package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import org.telegram.messenger.NotificationCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l implements j$.time.temporal.m, j$.time.temporal.n {
    public static final l APRIL;
    public static final l AUGUST;
    public static final l DECEMBER;
    public static final l FEBRUARY;
    public static final l JANUARY;
    public static final l JULY;
    public static final l JUNE;
    public static final l MARCH;
    public static final l MAY;
    public static final l NOVEMBER;
    public static final l OCTOBER;
    public static final l SEPTEMBER;
    private static final l[] a;
    private static final /* synthetic */ l[] b;

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) b.clone();
    }

    static {
        l lVar = new l("JANUARY", 0);
        JANUARY = lVar;
        l lVar2 = new l("FEBRUARY", 1);
        FEBRUARY = lVar2;
        l lVar3 = new l("MARCH", 2);
        MARCH = lVar3;
        l lVar4 = new l("APRIL", 3);
        APRIL = lVar4;
        l lVar5 = new l("MAY", 4);
        MAY = lVar5;
        l lVar6 = new l("JUNE", 5);
        JUNE = lVar6;
        l lVar7 = new l("JULY", 6);
        JULY = lVar7;
        l lVar8 = new l("AUGUST", 7);
        AUGUST = lVar8;
        l lVar9 = new l("SEPTEMBER", 8);
        SEPTEMBER = lVar9;
        l lVar10 = new l("OCTOBER", 9);
        OCTOBER = lVar10;
        l lVar11 = new l("NOVEMBER", 10);
        NOVEMBER = lVar11;
        l lVar12 = new l("DECEMBER", 11);
        DECEMBER = lVar12;
        b = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12};
        a = values();
    }

    public static l L(int i) {
        if (i < 1 || i > 12) {
            throw new c("Invalid value for MonthOfYear: " + i);
        }
        return a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.MONTH_OF_YEAR : pVar != null && pVar.n(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.k();
        }
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
        }
        return pVar.l(this);
    }

    public final l M() {
        return a[((((int) 1) + 12) + ordinal()) % 12];
    }

    public final int J(boolean z) {
        int i = k.a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public final int K() {
        int i = k.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int I(boolean z) {
        switch (k.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + NotificationCenter.messagePlayingGoingToStop;
            case 4:
                return (z ? 1 : 0) + NotificationCenter.musicListLoaded;
            case 5:
                return (z ? 1 : 0) + NotificationCenter.premiumStatusChangedGlobal;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + NotificationCenter.themeUploadError;
            case 10:
                return (z ? 1 : 0) + NotificationCenter.timezonesUpdated;
            case 11:
                return (z ? 1 : 0) + NotificationCenter.proxyChangedByRotation;
            default:
                return (z ? 1 : 0) + NotificationCenter.botForumDraftDelete;
        }
    }

    @Override // j$.time.temporal.m
    public final Object w(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return j$.time.chrono.s.d;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.n
    public final Temporal z(Temporal temporal) {
        if (!((j$.time.chrono.a) j$.time.chrono.h.q(temporal)).equals(j$.time.chrono.s.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
