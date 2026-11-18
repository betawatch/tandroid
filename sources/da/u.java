package da;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
