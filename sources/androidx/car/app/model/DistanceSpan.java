package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class DistanceSpan extends CarSpan {
    private final Distance mDistance;

    private DistanceSpan() {
        this.mDistance = null;
    }

    public static DistanceSpan create(Distance distance) {
        Objects.requireNonNull(distance);
        return new DistanceSpan(distance);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DistanceSpan) {
            return Objects.equals(this.mDistance, ((DistanceSpan) obj).mDistance);
        }
        return false;
    }

    public Distance getDistance() {
        Distance distance = this.mDistance;
        Objects.requireNonNull(distance);
        return distance;
    }

    public int hashCode() {
        return Objects.hashCode(this.mDistance);
    }

    public String toString() {
        return "[distance: " + this.mDistance + "]";
    }

    private DistanceSpan(Distance distance) {
        this.mDistance = distance;
    }
}
