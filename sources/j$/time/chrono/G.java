package j$.time.chrono;

import j$.time.LocalDate;
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
    public final m z(int i) {
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
    public final b k(j$.time.temporal.o oVar) {
        if (oVar instanceof I) {
            return (I) oVar;
        }
        return new I(LocalDate.D(oVar));
    }

    public final j$.time.temporal.w l(j$.time.temporal.a aVar) {
        int i = F.a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.w i2 = j$.time.temporal.a.PROLEPTIC_MONTH.i();
            return j$.time.temporal.w.j(i2.e() + 6516, i2.d() + 6516);
        }
        if (i == 2) {
            j$.time.temporal.w i3 = j$.time.temporal.a.YEAR.i();
            return j$.time.temporal.w.k((-(i3.e() + 543)) + 1, i3.d() + 543);
        }
        if (i == 3) {
            j$.time.temporal.w i4 = j$.time.temporal.a.YEAR.i();
            return j$.time.temporal.w.j(i4.e() + 543, i4.d() + 543);
        }
        return aVar.i();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new E((byte) 1, this);
    }
}
