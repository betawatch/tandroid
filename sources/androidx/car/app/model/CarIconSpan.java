package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class CarIconSpan extends CarSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;
    private final CarIcon mIcon;

    private CarIconSpan() {
        this.mIcon = null;
        this.mAlignment = 1;
    }

    private static String alignmentToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "unknown" : "center" : "baseline" : "bottom";
    }

    public static CarIconSpan create(CarIcon carIcon, int i) {
        td1.c.d(carIcon);
        if (i == 1 || i == 0 || i == 2) {
            Objects.requireNonNull(carIcon);
            return new CarIconSpan(carIcon, i);
        }
        dq9.m(hg9.j(i, "Invalid alignment value: "));
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarIconSpan) {
            return Objects.equals(this.mIcon, ((CarIconSpan) obj).mIcon);
        }
        return false;
    }

    public int getAlignment() {
        return this.mAlignment;
    }

    public CarIcon getIcon() {
        CarIcon carIcon = this.mIcon;
        Objects.requireNonNull(carIcon);
        return carIcon;
    }

    public int hashCode() {
        return Objects.hashCode(this.mIcon);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[icon: ");
        sb.append(this.mIcon);
        sb.append(", alignment: ");
        return b10.j(sb, alignmentToString(this.mAlignment), "]");
    }

    private CarIconSpan(CarIcon carIcon, int i) {
        this.mIcon = carIcon;
        this.mAlignment = i;
    }

    public static CarIconSpan create(CarIcon carIcon) {
        return create(carIcon, 1);
    }
}
