package m4;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;
    public final /* synthetic */ j1 c;

    public /* synthetic */ f0(k0 k0Var, j1 j1Var, int i10) {
        this.a = i10;
        this.b = k0Var;
        this.c = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                n4.y yVar = k0Var.k;
                j1 j1Var = this.c;
                yVar.a0(k0Var.G(j1Var));
                k0Var.i.s(j1Var.t().a(17) ? j1Var.w0() : b2.k1.a);
                break;
            default:
                k0 k0Var2 = this.b;
                k0Var2.k.a0(k0Var2.G(this.c));
                break;
        }
    }
}
