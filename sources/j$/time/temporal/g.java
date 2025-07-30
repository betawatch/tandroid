package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.util.A;
import org.telegram.messenger.NotificationCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class g implements l {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final /* synthetic */ g[] b;

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.l
            public final q f() {
                return q.j(90L, 92L);
            }

            @Override // j$.time.temporal.l
            public final long h(k kVar) {
                int[] iArr;
                if (!i(kVar)) {
                    throw new p("Unsupported field: DayOfQuarter");
                }
                int j = kVar.j(a.DAY_OF_YEAR);
                int j2 = kVar.j(a.MONTH_OF_YEAR);
                long h = kVar.h(a.YEAR);
                iArr = g.a;
                int i = (j2 - 1) / 3;
                j$.time.chrono.f.a.getClass();
                return j - iArr[i + (j$.time.chrono.f.f(h) ? 4 : 0)];
            }

            @Override // j$.time.temporal.l
            public final boolean i(k kVar) {
                return kVar.k(a.DAY_OF_YEAR) && kVar.k(a.MONTH_OF_YEAR) && kVar.k(a.YEAR) && g.m(kVar);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.l
            public final q j(k kVar) {
                if (!i(kVar)) {
                    throw new p("Unsupported field: DayOfQuarter");
                }
                long h = kVar.h(g.QUARTER_OF_YEAR);
                if (h != 1) {
                    return h == 2 ? q.i(1L, 91L) : (h == 3 || h == 4) ? q.i(1L, 92L) : f();
                }
                long h2 = kVar.h(a.YEAR);
                j$.time.chrono.f.a.getClass();
                return j$.time.chrono.f.f(h2) ? q.i(1L, 91L) : q.i(1L, 90L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.l
            public final q f() {
                return q.i(1L, 4L);
            }

            @Override // j$.time.temporal.l
            public final long h(k kVar) {
                if (i(kVar)) {
                    return (kVar.h(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new p("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.l
            public final boolean i(k kVar) {
                return kVar.k(a.MONTH_OF_YEAR) && g.m(kVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.l
            public final q f() {
                return q.j(52L, 53L);
            }

            @Override // j$.time.temporal.l
            public final long h(k kVar) {
                if (i(kVar)) {
                    return g.p(LocalDate.o(kVar));
                }
                throw new p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.l
            public final boolean i(k kVar) {
                return kVar.k(a.EPOCH_DAY) && g.m(kVar);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.l
            public final q j(k kVar) {
                q s;
                if (!i(kVar)) {
                    throw new p("Unsupported field: WeekOfWeekBasedYear");
                }
                s = g.s(LocalDate.o(kVar));
                return s;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.l
            public final q f() {
                return a.YEAR.f();
            }

            @Override // j$.time.temporal.l
            public final long h(k kVar) {
                int r;
                if (!i(kVar)) {
                    throw new p("Unsupported field: WeekBasedYear");
                }
                r = g.r(LocalDate.o(kVar));
                return r;
            }

            @Override // j$.time.temporal.l
            public final boolean i(k kVar) {
                return kVar.k(a.EPOCH_DAY) && g.m(kVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, NotificationCenter.updateBotMenuButton, NotificationCenter.voipServiceCreated, 0, 91, NotificationCenter.giftsToUserSent, NotificationCenter.webRtcMicAmplitudeEvent};
    }

    g(String str, int i) {
    }

    static boolean m(k kVar) {
        A.z(kVar, "temporal");
        Object obj = (j$.time.chrono.e) kVar.i(j.b);
        if (obj == null) {
            obj = j$.time.chrono.f.a;
        }
        return ((j$.time.chrono.a) obj).equals(j$.time.chrono.f.a);
    }

    static int p(LocalDate localDate) {
        int ordinal = localDate.q().ordinal();
        int i = 1;
        int r = localDate.r() - 1;
        int i2 = (3 - ordinal) + r;
        int i3 = i2 - ((i2 / 7) * 7);
        int i4 = i3 - 3;
        if (i4 < -3) {
            i4 = i3 + 4;
        }
        if (r < i4) {
            return (int) s(localDate.A().w(-1L)).d();
        }
        int i5 = ((r - i4) / 7) + 1;
        if (i5 != 53 || i4 == -3 || (i4 == -2 && localDate.t())) {
            i = i5;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(LocalDate localDate) {
        int year = localDate.getYear();
        int r = localDate.r();
        if (r <= 3) {
            return r - localDate.q().ordinal() < -2 ? year - 1 : year;
        }
        if (r >= 363) {
            return ((r - 363) - (localDate.t() ? 1 : 0)) - localDate.q().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static q s(LocalDate localDate) {
        LocalDate of = LocalDate.of(r(localDate), 1, 1);
        return q.i(1L, (of.q() == DayOfWeek.THURSDAY || (of.q() == DayOfWeek.WEDNESDAY && of.t())) ? 53 : 52);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    public q j(k kVar) {
        return f();
    }

    @Override // j$.time.temporal.l
    public final boolean k() {
        return true;
    }
}
