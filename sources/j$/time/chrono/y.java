package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.Temporal;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class y implements m, Serializable {
    public static final y d;
    private static final y[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    private final transient int a;
    private final transient LocalDate b;
    private final transient String c;

    @Override // j$.time.temporal.m
    public final /* synthetic */ boolean g(j$.time.temporal.p pVar) {
        return h.i(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return h.f(this, (j$.time.temporal.a) pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ long r(j$.time.temporal.p pVar) {
        return h.g(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object v(j$.time.temporal.r rVar) {
        return h.m(this, rVar);
    }

    static {
        y yVar = new y(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = yVar;
        e = new y[]{yVar, new y(0, LocalDate.of(1912, 7, 30), "Taisho"), new y(1, LocalDate.of(1926, 12, 25), "Showa"), new y(2, LocalDate.of(1989, 1, 8), "Heisei"), new y(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    static y q() {
        return e[r0.length - 1];
    }

    static long E() {
        int year = 1000000000 - q().b.getYear();
        y[] yVarArr = e;
        int year2 = yVarArr[0].b.getYear();
        for (int i = 1; i < yVarArr.length; i++) {
            y yVar = yVarArr[i];
            year = Math.min(year, (yVar.b.getYear() - year2) + 1);
            year2 = yVar.b.getYear();
        }
        return year;
    }

    static long B() {
        long f = j$.time.temporal.a.DAY_OF_YEAR.k().f();
        for (y yVar : e) {
            f = Math.min(f, ((yVar.b.P() ? 366 : 365) - yVar.b.L()) + 1);
            if (yVar.w() != null) {
                f = Math.min(f, yVar.w().b.L() - 1);
            }
        }
        return f;
    }

    private y(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    final LocalDate u() {
        return this.b;
    }

    public static y A(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            y[] yVarArr = e;
            if (i2 < yVarArr.length) {
                return yVarArr[i2];
            }
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    @Override // j$.time.temporal.n
    public final Temporal x(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.ERA);
    }

    static y m(LocalDate localDate) {
        if (localDate.O(x.d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 are not supported");
        }
        y[] yVarArr = e;
        for (int length = yVarArr.length - 1; length >= 0; length--) {
            y yVar = yVarArr[length];
            if (localDate.compareTo(yVar.b) >= 0) {
                return yVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (pVar != aVar) {
            return j$.time.temporal.l.d(this, pVar);
        }
        return v.d.A(aVar);
    }

    final y w() {
        if (this == q()) {
            return null;
        }
        return A(this.a + 1);
    }

    public final String toString() {
        return this.c;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 5, this);
    }

    final void G(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
    }
}
