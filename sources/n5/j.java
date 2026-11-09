package n5;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
