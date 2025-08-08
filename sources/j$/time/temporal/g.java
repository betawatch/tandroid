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

    @Override // j$.time.temporal.l
    public final boolean h() {
        return true;
    }

    static boolean i(k kVar) {
        A.z(kVar, "temporal");
        Object obj = (j$.time.chrono.e) kVar.g(j.b);
        if (obj == null) {
            obj = j$.time.chrono.f.a;
        }
        return ((j$.time.chrono.a) obj).equals(j$.time.chrono.f.a);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.l
            public final boolean g(k kVar) {
                return kVar.j(a.DAY_OF_YEAR) && kVar.j(a.MONTH_OF_YEAR) && kVar.j(a.YEAR) && g.i(kVar);
            }

            @Override // j$.time.temporal.l
            public final long f(k kVar) {
                int[] iArr;
                if (!g(kVar)) {
                    throw new p("Unsupported field: DayOfQuarter");
                }
                int h = kVar.h(a.DAY_OF_YEAR);
                int h2 = kVar.h(a.MONTH_OF_YEAR);
                long f = kVar.f(a.YEAR);
                iArr = g.a;
                int i = (h2 - 1) / 3;
                j$.time.chrono.f.a.getClass();
                return h - iArr[i + (j$.time.chrono.f.f(f) ? 4 : 0)];
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.l
            public final boolean g(k kVar) {
                return kVar.j(a.MONTH_OF_YEAR) && g.i(kVar);
            }

            @Override // j$.time.temporal.l
            public final long f(k kVar) {
                if (!g(kVar)) {
                    throw new p("Unsupported field: QuarterOfYear");
                }
                return (kVar.f(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.l
            public final boolean g(k kVar) {
                return kVar.j(a.EPOCH_DAY) && g.i(kVar);
            }

            @Override // j$.time.temporal.l
            public final long f(k kVar) {
                if (!g(kVar)) {
                    throw new p("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.l(LocalDate.n(kVar));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.l
            public final boolean g(k kVar) {
                return kVar.j(a.EPOCH_DAY) && g.i(kVar);
            }

            @Override // j$.time.temporal.l
            public final long f(k kVar) {
                int n;
                if (g(kVar)) {
                    n = g.n(LocalDate.n(kVar));
                    return n;
                }
                throw new p("Unsupported field: WeekBasedYear");
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

    static int l(LocalDate localDate) {
        int ordinal = localDate.p().ordinal();
        int i = 1;
        int q = localDate.q() - 1;
        int i2 = (3 - ordinal) + q;
        int i3 = i2 - ((i2 / 7) * 7);
        int i4 = i3 - 3;
        if (i4 < -3) {
            i4 = i3 + 4;
        }
        if (q < i4) {
            LocalDate of = LocalDate.of(n(localDate.z().v(-1L)), 1, 1);
            return (int) q.i(1L, (of.p() == DayOfWeek.THURSDAY || (of.p() == DayOfWeek.WEDNESDAY && of.s())) ? 53 : 52).d();
        }
        int i5 = ((q - i4) / 7) + 1;
        if (i5 != 53 || i4 == -3 || (i4 == -2 && localDate.s())) {
            i = i5;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(LocalDate localDate) {
        int year = localDate.getYear();
        int q = localDate.q();
        if (q <= 3) {
            return q - localDate.p().ordinal() < -2 ? year - 1 : year;
        }
        if (q >= 363) {
            return ((q - 363) - (localDate.s() ? 1 : 0)) - localDate.p().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
