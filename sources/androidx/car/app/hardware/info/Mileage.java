package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class Mileage {
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Float> mOdometerMeters;

    private Mileage() {
        this.mOdometerMeters = CarValue.UNKNOWN_FLOAT;
        this.mDistanceDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mileage)) {
            return false;
        }
        Mileage mileage = (Mileage) obj;
        return Objects.equals(getOdometerMeters(), mileage.getOdometerMeters()) && Objects.equals(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit);
    }

    public CarValue<Integer> getDistanceDisplayUnit() {
        CarValue<Integer> carValue = this.mDistanceDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Float> getOdometerMeters() {
        CarValue<Float> carValue = this.mOdometerMeters;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(getOdometerMeters(), this.mDistanceDisplayUnit);
    }

    public String toString() {
        return "[ odometer: " + getOdometerMeters() + ", distance display unit: " + this.mDistanceDisplayUnit + "]";
    }

    public Mileage(vf7 vf7Var) {
        vf7Var.getClass();
        throw null;
    }
}
