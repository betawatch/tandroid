package ca;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l implements ma.d {
    public static final l a = new l();
    public static final ma.c b = ma.c.c("generator");
    public static final ma.c c = ma.c.c("identifier");
    public static final ma.c d = ma.c.c("appQualitySessionId");
    public static final ma.c e = ma.c.c("startedAt");
    public static final ma.c f = ma.c.c("endedAt");
    public static final ma.c g = ma.c.c("crashed");
    public static final ma.c h = ma.c.c("app");
    public static final ma.c i = ma.c.c("user");
    public static final ma.c j = ma.c.c("os");
    public static final ma.c k = ma.c.c("device");
    public static final ma.c l = ma.c.c("events");
    public static final ma.c m = ma.c.c("generatorType");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        ma.e eVar = (ma.e) obj2;
        n0 n0Var = (n0) ((t2) obj);
        eVar.a(b, n0Var.a);
        eVar.a(c, n0Var.b.getBytes(u2.a));
        eVar.a(d, n0Var.c);
        eVar.f(e, n0Var.d);
        eVar.a(f, n0Var.e);
        eVar.b(g, n0Var.f);
        eVar.a(h, n0Var.g);
        eVar.a(i, n0Var.h);
        eVar.a(j, n0Var.i);
        eVar.a(k, n0Var.j);
        eVar.a(l, n0Var.k);
        eVar.e(m, n0Var.l);
    }
}
