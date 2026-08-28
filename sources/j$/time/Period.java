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
        for (int i9 = 0; i9 < 3; i9++) {
            arrayList.add(Objects.requireNonNull(objArr[i9]));
        }
        Collections.unmodifiableList(arrayList);
    }

    public static Period between(LocalDate localDate, LocalDate localDate2) {
        localDate.getClass();
        LocalDate I = LocalDate.I(localDate2);
        long M = I.M() - localDate.M();
        int i9 = I.c - localDate.c;
        if (M > 0 && i9 < 0) {
            M--;
            i9 = (int) (I.z() - localDate.T(M).z());
        } else if (M < 0 && i9 > 0) {
            M++;
            i9 -= I.P();
        }
        long j10 = M / 12;
        int i10 = (int) (M % 12);
        int i11 = (int) j10;
        if (j10 == i11) {
            return ((i11 | i10) | i9) == 0 ? d : new Period(i11, i10, i9);
        }
        throw new ArithmeticException();
    }

    public Period(int i9, int i10, int i11) {
        this.a = i9;
        this.b = i10;
        this.c = i11;
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
        StringBuilder sb2 = new StringBuilder("P");
        int i9 = this.a;
        if (i9 != 0) {
            sb2.append(i9);
            sb2.append('Y');
        }
        int i10 = this.b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        int i11 = this.c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('D');
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new p((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
