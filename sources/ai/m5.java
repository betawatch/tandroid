package ai;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                e6Var.K0.D(true);
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
