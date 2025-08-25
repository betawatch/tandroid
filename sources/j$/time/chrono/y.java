package j$.time.chrono;

import j$.time.LocalDate;
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

    @Override // j$.time.temporal.o
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return h.i(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int j(j$.time.temporal.r rVar) {
        return h.f(this, (j$.time.temporal.a) rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ long r(j$.time.temporal.r rVar) {
        return h.g(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object u(j$.time.temporal.t tVar) {
        return h.m(this, tVar);
    }

    static {
        y yVar = new y(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = yVar;
        e = new y[]{yVar, new y(0, LocalDate.of(1912, 7, 30), "Taisho"), new y(1, LocalDate.of(1926, 12, 25), "Showa"), new y(2, LocalDate.of(1989, 1, 8), "Heisei"), new y(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    static y n() {
        return e[r0.length - 1];
    }

    static long D() {
        int year = 1000000000 - n().b.getYear();
        y[] yVarArr = e;
        int year2 = yVarArr[0].b.getYear();
        for (int i = 1; i < yVarArr.length; i++) {
            y yVar = yVarArr[i];
            year = Math.min(year, (yVar.b.getYear() - year2) + 1);
            year2 = yVar.b.getYear();
        }
        return year;
    }

    static long C() {
        long f = j$.time.temporal.a.DAY_OF_YEAR.i().f();
        for (y yVar : e) {
            f = Math.min(f, ((yVar.b.K() ? 366 : 365) - yVar.b.G()) + 1);
            if (yVar.z() != null) {
                f = Math.min(f, yVar.z().b.G() - 1);
            }
        }
        return f;
    }

    private y(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    final LocalDate q() {
        return this.b;
    }

    public static y B(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            y[] yVarArr = e;
            if (i2 < yVarArr.length) {
                return yVarArr[i2];
            }
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }

    static y k(LocalDate localDate) {
        if (localDate.J(x.d)) {
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

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (rVar != aVar) {
            return j$.time.temporal.n.d(this, rVar);
        }
        return v.d.l(aVar);
    }

    final y z() {
        if (this == n()) {
            return null;
        }
        return B(this.a + 1);
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

    final void E(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
    }
}
