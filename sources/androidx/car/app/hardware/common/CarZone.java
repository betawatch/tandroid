package androidx.car.app.hardware.common;

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class CarZone {
    public static final int CAR_ZONE_COLUMN_ALL = 16;
    public static final int CAR_ZONE_COLUMN_CENTER = 48;
    public static final int CAR_ZONE_COLUMN_DRIVER = 80;
    public static final int CAR_ZONE_COLUMN_LEFT = 32;
    public static final int CAR_ZONE_COLUMN_PASSENGER = 96;
    public static final int CAR_ZONE_COLUMN_RIGHT = 64;
    public static final CarZone CAR_ZONE_GLOBAL = new CarZone(new qc1());
    public static final int CAR_ZONE_ROW_ALL = 0;
    public static final int CAR_ZONE_ROW_EXCLUDE_FIRST = 4;
    public static final int CAR_ZONE_ROW_FIRST = 1;
    public static final int CAR_ZONE_ROW_SECOND = 2;
    public static final int CAR_ZONE_ROW_THIRD = 3;
    private final int mColumn;
    private final int mRow;

    public CarZone(qc1 qc1Var) {
        qc1Var.getClass();
        this.mRow = 0;
        this.mColumn = 16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarZone)) {
            return false;
        }
        CarZone carZone = (CarZone) obj;
        return Integer.valueOf(this.mColumn).equals(Integer.valueOf(carZone.getColumn())) && Integer.valueOf(this.mRow).equals(Integer.valueOf(carZone.getRow()));
    }

    public int getColumn() {
        return this.mColumn;
    }

    public int getRow() {
        return this.mRow;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mRow), Integer.valueOf(this.mColumn));
    }

    public String toString() {
        int i = this.mRow;
        String str = "UNKNOWN";
        String str2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "CAR_ZONE_ROW_EXCLUDE_FIRST" : "CAR_ZONE_ROW_THIRD" : "CAR_ZONE_ROW_SECOND" : "CAR_ZONE_ROW_FIRST" : "CAR_ZONE_ROW_ALL";
        int i2 = this.mColumn;
        if (i2 == 16) {
            str = "CAR_ZONE_COLUMN_ALL";
        } else if (i2 == 32) {
            str = "CAR_ZONE_COLUMN_LEFT";
        } else if (i2 == 48) {
            str = "CAR_ZONE_COLUMN_CENTER";
        } else if (i2 == 64) {
            str = "CAR_ZONE_COLUMN_RIGHT";
        } else if (i2 == 80) {
            str = "CAR_ZONE_COLUMN_DRIVER";
        } else if (i2 == 96) {
            str = "CAR_ZONE_COLUMN_PASSENGER";
        }
        return b00.i("[CarZone row value: ", str2, ", column value: ", str, "]");
    }

    private CarZone() {
        this.mRow = 0;
        this.mColumn = 0;
    }
}
