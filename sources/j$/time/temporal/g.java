package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public abstract class g implements o {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ g[] b;

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.o
            public final boolean j(l lVar) {
                if (!lVar.e(a.DAY_OF_YEAR) || !lVar.e(a.MONTH_OF_YEAR) || !lVar.e(a.YEAR)) {
                    return false;
                }
                g gVar2 = i.a;
                return j$.time.a.M(lVar).equals(j$.time.chrono.q.c);
            }

            @Override // j$.time.temporal.o
            public final s k(l lVar) {
                if (!j(lVar)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                long y = lVar.y(g.QUARTER_OF_YEAR);
                if (y != 1) {
                    return y == 2 ? s.e(1L, 91L) : (y == 3 || y == 4) ? s.e(1L, 92L) : range();
                }
                long y2 = lVar.y(a.YEAR);
                j$.time.chrono.q.c.getClass();
                return j$.time.chrono.q.x(y2) ? s.e(1L, 91L) : s.e(1L, 90L);
            }

            @Override // j$.time.temporal.o
            public final long l(l lVar) {
                if (!j(lVar)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                int j = lVar.j(a.DAY_OF_YEAR);
                int j2 = lVar.j(a.MONTH_OF_YEAR);
                long y = lVar.y(a.YEAR);
                int i = (j2 - 1) / 3;
                j$.time.chrono.q.c.getClass();
                return j - g.a[i + (j$.time.chrono.q.x(y) ? 4 : 0)];
            }

            @Override // j$.time.temporal.o
            public final Temporal n(Temporal temporal, long j) {
                long l = l(temporal);
                range().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.c((j - l) + temporal.y(aVar), aVar);
            }

            @Override // j$.time.temporal.o
            public final s range() {
                return s.f(90L, 92L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.o
            public final boolean j(l lVar) {
                if (!lVar.e(a.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.a;
                return j$.time.a.M(lVar).equals(j$.time.chrono.q.c);
            }

            @Override // j$.time.temporal.o
            public final s k(l lVar) {
                if (j(lVar)) {
                    return range();
                }
                throw new r("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.o
            public final long l(l lVar) {
                if (j(lVar)) {
                    return (lVar.y(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new r("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.o
            public final Temporal n(Temporal temporal, long j) {
                long l = l(temporal);
                range().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.c(((j - l) * 3) + temporal.y(aVar), aVar);
            }

            @Override // j$.time.temporal.o
            public final s range() {
                return s.e(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.o
            public final boolean j(l lVar) {
                if (!lVar.e(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.a;
                return j$.time.a.M(lVar).equals(j$.time.chrono.q.c);
            }

            @Override // j$.time.temporal.o
            public final s k(l lVar) {
                if (j(lVar)) {
                    return s.e(1L, g.r(g.q(LocalDate.v(lVar))));
                }
                throw new r("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.o
            public final long l(l lVar) {
                if (j(lVar)) {
                    return g.o(LocalDate.v(lVar));
                }
                throw new r("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.o
            public final Temporal n(Temporal temporal, long j) {
                range().b(j, this);
                return temporal.d(j$.time.a.S(j, l(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.o
            public final s range() {
                return s.f(52L, 53L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.o
            public final boolean j(l lVar) {
                if (!lVar.e(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.a;
                return j$.time.a.M(lVar).equals(j$.time.chrono.q.c);
            }

            @Override // j$.time.temporal.o
            public final s k(l lVar) {
                if (j(lVar)) {
                    return a.YEAR.b;
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.o
            public final long l(l lVar) {
                if (j(lVar)) {
                    return g.q(LocalDate.v(lVar));
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.o
            public final Temporal n(Temporal temporal, long j) {
                if (!j(temporal)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                int a2 = a.YEAR.b.a(j, g.WEEK_BASED_YEAR);
                LocalDate v = LocalDate.v(temporal);
                int j2 = v.j(a.DAY_OF_WEEK);
                int o = g.o(v);
                if (o == 53 && g.r(a2) == 52) {
                    o = 52;
                }
                return temporal.k(LocalDate.of(a2, 1, 4).plusDays(((o - 1) * 7) + (j2 - r3.j(r6))));
            }

            @Override // j$.time.temporal.o
            public final s range() {
                return a.YEAR.b;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, kk7.K2, kk7.v4, 0, 91, kk7.L2, kk7.w4};
    }

    public static int o(LocalDate localDate) {
        int ordinal = localDate.x().ordinal();
        int C = localDate.C() - 1;
        int i = (3 - ordinal) + C;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (C < i3) {
            return (int) s.e(1L, r(q(localDate.Q(kk7.J2).N(-1L)))).d;
        }
        int i4 = ((C - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.H())) {
            return i4;
        }
        return 1;
    }

    public static int q(LocalDate localDate) {
        int year = localDate.getYear();
        int C = localDate.C();
        if (C <= 3) {
            return C - localDate.x().ordinal() < -2 ? year - 1 : year;
        }
        if (C >= 363) {
            return ((C - 363) - (localDate.H() ? 1 : 0)) - localDate.x().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    public static int r(int i) {
        LocalDate of = LocalDate.of(i, 1, 1);
        if (of.x() != DayOfWeek.THURSDAY) {
            return (of.x() == DayOfWeek.WEDNESDAY && of.H()) ? 53 : 52;
        }
        return 53;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    @Override // j$.time.temporal.o
    public final boolean isDateBased() {
        return true;
    }
}
