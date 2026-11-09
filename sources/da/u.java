package da;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class u implements na.d {
    public static final u a = new u();
    public static final na.c b = na.c.c("batteryLevel");
    public static final na.c c = na.c.c("batteryVelocity");
    public static final na.c d = na.c.c("proximityOn");
    public static final na.c e = na.c.c("orientation");
    public static final na.c f = na.c.c("ramUsed");
    public static final na.c g = na.c.c("diskUsed");

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        na.e eVar = (na.e) obj2;
        g1 g1Var = (g1) ((l2) obj);
        eVar.a(b, g1Var.a);
        eVar.d(c, g1Var.b);
        eVar.c(d, g1Var.c);
        eVar.d(e, g1Var.d);
        eVar.e(f, g1Var.e);
        eVar.e(g, g1Var.f);
    }
}
