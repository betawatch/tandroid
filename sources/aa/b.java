package aa;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b implements ka.d {
    public static final b a = new b();
    public static final ka.c b = ka.c.c("pid");
    public static final ka.c c = ka.c.c("processName");
    public static final ka.c d = ka.c.c("reasonCode");
    public static final ka.c e = ka.c.c("importance");
    public static final ka.c f = ka.c.c("pss");
    public static final ka.c g = ka.c.c("rss");
    public static final ka.c h = ka.c.c("timestamp");
    public static final ka.c i = ka.c.c("traceFile");
    public static final ka.c j = ka.c.c("buildIdMappingForArch");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ka.e eVar = (ka.e) obj2;
        c0 c0Var = (c0) ((i1) obj);
        eVar.e(b, c0Var.a);
        eVar.a(c, c0Var.b);
        eVar.e(d, c0Var.c);
        eVar.e(e, c0Var.d);
        eVar.f(f, c0Var.e);
        eVar.f(g, c0Var.f);
        eVar.f(h, c0Var.g);
        eVar.a(i, c0Var.h);
        eVar.a(j, c0Var.i);
    }
}
