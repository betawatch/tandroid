// default package

import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h3c {
    public final rb0 a;
    public final String b;
    public final d44 c;
    public final z0c d;
    public final i3c e;

    public h3c(rb0 rb0Var, String str, d44 d44Var, z0c z0cVar, i3c i3cVar) {
        this.a = rb0Var;
        this.b = str;
        this.c = d44Var;
        this.d = z0cVar;
        this.e = i3cVar;
    }

    public final void a(na0 na0Var, j3c j3cVar) {
        z0c z0cVar = this.d;
        if (z0cVar == null) {
            gxc.d("Null transformer");
            return;
        }
        i3c i3cVar = this.e;
        kd3 kd3Var = i3cVar.c;
        rb0 b = this.a.b(na0Var.c);
        oa0 oa0Var = new oa0();
        oa0Var.h = new HashMap();
        oa0Var.f = Long.valueOf(i3cVar.a.a());
        oa0Var.g = Long.valueOf(i3cVar.b.a());
        oa0Var.a = this.b;
        oa0Var.e = new z34(this.c, (byte[]) z0cVar.apply(na0Var.b));
        oa0Var.c = na0Var.a;
        hb0 hb0Var = na0Var.d;
        if (hb0Var != null) {
            oa0Var.d = hb0Var.a;
        }
        kd3Var.b.execute(new xo1(kd3Var, b, j3cVar, oa0Var.b(), (byte) 12));
    }
}
