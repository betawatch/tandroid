package k5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
