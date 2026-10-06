package ai;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ m5(v5 v5Var, int i10) {
        this.a = i10;
        this.b = v5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((ac) this.b.l.Q1).g(false);
                break;
            case 1:
                e6 e6Var = this.b.l;
                x5 x5Var = e6Var.Q1;
                if (x5Var != null) {
                    jc jcVar = ((ac) x5Var).d;
                    jcVar.Z0 = false;
                    jcVar.P();
                }
                e6Var.f1(false);
                e6Var.h3 = true;
                e6Var.K0.E(true);
                break;
            case 2:
                e6 e6Var2 = this.b.l;
                e6Var2.U3 = true;
                e6Var2.setActive(false);
                break;
            default:
                e6 e6Var3 = this.b.l;
                e6Var3.U3 = true;
                e6Var3.setActive(false);
                break;
        }
    }
}
