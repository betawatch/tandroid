package org.telegram.ui;

import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ba1 {
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

    public static com.google.firebase.messaging.r a(TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev) {
        String str;
        double d = tL_statsAbsValueAndPrev.current;
        double d10 = tL_statsAbsValueAndPrev.previous;
        int i10 = (int) (d - d10);
        float abs = d10 == 0.0d ? 0.0f : Math.abs((i10 / ((float) d10)) * 100.0f);
        boolean z4 = false;
        String formatWholeNumber = AndroidUtilities.formatWholeNumber((int) tL_statsAbsValueAndPrev.current, 0);
        boolean z10 = true;
        str = "";
        if (i10 != 0 && abs != 0.0f) {
            int i11 = (int) abs;
            if (abs == i11) {
                Locale locale = Locale.ENGLISH;
                StringBuilder sb = new StringBuilder();
                sb.append(i10 > 0 ? "+" : "");
                sb.append(AndroidUtilities.formatWholeNumber(i10, 0));
                str = sb.toString() + " (" + i11 + "%)";
            } else {
                Locale locale2 = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 > 0 ? "+" : "");
                sb2.append(AndroidUtilities.formatWholeNumber(i10, 0));
                str = String.format(locale2, "%s (%.1f%s)", sb2.toString(), Float.valueOf(abs), "%");
            }
        }
        boolean z11 = i10 >= 0;
        if (i10 == 0 && tL_statsAbsValueAndPrev.current == 0.0d) {
            z10 = false;
        }
        Boolean valueOf = Boolean.valueOf(z11);
        Boolean valueOf2 = Boolean.valueOf(z10);
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(22, z4);
        rVar.b = formatWholeNumber;
        rVar.e = str;
        rVar.c = valueOf;
        rVar.d = valueOf2;
        return rVar;
    }
}
