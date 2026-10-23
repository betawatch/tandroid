package ab;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class h implements ja.d {
    public static final h a = new h();
    public static final ja.c b = ja.c.c("sessionId");
    public static final ja.c c = ja.c.c("firstSessionId");
    public static final ja.c d = ja.c.c("sessionIndex");
    public static final ja.c e = ja.c.c("eventTimestampUs");
    public static final ja.c f = ja.c.c("dataCollectionStatus");
    public static final ja.c g = ja.c.c("firebaseInstallationId");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, n0Var.a);
        eVar.d(c, n0Var.b);
        eVar.g(d, n0Var.c);
        eVar.f(e, n0Var.d);
        eVar.d(f, n0Var.e);
        eVar.d(g, n0Var.f);
    }
}
