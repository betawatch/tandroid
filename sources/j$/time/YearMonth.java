package j$.time;

import j$.time.format.w;
import j$.time.format.x;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class YearMonth implements Temporal, j$.time.temporal.m, Comparable<YearMonth>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(YearMonth yearMonth) {
        YearMonth yearMonth2 = yearMonth;
        int i10 = this.a - yearMonth2.a;
        return i10 == 0 ? this.b - yearMonth2.b : i10;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.h(j$.time.temporal.a.YEAR, 4, 10, x.EXCEEDS_PAD);
        pVar.c('-');
        pVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.l(Locale.getDefault(), w.SMART, null);
    }

    public static YearMonth of(int i10, int i11) {
        j$.time.temporal.a.YEAR.w(i10);
        j$.time.temporal.a.MONTH_OF_YEAR.w(i11);
        return new YearMonth(i10, i11);
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        YearMonth of2;
        if (temporal instanceof YearMonth) {
            of2 = (YearMonth) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.r.c.equals(j$.com.android.tools.r8.a.N(temporal))) {
                    temporal = LocalDate.I(temporal);
                }
                of2 = of(temporal.j(j$.time.temporal.a.YEAR), temporal.j(j$.time.temporal.a.MONTH_OF_YEAR));
            } catch (b e6) {
                throw new b("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e6);
            }
        }
        if (qVar instanceof ChronoUnit) {
            long G = of2.G() - G();
            switch (s.b[((ChronoUnit) qVar).ordinal()]) {
                case 1:
                    return G;
                case 2:
                    return G / 12;
                case 3:
                    return G / 120;
                case 4:
                    return G / 1200;
                case 5:
                    return G / 12000;
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return of2.y(aVar) - y(aVar);
                default:
                    throw new j$.time.temporal.r("Unsupported unit: " + qVar);
            }
        }
        return qVar.between(this, of2);
    }

    public YearMonth(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final YearMonth K(int i10, int i11) {
        return (this.a == i10 && this.b == i11) ? this : new YearMonth(i10, i11);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.YEAR || oVar == j$.time.temporal.a.MONTH_OF_YEAR || oVar == j$.time.temporal.a.PROLEPTIC_MONTH || oVar == j$.time.temporal.a.YEAR_OF_ERA || oVar == j$.time.temporal.a.ERA : oVar != null && oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.s.e(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        return l(oVar).a(y(oVar), oVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        int i10;
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.m(this);
        }
        int i11 = s.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i11 == 1) {
            i10 = this.b;
        } else {
            if (i11 == 2) {
                return G();
            }
            if (i11 == 3) {
                int i12 = this.a;
                if (i12 < 1) {
                    i12 = 1 - i12;
                }
                return i12;
            }
            if (i11 != 4) {
                if (i11 == 5) {
                    return this.a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
            }
            i10 = this.a;
        }
        return i10;
    }

    public final long G() {
        return ((this.a * 12) + this.b) - 1;
    }

    public int lengthOfMonth() {
        j J = j.J(this.b);
        j$.time.chrono.r rVar = j$.time.chrono.r.c;
        long j10 = this.a;
        rVar.getClass();
        return J.H(j$.time.chrono.r.k(j10));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        localDate.getClass();
        return (YearMonth) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final YearMonth c(long j10, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (YearMonth) oVar.q(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.w(j10);
        int i10 = s.a[aVar.ordinal()];
        if (i10 == 1) {
            int i11 = (int) j10;
            j$.time.temporal.a.MONTH_OF_YEAR.w(i11);
            return K(this.a, i11);
        }
        if (i10 == 2) {
            return I(j10 - G());
        }
        if (i10 == 3) {
            if (this.a < 1) {
                j10 = 1 - j10;
            }
            int i12 = (int) j10;
            j$.time.temporal.a.YEAR.w(i12);
            return K(i12, this.b);
        }
        if (i10 == 4) {
            int i13 = (int) j10;
            j$.time.temporal.a.YEAR.w(i13);
            return K(i13, this.b);
        }
        if (i10 != 5) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
        if (y(j$.time.temporal.a.ERA) == j10) {
            return this;
        }
        int i14 = 1 - this.a;
        j$.time.temporal.a.YEAR.w(i14);
        return K(i14, this.b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final YearMonth d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (YearMonth) qVar.j(this, j10);
        }
        switch (s.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return I(j10);
            case 2:
                return J(j10);
            case 3:
                return J(j$.com.android.tools.r8.a.T(j10, 10));
            case 4:
                return J(j$.com.android.tools.r8.a.T(j10, 100));
            case 5:
                return J(j$.com.android.tools.r8.a.T(j10, MediaDataController.MAX_STYLE_RUNS_COUNT));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.O(y(aVar), j10), aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public final YearMonth J(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return K(aVar.b.a(this.a + j10, aVar), this.b);
    }

    public final YearMonth I(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.a * 12) + (this.b - 1) + j10;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j12 = 12;
        return K(aVar.b.a(j$.com.android.tools.r8.a.S(j11, j12), aVar), ((int) j$.com.android.tools.r8.a.R(j11, j12)) + 1);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object m(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.b) {
            return j$.time.chrono.r.c;
        }
        if (aVar == j$.time.temporal.p.c) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.p.c(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal q(Temporal temporal) {
        if (!j$.com.android.tools.r8.a.N(temporal).equals(j$.time.chrono.r.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return temporal.c(G(), j$.time.temporal.a.PROLEPTIC_MONTH);
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

    public final int hashCode() {
        return this.a ^ (this.b << 27);
    }

    public final String toString() {
        int abs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i10 = this.a;
            if (i10 < 0) {
                sb.append(i10 - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i10 + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.a);
        }
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
