package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;
import s.c;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class EnergyLevel {
    private final CarValue<Float> mBatteryPercent;
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Boolean> mEnergyIsLow;
    private final CarValue<Float> mFuelPercent;
    private final CarValue<Integer> mFuelVolumeDisplayUnit;
    private final CarValue<Float> mRangeRemainingMeters;

    public EnergyLevel(c cVar) {
        cVar.getClass();
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyLevel)) {
            return false;
        }
        EnergyLevel energyLevel = (EnergyLevel) obj;
        return Objects.equals(this.mBatteryPercent, energyLevel.mBatteryPercent) && Objects.equals(this.mFuelPercent, energyLevel.mFuelPercent) && Objects.equals(this.mEnergyIsLow, energyLevel.mEnergyIsLow) && Objects.equals(getRangeRemainingMeters(), energyLevel.getRangeRemainingMeters()) && Objects.equals(this.mDistanceDisplayUnit, energyLevel.mDistanceDisplayUnit) && Objects.equals(this.mFuelVolumeDisplayUnit, energyLevel.mFuelVolumeDisplayUnit);
    }

    public CarValue<Float> getBatteryPercent() {
        CarValue<Float> carValue = this.mBatteryPercent;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Integer> getDistanceDisplayUnit() {
        CarValue<Integer> carValue = this.mDistanceDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Boolean> getEnergyIsLow() {
        CarValue<Boolean> carValue = this.mEnergyIsLow;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Float> getFuelPercent() {
        CarValue<Float> carValue = this.mFuelPercent;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Integer> getFuelVolumeDisplayUnit() {
        CarValue<Integer> carValue = this.mFuelVolumeDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Float> getRangeRemainingMeters() {
        CarValue<Float> carValue = this.mRangeRemainingMeters;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mBatteryPercent, this.mFuelPercent, this.mEnergyIsLow, getRangeRemainingMeters(), this.mDistanceDisplayUnit, this.mFuelVolumeDisplayUnit);
    }

    public String toString() {
        return "[ battery percent: " + this.mBatteryPercent + ", fuel percent: " + this.mFuelPercent + ", energyIsLow: " + this.mEnergyIsLow + ", range remaining: " + getRangeRemainingMeters() + ", distance display unit: " + this.mDistanceDisplayUnit + ", fuel volume display unit: " + this.mFuelVolumeDisplayUnit + "]";
    }

    private EnergyLevel() {
        CarValue<Float> carValue = CarValue.UNKNOWN_FLOAT;
        this.mBatteryPercent = carValue;
        this.mFuelPercent = carValue;
        this.mEnergyIsLow = CarValue.UNKNOWN_BOOLEAN;
        this.mRangeRemainingMeters = carValue;
        CarValue<Integer> carValue2 = CarValue.UNKNOWN_INTEGER;
        this.mDistanceDisplayUnit = carValue2;
        this.mFuelVolumeDisplayUnit = carValue2;
    }
}
