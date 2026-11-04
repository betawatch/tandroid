package m5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements ma.d {
    public static final j a = new j();
    public static final ma.c b = ma.c.c("requestTimeMs");
    public static final ma.c c = ma.c.c("requestUptimeMs");
    public static final ma.c d = ma.c.c("clientInfo");
    public static final ma.c e = ma.c.c("logSource");
    public static final ma.c f = ma.c.c("logSourceName");
    public static final ma.c g = ma.c.c("logEvent");
    public static final ma.c h = ma.c.c("qosTier");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        ma.e eVar = (ma.e) obj2;
        t tVar = (t) ((f0) obj);
        eVar.f(b, tVar.a);
        eVar.f(c, tVar.b);
        eVar.a(d, tVar.c);
        eVar.a(e, tVar.d);
        eVar.a(f, tVar.e);
        eVar.a(g, tVar.f);
        eVar.a(h, j0.a);
    }
}
