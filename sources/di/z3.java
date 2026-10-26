package di;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ z3(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((p9) this.b.l.F1).g(false);
                break;
            case 1:
                q4 q4Var = this.b.l;
                j4 j4Var = q4Var.F1;
                if (j4Var != null) {
                    y9 y9Var = ((p9) j4Var).d;
                    y9Var.Z0 = false;
                    y9Var.P();
                }
                q4Var.d1(false);
                q4Var.W2 = true;
                q4Var.z0.E(true);
                break;
            case 2:
                q4 q4Var2 = this.b.l;
                q4Var2.J3 = true;
                q4Var2.setActive(false);
                break;
            default:
                q4 q4Var3 = this.b.l;
                q4Var3.J3 = true;
                q4Var3.setActive(false);
                break;
        }
    }
}
