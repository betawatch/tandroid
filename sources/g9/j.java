package g9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j implements q9.d {
    public static final j a = new j();
    public static final q9.c b = q9.c.c("generator");
    public static final q9.c c = q9.c.c("identifier");
    public static final q9.c d = q9.c.c("appQualitySessionId");
    public static final q9.c e = q9.c.c("startedAt");
    public static final q9.c f = q9.c.c("endedAt");
    public static final q9.c g = q9.c.c("crashed");
    public static final q9.c h = q9.c.c("app");
    public static final q9.c i = q9.c.c("user");
    public static final q9.c j = q9.c.c("os");
    public static final q9.c k = q9.c.c("device");
    public static final q9.c l = q9.c.c("events");
    public static final q9.c m = q9.c.c("generatorType");

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        q9.e eVar = (q9.e) obj2;
        h0 h0Var = (h0) ((d2) obj);
        eVar.g(b, h0Var.a);
        eVar.g(c, h0Var.b.getBytes(e2.a));
        eVar.g(d, h0Var.c);
        eVar.d(e, h0Var.d);
        eVar.g(f, h0Var.e);
        eVar.a(g, h0Var.f);
        eVar.g(h, h0Var.g);
        eVar.g(i, h0Var.h);
        eVar.g(j, h0Var.i);
        eVar.g(k, h0Var.j);
        eVar.g(l, h0Var.k);
        eVar.c(m, h0Var.l);
    }
}
