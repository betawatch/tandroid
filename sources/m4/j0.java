package m4;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
