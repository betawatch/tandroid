package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ForegroundCarColorSpan extends CarSpan {
    private final CarColor mCarColor;

    private ForegroundCarColorSpan() {
        this.mCarColor = CarColor.DEFAULT;
    }

    public static ForegroundCarColorSpan create(CarColor carColor) {
        rd1 rd1Var = rd1.b;
        rd1Var.getClass();
        if (rd1Var.a.contains(Integer.valueOf(carColor.getType()))) {
            return new ForegroundCarColorSpan(carColor);
        }
        u36.i(carColor, "Car color type is not allowed: ");
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForegroundCarColorSpan) {
            return Objects.equals(this.mCarColor, ((ForegroundCarColorSpan) obj).mCarColor);
        }
        return false;
    }

    public CarColor getColor() {
        return this.mCarColor;
    }

    public int hashCode() {
        return Objects.hashCode(this.mCarColor);
    }

    public String toString() {
        return "[color: " + this.mCarColor + "]";
    }

    private ForegroundCarColorSpan(CarColor carColor) {
        this.mCarColor = carColor;
    }
}
