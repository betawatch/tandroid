// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        k09 k09Var = xkaVar.u;
        if (k09Var != null) {
            ((l05) k09Var.b).onConnectionFailed(ws2Var);
        }
    }
}
