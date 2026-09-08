package androidx.car.app.navigation.model;

import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class LaneDirection {
    public static final int SHAPE_NORMAL_LEFT = 5;
    public static final int SHAPE_NORMAL_RIGHT = 6;
    public static final int SHAPE_SHARP_LEFT = 7;
    public static final int SHAPE_SHARP_RIGHT = 8;
    public static final int SHAPE_SLIGHT_LEFT = 3;
    public static final int SHAPE_SLIGHT_RIGHT = 4;
    public static final int SHAPE_STRAIGHT = 2;
    public static final int SHAPE_UNKNOWN = 1;
    public static final int SHAPE_U_TURN_LEFT = 9;
    public static final int SHAPE_U_TURN_RIGHT = 10;
    private final boolean mIsRecommended;
    private final int mShape;

    private LaneDirection(int i10, boolean z10) {
        this.mShape = i10;
        this.mIsRecommended = z10;
    }

    public static LaneDirection create(int i10, boolean z10) {
        return new LaneDirection(i10, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaneDirection)) {
            return false;
        }
        LaneDirection laneDirection = (LaneDirection) obj;
        return this.mShape == laneDirection.mShape && this.mIsRecommended == laneDirection.mIsRecommended;
    }

    public int getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mShape), Boolean.valueOf(this.mIsRecommended));
    }

    public boolean isRecommended() {
        return this.mIsRecommended;
    }

    public String toString() {
        return "[shape: " + this.mShape + ", isRecommended: " + this.mIsRecommended + "]";
    }

    private LaneDirection() {
        this.mShape = 1;
        this.mIsRecommended = false;
    }
}
