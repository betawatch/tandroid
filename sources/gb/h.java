package gb;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        x0 x0Var = (x0) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(b, x0Var.a);
        eVar.a(c, x0Var.b);
        eVar.d(d, x0Var.c);
        eVar.e(e, x0Var.d);
        eVar.a(f, x0Var.e);
        eVar.a(g, x0Var.f);
        eVar.a(h, x0Var.g);
    }
}
