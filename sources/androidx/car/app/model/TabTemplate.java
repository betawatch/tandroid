package androidx.car.app.model;

import androidx.car.app.model.constraints.ActionsConstraints;
import androidx.car.app.model.constraints.TabsConstraints;
import androidx.car.app.utils.CollectionUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class TabTemplate implements Template {
    private final String mActiveTabContentId;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final TabCallbackDelegate mTabCallbackDelegate;
    private final TabContents mTabContents;
    private final List<Tab> mTabs;

    public interface TabCallback {
        void onTabSelected(String str);
    }

    public Action getHeaderAction() {
        Action action = this.mHeaderAction;
        Objects.requireNonNull(action);
        return action;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public List<Tab> getTabs() {
        return CollectionUtils.emptyIfNull(this.mTabs);
    }

    public TabContents getTabContents() {
        TabContents tabContents = this.mTabContents;
        Objects.requireNonNull(tabContents);
        return tabContents;
    }

    public TabCallbackDelegate getTabCallbackDelegate() {
        TabCallbackDelegate tabCallbackDelegate = this.mTabCallbackDelegate;
        Objects.requireNonNull(tabCallbackDelegate);
        return tabCallbackDelegate;
    }

    public String getActiveTabContentId() {
        String str = this.mActiveTabContentId;
        Objects.requireNonNull(str);
        return str;
    }

    public String toString() {
        return "TabTemplate";
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTabs, this.mTabContents, this.mActiveTabContentId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabTemplate)) {
            return false;
        }
        TabTemplate tabTemplate = (TabTemplate) obj;
        return this.mIsLoading == tabTemplate.mIsLoading && Objects.equals(this.mHeaderAction, tabTemplate.mHeaderAction) && Objects.equals(this.mTabs, tabTemplate.mTabs) && Objects.equals(this.mTabContents, tabTemplate.mTabContents) && Objects.equals(this.mActiveTabContentId, tabTemplate.getActiveTabContentId());
    }

    TabTemplate(Builder builder) {
        this.mIsLoading = builder.mIsLoading;
        this.mHeaderAction = builder.mHeaderAction;
        this.mTabs = CollectionUtils.unmodifiableCopy(builder.mTabs);
        this.mTabContents = builder.mTabContents;
        this.mTabCallbackDelegate = builder.mTabCallbackDelegate;
        this.mActiveTabContentId = builder.mActiveTabContentId;
    }

    private TabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = Collections.emptyList();
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
    }

    public static final class Builder {
        String mActiveTabContentId;
        Action mHeaderAction;
        boolean mIsLoading;
        final TabCallbackDelegate mTabCallbackDelegate;
        TabContents mTabContents;
        final List mTabs;

        public Builder setHeaderAction(Action action) {
            ActionsConstraints actionsConstraints = ActionsConstraints.ACTIONS_CONSTRAINTS_TABS;
            Objects.requireNonNull(action);
            actionsConstraints.validateOrThrow(Collections.singletonList(action));
            this.mHeaderAction = action;
            return this;
        }

        public Builder setTabContents(TabContents tabContents) {
            Objects.requireNonNull(tabContents);
            this.mTabContents = tabContents;
            return this;
        }

        public Builder setActiveTabContentId(String str) {
            Objects.requireNonNull(str);
            if (str.isEmpty()) {
                throw new IllegalArgumentException("The content ID cannot be null or empty");
            }
            this.mActiveTabContentId = str;
            return this;
        }

        public Builder addTab(Tab tab) {
            Objects.requireNonNull(tab);
            this.mTabs.add(tab);
            return this;
        }

        public TabTemplate build() {
            String str;
            boolean z = (this.mTabContents == null || this.mTabs.isEmpty()) ? false : true;
            boolean z2 = this.mIsLoading;
            if (z2 && z) {
                throw new IllegalStateException("Template is in a loading state but tabs are added");
            }
            if (!z2 && !z) {
                throw new IllegalStateException("Template is not in a loading state but does not contain tabs or tab contents");
            }
            if (z && this.mActiveTabContentId == null) {
                throw new IllegalStateException("Template requires setting content ID for the active tab when not in Loading state");
            }
            if (z && (str = this.mActiveTabContentId) != null) {
                TabsConstraints.DEFAULT.validateOrThrow(this.mTabs, str);
            }
            if (!this.mIsLoading && this.mHeaderAction == null) {
                throw new IllegalArgumentException("Template requires a Header Action of TYPE_APP_ICON when not in Loading state");
            }
            return new TabTemplate(this);
        }

        public Builder(TabCallback tabCallback) {
            Objects.requireNonNull(tabCallback);
            this.mTabCallbackDelegate = TabCallbackDelegateImpl.create(tabCallback);
            this.mTabs = new ArrayList();
        }
    }
}
