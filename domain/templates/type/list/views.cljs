(ns <%= namespace %>.<%= domain %>.list.views
    (:require [reagent.core :as r])
    (:require [re-frame.core :refer [subscribe dispatch]])
    (:require [<%= domain %>.item.views :refer [<%= domain %>-item]]))

;; Display <%= domain %> list

(defn <%= domain %>-list []
  (let list (subscribe [:get-<%= domain %>-list])
    [:div {:class "<%= domain %>-list"}
      [:h3 "<%= domain %> list"]
      [:ul
        (for [item list]
          (<%= domain %>-item item))
      ]
      [:button "Create <%= domain %>" #(dispatch [:new-<%= domain %>])]
    ]
  ))