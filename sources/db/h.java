package db;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h implements ma.d {
    public static final h a = new h();
    public static final ma.c b = ma.c.c("sessionId");
    public static final ma.c c = ma.c.c("firstSessionId");
    public static final ma.c d = ma.c.c("sessionIndex");
    public static final ma.c e = ma.c.c("eventTimestampUs");
    public static final ma.c f = ma.c.c("dataCollectionStatus");
    public static final ma.c g = ma.c.c("firebaseInstallationId");
    public static final ma.c h = ma.c.c("firebaseAuthenticationToken");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        w0 w0Var = (w0) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(b, w0Var.a);
        eVar.a(c, w0Var.b);
        eVar.e(d, w0Var.c);
        eVar.f(e, w0Var.d);
        eVar.a(f, w0Var.e);
        eVar.a(g, w0Var.f);
        eVar.a(h, w0Var.g);
    }
}
