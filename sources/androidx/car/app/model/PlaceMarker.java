package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class PlaceMarker {
    private static final int MAX_LABEL_LENGTH = 3;
    public static final int TYPE_ICON = 0;
    public static final int TYPE_IMAGE = 1;
    private final CarColor mColor;
    private final CarIcon mIcon;
    private final int mIconType;
    private final CarText mLabel;

    public PlaceMarker(m0 m0Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceMarker)) {
            return false;
        }
        PlaceMarker placeMarker = (PlaceMarker) obj;
        return Objects.equals(this.mIcon, placeMarker.mIcon) && Objects.equals(this.mLabel, placeMarker.mLabel) && Objects.equals(this.mColor, placeMarker.mColor) && this.mIconType == placeMarker.mIconType;
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public int getIconType() {
        return this.mIconType;
    }

    public CarText getLabel() {
        return this.mLabel;
    }

    public int hashCode() {
        return Objects.hash(this.mIcon, this.mLabel, this.mColor, Integer.valueOf(this.mIconType));
    }

    public String toString() {
        String shortString;
        StringBuilder sb2 = new StringBuilder("[");
        CarIcon carIcon = this.mIcon;
        if (carIcon != null) {
            shortString = carIcon.toString();
        } else {
            CarText carText = this.mLabel;
            shortString = carText != null ? CarText.toShortString(carText) : super.toString();
        }
        return aa.d.r(sb2, shortString, "]");
    }

    private PlaceMarker() {
        this.mIcon = null;
        this.mIconType = 0;
        this.mLabel = null;
        this.mColor = null;
    }
}
