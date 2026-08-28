package g9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements q9.d {
    public static final b a = new b();
    public static final q9.c b = q9.c.c("pid");
    public static final q9.c c = q9.c.c("processName");
    public static final q9.c d = q9.c.c("reasonCode");
    public static final q9.c e = q9.c.c("importance");
    public static final q9.c f = q9.c.c("pss");
    public static final q9.c g = q9.c.c("rss");
    public static final q9.c h = q9.c.c("timestamp");
    public static final q9.c i = q9.c.c("traceFile");
    public static final q9.c j = q9.c.c("buildIdMappingForArch");

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        q9.e eVar = (q9.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.c(b, b0Var.a);
        eVar.g(c, b0Var.b);
        eVar.c(d, b0Var.c);
        eVar.c(e, b0Var.d);
        eVar.d(f, b0Var.e);
        eVar.d(g, b0Var.f);
        eVar.d(h, b0Var.g);
        eVar.g(i, b0Var.h);
        eVar.g(j, b0Var.i);
    }
}
