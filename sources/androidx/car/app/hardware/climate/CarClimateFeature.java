package androidx.car.app.hardware.climate;

import androidx.car.app.hardware.common.CarZone;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
public final class CarClimateFeature {
    private final List<CarZone> mCarZones;
    private final int mFeature;

    public static final class Builder {
    }

    public List<CarZone> getCarZones() {
        return this.mCarZones;
    }

    public int getFeature() {
        return this.mFeature;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CarClimateFeature.class == obj.getClass()) {
            CarClimateFeature carClimateFeature = (CarClimateFeature) obj;
            if (Integer.valueOf(this.mFeature).equals(Integer.valueOf(carClimateFeature.mFeature)) && Objects.equals(this.mCarZones, carClimateFeature.mCarZones)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mFeature), this.mCarZones);
    }

    public String toString() {
        return "ClimateProfileFeature{mFeature='" + this.mFeature + "', mCarZones=" + this.mCarZones + '}';
    }

    CarClimateFeature(Builder builder) {
        throw null;
    }
}
