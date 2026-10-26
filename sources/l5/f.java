package l5;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f implements ka.d {
    public static final f a = new f();
    public static final ka.c b = ka.c.c("requestTimeMs");
    public static final ka.c c = ka.c.c("requestUptimeMs");
    public static final ka.c d = ka.c.c("clientInfo");
    public static final ka.c e = ka.c.c("logSource");
    public static final ka.c f = ka.c.c("logSourceName");
    public static final ka.c g = ka.c.c("logEvent");
    public static final ka.c h = ka.c.c("qosTier");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ka.e eVar = (ka.e) obj2;
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
