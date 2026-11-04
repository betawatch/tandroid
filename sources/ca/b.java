package ca;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements ma.d {
    public static final b a = new b();
    public static final ma.c b = ma.c.c("pid");
    public static final ma.c c = ma.c.c("processName");
    public static final ma.c d = ma.c.c("reasonCode");
    public static final ma.c e = ma.c.c("importance");
    public static final ma.c f = ma.c.c("pss");
    public static final ma.c g = ma.c.c("rss");
    public static final ma.c h = ma.c.c("timestamp");
    public static final ma.c i = ma.c.c("traceFile");
    public static final ma.c j = ma.c.c("buildIdMappingForArch");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        ma.e eVar = (ma.e) obj2;
        f0 f0Var = (f0) ((u1) obj);
        eVar.e(b, f0Var.a);
        eVar.a(c, f0Var.b);
        eVar.e(d, f0Var.c);
        eVar.e(e, f0Var.d);
        eVar.f(f, f0Var.e);
        eVar.f(g, f0Var.f);
        eVar.f(h, f0Var.g);
        eVar.a(i, f0Var.h);
        eVar.a(j, f0Var.i);
    }
}
