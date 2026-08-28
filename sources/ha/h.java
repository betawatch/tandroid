package ha;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h implements q9.d {
    public static final h a = new h();
    public static final q9.c b = q9.c.c("sessionId");
    public static final q9.c c = q9.c.c("firstSessionId");
    public static final q9.c d = q9.c.c("sessionIndex");
    public static final q9.c e = q9.c.c("eventTimestampUs");
    public static final q9.c f = q9.c.c("dataCollectionStatus");
    public static final q9.c g = q9.c.c("firebaseInstallationId");

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(b, n0Var.a);
        eVar.g(c, n0Var.b);
        eVar.c(d, n0Var.c);
        eVar.d(e, n0Var.d);
        eVar.g(f, n0Var.e);
        eVar.g(g, n0Var.f);
    }
}
