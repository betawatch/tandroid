package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import org.telegram.messenger.NotificationCenter;

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
    public final boolean u() {
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
            public final boolean p(l lVar) {
                if (!lVar.h(a.DAY_OF_YEAR) || !lVar.h(a.MONTH_OF_YEAR) || !lVar.h(a.YEAR)) {
                    return false;
                }
                g gVar2 = i.a;
                return j$.com.android.tools.r8.a.N(lVar).equals(j$.time.chrono.r.c);
            }

            @Override // j$.time.temporal.o
            public final s r(l lVar) {
                if (!p(lVar)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                long u = lVar.u(g.QUARTER_OF_YEAR);
                if (u == 1) {
                    long u2 = lVar.u(a.YEAR);
                    j$.time.chrono.r.c.getClass();
                    return j$.time.chrono.r.o(u2) ? s.e(1L, 91L) : s.e(1L, 90L);
                }
                if (u == 2) {
                    return s.e(1L, 91L);
                }
                if (u == 3 || u == 4) {
                    return s.e(1L, 92L);
                }
                return l();
            }

            @Override // j$.time.temporal.o
            public final long o(l lVar) {
                if (!p(lVar)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                int o = lVar.o(a.DAY_OF_YEAR);
                int o2 = lVar.o(a.MONTH_OF_YEAR);
                long u = lVar.u(a.YEAR);
                int[] iArr = g.a;
                int i = (o2 - 1) / 3;
                j$.time.chrono.r.c.getClass();
                return o - iArr[i + (j$.time.chrono.r.o(u) ? 4 : 0)];
            }

            @Override // j$.time.temporal.o
            public final Temporal q(Temporal temporal, long j) {
                long o = o(temporal);
                l().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.e((j - o) + temporal.u(aVar), aVar);
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
            public final boolean p(l lVar) {
                if (!lVar.h(a.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.a;
                return j$.com.android.tools.r8.a.N(lVar).equals(j$.time.chrono.r.c);
            }

            @Override // j$.time.temporal.o
            public final long o(l lVar) {
                if (!p(lVar)) {
                    throw new r("Unsupported field: QuarterOfYear");
                }
                return (lVar.u(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.o
            public final s r(l lVar) {
                if (!p(lVar)) {
                    throw new r("Unsupported field: QuarterOfYear");
                }
                return l();
            }

            @Override // j$.time.temporal.o
            public final Temporal q(Temporal temporal, long j) {
                long o = o(temporal);
                l().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.e(((j - o) * 3) + temporal.u(aVar), aVar);
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
            public final boolean p(l lVar) {
                if (!lVar.h(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.a;
                return j$.com.android.tools.r8.a.N(lVar).equals(j$.time.chrono.r.c);
            }

            @Override // j$.time.temporal.o
            public final s r(l lVar) {
                if (!p(lVar)) {
                    throw new r("Unsupported field: WeekOfWeekBasedYear");
                }
                return s.e(1L, g.H(g.E(LocalDate.I(lVar))));
            }

            @Override // j$.time.temporal.o
            public final long o(l lVar) {
                if (!p(lVar)) {
                    throw new r("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.x(LocalDate.I(lVar));
            }

            @Override // j$.time.temporal.o
            public final Temporal q(Temporal temporal, long j) {
                l().b(j, this);
                return temporal.f(j$.com.android.tools.r8.a.U(j, o(temporal)), ChronoUnit.WEEKS);
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
            public final boolean p(l lVar) {
                if (!lVar.h(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.a;
                return j$.com.android.tools.r8.a.N(lVar).equals(j$.time.chrono.r.c);
            }

            @Override // j$.time.temporal.o
            public final long o(l lVar) {
                if (p(lVar)) {
                    return g.E(LocalDate.I(lVar));
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.o
            public final s r(l lVar) {
                if (!p(lVar)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                return l();
            }

            @Override // j$.time.temporal.o
            public final Temporal q(Temporal temporal, long j) {
                if (!p(temporal)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                int a2 = a.YEAR.b.a(j, g.WEEK_BASED_YEAR);
                LocalDate I = LocalDate.I(temporal);
                int o = I.o(a.DAY_OF_WEEK);
                int x = g.x(I);
                if (x == 53 && g.H(a2) == 52) {
                    x = 52;
                }
                return temporal.p(LocalDate.of(a2, 1, 4).plusDays(((x - 1) * 7) + (o - r6.o(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, NotificationCenter.newEmojiSuggestionsAvailable, NotificationCenter.suggestedLangpack, 0, 91, NotificationCenter.themeUploadedToServer, NotificationCenter.didSetNewWallpapper};
    }

    public static int H(int i) {
        LocalDate of = LocalDate.of(i, 1, 1);
        if (of.K() != DayOfWeek.THURSDAY) {
            return (of.K() == DayOfWeek.WEDNESDAY && of.O()) ? 53 : 52;
        }
        return 53;
    }

    public static int x(LocalDate localDate) {
        int ordinal = localDate.K().ordinal();
        int L = localDate.L() - 1;
        int i = (3 - ordinal) + L;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (L < i3) {
            return (int) s.e(1L, H(E(localDate.X(NotificationCenter.needDeleteDialog).U(-1L)))).d;
        }
        int i4 = ((L - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.O())) {
            return i4;
        }
        return 1;
    }

    public static int E(LocalDate localDate) {
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
