package j$.time;

import j$.time.temporal.p;
import j$.time.temporal.q;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
public enum j implements j$.time.temporal.k {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private static final j[] a = values();

    public static j o(int i) {
        if (i >= 1 && i <= 12) {
            return a[i - 1];
        }
        throw new c("Invalid value for MonthOfYear: " + i);
    }

    @Override // j$.time.temporal.k
    public final q f(j$.time.temporal.l lVar) {
        return lVar == j$.time.temporal.a.MONTH_OF_YEAR ? lVar.f() : j$.time.temporal.j.c(this, lVar);
    }

    @Override // j$.time.temporal.k
    public final long h(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return ordinal() + 1;
        }
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.h(this);
        }
        throw new p("Unsupported field: " + lVar);
    }

    @Override // j$.time.temporal.k
    public final Object i(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.j.d() ? j$.time.chrono.f.a : nVar == j$.time.temporal.j.h() ? j$.time.temporal.b.MONTHS : j$.time.temporal.j.b(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final int j(j$.time.temporal.a aVar) {
        return aVar == j$.time.temporal.a.MONTH_OF_YEAR ? ordinal() + 1 : j$.time.temporal.j.a(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final boolean k(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.MONTH_OF_YEAR : lVar != null && lVar.i(this);
    }

    public final int m(boolean z) {
        switch (i.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + NotificationCenter.recordStarted;
            case 4:
                return (z ? 1 : 0) + NotificationCenter.didSetNewTheme;
            case 5:
                return (z ? 1 : 0) + NotificationCenter.storiesDraftsUpdated;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + NotificationCenter.giftsToUserSent;
            case 10:
                return (z ? 1 : 0) + NotificationCenter.starBalanceUpdated;
            case 11:
                return (z ? 1 : 0) + NotificationCenter.appUpdateLoading;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public final int n(boolean z) {
        int i = i.a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public final j p() {
        return a[((((int) 1) + 12) + ordinal()) % 12];
    }
}
