package j$.time;

import j$.time.temporal.p;
import j$.time.temporal.q;
import org.telegram.messenger.NotificationCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j implements j$.time.temporal.k {
    public static final j APRIL;
    public static final j AUGUST;
    public static final j DECEMBER;
    public static final j FEBRUARY;
    public static final j JANUARY;
    public static final j JULY;
    public static final j JUNE;
    public static final j MARCH;
    public static final j MAY;
    public static final j NOVEMBER;
    public static final j OCTOBER;
    public static final j SEPTEMBER;
    private static final j[] a;
    private static final /* synthetic */ j[] b;

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) b.clone();
    }

    static {
        j jVar = new j("JANUARY", 0);
        JANUARY = jVar;
        j jVar2 = new j("FEBRUARY", 1);
        FEBRUARY = jVar2;
        j jVar3 = new j("MARCH", 2);
        MARCH = jVar3;
        j jVar4 = new j("APRIL", 3);
        APRIL = jVar4;
        j jVar5 = new j("MAY", 4);
        MAY = jVar5;
        j jVar6 = new j("JUNE", 5);
        JUNE = jVar6;
        j jVar7 = new j("JULY", 6);
        JULY = jVar7;
        j jVar8 = new j("AUGUST", 7);
        AUGUST = jVar8;
        j jVar9 = new j("SEPTEMBER", 8);
        SEPTEMBER = jVar9;
        j jVar10 = new j("OCTOBER", 9);
        OCTOBER = jVar10;
        j jVar11 = new j("NOVEMBER", 10);
        NOVEMBER = jVar11;
        j jVar12 = new j("DECEMBER", 11);
        DECEMBER = jVar12;
        b = new j[]{jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12};
        a = values();
    }

    public static j n(int i) {
        if (i < 1 || i > 12) {
            throw new c("Invalid value for MonthOfYear: " + i);
        }
        return a[i - 1];
    }

    @Override // j$.time.temporal.k
    public final boolean j(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.MONTH_OF_YEAR : lVar != null && lVar.g(this);
    }

    @Override // j$.time.temporal.k
    public final q i(j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return aVar.m();
        }
        return j$.time.temporal.j.c(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return ordinal() + 1;
        }
        return j$.time.temporal.j.a(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final long f(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return ordinal() + 1;
        }
        if (lVar instanceof j$.time.temporal.a) {
            throw new p("Unsupported field: " + lVar);
        }
        return lVar.f(this);
    }

    public final j o() {
        return a[((((int) 1) + 12) + ordinal()) % 12];
    }

    public final int m(boolean z) {
        int i = i.a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public final int l(boolean z) {
        switch (i.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + NotificationCenter.recordStarted;
            case 4:
                return (z ? 1 : 0) + NotificationCenter.invalidateMotionBackground;
            case 5:
                return (z ? 1 : 0) + NotificationCenter.onDatabaseReset;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + NotificationCenter.giftsToUserSent;
            case 10:
                return (z ? 1 : 0) + NotificationCenter.starGiftOptionsLoaded;
            case 11:
                return (z ? 1 : 0) + NotificationCenter.webRtcMicAmplitudeEvent;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.k
    public final Object g(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.d()) {
            return j$.time.chrono.f.a;
        }
        if (nVar == j$.time.temporal.j.h()) {
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.j.b(this, nVar);
    }
}
