package k9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class s implements u9.d {
    public static final s a = new s();
    public static final u9.c b = u9.c.c("batteryLevel");
    public static final u9.c c = u9.c.c("batteryVelocity");
    public static final u9.c d = u9.c.c("proximityOn");
    public static final u9.c e = u9.c.c("orientation");
    public static final u9.c f = u9.c.c("ramUsed");
    public static final u9.c g = u9.c.c("diskUsed");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        u0 u0Var = (u0) ((v1) obj);
        eVar.e(b, u0Var.a);
        eVar.a(c, u0Var.b);
        eVar.d(d, u0Var.c);
        eVar.a(e, u0Var.d);
        eVar.b(f, u0Var.e);
        eVar.b(g, u0Var.f);
    }
}
