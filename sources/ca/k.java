package ca;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k implements ma.d {
    public static final k a = new k();
    public static final ma.c b = ma.c.c("arch");
    public static final ma.c c = ma.c.c("model");
    public static final ma.c d = ma.c.c("cores");
    public static final ma.c e = ma.c.c("ram");
    public static final ma.c f = ma.c.c("diskSpace");
    public static final ma.c g = ma.c.c("simulator");
    public static final ma.c h = ma.c.c("state");
    public static final ma.c i = ma.c.c("manufacturer");
    public static final ma.c j = ma.c.c("modelClass");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        ma.e eVar = (ma.e) obj2;
        r0 r0Var = (r0) ((c2) obj);
        eVar.e(b, r0Var.a);
        eVar.a(c, r0Var.b);
        eVar.e(d, r0Var.c);
        eVar.f(e, r0Var.d);
        eVar.f(f, r0Var.e);
        eVar.b(g, r0Var.f);
        eVar.e(h, r0Var.g);
        eVar.a(i, r0Var.h);
        eVar.a(j, r0Var.i);
    }
}
