package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class x implements l, Serializable {
    public static final x d;
    public static final x[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    @Override // j$.time.temporal.l
    public final /* synthetic */ boolean h(j$.time.temporal.o oVar) {
        return j$.com.android.tools.r8.a.r(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int o(j$.time.temporal.o oVar) {
        return j$.com.android.tools.r8.a.m(this, (j$.time.temporal.a) oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object r(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.v(this, aVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ long u(j$.time.temporal.o oVar) {
        return j$.com.android.tools.r8.a.o(this, oVar);
    }

    static {
        x xVar = new x(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = xVar;
        e = new x[]{xVar, new x(0, LocalDate.of(1912, 7, 30), "Taisho"), new x(1, LocalDate.of(1926, 12, 25), "Showa"), new x(2, LocalDate.of(1989, 1, 8), "Heisei"), new x(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public final x m() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return n(this.a + 1);
    }

    public x(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static x n(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            x[] xVarArr = e;
            if (i2 < xVarArr.length) {
                return xVarArr[i2];
            }
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    @Override // j$.time.temporal.m
    public final Temporal x(Temporal temporal) {
        return temporal.e(getValue(), j$.time.temporal.a.ERA);
    }

    public static x a(LocalDate localDate) {
        if (localDate.N(w.d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 are not supported");
        }
        x[] xVarArr = e;
        for (int length = xVarArr.length - 1; length >= 0; length--) {
            x xVar = xVarArr[length];
            if (localDate.compareTo(xVar.b) >= 0) {
                return xVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (oVar != aVar) {
            return j$.time.temporal.p.d(this, oVar);
        }
        return u.c.y(aVar);
    }

    public final String toString() {
        return this.c;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 5, this);
    }
}
