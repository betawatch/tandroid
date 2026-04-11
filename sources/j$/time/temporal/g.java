package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import org.telegram.messenger.NotificationCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class g implements p {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final /* synthetic */ g[] b;

    @Override // j$.time.temporal.p
    public final boolean w() {
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
            @Override // j$.time.temporal.p
            public final u k() {
                return u.k(90L, 92L);
            }

            @Override // j$.time.temporal.p
            public final boolean n(m mVar) {
                if (mVar.g(a.DAY_OF_YEAR) && mVar.g(a.MONTH_OF_YEAR) && mVar.g(a.YEAR)) {
                    p pVar = i.a;
                    if (((j$.time.chrono.a) j$.time.chrono.h.q(mVar)).equals(j$.time.chrono.s.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.p
            public final u s(m mVar) {
                if (!n(mVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                long s = mVar.s(g.QUARTER_OF_YEAR);
                if (s == 1) {
                    long s2 = mVar.s(a.YEAR);
                    j$.time.chrono.s.d.getClass();
                    return j$.time.chrono.s.n(s2) ? u.j(1L, 91L) : u.j(1L, 90L);
                }
                if (s == 2) {
                    return u.j(1L, 91L);
                }
                if (s == 3 || s == 4) {
                    return u.j(1L, 92L);
                }
                return k();
            }

            @Override // j$.time.temporal.p
            public final long l(m mVar) {
                int[] iArr;
                if (!n(mVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                int l = mVar.l(a.DAY_OF_YEAR);
                int l2 = mVar.l(a.MONTH_OF_YEAR);
                long s = mVar.s(a.YEAR);
                iArr = g.a;
                int i = (l2 - 1) / 3;
                j$.time.chrono.s.d.getClass();
                return l - iArr[i + (j$.time.chrono.s.n(s) ? 4 : 0)];
            }

            @Override // j$.time.temporal.p
            public final Temporal o(Temporal temporal, long j) {
                long l = l(temporal);
                k().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.d((j - l) + temporal.s(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.p
            public final u k() {
                return u.j(1L, 4L);
            }

            @Override // j$.time.temporal.p
            public final boolean n(m mVar) {
                if (mVar.g(a.MONTH_OF_YEAR)) {
                    p pVar = i.a;
                    if (((j$.time.chrono.a) j$.time.chrono.h.q(mVar)).equals(j$.time.chrono.s.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.p
            public final long l(m mVar) {
                if (!n(mVar)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return (mVar.s(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.p
            public final u s(m mVar) {
                if (!n(mVar)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return k();
            }

            @Override // j$.time.temporal.p
            public final Temporal o(Temporal temporal, long j) {
                long l = l(temporal);
                k().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.d(((j - l) * 3) + temporal.s(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.p
            public final u k() {
                return u.k(52L, 53L);
            }

            @Override // j$.time.temporal.p
            public final boolean n(m mVar) {
                if (mVar.g(a.EPOCH_DAY)) {
                    p pVar = i.a;
                    if (((j$.time.chrono.a) j$.time.chrono.h.q(mVar)).equals(j$.time.chrono.s.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.p
            public final u s(m mVar) {
                if (!n(mVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.L(LocalDate.K(mVar));
            }

            @Override // j$.time.temporal.p
            public final long l(m mVar) {
                if (!n(mVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.I(LocalDate.K(mVar));
            }

            @Override // j$.time.temporal.p
            public final Temporal o(Temporal temporal, long j) {
                k().b(j, this);
                return temporal.e(j$.com.android.tools.r8.a.m(j, l(temporal)), ChronoUnit.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.p
            public final u k() {
                return a.YEAR.k();
            }

            @Override // j$.time.temporal.p
            public final boolean n(m mVar) {
                if (mVar.g(a.EPOCH_DAY)) {
                    p pVar = i.a;
                    if (((j$.time.chrono.a) j$.time.chrono.h.q(mVar)).equals(j$.time.chrono.s.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.p
            public final long l(m mVar) {
                int M;
                if (!n(mVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                M = g.M(LocalDate.K(mVar));
                return M;
            }

            @Override // j$.time.temporal.p
            public final u s(m mVar) {
                if (!n(mVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                return k();
            }

            @Override // j$.time.temporal.p
            public final Temporal o(Temporal temporal, long j) {
                int N;
                if (!n(temporal)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                int a2 = a.YEAR.k().a(j, g.WEEK_BASED_YEAR);
                LocalDate K = LocalDate.K(temporal);
                int l = K.l(a.DAY_OF_WEEK);
                int I = g.I(K);
                if (I == 53) {
                    N = g.N(a2);
                    if (N == 52) {
                        I = 52;
                    }
                }
                return temporal.n(LocalDate.of(a2, 1, 4).plusDays(((I - 1) * 7) + (l - r6.l(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, NotificationCenter.themeUploadedToServer, NotificationCenter.proxyCheckDone, 0, 91, NotificationCenter.themeUploadError, NotificationCenter.proxyChangedByRotation};
    }

    static u L(LocalDate localDate) {
        return u.j(1L, N(M(localDate)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int N(int i) {
        LocalDate of = LocalDate.of(i, 1, 1);
        if (of.M() != DayOfWeek.THURSDAY) {
            return (of.M() == DayOfWeek.WEDNESDAY && of.R()) ? 53 : 52;
        }
        return 53;
    }

    static int I(LocalDate localDate) {
        int ordinal = localDate.M().ordinal();
        int i = 1;
        int N = localDate.N() - 1;
        int i2 = (3 - ordinal) + N;
        int i3 = i2 - ((i2 / 7) * 7);
        int i4 = i3 - 3;
        if (i4 < -3) {
            i4 = i3 + 4;
        }
        if (N < i4) {
            return (int) u.j(1L, N(M(localDate.c0(NotificationCenter.newEmojiSuggestionsAvailable).Y(-1L)))).d();
        }
        int i5 = ((N - i4) / 7) + 1;
        if (i5 != 53 || i4 == -3 || (i4 == -2 && localDate.R())) {
            i = i5;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int M(LocalDate localDate) {
        int year = localDate.getYear();
        int N = localDate.N();
        if (N <= 3) {
            return N - localDate.M().ordinal() < -2 ? year - 1 : year;
        }
        if (N >= 363) {
            return ((N - 363) - (localDate.R() ? 1 : 0)) - localDate.M().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
