package j$.time.format;

import j$.util.A;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class p {
    private static final a f = new a();
    private p a;
    private final p b;
    private final ArrayList c;
    private final boolean d;
    private int e;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.l lVar = j$.time.temporal.i.a;
        hashMap.put('Q', lVar);
        hashMap.put('q', lVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
    }

    public p() {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = null;
        this.d = false;
    }

    private p(p pVar) {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = pVar;
        this.d = true;
    }

    public final void s() {
        d(k.SENSITIVE);
    }

    public final void r() {
        d(k.INSENSITIVE);
    }

    public final void t() {
        d(k.LENIENT);
    }

    public final void l(j$.time.temporal.l lVar, int i) {
        A.z(lVar, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        k(new i(lVar, i, i, x.NOT_NEGATIVE));
    }

    public final void m(j$.time.temporal.l lVar, int i, int i2, x xVar) {
        if (i == i2 && xVar == x.NOT_NEGATIVE) {
            l(lVar, i2);
            return;
        }
        A.z(lVar, "field");
        A.z(xVar, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
        k(new i(lVar, i, i2, xVar));
    }

    private void k(i iVar) {
        i b;
        x xVar;
        p pVar = this.a;
        int i = pVar.e;
        if (i >= 0) {
            i iVar2 = (i) pVar.c.get(i);
            int i2 = iVar.b;
            int i3 = iVar.c;
            if (i2 == i3) {
                xVar = iVar.d;
                if (xVar == x.NOT_NEGATIVE) {
                    b = iVar2.c(i3);
                    d(iVar.b());
                    this.a.e = i;
                    this.a.c.set(i, b);
                    return;
                }
            }
            b = iVar2.b();
            this.a.e = d(iVar);
            this.a.c.set(i, b);
            return;
        }
        pVar.e = d(iVar);
    }

    public final void b(j$.time.temporal.a aVar) {
        d(new g(aVar));
    }

    public final void i(j$.time.temporal.a aVar, TextStyle textStyle) {
        A.z(aVar, "field");
        A.z(textStyle, "textStyle");
        d(new m(aVar, textStyle, new u()));
    }

    public final void j(j$.time.temporal.a aVar, HashMap hashMap) {
        A.z(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        TextStyle textStyle = TextStyle.FULL;
        d(new m(aVar, textStyle, new b(new t(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void c() {
        d(new h());
    }

    public final void h() {
        d(j.d);
    }

    public final void g(String str, String str2) {
        d(new j(str, str2));
    }

    public final void n() {
        d(new n(f, "ZoneRegionId()"));
    }

    public final void o(TextStyle textStyle) {
        d(new o(textStyle));
    }

    public final void e(char c) {
        d(new d(c));
    }

    public final void f(String str) {
        if (str.length() > 0) {
            if (str.length() == 1) {
                d(new d(str.charAt(0)));
            } else {
                d(new l(str));
            }
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        d(dateTimeFormatter.e());
    }

    public final void q() {
        p pVar = this.a;
        pVar.e = -1;
        this.a = new p(pVar);
    }

    public final void p() {
        p pVar = this.a;
        if (pVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (pVar.c.size() > 0) {
            p pVar2 = this.a;
            e eVar = new e(pVar2.c, pVar2.d);
            this.a = this.a.b;
            d(eVar);
            return;
        }
        this.a = this.a.b;
    }

    private int d(f fVar) {
        A.z(fVar, "pp");
        p pVar = this.a;
        pVar.getClass();
        pVar.c.add(fVar);
        this.a.e = -1;
        return r2.c.size() - 1;
    }

    public final DateTimeFormatter v(Locale locale) {
        return w(locale, w.SMART, null);
    }

    final DateTimeFormatter u(w wVar, j$.time.chrono.f fVar) {
        return w(Locale.getDefault(), wVar, fVar);
    }

    private DateTimeFormatter w(Locale locale, w wVar, j$.time.chrono.f fVar) {
        A.z(locale, "locale");
        while (this.a.b != null) {
            p();
        }
        e eVar = new e(this.c, false);
        v vVar = v.a;
        return new DateTimeFormatter(eVar, locale, wVar, fVar);
    }
}
