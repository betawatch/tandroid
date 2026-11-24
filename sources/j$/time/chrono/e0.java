package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class e0 extends a implements Serializable {
    public static final e0 c = new e0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private e0() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final b j(j$.time.temporal.l lVar) {
        return lVar instanceof g0 ? (g0) lVar : new g0(LocalDate.v(lVar));
    }

    @Override // j$.time.chrono.a
    public final k k(int i) {
        if (i == 0) {
            return h0.BEFORE_BE;
        }
        if (i == 1) {
            return h0.BE;
        }
        j$.time.g.d("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.a
    public final String l() {
        return "buddhist";
    }

    @Override // j$.time.chrono.a
    public final String n() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDateTime o(Temporal temporal) {
        return super.o(temporal);
    }

    @Override // j$.time.chrono.a
    public final j$.time.temporal.s r(j$.time.temporal.a aVar) {
        int i = d0.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.s sVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.s.e(sVar.a + 6516, sVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.s sVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.s.f((-(sVar2.a + 543)) + 1, sVar2.d + 543);
        }
        if (i != 3) {
            return aVar.b;
        }
        j$.time.temporal.s sVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.e(sVar3.a + 543, sVar3.d + 543);
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
