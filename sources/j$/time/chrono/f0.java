package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class f0 extends a implements Serializable {
    public static final f0 c = new f0();
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

    @Override // j$.time.chrono.k
    public final l u(int i9) {
        if (i9 == 0) {
            return i0.BEFORE_BE;
        }
        if (i9 == 1) {
            return i0.BE;
        }
        throw new j$.time.b("Invalid era: " + i9);
    }

    @Override // j$.time.chrono.k
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.k
    public final String o() {
        return "buddhist";
    }

    @Override // j$.time.chrono.k
    public final b x(j$.time.temporal.l lVar) {
        if (lVar instanceof h0) {
            return (h0) lVar;
        }
        return new h0(LocalDate.I(lVar));
    }

    private f0() {
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.s s(j$.time.temporal.a aVar) {
        int i9 = e0.a[aVar.ordinal()];
        if (i9 == 1) {
            j$.time.temporal.s sVar = j$.time.temporal.a.PROLEPTIC_MONTH.b;
            return j$.time.temporal.s.e(sVar.a + 6516, sVar.d + 6516);
        }
        if (i9 == 2) {
            j$.time.temporal.s sVar2 = j$.time.temporal.a.YEAR.b;
            return j$.time.temporal.s.f((-(sVar2.a + 543)) + 1, sVar2.d + 543);
        }
        if (i9 != 3) {
            return aVar.b;
        }
        j$.time.temporal.s sVar3 = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.e(sVar3.a + 543, sVar3.d + 543);
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
