package h9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g implements r9.d {
    public static final g a = new g();
    public static final r9.c b = r9.c.c("identifier");
    public static final r9.c c = r9.c.c("version");
    public static final r9.c d = r9.c.c("displayVersion");
    public static final r9.c e = r9.c.c("organization");
    public static final r9.c f = r9.c.c("installationUuid");
    public static final r9.c g = r9.c.c("developmentPlatform");
    public static final r9.c h = r9.c.c("developmentPlatformVersion");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        i0 i0Var = (i0) ((l1) obj);
        eVar.a(b, i0Var.a);
        eVar.a(c, i0Var.b);
        eVar.a(d, i0Var.c);
        eVar.a(e, null);
        eVar.a(f, i0Var.d);
        eVar.a(g, i0Var.e);
        eVar.a(h, i0Var.f);
    }
}
