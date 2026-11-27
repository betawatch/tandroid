// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
