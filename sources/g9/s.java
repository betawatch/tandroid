package g9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s implements q9.d {
    public static final s a = new s();
    public static final q9.c b = q9.c.c("batteryLevel");
    public static final q9.c c = q9.c.c("batteryVelocity");
    public static final q9.c d = q9.c.c("proximityOn");
    public static final q9.c e = q9.c.c("orientation");
    public static final q9.c f = q9.c.c("ramUsed");
    public static final q9.c g = q9.c.c("diskUsed");

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        q9.e eVar = (q9.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.g(b, u0Var.a);
        eVar.c(c, u0Var.b);
        eVar.a(d, u0Var.c);
        eVar.c(e, u0Var.d);
        eVar.d(f, u0Var.e);
        eVar.d(g, u0Var.f);
    }
}
