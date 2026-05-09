package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
public final class LocalDate implements Temporal, j$.time.temporal.n, j$.time.chrono.b, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    private final int a;
    private final short b;
    private final short c;

    @Override // j$.time.chrono.b
    public final j$.time.chrono.b C(long j, j$.time.temporal.s sVar) {
        return e(-1L, (ChronoUnit) sVar);
    }

    static {
        of(1970, 1, 1);
    }

    public static LocalDate now() {
        a aVar = new a(ZoneId.systemDefault());
        Objects.requireNonNull(aVar, "clock");
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId a = aVar.a();
        Objects.requireNonNull(ofEpochMilli, "instant");
        Objects.requireNonNull(a, "zone");
        return T(j$.com.android.tools.r8.a.k(ofEpochMilli.I() + a.getRules().getOffset(ofEpochMilli).getTotalSeconds(), 86400));
    }

    public static LocalDate S(int i, k kVar, int i2) {
        j$.time.temporal.a.YEAR.G(i);
        Objects.requireNonNull(kVar, "month");
        j$.time.temporal.a.DAY_OF_MONTH.G(i2);
        return H(i, kVar.getValue(), i2);
    }

    public static LocalDate of(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.G(i);
        j$.time.temporal.a.MONTH_OF_YEAR.G(i2);
        j$.time.temporal.a.DAY_OF_MONTH.G(i3);
        return H(i, i2, i3);
    }

    public static LocalDate T(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.G(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / NotificationCenter.messagePlayingGoingToStop;
        return new LocalDate(j$.time.temporal.a.YEAR.x(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * NotificationCenter.premiumPromoUpdated) + 5) / 10)) + 1);
    }

    public static LocalDate I(j$.time.temporal.m mVar) {
        Objects.requireNonNull(mVar, "temporal");
        LocalDate localDate = (LocalDate) mVar.v(j$.time.temporal.l.f());
        if (localDate != null) {
            return localDate;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + mVar + " of type " + mVar.getClass().getName());
    }

    private static LocalDate H(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.s.d.getClass();
                if (j$.time.chrono.s.n(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new c("Invalid date '" + k.J(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    private static LocalDate X(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.s.d.getClass();
            i3 = Math.min(i3, j$.time.chrono.s.n((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    private LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        return j$.time.chrono.h.h(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.r(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (!aVar.v()) {
            throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
        }
        int i = f.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.u.j(1L, Q());
        }
        if (i == 2) {
            return j$.time.temporal.u.j(1L, P() ? 366 : 365);
        }
        if (i == 3) {
            return j$.time.temporal.u.j(1L, (k.J(this.b) != k.FEBRUARY || P()) ? 5L : 4L);
        }
        if (i != 4) {
            return ((j$.time.temporal.a) pVar).k();
        }
        return j$.time.temporal.u.j(1L, getYear() <= 0 ? 1000000000L : 999999999L);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return J(pVar);
        }
        return j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final long r(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.EPOCH_DAY) {
                return s();
            }
            if (pVar == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return N();
            }
            return J(pVar);
        }
        return pVar.l(this);
    }

    private int J(j$.time.temporal.p pVar) {
        int i;
        int i2 = f.a[((j$.time.temporal.a) pVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return L();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return K().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((L() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.t("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((L() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.t("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
        }
        return i + 1;
    }

    private long N() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.l a() {
        return j$.time.chrono.s.d;
    }

    public int getYear() {
        return this.a;
    }

    public final int M() {
        return this.b;
    }

    public final int L() {
        return (k.J(this.b).G(P()) + this.c) - 1;
    }

    public final DayOfWeek K() {
        return DayOfWeek.G(((int) j$.com.android.tools.r8.a.j(s() + 3, 7)) + 1);
    }

    public final boolean P() {
        j$.time.chrono.s sVar = j$.time.chrono.s.d;
        long j = this.a;
        sVar.getClass();
        return j$.time.chrono.s.n(j);
    }

    public final int Q() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : P() ? 29 : 28;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        return localDate instanceof LocalDate ? localDate : (LocalDate) localDate.x(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (LocalDate) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.G(j);
        int i = f.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                return s == i3 ? this : of(i2, s2, i3);
            case 2:
                return a0((int) j);
            case 3:
                return plusDays(j$.com.android.tools.r8.a.l(j - r(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return b0((int) j);
            case 5:
                return plusDays(j - K().getValue());
            case 6:
                return plusDays(j - r(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - r(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return T(j);
            case 9:
                return plusDays(j$.com.android.tools.r8.a.l(j - r(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i4 = (int) j;
                if (s2 == i4) {
                    return this;
                }
                j$.time.temporal.a.MONTH_OF_YEAR.G(i4);
                return X(i2, i4, s);
            case 11:
                return V(j - N());
            case 12:
                return b0((int) j);
            case 13:
                return r(j$.time.temporal.a.ERA) == j ? this : b0(1 - i2);
            default:
                throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
        }
    }

    public final LocalDate b0(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.G(i);
        return X(i, this.b, this.c);
    }

    public final LocalDate a0(int i) {
        if (L() == i) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i2 = this.a;
        long j = i2;
        aVar.G(j);
        j$.time.temporal.a.DAY_OF_YEAR.G(i);
        j$.time.chrono.s.d.getClass();
        boolean n = j$.time.chrono.s.n(j);
        if (i == 366 && !n) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        k J = k.J(((i - 1) / 31) + 1);
        if (i > (J.H(n) + J.G(n)) - 1) {
            J = J.K();
        }
        return new LocalDate(i2, J.getValue(), (i - J.G(n)) + 1);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final LocalDate e(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof ChronoUnit)) {
            return (LocalDate) sVar.k(this, j);
        }
        switch (f.b[((ChronoUnit) sVar).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return plusDays(j$.com.android.tools.r8.a.l(j, 7));
            case 3:
                return V(j);
            case 4:
                return W(j);
            case 5:
                return W(j$.com.android.tools.r8.a.l(j, 10));
            case 6:
                return W(j$.com.android.tools.r8.a.l(j, 100));
            case 7:
                return W(j$.com.android.tools.r8.a.l(j, MediaDataController.MAX_STYLE_RUNS_COUNT));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.f(r(aVar), j), aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final LocalDate W(long j) {
        return j == 0 ? this : X(j$.time.temporal.a.YEAR.x(this.a + j), this.b, this.c);
    }

    public final LocalDate V(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return X(j$.time.temporal.a.YEAR.x(j$.com.android.tools.r8.a.k(j2, j3)), ((int) j$.com.android.tools.r8.a.j(j2, j3)) + 1, this.c);
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long Q = Q();
                if (j2 <= Q) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    return new LocalDate(i, s + 1, (int) (j2 - Q));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.G(i2);
                return new LocalDate(i2, 1, (int) (j2 - Q));
            }
        }
        return T(j$.com.android.tools.r8.a.f(s(), j));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final Object v(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.l.f() ? this : j$.time.chrono.h.j(this, rVar);
    }

    @Override // j$.time.temporal.n
    public final Temporal x(Temporal temporal) {
        return j$.time.chrono.h.a(this, temporal);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, j$.time.temporal.s sVar) {
        LocalDate I = I(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            return sVar.between(this, I);
        }
        switch (f.b[((ChronoUnit) sVar).ordinal()]) {
            case 1:
                return I.s() - s();
            case 2:
                return (I.s() - s()) / 7;
            case 3:
                return R(I);
            case 4:
                return R(I) / 12;
            case 5:
                return R(I) / 120;
            case 6:
                return R(I) / 1200;
            case 7:
                return R(I) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return I.r(aVar) - r(aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    private long R(LocalDate localDate) {
        return (((localDate.N() * 32) + localDate.c) - ((N() * 32) + this.c)) / 32;
    }

    public final Period Y(LocalDate localDate) {
        LocalDate I = I(localDate);
        long N = I.N() - N();
        int i = I.c - this.c;
        if (N > 0 && i < 0) {
            N--;
            i = (int) (I.s() - V(N).s());
        } else if (N < 0 && i > 0) {
            N++;
            i -= I.Q();
        }
        long j = N / 12;
        int i2 = (int) (N % 12);
        int i3 = (int) j;
        if (j == i3) {
            return Period.a(i3, i2, i);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.b
    public final ChronoLocalDateTime t(i iVar) {
        return LocalDateTime.O(this, iVar);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.O(this, i.g);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        j$.time.zone.b e2;
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime O = LocalDateTime.O(this, i.g);
        if (!(zoneId instanceof ZoneOffset) && (e2 = zoneId.getRules().e(O)) != null && e2.x()) {
            O = e2.k();
        }
        return ZonedDateTime.I(O, zoneId, null);
    }

    @Override // j$.time.chrono.b
    public final long s() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !P() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof LocalDate) {
            return G((LocalDate) bVar);
        }
        return j$.time.chrono.h.b(this, bVar);
    }

    final int G(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    public final boolean O(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? G((LocalDate) bVar) < 0 : s() < bVar.s();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && G((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i = this.a;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void c0(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
    }
}
