package k5;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class f implements ia.d {
    public static final f a = new f();
    public static final ia.c b = ia.c.c("requestTimeMs");
    public static final ia.c c = ia.c.c("requestUptimeMs");
    public static final ia.c d = ia.c.c("clientInfo");
    public static final ia.c e = ia.c.c("logSource");
    public static final ia.c f = ia.c.c("logSourceName");
    public static final ia.c g = ia.c.c("logEvent");
    public static final ia.c h = ia.c.c("qosTier");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.f(b, lVar.a);
        eVar.f(c, lVar.b);
        eVar.a(d, lVar.c);
        eVar.a(e, lVar.d);
        eVar.a(f, lVar.e);
        eVar.a(g, lVar.f);
        eVar.a(h, w.a);
    }
}
