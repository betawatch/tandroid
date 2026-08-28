package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j implements j$.time.temporal.l, j$.time.temporal.m {
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
    public static final j[] a;
    public static final /* synthetic */ j[] b;

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

    public static j J(int i9) {
        if (i9 < 1 || i9 > 12) {
            throw new b("Invalid value for MonthOfYear: " + i9);
        }
        return a[i9 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.MONTH_OF_YEAR : oVar != null && oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return oVar.l();
        }
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
        return oVar.m(this);
    }

    public final int H(boolean z10) {
        int i9 = i.a[ordinal()];
        return i9 != 1 ? (i9 == 2 || i9 == 3 || i9 == 4 || i9 == 5) ? 30 : 31 : z10 ? 29 : 28;
    }

    public final int I() {
        int i9 = i.a[ordinal()];
        if (i9 != 1) {
            return (i9 == 2 || i9 == 3 || i9 == 4 || i9 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int G(boolean z10) {
        switch (i.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 91;
            case 3:
                return (z10 ? 1 : 0) + 152;
            case 4:
                return (z10 ? 1 : 0) + 244;
            case 5:
                return (z10 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z10 ? 1 : 0) + 60;
            case 8:
                return (z10 ? 1 : 0) + 121;
            case 9:
                return (z10 ? 1 : 0) + 182;
            case 10:
                return (z10 ? 1 : 0) + 213;
            case 11:
                return (z10 ? 1 : 0) + 274;
            default:
                return (z10 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.l
    public final Object m(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.b) {
            return j$.time.chrono.r.c;
        }
        if (aVar == j$.time.temporal.p.c) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.p.c(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal q(Temporal temporal) {
        if (!j$.com.android.tools.r8.a.N(temporal).equals(j$.time.chrono.r.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return temporal.c(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
