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
    public final l C(int i) {
        if (i == 0) {
            return C.BEFORE_ROC;
        }
        if (i == 1) {
            return C.ROC;
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.k
    public final String m() {
        return "roc";
    }

    @Override // j$.time.chrono.k
    public final b a(j$.time.temporal.l lVar) {
        if (lVar instanceof B) {
            return (B) lVar;
        }
        return new B(LocalDate.I(lVar));
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.s y(j$.time.temporal.a aVar) {
        int i = y.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.s sVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.s.e(sVar.a - 22932, sVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.s sVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.s.f(sVar2.d - 1911, (-sVar2.a) + 1912);
        }
        if (i != 3) {
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
    public final ChronoZonedDateTime A(Instant instant, ZoneId zoneId) {
        return j.H(this, instant, zoneId);
    }

    public Object writeReplace() {
        return new D((byte) 1, this);
    }
}
