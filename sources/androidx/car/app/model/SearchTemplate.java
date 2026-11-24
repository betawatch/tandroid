package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class SearchTemplate implements pib {
    private final ActionStrip mActionStrip;
    private final Action mHeaderAction;
    private final String mInitialSearchText;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final cu9 mSearchCallbackDelegate;
    private final String mSearchHint;
    private final boolean mShowKeyboardByDefault;

    private SearchTemplate() {
        this.mInitialSearchText = null;
        this.mSearchHint = null;
        this.mIsLoading = false;
        this.mItemList = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mSearchCallbackDelegate = null;
        this.mShowKeyboardByDefault = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTemplate)) {
            return false;
        }
        SearchTemplate searchTemplate = (SearchTemplate) obj;
        return this.mIsLoading == searchTemplate.mIsLoading && Objects.equals(this.mInitialSearchText, searchTemplate.mInitialSearchText) && Objects.equals(this.mSearchHint, searchTemplate.mSearchHint) && Objects.equals(this.mItemList, searchTemplate.mItemList) && Objects.equals(this.mHeaderAction, searchTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, searchTemplate.mActionStrip) && this.mShowKeyboardByDefault == searchTemplate.mShowKeyboardByDefault;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public String getInitialSearchText() {
        return this.mInitialSearchText;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public cu9 getSearchCallbackDelegate() {
        cu9 cu9Var = this.mSearchCallbackDelegate;
        Objects.requireNonNull(cu9Var);
        return cu9Var;
    }

    public String getSearchHint() {
        return this.mSearchHint;
    }

    public int hashCode() {
        return Objects.hash(this.mInitialSearchText, Boolean.valueOf(this.mIsLoading), this.mSearchHint, this.mItemList, Boolean.valueOf(this.mShowKeyboardByDefault), this.mHeaderAction, this.mActionStrip);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    public String toString() {
        return "SearchTemplate";
    }

    public SearchTemplate(yu9 yu9Var) {
        throw null;
    }
}
