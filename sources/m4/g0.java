package m4;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ f1 c;

    public /* synthetic */ g0(l0 l0Var, f1 f1Var, int i10) {
        this.a = i10;
        this.b = l0Var;
        this.c = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l0 l0Var = this.b;
                n4.x xVar = l0Var.k;
                f1 f1Var = this.c;
                xVar.b0(l0Var.G(f1Var));
                l0Var.i.s(f1Var.t().a(17) ? f1Var.w0() : b2.k1.a);
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.k.b0(l0Var2.G(this.c));
                break;
        }
    }
}
