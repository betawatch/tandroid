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
        int i = this.a - lVar.a;
        return i == 0 ? this.b - lVar.b : i;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.d("--");
        pVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.c('-');
        pVar.g(j$.time.temporal.a.DAY_OF_MONTH, 2);
        pVar.l(Locale.getDefault(), w.SMART, null);
    }

    public l(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // j$.time.temporal.l
    public final boolean h(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.MONTH_OF_YEAR || oVar == j$.time.temporal.a.DAY_OF_MONTH : oVar != null && oVar.p(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return oVar.l();
        }
        if (oVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.p.d(this, oVar);
        }
        j J = j.J(this.a);
        J.getClass();
        int i = i.a[J.ordinal()];
        return j$.time.temporal.s.f(i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, j.J(r5).I());
    }

    @Override // j$.time.temporal.l
    public final int o(j$.time.temporal.o oVar) {
        return q(oVar).a(u(oVar), oVar);
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        int i;
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.o(this);
        }
        int i2 = k.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.b) {
            return j$.time.chrono.r.c;
        }
        return j$.time.temporal.p.c(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal x(Temporal temporal) {
        if (!j$.com.android.tools.r8.a.N(temporal).equals(j$.time.chrono.r.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        Temporal e = temporal.e(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return e.e(Math.min(e.q(aVar).d, this.b), aVar);
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
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
