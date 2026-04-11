package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class YearMonth implements Temporal, j$.time.temporal.n, Comparable<YearMonth>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    private final int a;
    private final int b;

    @Override // java.lang.Comparable
    public final int compareTo(YearMonth yearMonth) {
        YearMonth yearMonth2 = yearMonth;
        int i = this.a - yearMonth2.a;
        return i == 0 ? this.b - yearMonth2.b : i;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.m(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.x.EXCEEDS_PAD);
        pVar.e('-');
        pVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.w(Locale.getDefault());
    }

    public static YearMonth of(int i, int i2) {
        j$.time.temporal.a.YEAR.I(i);
        j$.time.temporal.a.MONTH_OF_YEAR.I(i2);
        return new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, j$.time.temporal.s sVar) {
        YearMonth of;
        if (temporal instanceof YearMonth) {
            of = (YearMonth) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.s.d.equals(j$.time.chrono.h.q(temporal))) {
                    temporal = LocalDate.K(temporal);
                }
                of = of(temporal.l(j$.time.temporal.a.YEAR), temporal.l(j$.time.temporal.a.MONTH_OF_YEAR));
            } catch (c e) {
                throw new c("Unable to obtain YearMonth from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (sVar instanceof ChronoUnit) {
            long I = of.I() - I();
            switch (u.b[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return I;
                case 2:
                    return I / 12;
                case 3:
                    return I / 120;
                case 4:
                    return I / 1200;
                case 5:
                    return I / 12000;
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return of.s(aVar) - s(aVar);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return sVar.between(this, of);
    }

    private YearMonth(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private YearMonth M(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.PROLEPTIC_MONTH || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.n(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.j(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        return o(pVar).a(s(pVar), pVar);
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = u.a[((j$.time.temporal.a) pVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return I();
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
        throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
    }

    private long I() {
        return ((this.a * 12) + this.b) - 1;
    }

    public int lengthOfMonth() {
        l L = l.L(this.b);
        j$.time.chrono.s sVar = j$.time.chrono.s.d;
        long j = this.a;
        sVar.getClass();
        return L.J(j$.time.chrono.s.n(j));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        localDate.getClass();
        return (YearMonth) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final YearMonth d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (YearMonth) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.I(j);
        int i = u.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.I(i3);
            return M(i2, i3);
        }
        if (i == 2) {
            return K(j - I());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.I(i5);
            return M(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.I(i6);
            return M(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
        }
        if (s(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.I(i7);
        return M(i7, i4);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final YearMonth e(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof ChronoUnit)) {
            return (YearMonth) sVar.k(this, j);
        }
        switch (u.b[((ChronoUnit) sVar).ordinal()]) {
            case 1:
                return K(j);
            case 2:
                return L(j);
            case 3:
                return L(j$.com.android.tools.r8.a.l(j, 10));
            case 4:
                return L(j$.com.android.tools.r8.a.l(j, 100));
            case 5:
                return L(j$.com.android.tools.r8.a.l(j, MediaDataController.MAX_STYLE_RUNS_COUNT));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.f(s(aVar), j), aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final YearMonth L(long j) {
        return j == 0 ? this : M(j$.time.temporal.a.YEAR.z(this.a + j), this.b);
    }

    public final YearMonth K(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return M(j$.time.temporal.a.YEAR.z(j$.com.android.tools.r8.a.k(j2, j3)), ((int) j$.com.android.tools.r8.a.j(j2, j3)) + 1);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final Object w(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return j$.time.chrono.s.d;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.n
    public final Temporal z(Temporal temporal) {
        if (!((j$.time.chrono.a) j$.time.chrono.h.q(temporal)).equals(j$.time.chrono.s.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.d(I(), j$.time.temporal.a.PROLEPTIC_MONTH);
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

    private Object writeReplace() {
        return new r((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void O(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
    }
}
