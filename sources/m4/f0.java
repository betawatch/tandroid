package m4;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;
    public final /* synthetic */ e1 c;

    public /* synthetic */ f0(k0 k0Var, e1 e1Var, int i10) {
        this.a = i10;
        this.b = k0Var;
        this.c = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                n4.y yVar = k0Var.k;
                e1 e1Var = this.c;
                yVar.Z(k0Var.G(e1Var));
                k0Var.i.s(e1Var.t().a(17) ? e1Var.w0() : b2.k1.a);
                break;
            default:
                k0 k0Var2 = this.b;
                k0Var2.k.Z(k0Var2.G(this.c));
                break;
        }
    }
}
