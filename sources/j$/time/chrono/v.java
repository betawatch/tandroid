package j$.time.chrono;

import j$.time.LocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class v extends a implements Serializable {
    public static final v d = new v();
    private static final long serialVersionUID = 459996390165777884L;

    private v() {
    }

    @Override // j$.time.chrono.l
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.l
    public final String q() {
        return "japanese";
    }

    @Override // j$.time.chrono.l
    public final b k(j$.time.temporal.o oVar) {
        if (oVar instanceof x) {
            return (x) oVar;
        }
        return new x(LocalDate.D(oVar));
    }

    @Override // j$.time.chrono.l
    public final m z(int i) {
        return y.B(i);
    }

    public final j$.time.temporal.w l(j$.time.temporal.a aVar) {
        switch (u.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.v("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.w.k(y.D(), 999999999 - y.n().q().getYear());
            case 6:
                return j$.time.temporal.w.k(y.C(), j$.time.temporal.a.DAY_OF_YEAR.i().d());
            case 7:
                return j$.time.temporal.w.j(x.d.getYear(), 999999999L);
            case 8:
                return j$.time.temporal.w.j(y.d.getValue(), y.n().getValue());
            default:
                return aVar.i();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new E((byte) 1, this);
    }
}
