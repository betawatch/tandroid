package m4;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ k1 c;

    public /* synthetic */ f0(l0 l0Var, k1 k1Var, int i10) {
        this.a = i10;
        this.b = l0Var;
        this.c = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                n4.y yVar = l0Var.k;
                k1 k1Var = this.c;
                yVar.Y(l0Var.G(k1Var));
                l0Var.i.s(k1Var.t().a(17) ? k1Var.w0() : b2.k1.a);
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.k.Y(l0Var2.G(this.c));
                break;
        }
    }
}
