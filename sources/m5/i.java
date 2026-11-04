package m5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements ma.d {
    public static final i a = new i();
    public static final ma.c b = ma.c.c("eventTimeMs");
    public static final ma.c c = ma.c.c("eventCode");
    public static final ma.c d = ma.c.c("complianceData");
    public static final ma.c e = ma.c.c("eventUptimeMs");
    public static final ma.c f = ma.c.c("sourceExtension");
    public static final ma.c g = ma.c.c("sourceExtensionJsonProto3");
    public static final ma.c h = ma.c.c("timezoneOffsetSeconds");
    public static final ma.c i = ma.c.c("networkConnectionInfo");
    public static final ma.c j = ma.c.c("experimentIds");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        ma.e eVar = (ma.e) obj2;
        s sVar = (s) ((e0) obj);
        eVar.f(b, sVar.a);
        eVar.a(c, sVar.b);
        eVar.a(d, sVar.c);
        eVar.f(e, sVar.d);
        eVar.a(f, sVar.e);
        eVar.a(g, sVar.f);
        eVar.f(h, sVar.g);
        eVar.a(i, sVar.h);
        eVar.a(j, sVar.i);
    }
}
