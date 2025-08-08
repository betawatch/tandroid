package j$.time;

import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.util.A;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
public final class LocalDate implements j$.time.temporal.k, j$.time.chrono.b, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private final int a;
    private final short b;
    private final short c;

    public static LocalDate now() {
        a aVar = new a(ZoneId.systemDefault());
        return u(j$.com.android.tools.r8.a.i(Instant.q(System.currentTimeMillis()).o() + aVar.a().getRules().getOffset(r1).getTotalSeconds(), 86400L));
    }

    public static LocalDate of(int i, int i2, int i3) {
        long j = i;
        j$.time.temporal.a.YEAR.j(j);
        j$.time.temporal.a.MONTH_OF_YEAR.j(i2);
        j$.time.temporal.a.DAY_OF_MONTH.j(i3);
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.f.a.getClass();
                if (j$.time.chrono.f.f(j)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new c("Invalid date '" + j.n(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate u(long j) {
        long j2;
        long j3 = j + 719468;
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
        int i2 = ((i * 5) + 2) / NotificationCenter.recordStartError;
        return new LocalDate(j$.time.temporal.a.YEAR.i(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * NotificationCenter.wallpaperSettedToUser) + 5) / 10)) + 1);
    }

    public static LocalDate n(j$.time.temporal.k kVar) {
        A.z(kVar, "temporal");
        LocalDate localDate = (LocalDate) kVar.g(j$.time.temporal.j.e());
        if (localDate != null) {
            return localDate;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + kVar + " of type " + kVar.getClass().getName());
    }

    @Override // j$.time.temporal.k
    public final boolean j(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) lVar).h();
        }
        return lVar != null && lVar.g(this);
    }

    private static LocalDate w(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.f.a.getClass();
            i3 = Math.min(i3, j$.time.chrono.f.f((long) i) ? 29 : 28);
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

    @Override // j$.time.temporal.k
    public final q i(j$.time.temporal.a aVar) {
        if (aVar instanceof j$.time.temporal.a) {
            if (aVar.h()) {
                int i = f.a[aVar.ordinal()];
                if (i == 1) {
                    return q.i(1L, t());
                }
                if (i == 2) {
                    return q.i(1L, s() ? 366 : 365);
                }
                if (i == 3) {
                    return q.i(1L, (j.n(this.b) != j.FEBRUARY || s()) ? 5L : 4L);
                }
                if (i != 4) {
                    return aVar.m();
                }
                return q.i(1L, getYear() <= 0 ? 1000000000L : 999999999L);
            }
            throw new p("Unsupported field: " + aVar);
        }
        aVar.getClass();
        return i(aVar);
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.a aVar) {
        if (aVar instanceof j$.time.temporal.a) {
            return o(aVar);
        }
        return j$.time.temporal.j.a(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final long f(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            if (lVar == j$.time.temporal.a.EPOCH_DAY) {
                return x();
            }
            if (lVar == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return r();
            }
            return o(lVar);
        }
        return lVar.f(this);
    }

    private int o(j$.time.temporal.l lVar) {
        int i;
        int q;
        int i2 = f.a[((j$.time.temporal.a) lVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return q();
            case 3:
                i = (s - 1) / 7;
                return i + 1;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return p().ordinal() + 1;
            case 6:
                i = (s - 1) % 7;
                return i + 1;
            case 7:
                q = (q() - 1) % 7;
                return q + 1;
            case 8:
                throw new p("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                q = (q() - 1) / 7;
                return q + 1;
            case 10:
                return this.b;
            case 11:
                throw new p("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new p("Unsupported field: " + lVar);
        }
    }

    private long r() {
        return ((this.a * 12) + this.b) - 1;
    }

    public int getYear() {
        return this.a;
    }

    public final int q() {
        return (j.n(this.b).l(s()) + this.c) - 1;
    }

    public final DayOfWeek p() {
        return DayOfWeek.l(((int) j$.com.android.tools.r8.a.h(x() + 3, 7L)) + 1);
    }

    public final boolean s() {
        j$.time.chrono.f fVar = j$.time.chrono.f.a;
        long j = this.a;
        fVar.getClass();
        return j$.time.chrono.f.f(j);
    }

    public final int t() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : s() ? 29 : 28;
    }

    public final LocalDate z() {
        if (q() == 180) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i = this.a;
        long j = i;
        aVar.j(j);
        j$.time.temporal.a.DAY_OF_YEAR.j(NotificationCenter.suggestedFiltersLoaded);
        j$.time.chrono.f.a.getClass();
        boolean f = j$.time.chrono.f.f(j);
        j n = j.n(6);
        if (180 > (n.m(f) + n.l(f)) - 1) {
            n = n.o();
        }
        return new LocalDate(i, n.ordinal() + 1, 181 - n.l(f));
    }

    public final LocalDate v(long j) {
        return j == 0 ? this : w(j$.time.temporal.a.YEAR.i(this.a + j), this.b, this.c);
    }

    public LocalDate plusDays(long j) {
        return j == 0 ? this : u(j$.com.android.tools.r8.a.f(x(), j));
    }

    @Override // j$.time.temporal.k
    public final Object g(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.e()) {
            return this;
        }
        if (nVar == j$.time.temporal.j.j() || nVar == j$.time.temporal.j.i() || nVar == j$.time.temporal.j.g() || nVar == j$.time.temporal.j.f()) {
            return null;
        }
        if (nVar != j$.time.temporal.j.d()) {
            if (nVar == j$.time.temporal.j.h()) {
                return j$.time.temporal.b.DAYS;
            }
            return nVar.a(this);
        }
        return j$.time.chrono.f.a;
    }

    public final Period y(LocalDate localDate) {
        LocalDate w;
        LocalDate n = n(localDate);
        long r = n.r() - r();
        short s = n.c;
        short s2 = this.c;
        int i = s - s2;
        if (r > 0 && i < 0) {
            r--;
            if (r == 0) {
                w = this;
            } else {
                long j = (this.a * 12) + (this.b - 1) + r;
                w = w(j$.time.temporal.a.YEAR.i(j$.com.android.tools.r8.a.i(j, 12L)), ((int) j$.com.android.tools.r8.a.h(j, 12L)) + 1, s2);
            }
            i = (int) (n.x() - w.x());
        } else if (r < 0 && i > 0) {
            r++;
            i -= n.t();
        }
        long j2 = r / 12;
        int i2 = (int) (r % 12);
        int i3 = (int) j2;
        if (j2 == i3) {
            return Period.a(i3, i2, i);
        }
        throw new ArithmeticException();
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.s(this, h.g);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        j$.time.zone.a e2;
        A.z(zoneId, "zone");
        LocalDateTime s = LocalDateTime.s(this, h.g);
        if (!(zoneId instanceof ZoneOffset) && (e2 = zoneId.getRules().e(s)) != null && e2.m()) {
            s = e2.f();
        }
        return ZonedDateTime.m(s, zoneId);
    }

    public final long x() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !s() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (!(bVar instanceof LocalDate)) {
            int compare = Long.compare(x(), ((LocalDate) bVar).x());
            if (compare != 0) {
                return compare;
            }
            j$.time.chrono.f.a.getClass();
            return 0;
        }
        return m((LocalDate) bVar);
    }

    final int m(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && m((LocalDate) obj) == 0;
    }

    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

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
}
