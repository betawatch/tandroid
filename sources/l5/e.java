package l5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e implements ka.d {
    public static final e a = new e();
    public static final ka.c b = ka.c.c("eventTimeMs");
    public static final ka.c c = ka.c.c("eventCode");
    public static final ka.c d = ka.c.c("eventUptimeMs");
    public static final ka.c e = ka.c.c("sourceExtension");
    public static final ka.c f = ka.c.c("sourceExtensionJsonProto3");
    public static final ka.c g = ka.c.c("timezoneOffsetSeconds");
    public static final ka.c h = ka.c.c("networkConnectionInfo");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ka.e eVar = (ka.e) obj2;
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
