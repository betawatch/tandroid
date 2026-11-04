package o4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;
    public final /* synthetic */ l1 c;

    public /* synthetic */ i0(o0 o0Var, l1 l1Var, int i3) {
        this.a = i3;
        this.b = o0Var;
        this.c = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o0 o0Var = this.b;
                p4.q qVar = o0Var.n;
                l1 l1Var = this.c;
                qVar.G(o0Var.h0(l1Var));
                o0Var.j.v(l1Var.t().a(17) ? l1Var.y0() : d2.n1.a);
                break;
            default:
                o0 o0Var2 = this.b;
                o0Var2.n.G(o0Var2.h0(this.c));
                break;
        }
    }
}
