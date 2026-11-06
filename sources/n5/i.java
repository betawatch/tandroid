package n5;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i implements na.d {
    public static final i a = new i();
    public static final na.c b = na.c.c("eventTimeMs");
    public static final na.c c = na.c.c("eventCode");
    public static final na.c d = na.c.c("complianceData");
    public static final na.c e = na.c.c("eventUptimeMs");
    public static final na.c f = na.c.c("sourceExtension");
    public static final na.c g = na.c.c("sourceExtensionJsonProto3");
    public static final na.c h = na.c.c("timezoneOffsetSeconds");
    public static final na.c i = na.c.c("networkConnectionInfo");
    public static final na.c j = na.c.c("experimentIds");

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        na.e eVar = (na.e) obj2;
        s sVar = (s) ((e0) obj);
        eVar.e(b, sVar.a);
        eVar.a(c, sVar.b);
        eVar.a(d, sVar.c);
        eVar.e(e, sVar.d);
        eVar.a(f, sVar.e);
        eVar.a(g, sVar.f);
        eVar.e(h, sVar.g);
        eVar.a(i, sVar.h);
        eVar.a(j, sVar.i);
    }
}
