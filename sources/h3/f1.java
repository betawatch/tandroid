package h3;

import fh.y5;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f1 implements g {
    public static final f1 h;
    public static final String n;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final String w;
    public static final y5 x;
    public final String a;
    public final c1 b;
    public final b1 c;
    public final h1 d;
    public final z0 e;
    public final d1 f;

    static {
        x0 x0Var = new x0();
        o8.x xVar = o8.z.b;
        o8.l0 l0Var = o8.l0.e;
        List list = Collections.EMPTY_LIST;
        o8.l0 l0Var2 = o8.l0.e;
        h = new f1("", new z0(x0Var), null, new b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h1.U, d1.c);
        int i9 = d5.f0.a;
        n = Integer.toString(0, 36);
        r = Integer.toString(1, 36);
        s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
        x = new y5(16);
    }

    public f1(String str, z0 z0Var, c1 c1Var, b1 b1Var, h1 h1Var, d1 d1Var) {
        this.a = str;
        this.b = c1Var;
        this.c = b1Var;
        this.d = h1Var;
        this.e = z0Var;
        this.f = d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return d5.f0.a(this.a, f1Var.a) && this.e.equals(f1Var.e) && d5.f0.a(this.b, f1Var.b) && d5.f0.a(this.c, f1Var.c) && d5.f0.a(this.d, f1Var.d) && d5.f0.a(this.f, f1Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c1 c1Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + (c1Var != null ? c1Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
