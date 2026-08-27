package h9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b implements r9.d {
    public static final b a = new b();
    public static final r9.c b = r9.c.c("pid");
    public static final r9.c c = r9.c.c("processName");
    public static final r9.c d = r9.c.c("reasonCode");
    public static final r9.c e = r9.c.c("importance");
    public static final r9.c f = r9.c.c("pss");
    public static final r9.c g = r9.c.c("rss");
    public static final r9.c h = r9.c.c("timestamp");
    public static final r9.c i = r9.c.c("traceFile");
    public static final r9.c j = r9.c.c("buildIdMappingForArch");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.d(b, b0Var.a);
        eVar.a(c, b0Var.b);
        eVar.d(d, b0Var.c);
        eVar.d(e, b0Var.d);
        eVar.c(f, b0Var.e);
        eVar.c(g, b0Var.f);
        eVar.c(h, b0Var.g);
        eVar.a(i, b0Var.h);
        eVar.a(j, b0Var.i);
    }
}
