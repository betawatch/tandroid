package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        return c00.k(sb, shortString, "]");
    }

    public PlaceMarker(bf8 bf8Var) {
        throw null;
    }
}
