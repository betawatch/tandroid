package aa;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j implements ka.d {
    public static final j a = new j();
    public static final ka.c b = ka.c.c("generator");
    public static final ka.c c = ka.c.c("identifier");
    public static final ka.c d = ka.c.c("appQualitySessionId");
    public static final ka.c e = ka.c.c("startedAt");
    public static final ka.c f = ka.c.c("endedAt");
    public static final ka.c g = ka.c.c("crashed");
    public static final ka.c h = ka.c.c("app");
    public static final ka.c i = ka.c.c("user");
    public static final ka.c j = ka.c.c("os");
    public static final ka.c k = ka.c.c("device");
    public static final ka.c l = ka.c.c("events");
    public static final ka.c m = ka.c.c("generatorType");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ka.e eVar = (ka.e) obj2;
        i0 i0Var = (i0) ((f2) obj);
        eVar.a(b, i0Var.a);
        eVar.a(c, i0Var.b.getBytes(g2.a));
        eVar.a(d, i0Var.c);
        eVar.f(e, i0Var.d);
        eVar.a(f, i0Var.e);
        eVar.d(g, i0Var.f);
        eVar.a(h, i0Var.g);
        eVar.a(i, i0Var.h);
        eVar.a(j, i0Var.i);
        eVar.a(k, i0Var.j);
        eVar.a(l, i0Var.k);
        eVar.e(m, i0Var.l);
    }
}
