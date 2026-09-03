package j3;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c1 implements g {
    public static final c1 h;
    public static final String n;
    public static final String r;
    public static final String s;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final f0.d y;
    public final String a;
    public final y0 b;
    public final x0 c;
    public final e1 d;
    public final u0 e;
    public final z0 f;

    static {
        s0 s0Var = new s0();
        s8.t tVar = s8.v.b;
        s8.i0 i0Var = s8.i0.e;
        List list = Collections.EMPTY_LIST;
        s8.i0 i0Var2 = s8.i0.e;
        h = new c1("", new u0(s0Var), null, new x0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), e1.V, z0.c);
        int i10 = h5.d0.a;
        n = Integer.toString(0, 36);
        r = Integer.toString(1, 36);
        s = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
        x = Integer.toString(5, 36);
        y = new f0.d(29);
    }

    public c1(String str, u0 u0Var, y0 y0Var, x0 x0Var, e1 e1Var, z0 z0Var) {
        this.a = str;
        this.b = y0Var;
        this.c = x0Var;
        this.d = e1Var;
        this.e = u0Var;
        this.f = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return h5.d0.a(this.a, c1Var.a) && this.e.equals(c1Var.e) && h5.d0.a(this.b, c1Var.b) && h5.d0.a(this.c, c1Var.c) && h5.d0.a(this.d, c1Var.d) && h5.d0.a(this.f, c1Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y0 y0Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + (y0Var != null ? y0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
