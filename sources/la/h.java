package la;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h implements u9.d {
    public static final h a = new h();
    public static final u9.c b = u9.c.c("sessionId");
    public static final u9.c c = u9.c.c("firstSessionId");
    public static final u9.c d = u9.c.c("sessionIndex");
    public static final u9.c e = u9.c.c("eventTimestampUs");
    public static final u9.c f = u9.c.c("dataCollectionStatus");
    public static final u9.c g = u9.c.c("firebaseInstallationId");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, k0Var.a);
        eVar.e(c, k0Var.b);
        eVar.a(d, k0Var.c);
        eVar.b(e, k0Var.d);
        eVar.e(f, k0Var.e);
        eVar.e(g, k0Var.f);
    }
}
