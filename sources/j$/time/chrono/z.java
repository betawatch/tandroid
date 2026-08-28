package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class z extends a implements Serializable {
    public static final z c = new z();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.k
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.k
    public final l u(int i9) {
        if (i9 == 0) {
            return c0.BEFORE_ROC;
        }
        if (i9 == 1) {
            return c0.ROC;
        }
        throw new j$.time.b("Invalid era: " + i9);
    }

    @Override // j$.time.chrono.k
    public final String o() {
        return "roc";
    }

    @Override // j$.time.chrono.k
    public final b x(j$.time.temporal.l lVar) {
        if (lVar instanceof b0) {
            return (b0) lVar;
        }
        return new b0(LocalDate.I(lVar));
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.s s(j$.time.temporal.a aVar) {
        int i9 = y.a[aVar.ordinal()];
        if (i9 == 1) {
            j$.time.temporal.s sVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.s.e(sVar.a - 22932, sVar.d - 22932);
        }
        if (i9 == 2) {
            j$.time.temporal.s sVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.s.f(sVar2.d - 1911, (-sVar2.a) + 1912);
        }
        if (i9 != 3) {
            return aVar.b;
        }
        j$.time.temporal.s sVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.e(sVar3.a - 1911, sVar3.d - 1911);
    }

    private z() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime D(Instant instant, ZoneId zoneId) {
        return j.H(this, instant, zoneId);
    }

    public Object writeReplace() {
        return new d0((byte) 1, this);
    }
}
