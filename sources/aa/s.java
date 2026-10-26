package aa;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class s implements ka.d {
    public static final s a = new s();
    public static final ka.c b = ka.c.c("batteryLevel");
    public static final ka.c c = ka.c.c("batteryVelocity");
    public static final ka.c d = ka.c.c("proximityOn");
    public static final ka.c e = ka.c.c("orientation");
    public static final ka.c f = ka.c.c("ramUsed");
    public static final ka.c g = ka.c.c("diskUsed");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ka.e eVar = (ka.e) obj2;
        w0 w0Var = (w0) ((x1) obj);
        eVar.a(b, w0Var.a);
        eVar.e(c, w0Var.b);
        eVar.d(d, w0Var.c);
        eVar.e(e, w0Var.d);
        eVar.f(f, w0Var.e);
        eVar.f(g, w0Var.f);
    }
}
