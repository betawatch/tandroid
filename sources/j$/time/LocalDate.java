package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
public final class LocalDate implements j$.time.temporal.m, j$.time.temporal.p, j$.time.chrono.b, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    private final int a;
    private final short b;
    private final short c;

    static {
        of(1970, 1, 1);
    }

    public static LocalDate now() {
        a aVar = new a(ZoneId.systemDefault());
        Objects.requireNonNull(aVar, "clock");
        Instant F = Instant.F(System.currentTimeMillis());
        ZoneId a = aVar.a();
        Objects.requireNonNull(F, "instant");
        Objects.requireNonNull(a, "zone");
        return N(j$.com.android.tools.r8.a.k(F.D() + a.getRules().getOffset(F).getTotalSeconds(), 86400));
    }

    public static LocalDate M(int i, l lVar, int i2) {
        j$.time.temporal.a.YEAR.B(i);
        Objects.requireNonNull(lVar, "month");
        j$.time.temporal.a.DAY_OF_MONTH.B(i2);
        return C(i, lVar.getValue(), i2);
    }

    public static LocalDate of(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.B(i);
        j$.time.temporal.a.MONTH_OF_YEAR.B(i2);
        j$.time.temporal.a.DAY_OF_MONTH.B(i3);
        return C(i, i2, i3);
    }

    public static LocalDate N(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.B(j);
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
        int i2 = ((i * 5) + 2) / NotificationCenter.recordProgressChanged;
        return new LocalDate(j$.time.temporal.a.YEAR.v(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * NotificationCenter.premiumStickersPreviewLoaded) + 5) / 10)) + 1);
    }

    public static LocalDate D(j$.time.temporal.o oVar) {
        Objects.requireNonNull(oVar, "temporal");
        LocalDate localDate = (LocalDate) oVar.u(j$.time.temporal.n.f());
        if (localDate != null) {
            return localDate;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + oVar + " of type " + oVar.getClass().getName());
    }

    private static LocalDate C(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.s.d.getClass();
                if (j$.time.chrono.s.l(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new c("Invalid date '" + l.E(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    private static LocalDate R(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.s.d.getClass();
            i3 = Math.min(i3, j$.time.chrono.s.l((long) i) ? 29 : 28);
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

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return j$.time.chrono.h.h(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        if (!aVar.u()) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        int i = g.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.w.j(1L, L());
        }
        if (i == 2) {
            return j$.time.temporal.w.j(1L, K() ? 366 : 365);
        }
        if (i == 3) {
            return j$.time.temporal.w.j(1L, (l.E(this.b) != l.FEBRUARY || K()) ? 5L : 4L);
        }
        if (i != 4) {
            return ((j$.time.temporal.a) rVar).i();
        }
        return j$.time.temporal.w.j(1L, getYear() <= 0 ? 1000000000L : 999999999L);
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return E(rVar);
        }
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.EPOCH_DAY) {
                return s();
            }
            if (rVar == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return I();
            }
            return E(rVar);
        }
        return rVar.j(this);
    }

    private int E(j$.time.temporal.r rVar) {
        int i;
        int i2 = g.a[((j$.time.temporal.a) rVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return G();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return F().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((G() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.v("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((G() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.v("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return i + 1;
    }

    private long I() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.l a() {
        return j$.time.chrono.s.d;
    }

    public int getYear() {
        return this.a;
    }

    public final int H() {
        return this.b;
    }

    public final int G() {
        return (l.E(this.b).B(K()) + this.c) - 1;
    }

    public final DayOfWeek F() {
        return DayOfWeek.B(((int) j$.com.android.tools.r8.a.j(s() + 3, 7)) + 1);
    }

    public final boolean K() {
        j$.time.chrono.s sVar = j$.time.chrono.s.d;
        long j = this.a;
        sVar.getClass();
        return j$.time.chrono.s.l(j);
    }

    public final int L() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : K() ? 29 : 28;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        return localDate instanceof LocalDate ? localDate : (LocalDate) localDate.v(this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (LocalDate) rVar.m(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.B(j);
        int i = g.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                return s == i3 ? this : of(i2, s2, i3);
            case 2:
                return U((int) j);
            case 3:
                return plusDays(j$.com.android.tools.r8.a.l(j - r(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return V((int) j);
            case 5:
                return plusDays(j - F().getValue());
            case 6:
                return plusDays(j - r(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - r(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return N(j);
            case 9:
                return plusDays(j$.com.android.tools.r8.a.l(j - r(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i4 = (int) j;
                if (s2 == i4) {
                    return this;
                }
                j$.time.temporal.a.MONTH_OF_YEAR.B(i4);
                return R(i2, i4, s);
            case 11:
                return P(j - I());
            case 12:
                return V((int) j);
            case 13:
                return r(j$.time.temporal.a.ERA) == j ? this : V(1 - i2);
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public final LocalDate V(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.B(i);
        return R(i, this.b, this.c);
    }

    public final LocalDate U(int i) {
        if (G() == i) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i2 = this.a;
        long j = i2;
        aVar.B(j);
        j$.time.temporal.a.DAY_OF_YEAR.B(i);
        j$.time.chrono.s.d.getClass();
        boolean l = j$.time.chrono.s.l(j);
        if (i == 366 && !l) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        l E = l.E(((i - 1) / 31) + 1);
        if (i > (E.C(l) + E.B(l)) - 1) {
            E = E.F();
        }
        return new LocalDate(i2, E.getValue(), (i - E.B(l)) + 1);
    }

    @Override // j$.time.temporal.m
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final LocalDate e(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (LocalDate) uVar.i(this, j);
        }
        switch (g.b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return plusDays(j$.com.android.tools.r8.a.l(j, 7));
            case 3:
                return P(j);
            case 4:
                return Q(j);
            case 5:
                return Q(j$.com.android.tools.r8.a.l(j, 10));
            case 6:
                return Q(j$.com.android.tools.r8.a.l(j, 100));
            case 7:
                return Q(j$.com.android.tools.r8.a.l(j, MediaDataController.MAX_STYLE_RUNS_COUNT));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.f(r(aVar), j), aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public final LocalDate Q(long j) {
        return j == 0 ? this : R(j$.time.temporal.a.YEAR.v(this.a + j), this.b, this.c);
    }

    public final LocalDate P(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return R(j$.time.temporal.a.YEAR.v(j$.com.android.tools.r8.a.k(j2, j3)), ((int) j$.com.android.tools.r8.a.j(j2, j3)) + 1, this.c);
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
                long L = L();
                if (j2 <= L) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    return new LocalDate(i, s + 1, (int) (j2 - L));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.B(i2);
                return new LocalDate(i2, 1, (int) (j2 - L));
            }
        }
        return N(j$.com.android.tools.r8.a.f(s(), j));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.f() ? this : j$.time.chrono.h.j(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return j$.time.chrono.h.a(this, mVar);
    }

    public final Period S(LocalDate localDate) {
        LocalDate D = D(localDate);
        long I = D.I() - I();
        int i = D.c - this.c;
        if (I > 0 && i < 0) {
            I--;
            i = (int) (D.s() - P(I).s());
        } else if (I < 0 && i > 0) {
            I++;
            i -= D.L();
        }
        long j = I / 12;
        int i2 = (int) (I % 12);
        int i3 = (int) j;
        if (j == i3) {
            return Period.a(i3, i2, i);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.b
    public final ChronoLocalDateTime t(j jVar) {
        return LocalDateTime.J(this, jVar);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.J(this, j.g);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        j$.time.zone.b e2;
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime J = LocalDateTime.J(this, j.g);
        if (!(zoneId instanceof ZoneOffset) && (e2 = zoneId.getRules().e(J)) != null && e2.v()) {
            J = e2.i();
        }
        return ZonedDateTime.B(J, zoneId, null);
    }

    @Override // j$.time.chrono.b
    public final long s() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !K() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof LocalDate) {
            return B((LocalDate) bVar);
        }
        return j$.time.chrono.h.b(this, bVar);
    }

    final int B(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    public final boolean J(LocalDate localDate) {
        return localDate instanceof LocalDate ? B(localDate) < 0 : s() < localDate.s();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && B((LocalDate) obj) == 0;
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

    final void W(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
    }
}
