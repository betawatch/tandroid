package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
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
    public final String r() {
        return "japanese";
    }

    @Override // j$.time.chrono.l
    public final b m(j$.time.temporal.m mVar) {
        if (mVar instanceof x) {
            return (x) mVar;
        }
        return new x(LocalDate.K(mVar));
    }

    @Override // j$.time.chrono.l
    public final m G(int i) {
        return y.C(i);
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.u C(j$.time.temporal.a aVar) {
        switch (u.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.t("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.u.k(y.G(), 999999999 - y.r().v().getYear());
            case 6:
                return j$.time.temporal.u.k(y.D(), j$.time.temporal.a.DAY_OF_YEAR.k().d());
            case 7:
                return j$.time.temporal.u.j(x.d.getYear(), 999999999L);
            case 8:
                return j$.time.temporal.u.j(y.d.getValue(), y.r().getValue());
            default:
                return aVar.k();
        }
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime D(Instant instant, ZoneId zoneId) {
        return k.J(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new E((byte) 1, this);
    }
}
