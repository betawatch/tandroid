package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class w implements k, Serializable {
    public static final w d;
    public static final w[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    static {
        w wVar = new w(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = wVar;
        e = new w[]{wVar, new w(0, LocalDate.of(1912, 7, 30), "Taisho"), new w(1, LocalDate.of(1926, 12, 25), "Showa"), new w(2, LocalDate.of(1989, 1, 8), "Heisei"), new w(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public w(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static w o(LocalDate localDate) {
        if (localDate.G(v.d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = e.length - 1; length >= 0; length--) {
            w wVar = e[length];
            if (localDate.compareTo(wVar.b) >= 0) {
                return wVar;
            }
        }
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static w v(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            w[] wVarArr = e;
            if (i2 < wVarArr.length) {
                return wVarArr[i2];
            }
        }
        j$.time.g.d("Invalid era: ", i);
        return null;
    }

    private Object writeReplace() {
        return new c0((byte) 5, this);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ boolean e(j$.time.temporal.o oVar) {
        return j$.time.a.q(this, oVar);
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.o oVar) {
        return j$.time.a.l(this, (j$.time.temporal.a) oVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return oVar == aVar ? t.c.r(aVar) : j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal n(Temporal temporal) {
        return temporal.c(getValue(), j$.time.temporal.a.ERA);
    }

    public final w q() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return v(this.a + 1);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object r(j$.time.format.a aVar) {
        return j$.time.a.u(this, aVar);
    }

    public final String toString() {
        return this.c;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ long y(j$.time.temporal.o oVar) {
        return j$.time.a.n(this, oVar);
    }
}
