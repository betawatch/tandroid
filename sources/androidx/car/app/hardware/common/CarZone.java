package androidx.car.app.hardware.common;

import j$.util.Objects;
import org.telegram.ui.Cells.f1;
import r.b;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        int i7 = this.mRow;
        String str = "UNKNOWN";
        String str2 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "UNKNOWN" : "CAR_ZONE_ROW_EXCLUDE_FIRST" : "CAR_ZONE_ROW_THIRD" : "CAR_ZONE_ROW_SECOND" : "CAR_ZONE_ROW_FIRST" : "CAR_ZONE_ROW_ALL";
        int i10 = this.mColumn;
        if (i10 == 16) {
            str = "CAR_ZONE_COLUMN_ALL";
        } else if (i10 == 32) {
            str = "CAR_ZONE_COLUMN_LEFT";
        } else if (i10 == 48) {
            str = "CAR_ZONE_COLUMN_CENTER";
        } else if (i10 == 64) {
            str = "CAR_ZONE_COLUMN_RIGHT";
        } else if (i10 == 80) {
            str = "CAR_ZONE_COLUMN_DRIVER";
        } else if (i10 == 96) {
            str = "CAR_ZONE_COLUMN_PASSENGER";
        }
        return f1.m("[CarZone row value: ", str2, ", column value: ", str, "]");
    }

    private CarZone() {
        this.mRow = 0;
        this.mColumn = 0;
    }
}
