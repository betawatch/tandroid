package k9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b implements u9.d {
    public static final b a = new b();
    public static final u9.c b = u9.c.c("pid");
    public static final u9.c c = u9.c.c("processName");
    public static final u9.c d = u9.c.c("reasonCode");
    public static final u9.c e = u9.c.c("importance");
    public static final u9.c f = u9.c.c("pss");
    public static final u9.c g = u9.c.c("rss");
    public static final u9.c h = u9.c.c("timestamp");
    public static final u9.c i = u9.c.c("traceFile");
    public static final u9.c j = u9.c.c("buildIdMappingForArch");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.a(b, b0Var.a);
        eVar.e(c, b0Var.b);
        eVar.a(d, b0Var.c);
        eVar.a(e, b0Var.d);
        eVar.b(f, b0Var.e);
        eVar.b(g, b0Var.f);
        eVar.b(h, b0Var.g);
        eVar.e(i, b0Var.h);
        eVar.e(j, b0Var.i);
    }
}
