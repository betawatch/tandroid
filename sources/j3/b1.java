package j3;

import android.net.Uri;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class b1 implements g {
    public static final q0 B;
    public static final String n;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String h;

    static {
        int i10 = h5.d0.a;
        n = Integer.toString(0, 36);
        r = Integer.toString(1, 36);
        s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
        x = Integer.toString(5, 36);
        y = Integer.toString(6, 36);
        B = new q0(7);
    }

    public b1(c9.a aVar) {
        this.a = (Uri) aVar.d;
        this.b = (String) aVar.a;
        this.c = (String) aVar.e;
        this.d = aVar.b;
        this.e = aVar.c;
        this.f = (String) aVar.f;
        this.h = (String) aVar.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.a.equals(b1Var.a) && h5.d0.a(this.b, b1Var.b) && h5.d0.a(this.c, b1Var.c) && this.d == b1Var.d && this.e == b1Var.e && h5.d0.a(this.f, b1Var.f) && h5.d0.a(this.h, b1Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
