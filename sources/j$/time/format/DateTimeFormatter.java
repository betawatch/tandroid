package j$.time.format;

import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter e;
    private final e a;
    private final Locale b;
    private final v c;
    private final j$.time.chrono.s d;

    static {
        p pVar = new p();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        x xVar = x.EXCEEDS_PAD;
        pVar.m(aVar, 4, 10, xVar);
        pVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        pVar.l(aVar2, 2);
        pVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        pVar.l(aVar3, 2);
        w wVar = w.STRICT;
        j$.time.chrono.s sVar = j$.time.chrono.s.d;
        DateTimeFormatter v = pVar.v(wVar, sVar);
        ISO_LOCAL_DATE = v;
        p pVar2 = new p();
        pVar2.r();
        pVar2.a(v);
        pVar2.h();
        pVar2.v(wVar, sVar);
        p pVar3 = new p();
        pVar3.r();
        pVar3.a(v);
        pVar3.q();
        pVar3.h();
        pVar3.v(wVar, sVar);
        p pVar4 = new p();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        pVar4.l(aVar4, 2);
        pVar4.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        pVar4.l(aVar5, 2);
        pVar4.q();
        pVar4.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        pVar4.l(aVar6, 2);
        pVar4.q();
        pVar4.b(j$.time.temporal.a.NANO_OF_SECOND);
        DateTimeFormatter v2 = pVar4.v(wVar, null);
        p pVar5 = new p();
        pVar5.r();
        pVar5.a(v2);
        pVar5.h();
        pVar5.v(wVar, null);
        p pVar6 = new p();
        pVar6.r();
        pVar6.a(v2);
        pVar6.q();
        pVar6.h();
        pVar6.v(wVar, null);
        p pVar7 = new p();
        pVar7.r();
        pVar7.a(v);
        pVar7.e('T');
        pVar7.a(v2);
        DateTimeFormatter v3 = pVar7.v(wVar, sVar);
        p pVar8 = new p();
        pVar8.r();
        pVar8.a(v3);
        pVar8.t();
        pVar8.h();
        pVar8.u();
        DateTimeFormatter v4 = pVar8.v(wVar, sVar);
        p pVar9 = new p();
        pVar9.a(v4);
        pVar9.q();
        pVar9.e('[');
        pVar9.s();
        pVar9.n();
        pVar9.e(']');
        pVar9.v(wVar, sVar);
        p pVar10 = new p();
        pVar10.a(v3);
        pVar10.q();
        pVar10.h();
        pVar10.q();
        pVar10.e('[');
        pVar10.s();
        pVar10.n();
        pVar10.e(']');
        pVar10.v(wVar, sVar);
        p pVar11 = new p();
        pVar11.r();
        pVar11.m(aVar, 4, 10, xVar);
        pVar11.e('-');
        pVar11.l(j$.time.temporal.a.DAY_OF_YEAR, 3);
        pVar11.q();
        pVar11.h();
        pVar11.v(wVar, sVar);
        p pVar12 = new p();
        pVar12.r();
        pVar12.m(j$.time.temporal.j.c, 4, 10, xVar);
        pVar12.f("-W");
        pVar12.l(j$.time.temporal.j.b, 2);
        pVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        pVar12.l(aVar7, 1);
        pVar12.q();
        pVar12.h();
        pVar12.v(wVar, sVar);
        p pVar13 = new p();
        pVar13.r();
        pVar13.c();
        e = pVar13.v(wVar, null);
        p pVar14 = new p();
        pVar14.r();
        pVar14.l(aVar, 4);
        pVar14.l(aVar2, 2);
        pVar14.l(aVar3, 2);
        pVar14.q();
        pVar14.t();
        pVar14.g("+HHMMss", "Z");
        pVar14.u();
        pVar14.v(wVar, sVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        p pVar15 = new p();
        pVar15.r();
        pVar15.t();
        pVar15.q();
        pVar15.j(aVar7, hashMap);
        pVar15.f(", ");
        pVar15.p();
        pVar15.m(aVar3, 1, 2, x.NOT_NEGATIVE);
        pVar15.e(' ');
        pVar15.j(aVar2, hashMap2);
        pVar15.e(' ');
        pVar15.l(aVar, 4);
        pVar15.e(' ');
        pVar15.l(aVar4, 2);
        pVar15.e(':');
        pVar15.l(aVar5, 2);
        pVar15.q();
        pVar15.e(':');
        pVar15.l(aVar6, 2);
        pVar15.p();
        pVar15.e(' ');
        pVar15.g("+HHMM", "GMT");
        pVar15.v(w.SMART, sVar);
    }

    DateTimeFormatter(e eVar, Locale locale, w wVar, j$.time.chrono.s sVar) {
        v vVar = v.a;
        this.a = (e) Objects.requireNonNull(eVar, "printerParser");
        this.b = (Locale) Objects.requireNonNull(locale, "locale");
        this.c = (v) Objects.requireNonNull(vVar, "decimalStyle");
        this.d = sVar;
    }

    public final Locale d() {
        return this.b;
    }

    public final v c() {
        return this.c;
    }

    public final j$.time.chrono.l b() {
        return this.d;
    }

    public final String a(j$.time.temporal.o oVar) {
        StringBuilder sb = new StringBuilder(32);
        Objects.requireNonNull(oVar, "temporal");
        Objects.requireNonNull(sb, "appendable");
        try {
            this.a.i(new r(oVar, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new j$.time.c(e2.getMessage(), e2);
        }
    }

    final e e() {
        return this.a.a();
    }

    public final String toString() {
        String eVar = this.a.toString();
        return eVar.startsWith("[") ? eVar : eVar.substring(1, eVar.length() - 1);
    }
}
