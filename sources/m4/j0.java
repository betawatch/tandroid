package m4;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                n4.s sVar = p0Var.m;
                n1 n1Var = this.c;
                sVar.G(p0Var.G(n1Var));
                p0Var.i.s(n1Var.s().a(17) ? n1Var.y0() : b2.p1.a);
                break;
            default:
                p0 p0Var2 = this.b;
                p0Var2.m.G(p0Var2.G(this.c));
                break;
        }
    }
}
