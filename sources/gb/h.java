package gb;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        w0 w0Var = (w0) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(b, w0Var.a);
        eVar.a(c, w0Var.b);
        eVar.d(d, w0Var.c);
        eVar.e(e, w0Var.d);
        eVar.a(f, w0Var.e);
        eVar.a(g, w0Var.f);
        eVar.a(h, w0Var.g);
    }
}
