package ca;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u implements ma.d {
    public static final u a = new u();
    public static final ma.c b = ma.c.c("batteryLevel");
    public static final ma.c c = ma.c.c("batteryVelocity");
    public static final ma.c d = ma.c.c("proximityOn");
    public static final ma.c e = ma.c.c("orientation");
    public static final ma.c f = ma.c.c("ramUsed");
    public static final ma.c g = ma.c.c("diskUsed");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        ma.e eVar = (ma.e) obj2;
        g1 g1Var = (g1) ((l2) obj);
        eVar.a(b, g1Var.a);
        eVar.e(c, g1Var.b);
        eVar.b(d, g1Var.c);
        eVar.e(e, g1Var.d);
        eVar.f(f, g1Var.e);
        eVar.f(g, g1Var.f);
    }
}
