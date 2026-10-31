package org.telegram.ui;

import java.util.Locale;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p61 {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public boolean G;
    public boolean H;
    public String a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public boolean l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public boolean r;
    public boolean s;
    public String t;
    public String u;
    public String v;
    public boolean w;
    public boolean x;
    public String y;
    public String z;

    public static xa.n a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        String str;
        double d = tL_statsAbsValueAndPrev.current;
        double d10 = tL_statsAbsValueAndPrev.previous;
        int i10 = (int) (d - d10);
        float abs = d10 == 0.0d ? 0.0f : Math.abs((i10 / ((float) d10)) * 100.0f);
        String o02 = org.telegram.messenger.i0.o0((int) tL_statsAbsValueAndPrev.current, 0);
        str = "";
        if (i10 != 0 && abs != 0.0f) {
            int i11 = (int) abs;
            if (abs == i11) {
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 > 0 ? "+" : "");
                sb2.append(org.telegram.messenger.i0.o0(i10, 0));
                str = sb2.toString() + " (" + i11 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i10 > 0 ? "+" : "");
                sb3.append(org.telegram.messenger.i0.o0(i10, 0));
                str = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs), "%");
            }
        }
        boolean z10 = i10 >= 0;
        boolean z11 = (i10 == 0 && tL_statsAbsValueAndPrev.current == 0.0d) ? false : true;
        Boolean valueOf = Boolean.valueOf(z10);
        Boolean valueOf2 = Boolean.valueOf(z11);
        xa.n nVar = new xa.n();
        nVar.a = o02;
        nVar.d = str;
        nVar.b = valueOf;
        nVar.c = valueOf2;
        return nVar;
    }
}
