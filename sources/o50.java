// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class o50 implements zq7 {
    public static final o50 a = new o50();
    public static final sa4 b = sa4.c("eventTimeMs");
    public static final sa4 c = sa4.c("eventCode");
    public static final sa4 d = sa4.c("complianceData");
    public static final sa4 e = sa4.c("eventUptimeMs");
    public static final sa4 f = sa4.c("sourceExtension");
    public static final sa4 g = sa4.c("sourceExtensionJsonProto3");
    public static final sa4 h = sa4.c("timezoneOffsetSeconds");
    public static final sa4 i = sa4.c("networkConnectionInfo");
    public static final sa4 j = sa4.c("experimentIds");

    @Override // l34
    public final void a(Object obj, Object obj2) {
        ae6 ae6Var = (ae6) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.g(b, ((ca0) ae6Var).a);
        ca0 ca0Var = (ca0) ae6Var;
        ar7Var.a(c, ca0Var.b);
        ar7Var.a(d, ca0Var.c);
        ar7Var.g(e, ca0Var.d);
        ar7Var.a(f, ca0Var.e);
        ar7Var.a(g, ca0Var.f);
        ar7Var.g(h, ca0Var.g);
        ar7Var.a(i, ca0Var.h);
        ar7Var.a(j, ca0Var.i);
    }
}
