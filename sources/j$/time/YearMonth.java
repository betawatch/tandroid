package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class YearMonth implements Temporal, j$.time.temporal.m, Comparable<YearMonth>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.x.EXCEEDS_PAD);
        pVar.c('-');
        pVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.l(Locale.getDefault(), j$.time.format.w.SMART, null);
    }

    public YearMonth(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static YearMonth of(int i, int i2) {
        j$.time.temporal.a.YEAR.o(i);
        j$.time.temporal.a.MONTH_OF_YEAR.o(i2);
        return new YearMonth(i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 12, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final YearMonth c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (YearMonth) oVar.n(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.o(j);
        int i = u.a[aVar.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.o(i2);
            return x(this.a, i2);
        }
        if (i == 2) {
            return v(j - o());
        }
        if (i == 3) {
            if (this.a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            j$.time.temporal.a.YEAR.o(i3);
            return x(i3, this.b);
        }
        if (i == 4) {
            int i4 = (int) j;
            j$.time.temporal.a.YEAR.o(i4);
            return x(i4, this.b);
        }
        if (i != 5) {
            throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
        }
        if (y(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.a;
        j$.time.temporal.a.YEAR.o(i5);
        return x(i5, this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(YearMonth yearMonth) {
        YearMonth yearMonth2 = yearMonth;
        int i = this.a - yearMonth2.a;
        return i == 0 ? this.b - yearMonth2.b : i;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.YEAR || oVar == j$.time.temporal.a.MONTH_OF_YEAR || oVar == j$.time.temporal.a.PROLEPTIC_MONTH || oVar == j$.time.temporal.a.YEAR_OF_ERA || oVar == j$.time.temporal.a.ERA : oVar != null && oVar.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YearMonth) {
            YearMonth yearMonth = (YearMonth) obj;
            if (this.a == yearMonth.a && this.b == yearMonth.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        YearMonth of;
        if (temporal instanceof YearMonth) {
            of = (YearMonth) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.q.c.equals(a.M(temporal))) {
                    temporal = LocalDate.v(temporal);
                }
                of = of(temporal.j(j$.time.temporal.a.YEAR), temporal.j(j$.time.temporal.a.MONTH_OF_YEAR));
            } catch (c e) {
                g.g("Unable to obtain YearMonth from TemporalAccessor: ", temporal, temporal.getClass().getName(), e);
                return 0L;
            }
        }
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, of);
        }
        long o = of.o() - o();
        switch (u.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return o;
            case 2:
                return o / 12;
            case 3:
                return o / 120;
            case 4:
                return o / 1200;
            case 5:
                return o / 12000;
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return of.y(aVar) - y(aVar);
            default:
                g.b(qVar, "Unsupported unit: ");
                return 0L;
        }
    }

    public final int hashCode() {
        return this.a ^ (this.b << 27);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        return l(oVar).a(y(oVar), oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        localDate.getClass();
        return (YearMonth) a.a(localDate, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.s.e(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.p.d(this, oVar);
    }

    public int lengthOfMonth() {
        l w = l.w(this.b);
        j$.time.chrono.q qVar = j$.time.chrono.q.c;
        long j = this.a;
        qVar.getClass();
        return w.q(j$.time.chrono.q.x(j));
    }

    @Override // j$.time.temporal.m
    public final Temporal n(Temporal temporal) {
        if (!a.M(temporal).equals(j$.time.chrono.q.c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.c(o(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final long o() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final YearMonth d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (YearMonth) qVar.j(this, j);
        }
        switch (u.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return v(j);
            case 2:
                return w(j);
            case 3:
                return w(a.R(j, 10L));
            case 4:
                return w(a.R(j, 100L));
            case 5:
                return w(a.R(j, 1000L));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(a.N(y(aVar), j), aVar);
            default:
                g.b(qVar, "Unsupported unit: ");
                return null;
        }
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.p.b ? j$.time.chrono.q.c : aVar == j$.time.temporal.p.c ? ChronoUnit.MONTHS : j$.time.temporal.p.c(this, aVar);
    }

    public final String toString() {
        int abs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        int i = this.a;
        if (abs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(long j, ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = d(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.d(j2, chronoUnit);
    }

    public final YearMonth v(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return x(aVar.b.a(a.Q(j2, 12L), aVar), ((int) a.P(j2, 12L)) + 1);
    }

    public final YearMonth w(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return x(aVar.b.a(this.a + j, aVar), this.b);
    }

    public final YearMonth x(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        int i;
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.l(this);
        }
        int i2 = u.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return o();
            }
            if (i2 == 3) {
                i = this.a;
                if (i < 1) {
                    i = 1 - i;
                }
            } else {
                if (i2 != 4) {
                    if (i2 == 5) {
                        return this.a < 1 ? 0 : 1;
                    }
                    throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
                }
                i = this.a;
            }
        }
        return i;
    }
}
