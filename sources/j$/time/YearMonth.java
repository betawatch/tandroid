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
        int i = this.a - yearMonth2.a;
        return i == 0 ? this.b - yearMonth2.b : i;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.h(j$.time.temporal.a.YEAR, 4, 10, x.EXCEEDS_PAD);
        pVar.c('-');
        pVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.l(Locale.getDefault(), w.SMART, null);
    }

    public static YearMonth of(int i, int i2) {
        j$.time.temporal.a.YEAR.x(i);
        j$.time.temporal.a.MONTH_OF_YEAR.x(i2);
        return new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        YearMonth of;
        if (temporal instanceof YearMonth) {
            of = (YearMonth) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.r.c.equals(j$.com.android.tools.r8.a.N(temporal))) {
                    temporal = LocalDate.I(temporal);
                }
                of = of(temporal.o(j$.time.temporal.a.YEAR), temporal.o(j$.time.temporal.a.MONTH_OF_YEAR));
            } catch (b e) {
                throw new b("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (qVar instanceof ChronoUnit) {
            long E = of.E() - E();
            switch (s.b[((ChronoUnit) qVar).ordinal()]) {
                case 1:
                    return E;
                case 2:
                    return E / 12;
                case 3:
                    return E / 120;
                case 4:
                    return E / 1200;
                case 5:
                    return E / 12000;
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return of.u(aVar) - u(aVar);
                default:
                    throw new j$.time.temporal.r("Unsupported unit: " + qVar);
            }
        }
        return qVar.between(this, of);
    }

    public YearMonth(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final YearMonth K(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.l
    public final boolean h(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.YEAR || oVar == j$.time.temporal.a.MONTH_OF_YEAR || oVar == j$.time.temporal.a.PROLEPTIC_MONTH || oVar == j$.time.temporal.a.YEAR_OF_ERA || oVar == j$.time.temporal.a.ERA : oVar != null && oVar.p(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.s.e(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final int o(j$.time.temporal.o oVar) {
        return q(oVar).a(u(oVar), oVar);
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.o(this);
        }
        int i = s.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return E();
        }
        int i2 = this.a;
        if (i == 3) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 4) {
            return i2;
        }
        if (i == 5) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
    }

    public final long E() {
        return ((this.a * 12) + this.b) - 1;
    }

    public int lengthOfMonth() {
        j J = j.J(this.b);
        j$.time.chrono.r rVar = j$.time.chrono.r.c;
        long j = this.a;
        rVar.getClass();
        return J.H(j$.time.chrono.r.o(j));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(LocalDate localDate) {
        localDate.getClass();
        return (YearMonth) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final YearMonth e(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (YearMonth) oVar.q(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.x(j);
        int i = s.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.x(i3);
            return K(i2, i3);
        }
        if (i == 2) {
            return I(j - E());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.x(i5);
            return K(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.x(i6);
            return K(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
        if (u(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.x(i7);
        return K(i7, i4);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final YearMonth f(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (YearMonth) qVar.l(this, j);
        }
        switch (s.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return I(j);
            case 2:
                return J(j);
            case 3:
                return J(j$.com.android.tools.r8.a.T(j, 10));
            case 4:
                return J(j$.com.android.tools.r8.a.T(j, 100));
            case 5:
                return J(j$.com.android.tools.r8.a.T(j, MediaDataController.MAX_STYLE_RUNS_COUNT));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return e(j$.com.android.tools.r8.a.O(u(aVar), j), aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public final YearMonth J(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return K(aVar.b.a(this.a + j, aVar), this.b);
    }

    public final YearMonth I(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return K(aVar.b.a(j$.com.android.tools.r8.a.S(j2, j3), aVar), ((int) j$.com.android.tools.r8.a.R(j2, j3)) + 1);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.b) {
            return j$.time.chrono.r.c;
        }
        if (aVar == j$.time.temporal.p.c) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.p.c(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal x(Temporal temporal) {
        if (!j$.com.android.tools.r8.a.N(temporal).equals(j$.time.chrono.r.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return temporal.e(E(), j$.time.temporal.a.PROLEPTIC_MONTH);
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

    private Object writeReplace() {
        return new p((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
