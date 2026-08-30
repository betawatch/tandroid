package androidx.car.app.navigation.model;

import androidx.car.app.model.CarIcon;
import j$.util.Objects;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class Maneuver {
    public static final int TYPE_DEPART = 1;
    public static final int TYPE_DESTINATION = 39;
    public static final int TYPE_DESTINATION_LEFT = 41;
    public static final int TYPE_DESTINATION_RIGHT = 42;
    public static final int TYPE_DESTINATION_STRAIGHT = 40;
    public static final int TYPE_FERRY_BOAT = 37;
    public static final int TYPE_FERRY_BOAT_LEFT = 47;
    public static final int TYPE_FERRY_BOAT_RIGHT = 48;
    public static final int TYPE_FERRY_TRAIN = 38;
    public static final int TYPE_FERRY_TRAIN_LEFT = 49;
    public static final int TYPE_FERRY_TRAIN_RIGHT = 50;
    public static final int TYPE_FORK_LEFT = 25;
    public static final int TYPE_FORK_RIGHT = 26;
    public static final int TYPE_KEEP_LEFT = 3;
    public static final int TYPE_KEEP_RIGHT = 4;
    public static final int TYPE_MERGE_LEFT = 27;
    public static final int TYPE_MERGE_RIGHT = 28;
    public static final int TYPE_MERGE_SIDE_UNSPECIFIED = 29;
    public static final int TYPE_NAME_CHANGE = 2;
    public static final int TYPE_OFF_RAMP_NORMAL_LEFT = 23;
    public static final int TYPE_OFF_RAMP_NORMAL_RIGHT = 24;
    public static final int TYPE_OFF_RAMP_SLIGHT_LEFT = 21;
    public static final int TYPE_OFF_RAMP_SLIGHT_RIGHT = 22;
    public static final int TYPE_ON_RAMP_NORMAL_LEFT = 15;
    public static final int TYPE_ON_RAMP_NORMAL_RIGHT = 16;
    public static final int TYPE_ON_RAMP_SHARP_LEFT = 17;
    public static final int TYPE_ON_RAMP_SHARP_RIGHT = 18;
    public static final int TYPE_ON_RAMP_SLIGHT_LEFT = 13;
    public static final int TYPE_ON_RAMP_SLIGHT_RIGHT = 14;
    public static final int TYPE_ON_RAMP_U_TURN_LEFT = 19;
    public static final int TYPE_ON_RAMP_U_TURN_RIGHT = 20;
    public static final int TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW = 34;
    public static final int TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE = 35;
    public static final int TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW = 32;
    public static final int TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE = 33;
    public static final int TYPE_ROUNDABOUT_ENTER_CCW = 45;
    public static final int TYPE_ROUNDABOUT_ENTER_CW = 43;
    public static final int TYPE_ROUNDABOUT_EXIT_CCW = 46;
    public static final int TYPE_ROUNDABOUT_EXIT_CW = 44;
    public static final int TYPE_STRAIGHT = 36;
    public static final int TYPE_TURN_NORMAL_LEFT = 7;
    public static final int TYPE_TURN_NORMAL_RIGHT = 8;
    public static final int TYPE_TURN_SHARP_LEFT = 9;
    public static final int TYPE_TURN_SHARP_RIGHT = 10;
    public static final int TYPE_TURN_SLIGHT_LEFT = 5;
    public static final int TYPE_TURN_SLIGHT_RIGHT = 6;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_U_TURN_LEFT = 11;
    public static final int TYPE_U_TURN_RIGHT = 12;
    private final CarIcon mIcon;
    private final int mRoundaboutExitAngle;
    private final int mRoundaboutExitNumber;
    private final int mType;

    public Maneuver(int i10, int i11, int i12, CarIcon carIcon) {
        this.mType = i10;
        this.mRoundaboutExitNumber = i11;
        this.mRoundaboutExitAngle = i12;
        t.b.b.a(carIcon);
        this.mIcon = carIcon;
    }

    public static boolean isExitNumberRequired(int i10) {
        return i10 == 32 || i10 == 34;
    }

    public static boolean isValidType(int i10) {
        return i10 >= 0 && i10 <= 50;
    }

    public static boolean isValidTypeWithExitAngle(int i10) {
        return i10 == 33 || i10 == 35;
    }

    public static boolean isValidTypeWithExitNumber(int i10) {
        return i10 == 32 || i10 == 34 || i10 == 33 || i10 == 35;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Maneuver)) {
            return false;
        }
        Maneuver maneuver = (Maneuver) obj;
        return this.mType == maneuver.mType && this.mRoundaboutExitNumber == maneuver.mRoundaboutExitNumber && this.mRoundaboutExitAngle == maneuver.mRoundaboutExitAngle && Objects.equals(this.mIcon, maneuver.mIcon);
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public int getRoundaboutExitAngle() {
        return this.mRoundaboutExitAngle;
    }

    public int getRoundaboutExitNumber() {
        return this.mRoundaboutExitNumber;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), Integer.valueOf(this.mRoundaboutExitNumber), Integer.valueOf(this.mRoundaboutExitAngle), this.mIcon);
    }

    public String toString() {
        return "[type: " + this.mType + ", exit #: " + this.mRoundaboutExitNumber + ", exit angle: " + this.mRoundaboutExitAngle + ", icon: " + this.mIcon + "]";
    }

    private Maneuver() {
        this.mType = 0;
        this.mRoundaboutExitNumber = 0;
        this.mRoundaboutExitAngle = 0;
        this.mIcon = null;
    }
}
