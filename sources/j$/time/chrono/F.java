package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class F extends a implements Serializable {
    public static final F c = new F();
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
    public final l C(int i) {
        if (i == 0) {
            return I.BEFORE_BE;
        }
        if (i == 1) {
            return I.BE;
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.k
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.k
    public final String m() {
        return "buddhist";
    }

    @Override // j$.time.chrono.k
    public final b a(j$.time.temporal.l lVar) {
        if (lVar instanceof H) {
            return (H) lVar;
        }
        return new H(LocalDate.I(lVar));
    }

    private F() {
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.s y(j$.time.temporal.a aVar) {
        int i = E.a[aVar.ordinal()];
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
