package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import org.telegram.messenger.NotificationCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class h implements r {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final /* synthetic */ h[] b;

    @Override // j$.time.temporal.r
    public final boolean u() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.r
            public final w i() {
                return w.k(90L, 92L);
            }

            @Override // j$.time.temporal.r
            public final boolean l(o oVar) {
                if (oVar.f(a.DAY_OF_YEAR) && oVar.f(a.MONTH_OF_YEAR) && oVar.f(a.YEAR)) {
                    r rVar = j.a;
                    if (((j$.time.chrono.a) j$.time.chrono.h.p(oVar)).equals(j$.time.chrono.s.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final w r(o oVar) {
                if (!l(oVar)) {
                    throw new v("Unsupported field: DayOfQuarter");
                }
                long r = oVar.r(h.QUARTER_OF_YEAR);
                if (r == 1) {
                    long r2 = oVar.r(a.YEAR);
                    j$.time.chrono.s.d.getClass();
                    return j$.time.chrono.s.l(r2) ? w.j(1L, 91L) : w.j(1L, 90L);
                }
                if (r == 2) {
                    return w.j(1L, 91L);
                }
                if (r == 3 || r == 4) {
                    return w.j(1L, 92L);
                }
                return i();
            }

            @Override // j$.time.temporal.r
            public final long j(o oVar) {
                int[] iArr;
                if (!l(oVar)) {
                    throw new v("Unsupported field: DayOfQuarter");
                }
                int j = oVar.j(a.DAY_OF_YEAR);
                int j2 = oVar.j(a.MONTH_OF_YEAR);
                long r = oVar.r(a.YEAR);
                iArr = h.a;
                int i = (j2 - 1) / 3;
                j$.time.chrono.s.d.getClass();
                return j - iArr[i + (j$.time.chrono.s.l(r) ? 4 : 0)];
            }

            @Override // j$.time.temporal.r
            public final m m(m mVar, long j) {
                long j2 = j(mVar);
                i().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.d((j - j2) + mVar.r(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.r
            public final w i() {
                return w.j(1L, 4L);
            }

            @Override // j$.time.temporal.r
            public final boolean l(o oVar) {
                if (oVar.f(a.MONTH_OF_YEAR)) {
                    r rVar = j.a;
                    if (((j$.time.chrono.a) j$.time.chrono.h.p(oVar)).equals(j$.time.chrono.s.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final long j(o oVar) {
                if (!l(oVar)) {
                    throw new v("Unsupported field: QuarterOfYear");
                }
                return (oVar.r(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.r
            public final w r(o oVar) {
                if (!l(oVar)) {
                    throw new v("Unsupported field: QuarterOfYear");
                }
                return i();
            }

            @Override // j$.time.temporal.r
            public final m m(m mVar, long j) {
                long j2 = j(mVar);
                i().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.d(((j - j2) * 3) + mVar.r(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.r
            public final w i() {
                return w.k(52L, 53L);
            }

            @Override // j$.time.temporal.r
            public final boolean l(o oVar) {
                if (oVar.f(a.EPOCH_DAY)) {
                    r rVar = j.a;
                    if (((j$.time.chrono.a) j$.time.chrono.h.p(oVar)).equals(j$.time.chrono.s.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final w r(o oVar) {
                if (!l(oVar)) {
                    throw new v("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.E(LocalDate.D(oVar));
            }

            @Override // j$.time.temporal.r
            public final long j(o oVar) {
                if (!l(oVar)) {
                    throw new v("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.B(LocalDate.D(oVar));
            }

            @Override // j$.time.temporal.r
            public final m m(m mVar, long j) {
                i().b(j, this);
                return mVar.e(j$.com.android.tools.r8.a.m(j, j(mVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.r
            public final w i() {
                return a.YEAR.i();
            }

            @Override // j$.time.temporal.r
            public final boolean l(o oVar) {
                if (oVar.f(a.EPOCH_DAY)) {
                    r rVar = j.a;
                    if (((j$.time.chrono.a) j$.time.chrono.h.p(oVar)).equals(j$.time.chrono.s.d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final long j(o oVar) {
                int F;
                if (!l(oVar)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                F = h.F(LocalDate.D(oVar));
                return F;
            }

            @Override // j$.time.temporal.r
            public final w r(o oVar) {
                if (!l(oVar)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                return i();
            }

            @Override // j$.time.temporal.r
            public final m m(m mVar, long j) {
                int G;
                if (!l(mVar)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                int a2 = a.YEAR.i().a(j, h.WEEK_BASED_YEAR);
                LocalDate D = LocalDate.D(mVar);
                int j2 = D.j(a.DAY_OF_WEEK);
                int B = h.B(D);
                if (B == 53) {
                    G = h.G(a2);
                    if (G == 52) {
                        B = 52;
                    }
                }
                return mVar.l(LocalDate.of(a2, 1, 4).plusDays(((B - 1) * 7) + (j2 - r6.j(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        b = new h[]{hVar, hVar2, hVar3, hVar4};
        a = new int[]{0, 90, NotificationCenter.themeUploadedToServer, NotificationCenter.proxyChangedByRotation, 0, 91, NotificationCenter.themeUploadError, NotificationCenter.liveLocationsChanged};
    }

    static w E(LocalDate localDate) {
        return w.j(1L, G(F(localDate)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int G(int i) {
        LocalDate of = LocalDate.of(i, 1, 1);
        if (of.F() != DayOfWeek.THURSDAY) {
            return (of.F() == DayOfWeek.WEDNESDAY && of.K()) ? 53 : 52;
        }
        return 53;
    }

    static int B(LocalDate localDate) {
        int ordinal = localDate.F().ordinal();
        int i = 1;
        int G = localDate.G() - 1;
        int i2 = (3 - ordinal) + G;
        int i3 = i2 - ((i2 / 7) * 7);
        int i4 = i3 - 3;
        if (i4 < -3) {
            i4 = i3 + 4;
        }
        if (G < i4) {
            return (int) w.j(1L, G(F(localDate.U(NotificationCenter.newEmojiSuggestionsAvailable).Q(-1L)))).d();
        }
        int i5 = ((G - i4) / 7) + 1;
        if (i5 != 53 || i4 == -3 || (i4 == -2 && localDate.K())) {
            i = i5;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int F(LocalDate localDate) {
        int year = localDate.getYear();
        int G = localDate.G();
        if (G <= 3) {
            return G - localDate.F().ordinal() < -2 ? year - 1 : year;
        }
        if (G >= 363) {
            return ((G - 363) - (localDate.K() ? 1 : 0)) - localDate.F().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
