package ia;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h implements r9.d {
    public static final h a = new h();
    public static final r9.c b = r9.c.c("sessionId");
    public static final r9.c c = r9.c.c("firstSessionId");
    public static final r9.c d = r9.c.c("sessionIndex");
    public static final r9.c e = r9.c.c("eventTimestampUs");
    public static final r9.c f = r9.c.c("dataCollectionStatus");
    public static final r9.c g = r9.c.c("firebaseInstallationId");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        o0 o0Var = (o0) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(b, o0Var.a);
        eVar.a(c, o0Var.b);
        eVar.d(d, o0Var.c);
        eVar.c(e, o0Var.d);
        eVar.a(f, o0Var.e);
        eVar.a(g, o0Var.f);
    }
}
