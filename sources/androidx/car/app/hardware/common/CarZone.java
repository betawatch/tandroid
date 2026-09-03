package androidx.car.app.hardware.common;

import j$.util.Objects;
import org.telegram.ui.yh;
import r.b;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class CarZone {
    public static final int CAR_ZONE_COLUMN_ALL = 16;
    public static final int CAR_ZONE_COLUMN_CENTER = 48;
    public static final int CAR_ZONE_COLUMN_DRIVER = 80;
    public static final int CAR_ZONE_COLUMN_LEFT = 32;
    public static final int CAR_ZONE_COLUMN_PASSENGER = 96;
    public static final int CAR_ZONE_COLUMN_RIGHT = 64;
    public static final CarZone CAR_ZONE_GLOBAL = new CarZone(new b());
    public static final int CAR_ZONE_ROW_ALL = 0;
    public static final int CAR_ZONE_ROW_EXCLUDE_FIRST = 4;
    public static final int CAR_ZONE_ROW_FIRST = 1;
    public static final int CAR_ZONE_ROW_SECOND = 2;
    public static final int CAR_ZONE_ROW_THIRD = 3;
    private final int mColumn;
    private final int mRow;

    public CarZone(b bVar) {
        bVar.getClass();
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
        int i10 = this.mRow;
        String str = "UNKNOWN";
        String str2 = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "CAR_ZONE_ROW_EXCLUDE_FIRST" : "CAR_ZONE_ROW_THIRD" : "CAR_ZONE_ROW_SECOND" : "CAR_ZONE_ROW_FIRST" : "CAR_ZONE_ROW_ALL";
        int i11 = this.mColumn;
        if (i11 == 16) {
            str = "CAR_ZONE_COLUMN_ALL";
        } else if (i11 == 32) {
            str = "CAR_ZONE_COLUMN_LEFT";
        } else if (i11 == 48) {
            str = "CAR_ZONE_COLUMN_CENTER";
        } else if (i11 == 64) {
            str = "CAR_ZONE_COLUMN_RIGHT";
        } else if (i11 == 80) {
            str = "CAR_ZONE_COLUMN_DRIVER";
        } else if (i11 == 96) {
            str = "CAR_ZONE_COLUMN_PASSENGER";
        }
        return yh.l("[CarZone row value: ", str2, ", column value: ", str, "]");
    }

    private CarZone() {
        this.mRow = 0;
        this.mColumn = 0;
    }
}
