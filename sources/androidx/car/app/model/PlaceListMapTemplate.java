package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class PlaceListMapTemplate implements pib {
    private final ActionStrip mActionStrip;
    private final Place mAnchor;
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final ItemList mItemList;
    private final dr7 mOnContentRefreshDelegate;
    private final boolean mShowCurrentLocation;
    private final CarText mTitle;

    private PlaceListMapTemplate() {
        this.mShowCurrentLocation = false;
        this.mIsLoading = false;
        this.mTitle = null;
        this.mItemList = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mAnchor = null;
        this.mOnContentRefreshDelegate = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceListMapTemplate)) {
            return false;
        }
        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
        if (this.mShowCurrentLocation == placeListMapTemplate.mShowCurrentLocation && this.mIsLoading == placeListMapTemplate.mIsLoading && Objects.equals(this.mTitle, placeListMapTemplate.mTitle) && Objects.equals(this.mItemList, placeListMapTemplate.mItemList) && Objects.equals(this.mHeaderAction, placeListMapTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, placeListMapTemplate.mActionStrip) && Objects.equals(this.mAnchor, placeListMapTemplate.mAnchor)) {
            if (Boolean.valueOf(this.mOnContentRefreshDelegate == null).equals(Boolean.valueOf(placeListMapTemplate.mOnContentRefreshDelegate == null))) {
                return true;
            }
        }
        return false;
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public Place getAnchor() {
        return this.mAnchor;
    }

    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public ItemList getItemList() {
        return this.mItemList;
    }

    public dr7 getOnContentRefreshDelegate() {
        return this.mOnContentRefreshDelegate;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mShowCurrentLocation), Boolean.valueOf(this.mIsLoading), this.mTitle, this.mItemList, this.mHeaderAction, this.mActionStrip, this.mAnchor, Boolean.valueOf(this.mOnContentRefreshDelegate == null));
    }

    public boolean isCurrentLocationEnabled() {
        return this.mShowCurrentLocation;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "PlaceListMapTemplate";
    }

    public PlaceListMapTemplate(nd8 nd8Var) {
        throw null;
    }
}
