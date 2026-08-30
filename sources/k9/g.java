package k9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g implements u9.d {
    public static final g a = new g();
    public static final u9.c b = u9.c.c("identifier");
    public static final u9.c c = u9.c.c("version");
    public static final u9.c d = u9.c.c("displayVersion");
    public static final u9.c e = u9.c.c("organization");
    public static final u9.c f = u9.c.c("installationUuid");
    public static final u9.c g = u9.c.c("developmentPlatform");
    public static final u9.c h = u9.c.c("developmentPlatformVersion");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        i0 i0Var = (i0) ((l1) obj);
        eVar.e(b, i0Var.a);
        eVar.e(c, i0Var.b);
        eVar.e(d, i0Var.c);
        eVar.e(e, null);
        eVar.e(f, i0Var.d);
        eVar.e(g, i0Var.e);
        eVar.e(h, i0Var.f);
    }
}
