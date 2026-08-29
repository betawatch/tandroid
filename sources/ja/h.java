package ja;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h implements s9.d {
    public static final h a = new h();
    public static final s9.c b = s9.c.c("sessionId");
    public static final s9.c c = s9.c.c("firstSessionId");
    public static final s9.c d = s9.c.c("sessionIndex");
    public static final s9.c e = s9.c.c("eventTimestampUs");
    public static final s9.c f = s9.c.c("dataCollectionStatus");
    public static final s9.c g = s9.c.c("firebaseInstallationId");

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(b, n0Var.a);
        eVar.e(c, n0Var.b);
        eVar.b(d, n0Var.c);
        eVar.c(e, n0Var.d);
        eVar.e(f, n0Var.e);
        eVar.e(g, n0Var.f);
    }
}
