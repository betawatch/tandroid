package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class Period implements Serializable {
    public static final Period d = new Period(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        Object[] objArr = {ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS};
        ArrayList arrayList = new ArrayList(3);
        for (int i10 = 0; i10 < 3; i10++) {
            arrayList.add(Objects.requireNonNull(objArr[i10]));
        }
        Collections.unmodifiableList(arrayList);
    }

    public static Period between(LocalDate localDate, LocalDate localDate2) {
        localDate.getClass();
        LocalDate I = LocalDate.I(localDate2);
        long M = I.M() - localDate.M();
        int i10 = I.c - localDate.c;
        if (M > 0 && i10 < 0) {
            M--;
            i10 = (int) (I.z() - localDate.T(M).z());
        } else if (M < 0 && i10 > 0) {
            M++;
            i10 -= I.P();
        }
        long j10 = M / 12;
        int i11 = (int) (M % 12);
        int i12 = (int) j10;
        if (j10 == i12) {
            return ((i12 | i11) | i10) == 0 ? d : new Period(i12, i11, i10);
        }
        throw new ArithmeticException();
    }

    public Period(int i10, int i11, int i12) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
    }

    public int getYears() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            if (this.a == period.a && this.b == period.b && this.c == period.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i10 = this.a;
        if (i10 != 0) {
            sb.append(i10);
            sb.append('Y');
        }
        int i11 = this.b;
        if (i11 != 0) {
            sb.append(i11);
            sb.append('M');
        }
        int i12 = this.c;
        if (i12 != 0) {
            sb.append(i12);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
