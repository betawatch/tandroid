package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class t extends a implements Serializable {
    public static final t c = new t();
    private static final long serialVersionUID = 459996390165777884L;

    private t() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final b j(j$.time.temporal.l lVar) {
        return lVar instanceof v ? (v) lVar : new v(LocalDate.v(lVar));
    }

    @Override // j$.time.chrono.a
    public final k k(int i) {
        return w.v(i);
    }

    @Override // j$.time.chrono.a
    public final String l() {
        return "japanese";
    }

    @Override // j$.time.chrono.a
    public final String n() {
        return "Japanese";
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDateTime o(Temporal temporal) {
        return super.o(temporal);
    }

    @Override // j$.time.chrono.a
    public final j$.time.temporal.s r(j$.time.temporal.a aVar) {
        switch (s.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                j$.time.g.b(aVar, "Unsupported field: ");
                return null;
            case 5:
                w[] wVarArr = w.e;
                int year = wVarArr[wVarArr.length - 1].b.getYear();
                int year2 = 1000000000 - wVarArr[wVarArr.length - 1].b.getYear();
                int year3 = wVarArr[0].b.getYear();
                int i = 1;
                while (true) {
                    w[] wVarArr2 = w.e;
                    if (i >= wVarArr2.length) {
                        return j$.time.temporal.s.f(year2, 999999999 - year);
                    }
                    w wVar = wVarArr2[i];
                    year2 = Math.min(year2, (wVar.b.getYear() - year3) + 1);
                    year3 = wVar.b.getYear();
                    i++;
                }
            case 6:
                w wVar2 = w.d;
                long j = j$.time.temporal.a.DAY_OF_YEAR.b.c;
                for (w wVar3 : w.e) {
                    j = Math.min(j, ((wVar3.b.H() ? 366 : 365) - wVar3.b.C()) + 1);
                    if (wVar3.q() != null) {
                        j = Math.min(j, wVar3.q().b.C() - 1);
                    }
                }
                return j$.time.temporal.s.f(j, j$.time.temporal.a.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.s.e(v.d.getYear(), 999999999L);
            case 8:
                long j2 = w.d.a;
                w[] wVarArr3 = w.e;
                return j$.time.temporal.s.e(j2, wVarArr3[wVarArr3.length - 1].a);
            default:
                return aVar.b;
        }
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
