package j$.time;

import j$.time.format.TextStyle;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DayOfWeek implements j$.time.temporal.m, j$.time.temporal.n {
    public static final DayOfWeek FRIDAY;
    public static final DayOfWeek MONDAY;
    public static final DayOfWeek SATURDAY;
    public static final DayOfWeek SUNDAY;
    public static final DayOfWeek THURSDAY;
    public static final DayOfWeek TUESDAY;
    public static final DayOfWeek WEDNESDAY;
    private static final DayOfWeek[] a;
    private static final /* synthetic */ DayOfWeek[] b;

    public static DayOfWeek valueOf(String str) {
        return (DayOfWeek) Enum.valueOf(DayOfWeek.class, str);
    }

    public static DayOfWeek[] values() {
        return (DayOfWeek[]) b.clone();
    }

    static {
        DayOfWeek dayOfWeek = new DayOfWeek("MONDAY", 0);
        MONDAY = dayOfWeek;
        DayOfWeek dayOfWeek2 = new DayOfWeek("TUESDAY", 1);
        TUESDAY = dayOfWeek2;
        DayOfWeek dayOfWeek3 = new DayOfWeek("WEDNESDAY", 2);
        WEDNESDAY = dayOfWeek3;
        DayOfWeek dayOfWeek4 = new DayOfWeek("THURSDAY", 3);
        THURSDAY = dayOfWeek4;
        DayOfWeek dayOfWeek5 = new DayOfWeek("FRIDAY", 4);
        FRIDAY = dayOfWeek5;
        DayOfWeek dayOfWeek6 = new DayOfWeek("SATURDAY", 5);
        SATURDAY = dayOfWeek6;
        DayOfWeek dayOfWeek7 = new DayOfWeek("SUNDAY", 6);
        SUNDAY = dayOfWeek7;
        b = new DayOfWeek[]{dayOfWeek, dayOfWeek2, dayOfWeek3, dayOfWeek4, dayOfWeek5, dayOfWeek6, dayOfWeek7};
        a = values();
    }

    public static DayOfWeek I(int i) {
        if (i < 1 || i > 7) {
            throw new c("Invalid value for DayOfWeek: " + i);
        }
        return a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.i(j$.time.temporal.a.DAY_OF_WEEK, textStyle);
        return pVar.w(locale).a(this);
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.DAY_OF_WEEK : pVar != null && pVar.n(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return pVar.k();
        }
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        return j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
        }
        return pVar.l(this);
    }

    @Override // j$.time.temporal.m
    public final Object w(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.DAYS;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.n
    public final Temporal z(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
