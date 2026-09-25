package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class ForegroundCarColorSpan extends CarSpan {
    private final CarColor mCarColor;

    private ForegroundCarColorSpan(CarColor carColor) {
        this.mCarColor = carColor;
    }

    public static ForegroundCarColorSpan create(CarColor carColor) {
        t.a aVar = t.a.b;
        aVar.getClass();
        if (aVar.a.contains(Integer.valueOf(carColor.getType()))) {
            return new ForegroundCarColorSpan(carColor);
        }
        throw new IllegalArgumentException("Car color type is not allowed: " + carColor);
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

    private ForegroundCarColorSpan() {
        this.mCarColor = CarColor.DEFAULT;
    }
}
