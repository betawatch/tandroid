// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gg0 implements fg0 {
    public final /* synthetic */ xka a;

    public gg0(xka xkaVar) {
        this.a = xkaVar;
    }

    @Override // fg0
    public final void a(ws2 ws2Var) {
        boolean c = ws2Var.c();
        xka xkaVar = this.a;
        if (c) {
            xkaVar.j(null, xkaVar.E);
            return;
        }
        l09 l09Var = xkaVar.u;
        if (l09Var != null) {
            ((l05) l09Var.b).onConnectionFailed(ws2Var);
        }
    }
}
