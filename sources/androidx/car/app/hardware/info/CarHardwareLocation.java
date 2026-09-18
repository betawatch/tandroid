package androidx.car.app.hardware.info;

import android.location.Location;
import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class CarHardwareLocation {
    public static final CarValue<Location> UNIMPLEMENTED_LOCATION = new CarValue<>(null, 0, 2);
    public static final CarValue<Location> UNKNOWN_LOCATION = new CarValue<>(null, 0, 0);
    private final CarValue<Location> mLocation;

    public CarHardwareLocation(CarValue<Location> carValue) {
        Objects.requireNonNull(carValue);
        this.mLocation = carValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarHardwareLocation) {
            return Objects.equals(this.mLocation, ((CarHardwareLocation) obj).mLocation);
        }
        return false;
    }

    public CarValue<Location> getLocation() {
        return this.mLocation;
    }

    public int hashCode() {
        return Objects.hash(this.mLocation);
    }

    public String toString() {
        return "[ location: " + this.mLocation + " ]";
    }

    private CarHardwareLocation() {
        this.mLocation = UNKNOWN_LOCATION;
    }
}
