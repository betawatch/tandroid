package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class G extends a implements Serializable {
    public static final G d = new G();
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

    @Override // j$.time.chrono.l
    public final m E(int i) {
        if (i == 0) {
            return J.BEFORE_BE;
        }
        if (i == 1) {
            return J.BE;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    private G() {
    }

    @Override // j$.time.chrono.l
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.l
    public final String q() {
        return "buddhist";
    }

    @Override // j$.time.chrono.l
    public final b m(j$.time.temporal.m mVar) {
        if (mVar instanceof I) {
            return (I) mVar;
        }
        return new I(LocalDate.I(mVar));
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.u A(j$.time.temporal.a aVar) {
        int i = F.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.u k = j$.time.temporal.a.PROLEPTIC_MONTH.k();
            return j$.time.temporal.u.j(k.e() + 6516, k.d() + 6516);
        }
        if (i == 2) {
            j$.time.temporal.u k2 = j$.time.temporal.a.YEAR.k();
            return j$.time.temporal.u.k((-(k2.e() + 543)) + 1, k2.d() + 543);
        }
        if (i == 3) {
            j$.time.temporal.u k3 = j$.time.temporal.a.YEAR.k();
            return j$.time.temporal.u.j(k3.e() + 543, k3.d() + 543);
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
