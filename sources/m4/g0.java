package m4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ l1 c;

    public /* synthetic */ g0(l0 l0Var, l1 l1Var, int i10) {
        this.a = i10;
        this.b = l0Var;
        this.c = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                n4.y yVar = l0Var.k;
                l1 l1Var = this.c;
                yVar.w(l0Var.G(l1Var));
                l0Var.i.s(l1Var.t().a(17) ? l1Var.w0() : b2.k1.a);
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.k.w(l0Var2.G(this.c));
                break;
        }
    }
}
