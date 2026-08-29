package i9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s implements s9.d {
    public static final s a = new s();
    public static final s9.c b = s9.c.c("batteryLevel");
    public static final s9.c c = s9.c.c("batteryVelocity");
    public static final s9.c d = s9.c.c("proximityOn");
    public static final s9.c e = s9.c.c("orientation");
    public static final s9.c f = s9.c.c("ramUsed");
    public static final s9.c g = s9.c.c("diskUsed");

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        s9.e eVar = (s9.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.e(b, u0Var.a);
        eVar.b(c, u0Var.b);
        eVar.d(d, u0Var.c);
        eVar.b(e, u0Var.d);
        eVar.c(f, u0Var.e);
        eVar.c(g, u0Var.f);
    }
}
