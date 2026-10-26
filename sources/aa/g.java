package aa;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g implements ka.d {
    public static final g a = new g();
    public static final ka.c b = ka.c.c("identifier");
    public static final ka.c c = ka.c.c("version");
    public static final ka.c d = ka.c.c("displayVersion");
    public static final ka.c e = ka.c.c("organization");
    public static final ka.c f = ka.c.c("installationUuid");
    public static final ka.c g = ka.c.c("developmentPlatform");
    public static final ka.c h = ka.c.c("developmentPlatformVersion");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ka.e eVar = (ka.e) obj2;
        j0 j0Var = (j0) ((n1) obj);
        eVar.a(b, j0Var.a);
        eVar.a(c, j0Var.b);
        eVar.a(d, j0Var.c);
        eVar.a(e, null);
        eVar.a(f, j0Var.d);
        eVar.a(g, j0Var.e);
        eVar.a(h, j0Var.f);
    }
}
