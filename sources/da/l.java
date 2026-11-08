package da;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l implements na.d {
    public static final l a = new l();
    public static final na.c b = na.c.c("generator");
    public static final na.c c = na.c.c("identifier");
    public static final na.c d = na.c.c("appQualitySessionId");
    public static final na.c e = na.c.c("startedAt");
    public static final na.c f = na.c.c("endedAt");
    public static final na.c g = na.c.c("crashed");
    public static final na.c h = na.c.c("app");
    public static final na.c i = na.c.c("user");
    public static final na.c j = na.c.c("os");
    public static final na.c k = na.c.c("device");
    public static final na.c l = na.c.c("events");
    public static final na.c m = na.c.c("generatorType");

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        na.e eVar = (na.e) obj2;
        n0 n0Var = (n0) ((t2) obj);
        eVar.a(b, n0Var.a);
        eVar.a(c, n0Var.b.getBytes(u2.a));
        eVar.a(d, n0Var.c);
        eVar.e(e, n0Var.d);
        eVar.a(f, n0Var.e);
        eVar.c(g, n0Var.f);
        eVar.a(h, n0Var.g);
        eVar.a(i, n0Var.h);
        eVar.a(j, n0Var.i);
        eVar.a(k, n0Var.j);
        eVar.a(l, n0Var.k);
        eVar.d(m, n0Var.l);
    }
}
