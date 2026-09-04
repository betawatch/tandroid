package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class g implements o {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ g[] b;

    @Override // j$.time.temporal.o
    public final boolean isDateBased() {
        return true;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.o
            public final s l() {
                return s.f(90L, 92L);
            }

            @Override // j$.time.temporal.o
            public final boolean j(l lVar) {
                if (!lVar.e(a.DAY_OF_YEAR) || !lVar.e(a.MONTH_OF_YEAR) || !lVar.e(a.YEAR)) {
                    return false;
                }
                g gVar2 = i.a;
                return j$.com.android.tools.r8.a.N(lVar).equals(j$.time.chrono.r.c);
            }

            @Override // j$.time.temporal.o
            public final s k(l lVar) {
                if (!j(lVar)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                long y3 = lVar.y(g.QUARTER_OF_YEAR);
                if (y3 == 1) {
                    long y10 = lVar.y(a.YEAR);
                    j$.time.chrono.r.c.getClass();
                    return j$.time.chrono.r.k(y10) ? s.e(1L, 91L) : s.e(1L, 90L);
                }
                if (y3 == 2) {
                    return s.e(1L, 91L);
                }
                if (y3 == 3 || y3 == 4) {
                    return s.e(1L, 92L);
                }
                return l();
            }

            @Override // j$.time.temporal.o
            public final long m(l lVar) {
                if (!j(lVar)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                int j3 = lVar.j(a.DAY_OF_YEAR);
                int j10 = lVar.j(a.MONTH_OF_YEAR);
                long y3 = lVar.y(a.YEAR);
                int i10 = (j10 - 1) / 3;
                j$.time.chrono.r.c.getClass();
                return j3 - g.a[i10 + (j$.time.chrono.r.k(y3) ? 4 : 0)];
            }

            @Override // j$.time.temporal.o
            public final Temporal q(Temporal temporal, long j3) {
                long m10 = m(temporal);
                l().b(j3, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.c((j3 - m10) + temporal.y(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.o
            public final s l() {
                return s.e(1L, 4L);
            }

            @Override // j$.time.temporal.o
            public final boolean j(l lVar) {
                if (!lVar.e(a.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.a;
                return j$.com.android.tools.r8.a.N(lVar).equals(j$.time.chrono.r.c);
            }

            @Override // j$.time.temporal.o
            public final long m(l lVar) {
                if (!j(lVar)) {
                    throw new r("Unsupported field: QuarterOfYear");
                }
                return (lVar.y(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.o
            public final s k(l lVar) {
                if (!j(lVar)) {
                    throw new r("Unsupported field: QuarterOfYear");
                }
                return l();
            }

            @Override // j$.time.temporal.o
            public final Temporal q(Temporal temporal, long j3) {
                long m10 = m(temporal);
                l().b(j3, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.c(((j3 - m10) * 3) + temporal.y(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.o
            public final s l() {
                return s.f(52L, 53L);
            }

            @Override // j$.time.temporal.o
            public final boolean j(l lVar) {
                if (!lVar.e(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.a;
                return j$.com.android.tools.r8.a.N(lVar).equals(j$.time.chrono.r.c);
            }

            @Override // j$.time.temporal.o
            public final s k(l lVar) {
                if (!j(lVar)) {
                    throw new r("Unsupported field: WeekOfWeekBasedYear");
                }
                return s.e(1L, g.G(g.y(LocalDate.I(lVar))));
            }

            @Override // j$.time.temporal.o
            public final long m(l lVar) {
                if (!j(lVar)) {
                    throw new r("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.w(LocalDate.I(lVar));
            }

            @Override // j$.time.temporal.o
            public final Temporal q(Temporal temporal, long j3) {
                l().b(j3, this);
                return temporal.d(j$.com.android.tools.r8.a.U(j3, m(temporal)), ChronoUnit.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.o
            public final s l() {
                return a.YEAR.b;
            }

            @Override // j$.time.temporal.o
            public final boolean j(l lVar) {
                if (!lVar.e(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.a;
                return j$.com.android.tools.r8.a.N(lVar).equals(j$.time.chrono.r.c);
            }

            @Override // j$.time.temporal.o
            public final long m(l lVar) {
                if (j(lVar)) {
                    return g.y(LocalDate.I(lVar));
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.o
            public final s k(l lVar) {
                if (!j(lVar)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                return l();
            }

            @Override // j$.time.temporal.o
            public final Temporal q(Temporal temporal, long j3) {
                if (!j(temporal)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                int a2 = a.YEAR.b.a(j3, g.WEEK_BASED_YEAR);
                LocalDate I = LocalDate.I(temporal);
                int j10 = I.j(a.DAY_OF_WEEK);
                int w10 = g.w(I);
                if (w10 == 53 && g.G(a2) == 52) {
                    w10 = 52;
                }
                return temporal.k(LocalDate.of(a2, 1, 4).plusDays(((w10 - 1) * 7) + (j10 - r6.j(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int G(int i10) {
        LocalDate of2 = LocalDate.of(i10, 1, 1);
        if (of2.K() != DayOfWeek.THURSDAY) {
            return (of2.K() == DayOfWeek.WEDNESDAY && of2.O()) ? 53 : 52;
        }
        return 53;
    }

    public static int w(LocalDate localDate) {
        int ordinal = localDate.K().ordinal();
        int L = localDate.L() - 1;
        int i10 = (3 - ordinal) + L;
        int i11 = i10 - ((i10 / 7) * 7);
        int i12 = i11 - 3;
        if (i12 < -3) {
            i12 = i11 + 4;
        }
        if (L < i12) {
            return (int) s.e(1L, G(y(localDate.X(180).U(-1L)))).d;
        }
        int i13 = ((L - i12) / 7) + 1;
        if (i13 != 53 || i12 == -3 || (i12 == -2 && localDate.O())) {
            return i13;
        }
        return 1;
    }

    public static int y(LocalDate localDate) {
        int year = localDate.getYear();
        int L = localDate.L();
        if (L <= 3) {
            return L - localDate.K().ordinal() < -2 ? year - 1 : year;
        }
        if (L >= 363) {
            return ((L - 363) - (localDate.O() ? 1 : 0)) - localDate.K().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
