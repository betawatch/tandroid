package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class u extends a implements Serializable {
    public static final u c = new u();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.k
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.k
    public final String m() {
        return "japanese";
    }

    @Override // j$.time.chrono.k
    public final b a(j$.time.temporal.l lVar) {
        if (lVar instanceof w) {
            return (w) lVar;
        }
        return new w(LocalDate.I(lVar));
    }

    private u() {
    }

    @Override // j$.time.chrono.k
    public final l C(int i) {
        return x.n(i);
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.s y(j$.time.temporal.a aVar) {
        switch (t.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.r("Unsupported field: " + aVar);
            case 5:
                x[] xVarArr = x.e;
                int year = xVarArr[xVarArr.length - 1].b.getYear();
                int year2 = 1000000000 - xVarArr[xVarArr.length - 1].b.getYear();
                int year3 = xVarArr[0].b.getYear();
                for (int i = 1; i < xVarArr.length; i++) {
                    x xVar = xVarArr[i];
                    year2 = Math.min(year2, (xVar.b.getYear() - year3) + 1);
                    year3 = xVar.b.getYear();
                }
                return j$.time.temporal.s.f(year2, 999999999 - year);
            case 6:
                x xVar2 = x.d;
                j$.time.temporal.s sVar = j$.time.temporal.a.DAY_OF_YEAR.b;
                x[] xVarArr2 = x.e;
                long j = sVar.c;
                for (x xVar3 : xVarArr2) {
                    j = Math.min(j, ((xVar3.b.O() ? 366 : 365) - xVar3.b.L()) + 1);
                    if (xVar3.m() != null) {
                        j = Math.min(j, xVar3.m().b.L() - 1);
                    }
                }
                return j$.time.temporal.s.f(j, j$.time.temporal.a.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.s.e(w.d.getYear(), 999999999L);
            case 8:
                long j2 = x.d.a;
                x[] xVarArr3 = x.e;
                return j$.time.temporal.s.e(j2, xVarArr3[xVarArr3.length - 1].a);
            default:
                return aVar.b;
        }
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime A(Instant instant, ZoneId zoneId) {
        return j.H(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new D((byte) 1, this);
    }
}
