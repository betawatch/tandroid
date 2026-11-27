package j$.time;

import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class n implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.d("--");
        pVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.c('-');
        pVar.g(j$.time.temporal.a.DAY_OF_MONTH, 2);
        pVar.l(Locale.getDefault(), j$.time.format.w.SMART, null);
    }

    public n(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 13, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        int i = this.a - nVar.a;
        return i == 0 ? this.b - nVar.b : i;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.MONTH_OF_YEAR || oVar == j$.time.temporal.a.DAY_OF_MONTH : oVar != null && oVar.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.a == nVar.a && this.b == nVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        return l(oVar).a(y(oVar), oVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return oVar.range();
        }
        if (oVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.p.d(this, oVar);
        }
        l w = l.w(this.a);
        w.getClass();
        int i = k.a[w.ordinal()];
        return j$.time.temporal.s.f(i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, l.w(this.a).v());
    }

    @Override // j$.time.temporal.m
    public final Temporal n(Temporal temporal) {
        if (!a.M(temporal).equals(j$.time.chrono.q.c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        Temporal c2 = temporal.c(this.a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return c2.c(Math.min(c2.l(aVar).d, this.b), aVar);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.p.b ? j$.time.chrono.q.c : j$.time.temporal.p.c(this, aVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.a < 10 ? "0" : "");
        sb.append(this.a);
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        int i;
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.l(this);
        }
        int i2 = m.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
            }
            i = this.a;
        }
        return i;
    }
}
