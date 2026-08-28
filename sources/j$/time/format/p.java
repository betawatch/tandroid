package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p {
    public static final a f = new a(0);
    public p a;
    public final p b;
    public final List c;
    public final boolean d;
    public int e;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.g gVar = j$.time.temporal.i.a;
        hashMap.put('Q', gVar);
        hashMap.put('q', gVar);
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
        hashMap.put('g', j$.time.temporal.k.a);
    }

    public p() {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = null;
        this.d = false;
    }

    public p(p pVar) {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = pVar;
        this.d = true;
    }

    public final void g(j$.time.temporal.o oVar, int i9) {
        Objects.requireNonNull(oVar, "field");
        if (i9 < 1 || i9 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i9);
        }
        f(new i(oVar, i9, i9, x.NOT_NEGATIVE));
    }

    public final void h(j$.time.temporal.o oVar, int i9, int i10, x xVar) {
        if (i9 == i10 && xVar == x.NOT_NEGATIVE) {
            g(oVar, i10);
            return;
        }
        Objects.requireNonNull(oVar, "field");
        Objects.requireNonNull(xVar, "signStyle");
        if (i9 < 1 || i9 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i9);
        }
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i10 < i9) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i10 + " < " + i9);
        }
        f(new i(oVar, i9, i10, xVar));
    }

    public final void f(i iVar) {
        i a2;
        p pVar = this.a;
        int i9 = pVar.e;
        if (i9 < 0) {
            pVar.e = b(iVar);
            return;
        }
        i iVar2 = (i) ((ArrayList) pVar.c).get(i9);
        int i10 = iVar.b;
        int i11 = iVar.c;
        if (i10 == i11 && iVar.d == x.NOT_NEGATIVE) {
            a2 = iVar2.b(i11);
            b(iVar.a());
            this.a.e = i9;
        } else {
            a2 = iVar2.a();
            this.a.e = b(iVar);
        }
        ((ArrayList) this.a.c).set(i9, a2);
    }

    public final void e(j$.time.temporal.a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        b(new m(aVar, textStyle, new b(new t(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void c(char c10) {
        b(new d(c10));
    }

    public final void d(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new d(str.charAt(0)));
        } else {
            b(new l(str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        e eVar = dateTimeFormatter.a;
        if (eVar.b) {
            eVar = new e(eVar.a, false);
        }
        b(eVar);
    }

    public final void j() {
        p pVar = this.a;
        pVar.e = -1;
        this.a = new p(pVar);
    }

    public final void i() {
        p pVar = this.a;
        if (pVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) pVar.c).size() > 0) {
            p pVar2 = this.a;
            e eVar = new e(pVar2.c, pVar2.d);
            this.a = this.a.b;
            b(eVar);
            return;
        }
        this.a = this.a.b;
    }

    public final int b(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        p pVar = this.a;
        pVar.getClass();
        ((ArrayList) pVar.c).add(fVar);
        this.a.e = -1;
        return ((ArrayList) r2.c).size() - 1;
    }

    public final DateTimeFormatter k(w wVar, j$.time.chrono.k kVar) {
        return l(Locale.getDefault(), wVar, kVar);
    }

    public final DateTimeFormatter l(Locale locale, w wVar, j$.time.chrono.k kVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            i();
        }
        e eVar = new e(this.c, false);
        v vVar = v.a;
        return new DateTimeFormatter(eVar, locale, wVar, kVar);
    }
}
