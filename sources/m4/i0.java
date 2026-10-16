package m4;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ m1 c;

    public /* synthetic */ i0(p0 p0Var, m1 m1Var, int i10) {
        this.a = i10;
        this.b = p0Var;
        this.c = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p0 p0Var = this.b;
                n4.s sVar = p0Var.m;
                m1 m1Var = this.c;
                sVar.D(p0Var.G(m1Var));
                p0Var.i.s(m1Var.s().a(17) ? m1Var.y0() : b2.p1.a);
                break;
            default:
                p0 p0Var2 = this.b;
                p0Var2.m.D(p0Var2.G(this.c));
                break;
        }
    }
}
