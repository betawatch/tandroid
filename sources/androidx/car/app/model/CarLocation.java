package androidx.car.app.model;

import android.location.Location;
import j$.util.Objects;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class CarLocation {
    private final double mLat;
    private final double mLng;

    private CarLocation(double d, double d10) {
        this.mLat = d;
        this.mLng = d10;
    }

    public static CarLocation create(double d, double d10) {
        return new CarLocation(d, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarLocation)) {
            return false;
        }
        CarLocation carLocation = (CarLocation) obj;
        return Double.doubleToLongBits(this.mLat) == Double.doubleToLongBits(carLocation.mLat) && Double.doubleToLongBits(this.mLng) == Double.doubleToLongBits(carLocation.mLng);
    }

    public double getLatitude() {
        return this.mLat;
    }

    public double getLongitude() {
        return this.mLng;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.mLat), Double.valueOf(this.mLng));
    }

    public String toString() {
        return "[" + getLatitude() + ", " + getLongitude() + "]";
    }

    public static CarLocation create(Location location) {
        Objects.requireNonNull(location);
        return create(location.getLatitude(), location.getLongitude());
    }

    private CarLocation() {
        this(0.0d, 0.0d);
    }
}
