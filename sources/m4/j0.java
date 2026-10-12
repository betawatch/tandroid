package m4;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ n1 c;

    public /* synthetic */ j0(q0 q0Var, n1 n1Var, int i10) {
        this.a = i10;
        this.b = q0Var;
        this.c = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                n4.s sVar = q0Var.m;
                n1 n1Var = this.c;
                sVar.A(q0Var.G(n1Var));
                q0Var.i.s(n1Var.s().a(17) ? n1Var.y0() : b2.p1.a);
                break;
            default:
                q0 q0Var2 = this.b;
                q0Var2.m.A(q0Var2.G(this.c));
                break;
        }
    }
}
