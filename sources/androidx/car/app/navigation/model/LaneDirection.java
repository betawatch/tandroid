package androidx.car.app.navigation.model;

import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    private LaneDirection(int i3, boolean z10) {
        this.mShape = i3;
        this.mIsRecommended = z10;
    }

    public static LaneDirection create(int i3, boolean z10) {
        return new LaneDirection(i3, z10);
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
