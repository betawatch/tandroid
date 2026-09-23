package m4;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ f1 c;

    public /* synthetic */ f0(l0 l0Var, f1 f1Var, int i10) {
        this.a = i10;
        this.b = l0Var;
        this.c = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                n4.y yVar = l0Var.k;
                f1 f1Var = this.c;
                yVar.Y(l0Var.G(f1Var));
                l0Var.i.s(f1Var.t().a(17) ? f1Var.w0() : b2.k1.a);
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.k.Y(l0Var2.G(this.c));
                break;
        }
    }
}
