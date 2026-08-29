package j3;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f1 implements g {
    public static final f1 h;
    public static final String n;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final String w;
    public static final d0 x;
    public final String a;
    public final c1 b;
    public final b1 c;
    public final h1 d;
    public final z0 e;
    public final d1 f;

    static {
        x0 x0Var = new x0();
        q8.x xVar = q8.z.b;
        q8.l0 l0Var = q8.l0.e;
        List list = Collections.EMPTY_LIST;
        q8.l0 l0Var2 = q8.l0.e;
        h = new f1("", new z0(x0Var), null, new b1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), h1.U, d1.c);
        int i10 = f5.d0.a;
        n = Integer.toString(0, 36);
        r = Integer.toString(1, 36);
        s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
        x = new d0(3);
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
        return f5.d0.a(this.a, f1Var.a) && this.e.equals(f1Var.e) && f5.d0.a(this.b, f1Var.b) && f5.d0.a(this.c, f1Var.c) && f5.d0.a(this.d, f1Var.d) && f5.d0.a(this.f, f1Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c1 c1Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + (c1Var != null ? c1Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
