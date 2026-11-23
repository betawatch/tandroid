package gb;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class h implements na.d {
    public static final h a = new h();
    public static final na.c b = na.c.c("sessionId");
    public static final na.c c = na.c.c("firstSessionId");
    public static final na.c d = na.c.c("sessionIndex");
    public static final na.c e = na.c.c("eventTimestampUs");
    public static final na.c f = na.c.c("dataCollectionStatus");
    public static final na.c g = na.c.c("firebaseInstallationId");
    public static final na.c h = na.c.c("firebaseAuthenticationToken");

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        v0 v0Var = (v0) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(b, v0Var.a);
        eVar.a(c, v0Var.b);
        eVar.d(d, v0Var.c);
        eVar.e(e, v0Var.d);
        eVar.a(f, v0Var.e);
        eVar.a(g, v0Var.f);
        eVar.a(h, v0Var.g);
    }
}
