package j$.time;

import j$.time.format.TextStyle;
import j$.time.format.p;
import j$.time.temporal.q;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DayOfWeek implements j$.time.temporal.k {
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

    public static DayOfWeek l(int i) {
        if (i < 1 || i > 7) {
            throw new c("Invalid value for DayOfWeek: " + i);
        }
        return a[i - 1];
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        p pVar = new p();
        pVar.i(j$.time.temporal.a.DAY_OF_WEEK, textStyle);
        return pVar.v(locale).a(this);
    }

    @Override // j$.time.temporal.k
    public final boolean j(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.DAY_OF_WEEK : lVar != null && lVar.g(this);
    }

    @Override // j$.time.temporal.k
    public final q i(j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return aVar.m();
        }
        return j$.time.temporal.j.c(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return ordinal() + 1;
        }
        return j$.time.temporal.j.a(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final long f(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return ordinal() + 1;
        }
        if (lVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.p("Unsupported field: " + lVar);
        }
        return lVar.f(this);
    }

    @Override // j$.time.temporal.k
    public final Object g(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.h()) {
            return j$.time.temporal.b.DAYS;
        }
        return j$.time.temporal.j.b(this, nVar);
    }
}
