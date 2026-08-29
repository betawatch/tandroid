package i9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g implements s9.d {
    public static final g a = new g();
    public static final s9.c b = s9.c.c("identifier");
    public static final s9.c c = s9.c.c("version");
    public static final s9.c d = s9.c.c("displayVersion");
    public static final s9.c e = s9.c.c("organization");
    public static final s9.c f = s9.c.c("installationUuid");
    public static final s9.c g = s9.c.c("developmentPlatform");
    public static final s9.c h = s9.c.c("developmentPlatformVersion");

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        s9.e eVar = (s9.e) obj2;
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
