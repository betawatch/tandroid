package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
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
    public final m E(int i) {
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
    public final b m(j$.time.temporal.m mVar) {
        if (mVar instanceof C) {
            return (C) mVar;
        }
        return new C(LocalDate.I(mVar));
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.u A(j$.time.temporal.a aVar) {
        int i = z.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.u k = j$.time.temporal.a.PROLEPTIC_MONTH.k();
            return j$.time.temporal.u.j(k.e() - 22932, k.d() - 22932);
        }
        if (i == 2) {
            j$.time.temporal.u k2 = j$.time.temporal.a.YEAR.k();
            return j$.time.temporal.u.k(k2.d() - 1911, (-k2.e()) + 1912);
        }
        if (i == 3) {
            j$.time.temporal.u k3 = j$.time.temporal.a.YEAR.k();
            return j$.time.temporal.u.j(k3.e() - 1911, k3.d() - 1911);
        }
        return aVar.k();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime B(Instant instant, ZoneId zoneId) {
        return k.H(this, instant, zoneId);
    }

    Object writeReplace() {
        return new E((byte) 1, this);
    }
}
