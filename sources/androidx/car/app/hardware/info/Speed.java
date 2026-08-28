package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;
import s.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class Speed {
    private final CarValue<Float> mDisplaySpeedMetersPerSecond;
    private final CarValue<Float> mRawSpeedMetersPerSecond;
    private final CarValue<Integer> mSpeedDisplayUnit;

    public Speed(j jVar) {
        jVar.getClass();
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Speed)) {
            return false;
        }
        Speed speed = (Speed) obj;
        return Objects.equals(getRawSpeedMetersPerSecond(), speed.getRawSpeedMetersPerSecond()) && Objects.equals(getDisplaySpeedMetersPerSecond(), speed.getDisplaySpeedMetersPerSecond()) && Objects.equals(this.mSpeedDisplayUnit, speed.mSpeedDisplayUnit);
    }

    public CarValue<Float> getDisplaySpeedMetersPerSecond() {
        CarValue<Float> carValue = this.mDisplaySpeedMetersPerSecond;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Float> getRawSpeedMetersPerSecond() {
        CarValue<Float> carValue = this.mRawSpeedMetersPerSecond;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Integer> getSpeedDisplayUnit() {
        CarValue<Integer> carValue = this.mSpeedDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(getRawSpeedMetersPerSecond(), getDisplaySpeedMetersPerSecond(), this.mSpeedDisplayUnit);
    }

    public String toString() {
        return "[ raw speed: " + getRawSpeedMetersPerSecond() + ", display speed: " + getDisplaySpeedMetersPerSecond() + ", speed display unit: " + this.mSpeedDisplayUnit + "]";
    }

    private Speed() {
        CarValue<Float> carValue = CarValue.UNKNOWN_FLOAT;
        this.mRawSpeedMetersPerSecond = carValue;
        this.mDisplaySpeedMetersPerSecond = carValue;
        this.mSpeedDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }
}
