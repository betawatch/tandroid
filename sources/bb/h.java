package bb;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h implements ka.d {
    public static final h a = new h();
    public static final ka.c b = ka.c.c("sessionId");
    public static final ka.c c = ka.c.c("firstSessionId");
    public static final ka.c d = ka.c.c("sessionIndex");
    public static final ka.c e = ka.c.c("eventTimestampUs");
    public static final ka.c f = ka.c.c("dataCollectionStatus");
    public static final ka.c g = ka.c.c("firebaseInstallationId");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, n0Var.a);
        eVar.a(c, n0Var.b);
        eVar.e(d, n0Var.c);
        eVar.f(e, n0Var.d);
        eVar.a(f, n0Var.e);
        eVar.a(g, n0Var.f);
    }
}
