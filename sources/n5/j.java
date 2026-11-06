package n5;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class j implements na.d {
    public static final j a = new j();
    public static final na.c b = na.c.c("requestTimeMs");
    public static final na.c c = na.c.c("requestUptimeMs");
    public static final na.c d = na.c.c("clientInfo");
    public static final na.c e = na.c.c("logSource");
    public static final na.c f = na.c.c("logSourceName");
    public static final na.c g = na.c.c("logEvent");
    public static final na.c h = na.c.c("qosTier");

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        na.e eVar = (na.e) obj2;
        t tVar = (t) ((f0) obj);
        eVar.e(b, tVar.a);
        eVar.e(c, tVar.b);
        eVar.a(d, tVar.c);
        eVar.a(e, tVar.d);
        eVar.a(f, tVar.e);
        eVar.a(g, tVar.f);
        eVar.a(h, j0.a);
    }
}
