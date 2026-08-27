package h9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s implements r9.d {
    public static final s a = new s();
    public static final r9.c b = r9.c.c("batteryLevel");
    public static final r9.c c = r9.c.c("batteryVelocity");
    public static final r9.c d = r9.c.c("proximityOn");
    public static final r9.c e = r9.c.c("orientation");
    public static final r9.c f = r9.c.c("ramUsed");
    public static final r9.c g = r9.c.c("diskUsed");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.a(b, u0Var.a);
        eVar.d(c, u0Var.b);
        eVar.g(d, u0Var.c);
        eVar.d(e, u0Var.d);
        eVar.c(f, u0Var.e);
        eVar.c(g, u0Var.f);
    }
}
