package j$.time.chrono;

import j$.time.LocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class A extends a implements Serializable {
    public static final A d = new A();
    private static final long serialVersionUID = 1039765215346859963L;

    private A() {
    }

    @Override // j$.time.chrono.l
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.l
    public final m z(int i) {
        if (i == 0) {
            return D.BEFORE_ROC;
        }
        if (i == 1) {
            return D.ROC;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    @Override // j$.time.chrono.l
    public final String q() {
        return "roc";
    }

    @Override // j$.time.chrono.l
    public final b k(j$.time.temporal.o oVar) {
        if (oVar instanceof C) {
            return (C) oVar;
        }
        return new C(LocalDate.D(oVar));
    }

    public final j$.time.temporal.w l(j$.time.temporal.a aVar) {
        int i = z.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.w i2 = j$.time.temporal.a.PROLEPTIC_MONTH.i();
            return j$.time.temporal.w.j(i2.e() - 22932, i2.d() - 22932);
        }
        if (i == 2) {
            j$.time.temporal.w i3 = j$.time.temporal.a.YEAR.i();
            return j$.time.temporal.w.k(i3.d() - 1911, (-i3.e()) + 1912);
        }
        if (i == 3) {
            j$.time.temporal.w i4 = j$.time.temporal.a.YEAR.i();
            return j$.time.temporal.w.j(i4.e() - 1911, i4.d() - 1911);
        }
        return aVar.i();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new E((byte) 1, this);
    }
}
