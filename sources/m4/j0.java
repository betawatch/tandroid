package m4;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ n1 c;

    public /* synthetic */ j0(p0 p0Var, n1 n1Var, int i10) {
        this.a = i10;
        this.b = p0Var;
        this.c = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p0 p0Var = this.b;
                n4.q qVar = p0Var.n;
                n1 n1Var = this.c;
                qVar.H(p0Var.h0(n1Var));
                p0Var.j.v(n1Var.s().a(17) ? n1Var.y0() : b2.o1.a);
                break;
            default:
                p0 p0Var2 = this.b;
                p0Var2.n.H(p0Var2.h0(this.c));
                break;
        }
    }
}
