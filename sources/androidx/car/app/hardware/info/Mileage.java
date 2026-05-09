package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class Mileage {
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Float> mOdometerMeters;

    public CarValue<Float> getOdometerMeters() {
        CarValue<Float> carValue = this.mOdometerMeters;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Integer> getDistanceDisplayUnit() {
        CarValue<Integer> carValue = this.mDistanceDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public String toString() {
        return "[ odometer: " + getOdometerMeters() + ", distance display unit: " + this.mDistanceDisplayUnit + "]";
    }

    public int hashCode() {
        return Objects.hash(getOdometerMeters(), this.mDistanceDisplayUnit);
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

    Mileage(Builder builder) {
        CarValue<Float> carValue = builder.mOdometerMeters;
        Objects.requireNonNull(carValue);
        this.mOdometerMeters = carValue;
        CarValue<Integer> carValue2 = builder.mDistanceDisplayUnit;
        Objects.requireNonNull(carValue2);
        this.mDistanceDisplayUnit = carValue2;
    }

    private Mileage() {
        this.mOdometerMeters = CarValue.UNKNOWN_FLOAT;
        this.mDistanceDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }

    public static final class Builder {
        CarValue mOdometerMeters = CarValue.UNKNOWN_FLOAT;
        CarValue mDistanceDisplayUnit = CarValue.UNKNOWN_INTEGER;

        public Mileage build() {
            return new Mileage(this);
        }
    }
}
