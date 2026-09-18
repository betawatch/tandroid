package k5;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class e implements ia.d {
    public static final e a = new e();
    public static final ia.c b = ia.c.c("eventTimeMs");
    public static final ia.c c = ia.c.c("eventCode");
    public static final ia.c d = ia.c.c("eventUptimeMs");
    public static final ia.c e = ia.c.c("sourceExtension");
    public static final ia.c f = ia.c.c("sourceExtensionJsonProto3");
    public static final ia.c g = ia.c.c("timezoneOffsetSeconds");
    public static final ia.c h = ia.c.c("networkConnectionInfo");

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.f(b, kVar.a);
        eVar.a(c, kVar.b);
        eVar.f(d, kVar.c);
        eVar.a(e, kVar.d);
        eVar.a(f, kVar.e);
        eVar.f(g, kVar.f);
        eVar.a(h, kVar.g);
    }
}
