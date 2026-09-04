package j$.time.format;

import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter e;
    public final e a;
    public final Locale b;
    public final v c;
    public final j$.time.chrono.k d;

    static {
        p pVar = new p();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        x xVar = x.EXCEEDS_PAD;
        pVar.h(aVar, 4, 10, xVar);
        pVar.c('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        pVar.g(aVar2, 2);
        pVar.c('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        pVar.g(aVar3, 2);
        w wVar = w.STRICT;
        j$.time.chrono.r rVar = j$.time.chrono.r.c;
        DateTimeFormatter k10 = pVar.k(wVar, rVar);
        ISO_LOCAL_DATE = k10;
        p pVar2 = new p();
        k kVar = k.INSENSITIVE;
        pVar2.b(kVar);
        pVar2.a(k10);
        j jVar = j.e;
        pVar2.b(jVar);
        pVar2.k(wVar, rVar);
        p pVar3 = new p();
        pVar3.b(kVar);
        pVar3.a(k10);
        pVar3.j();
        pVar3.b(jVar);
        pVar3.k(wVar, rVar);
        p pVar4 = new p();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        pVar4.g(aVar4, 2);
        pVar4.c(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        pVar4.g(aVar5, 2);
        pVar4.j();
        pVar4.c(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        pVar4.g(aVar6, 2);
        pVar4.j();
        j$.time.temporal.a aVar7 = j$.time.temporal.a.NANO_OF_SECOND;
        g gVar = new g(aVar7, 0, 9, true, 0);
        Objects.requireNonNull(aVar7, "field");
        j$.time.temporal.s sVar = aVar7.b;
        if (sVar.a != sVar.b || sVar.c != sVar.d) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar7);
        }
        pVar4.b(gVar);
        DateTimeFormatter k11 = pVar4.k(wVar, null);
        p pVar5 = new p();
        pVar5.b(kVar);
        pVar5.a(k11);
        pVar5.b(jVar);
        pVar5.k(wVar, null);
        p pVar6 = new p();
        pVar6.b(kVar);
        pVar6.a(k11);
        pVar6.j();
        pVar6.b(jVar);
        pVar6.k(wVar, null);
        p pVar7 = new p();
        pVar7.b(kVar);
        pVar7.a(k10);
        pVar7.c('T');
        pVar7.a(k11);
        DateTimeFormatter k12 = pVar7.k(wVar, rVar);
        p pVar8 = new p();
        pVar8.b(kVar);
        pVar8.a(k12);
        k kVar2 = k.LENIENT;
        pVar8.b(kVar2);
        pVar8.b(jVar);
        k kVar3 = k.STRICT;
        pVar8.b(kVar3);
        DateTimeFormatter k13 = pVar8.k(wVar, rVar);
        p pVar9 = new p();
        pVar9.a(k13);
        pVar9.j();
        pVar9.c('[');
        k kVar4 = k.SENSITIVE;
        pVar9.b(kVar4);
        a aVar8 = p.f;
        pVar9.b(new n(aVar8, "ZoneRegionId()"));
        pVar9.c(']');
        pVar9.k(wVar, rVar);
        p pVar10 = new p();
        pVar10.a(k12);
        pVar10.j();
        pVar10.b(jVar);
        pVar10.j();
        pVar10.c('[');
        pVar10.b(kVar4);
        pVar10.b(new n(aVar8, "ZoneRegionId()"));
        pVar10.c(']');
        pVar10.k(wVar, rVar);
        p pVar11 = new p();
        pVar11.b(kVar);
        pVar11.h(aVar, 4, 10, xVar);
        pVar11.c('-');
        pVar11.g(j$.time.temporal.a.DAY_OF_YEAR, 3);
        pVar11.j();
        pVar11.b(jVar);
        pVar11.k(wVar, rVar);
        p pVar12 = new p();
        pVar12.b(kVar);
        pVar12.h(j$.time.temporal.i.c, 4, 10, xVar);
        pVar12.d("-W");
        pVar12.g(j$.time.temporal.i.b, 2);
        pVar12.c('-');
        j$.time.temporal.a aVar9 = j$.time.temporal.a.DAY_OF_WEEK;
        pVar12.g(aVar9, 1);
        pVar12.j();
        pVar12.b(jVar);
        pVar12.k(wVar, rVar);
        p pVar13 = new p();
        pVar13.b(kVar);
        pVar13.b(new h());
        e = pVar13.k(wVar, null);
        p pVar14 = new p();
        pVar14.b(kVar);
        pVar14.g(aVar, 4);
        pVar14.g(aVar2, 2);
        pVar14.g(aVar3, 2);
        pVar14.j();
        pVar14.b(kVar2);
        pVar14.b(new j("+HHMMss", "Z"));
        pVar14.b(kVar3);
        pVar14.k(wVar, rVar);
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
        pVar15.b(kVar);
        pVar15.b(kVar2);
        pVar15.j();
        pVar15.e(aVar9, hashMap);
        pVar15.d(", ");
        pVar15.i();
        pVar15.h(aVar3, 1, 2, x.NOT_NEGATIVE);
        pVar15.c(' ');
        pVar15.e(aVar2, hashMap2);
        pVar15.c(' ');
        pVar15.g(aVar, 4);
        pVar15.c(' ');
        pVar15.g(aVar4, 2);
        pVar15.c(':');
        pVar15.g(aVar5, 2);
        pVar15.j();
        pVar15.c(':');
        pVar15.g(aVar6, 2);
        pVar15.i();
        pVar15.c(' ');
        pVar15.b(new j("+HHMM", "GMT"));
        pVar15.k(w.SMART, rVar);
    }

    public DateTimeFormatter(e eVar, Locale locale, w wVar, j$.time.chrono.k kVar) {
        v vVar = v.a;
        this.a = (e) Objects.requireNonNull(eVar, "printerParser");
        this.b = (Locale) Objects.requireNonNull(locale, "locale");
        this.c = (v) Objects.requireNonNull(vVar, "decimalStyle");
        this.d = kVar;
    }

    public final String a(j$.time.temporal.l lVar) {
        StringBuilder sb2 = new StringBuilder(32);
        e eVar = this.a;
        Objects.requireNonNull(lVar, "temporal");
        Objects.requireNonNull(sb2, "appendable");
        try {
            eVar.j(new r(lVar, this), sb2);
            return sb2.toString();
        } catch (IOException e7) {
            throw new j$.time.b(e7.getMessage(), e7);
        }
    }

    public final String toString() {
        String eVar = this.a.toString();
        return eVar.startsWith("[") ? eVar : eVar.substring(1, eVar.length() - 1);
    }
}
