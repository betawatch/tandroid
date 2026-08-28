package cc;

import f7.l7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public static final String[] o = {"34", "37"};
    public static final String[] p = {"60", "62", "64", "65"};
    public static final String[] q = {"35"};
    public static final String[] r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] s = {"4"};
    public static final String[] t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public String l;
    public String m;
    public final String n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.a = l7.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.c = num;
        this.d = num2;
        this.b = l7.e(str2);
        this.e = l7.e(str3);
        this.f = l7.e(str4);
        this.g = l7.e(str5);
        this.h = l7.e(str6);
        this.i = l7.e(str7);
        this.j = l7.e(str8);
        this.k = l7.e(str9);
        this.m = l7.a(str10) == null ? a() : str10;
        this.l = l7.e(str11) == null ? b() : str11;
        l7.e(str12);
        l7.b(str13);
        l7.e(str14);
        this.n = l7.e(str15);
    }

    public final String a() {
        if (l7.d(this.m)) {
            String str = this.a;
            if (!l7.d(str)) {
                this.m = l7.c(str, o) ? "American Express" : l7.c(str, p) ? "Discover" : l7.c(str, q) ? "JCB" : l7.c(str, r) ? "Diners Club" : l7.c(str, s) ? "Visa" : l7.c(str, t) ? "MasterCard" : "Unknown";
            }
        }
        return this.m;
    }

    public final String b() {
        if (!l7.d(this.l)) {
            return this.l;
        }
        String str = this.a;
        if (str == null || str.length() <= 4) {
            return null;
        }
        String substring = str.substring(str.length() - 4, str.length());
        this.l = substring;
        return substring;
    }
}
