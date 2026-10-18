package k5;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class f implements ja.d {
    public static final f a = new f();
    public static final ja.c b = ja.c.c("requestTimeMs");
    public static final ja.c c = ja.c.c("requestUptimeMs");
    public static final ja.c d = ja.c.c("clientInfo");
    public static final ja.c e = ja.c.c("logSource");
    public static final ja.c f = ja.c.c("logSourceName");
    public static final ja.c g = ja.c.c("logEvent");
    public static final ja.c h = ja.c.c("qosTier");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.f(b, lVar.a);
        eVar.f(c, lVar.b);
        eVar.d(d, lVar.c);
        eVar.d(e, lVar.d);
        eVar.d(f, lVar.e);
        eVar.d(g, lVar.f);
        eVar.d(h, w.a);
    }
}
