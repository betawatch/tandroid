package j$.time;

import j$.time.format.TextStyle;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class DayOfWeek implements j$.time.temporal.l, j$.time.temporal.m {
    public static final DayOfWeek FRIDAY;
    public static final DayOfWeek MONDAY;
    public static final DayOfWeek SATURDAY;
    public static final DayOfWeek SUNDAY;
    public static final DayOfWeek THURSDAY;
    public static final DayOfWeek TUESDAY;
    public static final DayOfWeek WEDNESDAY;
    public static final DayOfWeek[] a;
    public static final /* synthetic */ DayOfWeek[] b;

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

    public static DayOfWeek o(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        g.d("Invalid value for DayOfWeek: ", i);
        return null;
    }

    public static DayOfWeek valueOf(String str) {
        return (DayOfWeek) Enum.valueOf(DayOfWeek.class, str);
    }

    public static DayOfWeek[] values() {
        return (DayOfWeek[]) b.clone();
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.DAY_OF_WEEK : oVar != null && oVar.j(this);
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        j$.time.format.p pVar = new j$.time.format.p();
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_WEEK;
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        pVar.b(new j$.time.format.m(aVar, textStyle, j$.time.format.u.c));
        return pVar.l(locale, j$.time.format.w.SMART, null).a(this);
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        return oVar == j$.time.temporal.a.DAY_OF_WEEK ? getValue() : j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        return oVar == j$.time.temporal.a.DAY_OF_WEEK ? oVar.range() : j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal n(Temporal temporal) {
        return temporal.c(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.p.c ? ChronoUnit.DAYS : j$.time.temporal.p.c(this, aVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
        }
        return oVar.l(this);
    }
}
