package j$.time;

import j$.time.format.p;
import j$.time.format.x;
import j$.time.temporal.q;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class YearMonth implements j$.time.temporal.k, Comparable<YearMonth>, Serializable {
    private final int a;
    private final int b;

    @Override // java.lang.Comparable
    public final int compareTo(YearMonth yearMonth) {
        YearMonth yearMonth2 = yearMonth;
        int i = this.a - yearMonth2.a;
        return i == 0 ? this.b - yearMonth2.b : i;
    }

    static {
        p pVar = new p();
        pVar.m(j$.time.temporal.a.YEAR, 4, 10, x.EXCEEDS_PAD);
        pVar.e('-');
        pVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.v(Locale.getDefault());
    }

    public static YearMonth of(int i, int i2) {
        j$.time.temporal.a.YEAR.j(i);
        j$.time.temporal.a.MONTH_OF_YEAR.j(i2);
        return new YearMonth(i, i2);
    }

    private YearMonth(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // j$.time.temporal.k
    public final boolean j(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.YEAR || lVar == j$.time.temporal.a.MONTH_OF_YEAR || lVar == j$.time.temporal.a.PROLEPTIC_MONTH || lVar == j$.time.temporal.a.YEAR_OF_ERA || lVar == j$.time.temporal.a.ERA : lVar != null && lVar.g(this);
    }

    @Override // j$.time.temporal.k
    public final q i(j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return q.i(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.j.c(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.a aVar) {
        return i(aVar).a(f(aVar), aVar);
    }

    @Override // j$.time.temporal.k
    public final long f(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            int i = l.a[((j$.time.temporal.a) lVar).ordinal()];
            int i2 = this.b;
            if (i == 1) {
                return i2;
            }
            int i3 = this.a;
            if (i == 2) {
                return ((i3 * 12) + i2) - 1;
            }
            if (i == 3) {
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i == 4) {
                return i3;
            }
            if (i == 5) {
                return i3 < 1 ? 0 : 1;
            }
            throw new j$.time.temporal.p("Unsupported field: " + lVar);
        }
        return lVar.f(this);
    }

    public int lengthOfMonth() {
        j n = j.n(this.b);
        j$.time.chrono.f fVar = j$.time.chrono.f.a;
        long j = this.a;
        fVar.getClass();
        return n.m(j$.time.chrono.f.f(j));
    }

    @Override // j$.time.temporal.k
    public final Object g(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.d()) {
            return j$.time.chrono.f.a;
        }
        if (nVar == j$.time.temporal.j.h()) {
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.j.b(this, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YearMonth)) {
            return false;
        }
        YearMonth yearMonth = (YearMonth) obj;
        return this.a == yearMonth.a && this.b == yearMonth.b;
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    public final String toString() {
        int i = this.a;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (abs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }
}
