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
    public final boolean v() {
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
            public final u r(m mVar) {
                if (!n(mVar)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                long r = mVar.r(g.QUARTER_OF_YEAR);
                if (r == 1) {
                    long r2 = mVar.r(a.YEAR);
                    j$.time.chrono.s.d.getClass();
                    return j$.time.chrono.s.n(r2) ? u.j(1L, 91L) : u.j(1L, 90L);
                }
                if (r == 2) {
                    return u.j(1L, 91L);
                }
                if (r == 3 || r == 4) {
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
                long r = mVar.r(a.YEAR);
                iArr = g.a;
                int i = (l2 - 1) / 3;
                j$.time.chrono.s.d.getClass();
                return l - iArr[i + (j$.time.chrono.s.n(r) ? 4 : 0)];
            }

            @Override // j$.time.temporal.p
            public final Temporal o(Temporal temporal, long j) {
                long l = l(temporal);
                k().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.d((j - l) + temporal.r(aVar), aVar);
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
                return (mVar.r(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.p
            public final u r(m mVar) {
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
                return temporal.d(((j - l) * 3) + temporal.r(aVar), aVar);
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
            public final u r(m mVar) {
                if (!n(mVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.J(LocalDate.I(mVar));
            }

            @Override // j$.time.temporal.p
            public final long l(m mVar) {
                if (!n(mVar)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.G(LocalDate.I(mVar));
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
                int K;
                if (!n(mVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                K = g.K(LocalDate.I(mVar));
                return K;
            }

            @Override // j$.time.temporal.p
            public final u r(m mVar) {
                if (!n(mVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                return k();
            }

            @Override // j$.time.temporal.p
            public final Temporal o(Temporal temporal, long j) {
                int L;
                if (!n(temporal)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                int a2 = a.YEAR.k().a(j, g.WEEK_BASED_YEAR);
                LocalDate I = LocalDate.I(temporal);
                int l = I.l(a.DAY_OF_WEEK);
                int G = g.G(I);
                if (G == 53) {
                    L = g.L(a2);
                    if (L == 52) {
                        G = 52;
                    }
                }
                return temporal.n(LocalDate.of(a2, 1, 4).plusDays(((G - 1) * 7) + (l - r6.l(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, NotificationCenter.newEmojiSuggestionsAvailable, NotificationCenter.didSetNewWallpapper, 0, 91, NotificationCenter.themeUploadedToServer, NotificationCenter.proxySettingsChanged};
    }

    static u J(LocalDate localDate) {
        return u.j(1L, L(K(localDate)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int L(int i) {
        LocalDate of = LocalDate.of(i, 1, 1);
        if (of.K() != DayOfWeek.THURSDAY) {
            return (of.K() == DayOfWeek.WEDNESDAY && of.P()) ? 53 : 52;
        }
        return 53;
    }

    static int G(LocalDate localDate) {
        int ordinal = localDate.K().ordinal();
        int i = 1;
        int L = localDate.L() - 1;
        int i2 = (3 - ordinal) + L;
        int i3 = i2 - ((i2 / 7) * 7);
        int i4 = i3 - 3;
        if (i4 < -3) {
            i4 = i3 + 4;
        }
        if (L < i4) {
            return (int) u.j(1L, L(K(localDate.a0(NotificationCenter.needDeleteDialog).W(-1L)))).d();
        }
        int i5 = ((L - i4) / 7) + 1;
        if (i5 != 53 || i4 == -3 || (i4 == -2 && localDate.P())) {
            i = i5;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int K(LocalDate localDate) {
        int year = localDate.getYear();
        int L = localDate.L();
        if (L <= 3) {
            return L - localDate.K().ordinal() < -2 ? year - 1 : year;
        }
        if (L >= 363) {
            return ((L - 363) - (localDate.P() ? 1 : 0)) - localDate.K().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
