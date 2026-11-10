package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class DistanceSpan extends CarSpan {
    private final Distance mDistance;

    private DistanceSpan(Distance distance) {
        this.mDistance = distance;
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

    private DistanceSpan() {
        this.mDistance = null;
    }
}
