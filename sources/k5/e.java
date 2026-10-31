package k5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e implements ja.d {
    public static final e a = new e();
    public static final ja.c b = ja.c.c("eventTimeMs");
    public static final ja.c c = ja.c.c("eventCode");
    public static final ja.c d = ja.c.c("eventUptimeMs");
    public static final ja.c e = ja.c.c("sourceExtension");
    public static final ja.c f = ja.c.c("sourceExtensionJsonProto3");
    public static final ja.c g = ja.c.c("timezoneOffsetSeconds");
    public static final ja.c h = ja.c.c("networkConnectionInfo");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        ja.e eVar = (ja.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.f(b, kVar.a);
        eVar.d(c, kVar.b);
        eVar.f(d, kVar.c);
        eVar.d(e, kVar.d);
        eVar.d(f, kVar.e);
        eVar.f(g, kVar.f);
        eVar.d(h, kVar.g);
    }
}
