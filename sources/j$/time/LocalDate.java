package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class LocalDate implements Temporal, j$.time.temporal.m, j$.time.chrono.b, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        of(1970, 1, 1);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    public static LocalDate K(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.o(j);
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
        int i2 = ((i * 5) + 2) / kk7.i2;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * kk7.c5) + 5) / 10)) + 1;
        long j7 = j5 + j2 + (i2 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.b.a(j7, aVar), i3, i4);
    }

    public static LocalDate O(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.q.c.getClass();
            i3 = Math.min(i3, j$.time.chrono.q.x((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate now() {
        ZoneId systemDefault = ZoneId.systemDefault();
        Objects.requireNonNull(new b(systemDefault), "clock");
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        Objects.requireNonNull(ofEpochMilli, "instant");
        Objects.requireNonNull(systemDefault, "zone");
        return K(a.Q(ofEpochMilli.a + systemDefault.getRules().getOffset(ofEpochMilli).getTotalSeconds(), 86400L));
    }

    public static LocalDate of(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.o(i);
        j$.time.temporal.a.MONTH_OF_YEAR.o(i2);
        j$.time.temporal.a.DAY_OF_MONTH.o(i3);
        return q(i, i2, i3);
    }

    public static LocalDate q(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.q.c.getClass();
                if (j$.time.chrono.q.x(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    g.e("Invalid date 'February 29' as '", i, "' is not a leap year");
                    return null;
                }
                throw new c("Invalid date '" + l.w(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static LocalDate v(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        LocalDate localDate = (LocalDate) lVar.r(j$.time.temporal.p.f);
        if (localDate != null) {
            return localDate;
        }
        g.f("Unable to obtain LocalDate from TemporalAccessor: ", lVar, lVar.getClass().getName());
        return null;
    }

    private Object writeReplace() {
        return new r((byte) 3, this);
    }

    @Override // j$.time.chrono.b
    public final ChronoLocalDateTime A(j jVar) {
        return LocalDateTime.w(this, jVar);
    }

    public final int C() {
        return (l.w(this.b).o(H()) + this.c) - 1;
    }

    @Override // java.lang.Comparable
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? o((LocalDate) bVar) : a.d(this, bVar);
    }

    public final long F() {
        return ((this.a * 12) + this.b) - 1;
    }

    public final boolean G(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? o((LocalDate) bVar) < 0 : z() < bVar.z();
    }

    public final boolean H() {
        j$.time.chrono.q qVar = j$.time.chrono.q.c;
        long j = this.a;
        qVar.getClass();
        return j$.time.chrono.q.x(j);
    }

    public final int I() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : H() ? 29 : 28;
    }

    public final long J(LocalDate localDate) {
        return (((localDate.F() << 5) + localDate.c) - ((F() << 5) + this.c)) / 32;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (LocalDate) qVar.j(this, j);
        }
        switch (f.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return plusDays(a.R(j, 7L));
            case 3:
                return M(j);
            case 4:
                return N(j);
            case 5:
                return N(a.R(j, 10L));
            case 6:
                return N(a.R(j, 100L));
            case 7:
                return N(a.R(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(a.N(y(aVar), j), aVar);
            default:
                g.b(qVar, "Unsupported unit: ");
                return null;
        }
    }

    public final LocalDate M(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return O(aVar.b.a(a.Q(j2, 12L), aVar), ((int) a.P(j2, 12L)) + 1, this.c);
    }

    public final LocalDate N(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return O(aVar.b.a(this.a + j, aVar), this.b, this.c);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (LocalDate) oVar.n(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.o(j);
        switch (f.a[aVar.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return of(this.a, this.b, i);
                }
                return this;
            case 2:
                return Q((int) j);
            case 3:
                return plusDays(a.R(j - y(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7L));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return R((int) j);
            case 5:
                return plusDays(j - x().getValue());
            case 6:
                return plusDays(j - y(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - y(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return K(j);
            case 9:
                return plusDays(a.R(j - y(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7L));
            case 10:
                int i2 = (int) j;
                if (this.b != i2) {
                    j$.time.temporal.a.MONTH_OF_YEAR.o(i2);
                    return O(this.a, i2, this.c);
                }
                return this;
            case 11:
                return M(j - F());
            case 12:
                return R((int) j);
            case 13:
                if (y(j$.time.temporal.a.ERA) != j) {
                    return R(1 - this.a);
                }
                return this;
            default:
                throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
        }
    }

    public final LocalDate Q(int i) {
        if (C() == i) {
            return this;
        }
        int i2 = this.a;
        long j = i2;
        j$.time.temporal.a.YEAR.o(j);
        j$.time.temporal.a.DAY_OF_YEAR.o(i);
        j$.time.chrono.q.c.getClass();
        boolean x = j$.time.chrono.q.x(j);
        if (i == 366 && !x) {
            g.e("Invalid date 'DayOfYear 366' as '", i2, "' is not a leap year");
            return null;
        }
        l w = l.w(((i - 1) / 31) + 1);
        if (i > (w.q(x) + w.o(x)) - 1) {
            w = l.a[(w.ordinal() + 13) % 12];
        }
        return new LocalDate(i2, w.getValue(), (i - w.o(x)) + 1);
    }

    public final LocalDate R(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.o(i);
        return O(i, this.b, this.c);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.a a() {
        return j$.time.chrono.q.c;
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        j$.time.zone.b e2;
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime w = LocalDateTime.w(this, j.g);
        if (!(zoneId instanceof ZoneOffset) && (e2 = zoneId.getRules().e(w)) != null && e2.j()) {
            w = e2.b.F(e2.d.getTotalSeconds() - e2.c.getTotalSeconds());
        }
        return ZonedDateTime.q(w, zoneId, null);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return a.p(this, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && o((LocalDate) obj) == 0;
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        LocalDate v = v(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, v);
        }
        switch (f.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return v.z() - z();
            case 2:
                return (v.z() - z()) / 7;
            case 3:
                return J(v);
            case 4:
                return J(v) / 12;
            case 5:
                return J(v) / 120;
            case 6:
                return J(v) / 1200;
            case 7:
                return J(v) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return v.y(aVar) - y(aVar);
            default:
                g.b(qVar, "Unsupported unit: ");
                return 0L;
        }
    }

    public int getYear() {
        return this.a;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i = this.a;
        return (i & (-2048)) ^ (((i << 11) + (this.b << 6)) + this.c);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? w(oVar) : j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        return d.b(localDate) ? localDate : (LocalDate) localDate.n(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.k(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
        }
        int i = f.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.e(1L, I());
        }
        if (i == 2) {
            return j$.time.temporal.s.e(1L, H() ? 366 : 365);
        }
        if (i != 3) {
            return i != 4 ? aVar.b : getYear() <= 0 ? j$.time.temporal.s.e(1L, 1000000000L) : j$.time.temporal.s.e(1L, 999999999L);
        }
        return j$.time.temporal.s.e(1L, (l.w(this.b) != l.FEBRUARY || H()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.m
    public final Temporal n(Temporal temporal) {
        return a.a(this, temporal);
    }

    public final int o(LocalDate localDate) {
        int i = this.a - localDate.a;
        return (i == 0 && (i = this.b - localDate.b) == 0) ? this.c - localDate.c : i;
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new LocalDate(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long I = I();
                if (j2 <= I) {
                    return new LocalDate(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new LocalDate(this.a, s + 1, (int) (j2 - I));
                }
                j$.time.temporal.a.YEAR.o(this.a + 1);
                return new LocalDate(this.a + 1, 1, (int) (j2 - I));
            }
        }
        return K(a.N(z(), j));
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.p.f ? this : a.r(this, aVar);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.b s(long j, j$.time.temporal.q qVar) {
        return d(-1L, (ChronoUnit) qVar);
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
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
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
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

    public final int w(j$.time.temporal.o oVar) {
        switch (f.a[((j$.time.temporal.a) oVar).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return C();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return x().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((C() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.r("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((C() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.r("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
        }
    }

    public final DayOfWeek x() {
        return DayOfWeek.o(((int) a.P(z() + 3, 7L)) + 1);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.EPOCH_DAY ? z() : oVar == j$.time.temporal.a.PROLEPTIC_MONTH ? F() : w(oVar) : oVar.l(this);
    }

    @Override // j$.time.chrono.b
    public final long z() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !H() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.w(this, j.g);
    }
}
