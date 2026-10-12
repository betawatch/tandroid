package bi;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class z4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    public /* synthetic */ z4(h5 h5Var, int i10) {
        this.a = i10;
        this.b = h5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((jb) this.b.l.Q1).g(false);
                break;
            case 1:
                q5 q5Var = this.b.l;
                j5 j5Var = q5Var.Q1;
                if (j5Var != null) {
                    sb sbVar = ((jb) j5Var).d;
                    sbVar.Z0 = false;
                    sbVar.P();
                }
                q5Var.f1(false);
                q5Var.h3 = true;
                q5Var.K0.D(true);
                break;
            case 2:
                q5 q5Var2 = this.b.l;
                q5Var2.U3 = true;
                q5Var2.setActive(false);
                break;
            default:
                q5 q5Var3 = this.b.l;
                q5Var3.U3 = true;
                q5Var3.setActive(false);
                break;
        }
    }
}
