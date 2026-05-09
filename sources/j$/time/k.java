package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import org.telegram.messenger.NotificationCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k implements j$.time.temporal.m, j$.time.temporal.n {
    public static final k APRIL;
    public static final k AUGUST;
    public static final k DECEMBER;
    public static final k FEBRUARY;
    public static final k JANUARY;
    public static final k JULY;
    public static final k JUNE;
    public static final k MARCH;
    public static final k MAY;
    public static final k NOVEMBER;
    public static final k OCTOBER;
    public static final k SEPTEMBER;
    private static final k[] a;
    private static final /* synthetic */ k[] b;

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) b.clone();
    }

    static {
        k kVar = new k("JANUARY", 0);
        JANUARY = kVar;
        k kVar2 = new k("FEBRUARY", 1);
        FEBRUARY = kVar2;
        k kVar3 = new k("MARCH", 2);
        MARCH = kVar3;
        k kVar4 = new k("APRIL", 3);
        APRIL = kVar4;
        k kVar5 = new k("MAY", 4);
        MAY = kVar5;
        k kVar6 = new k("JUNE", 5);
        JUNE = kVar6;
        k kVar7 = new k("JULY", 6);
        JULY = kVar7;
        k kVar8 = new k("AUGUST", 7);
        AUGUST = kVar8;
        k kVar9 = new k("SEPTEMBER", 8);
        SEPTEMBER = kVar9;
        k kVar10 = new k("OCTOBER", 9);
        OCTOBER = kVar10;
        k kVar11 = new k("NOVEMBER", 10);
        NOVEMBER = kVar11;
        k kVar12 = new k("DECEMBER", 11);
        DECEMBER = kVar12;
        b = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12};
        a = values();
    }

    public static k J(int i) {
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
    public final long r(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
        }
        return pVar.l(this);
    }

    public final k K() {
        return a[((((int) 1) + 12) + ordinal()) % 12];
    }

    public final int H(boolean z) {
        int i = j.a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public final int I() {
        int i = j.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int G(boolean z) {
        switch (j.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + NotificationCenter.messagePlayingDidSeek;
            case 4:
                return (z ? 1 : 0) + NotificationCenter.contentSettingsLoaded;
            case 5:
                return (z ? 1 : 0) + NotificationCenter.currentUserPremiumStatusChanged;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + NotificationCenter.themeUploadedToServer;
            case 10:
                return (z ? 1 : 0) + NotificationCenter.groupPackUpdated;
            case 11:
                return (z ? 1 : 0) + NotificationCenter.proxySettingsChanged;
            default:
                return (z ? 1 : 0) + NotificationCenter.botForumTopicDidCreate;
        }
    }

    @Override // j$.time.temporal.m
    public final Object v(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return j$.time.chrono.s.d;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.n
    public final Temporal x(Temporal temporal) {
        if (!((j$.time.chrono.a) j$.time.chrono.h.q(temporal)).equals(j$.time.chrono.s.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.d(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
