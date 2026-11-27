package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class y extends a implements Serializable {
    public static final y c = new y();
    private static final long serialVersionUID = 1039765215346859963L;

    private y() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final b j(j$.time.temporal.l lVar) {
        return lVar instanceof a0 ? (a0) lVar : new a0(LocalDate.v(lVar));
    }

    @Override // j$.time.chrono.a
    public final k k(int i) {
        if (i == 0) {
            return b0.BEFORE_ROC;
        }
        if (i == 1) {
            return b0.ROC;
        }
        j$.time.g.d("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.a
    public final String l() {
        return "roc";
    }

    @Override // j$.time.chrono.a
    public final String n() {
        return "Minguo";
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDateTime o(Temporal temporal) {
        return super.o(temporal);
    }

    @Override // j$.time.chrono.a
    public final j$.time.temporal.s r(j$.time.temporal.a aVar) {
        int i = x.a[aVar.ordinal()];
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

    @Override // j$.time.chrono.a
    public final ChronoZonedDateTime v(Instant instant, ZoneId zoneId) {
        return j.q(this, instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final ChronoZonedDateTime w(Temporal temporal) {
        return super.w(temporal);
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }
}
