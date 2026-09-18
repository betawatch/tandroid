package m4;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
