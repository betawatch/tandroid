package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class PlaceMarker {
    private static final int MAX_LABEL_LENGTH = 3;
    public static final int TYPE_ICON = 0;
    public static final int TYPE_IMAGE = 1;
    private final CarColor mColor;
    private final CarIcon mIcon;
    private final int mIconType;
    private final CarText mLabel;

    private PlaceMarker() {
        this.mIcon = null;
        this.mIconType = 0;
        this.mLabel = null;
        this.mColor = null;
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
        StringBuilder sb = new StringBuilder("[");
        CarIcon carIcon = this.mIcon;
        if (carIcon != null) {
            shortString = carIcon.toString();
        } else {
            CarText carText = this.mLabel;
            shortString = carText != null ? CarText.toShortString(carText) : super.toString();
        }
        return b10.j(sb, shortString, "]");
    }

    public PlaceMarker(pd8 pd8Var) {
        throw null;
    }
}
