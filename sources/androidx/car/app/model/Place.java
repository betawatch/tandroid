package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class Place {
    private final CarLocation mLocation;
    private final PlaceMarker mMarker;

    public Place(k0 k0Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Place)) {
            return false;
        }
        Place place = (Place) obj;
        return Objects.equals(this.mLocation, place.mLocation) && Objects.equals(this.mMarker, place.mMarker);
    }

    public CarLocation getLocation() {
        CarLocation carLocation = this.mLocation;
        Objects.requireNonNull(carLocation);
        return carLocation;
    }

    public PlaceMarker getMarker() {
        return this.mMarker;
    }

    public int hashCode() {
        return Objects.hash(this.mLocation, this.mMarker);
    }

    public String toString() {
        return "[ location: " + this.mLocation + ", marker: " + this.mMarker + "]";
    }

    private Place() {
        this.mLocation = null;
        this.mMarker = null;
    }
}
