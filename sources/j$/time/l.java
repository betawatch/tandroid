package j$.time;

import j$.time.format.w;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class l implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        int i7 = this.a - lVar.a;
        return i7 == 0 ? this.b - lVar.b : i7;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.d("--");
        pVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.c('-');
        pVar.g(j$.time.temporal.a.DAY_OF_MONTH, 2);
        pVar.l(Locale.getDefault(), w.SMART, null);
    }

    public l(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.MONTH_OF_YEAR || oVar == j$.time.temporal.a.DAY_OF_MONTH : oVar != null && oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return oVar.l();
        }
        if (oVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.p.d(this, oVar);
        }
        j J = j.J(this.a);
        J.getClass();
        int i7 = i.a[J.ordinal()];
        return j$.time.temporal.s.f(i7 != 1 ? (i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) ? 30 : 31 : 28, j.J(this.a).I());
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        return l(oVar).a(y(oVar), oVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        int i7;
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.m(this);
        }
        int i10 = k.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i10 == 1) {
            i7 = this.b;
        } else {
            if (i10 != 2) {
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
            }
            i7 = this.a;
        }
        return i7;
    }

    @Override // j$.time.temporal.l
    public final Object m(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.b) {
            return j$.time.chrono.r.c;
        }
        return j$.time.temporal.p.c(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal q(Temporal temporal) {
        if (!j$.com.android.tools.r8.a.M(temporal).equals(j$.time.chrono.r.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        Temporal c10 = temporal.c(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return c10.c(Math.min(c10.l(aVar).d, this.b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.a == lVar.a && this.b == lVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.a < 10 ? "0" : "");
        sb2.append(this.a);
        sb2.append(this.b < 10 ? "-0" : "-");
        sb2.append(this.b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new p((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
