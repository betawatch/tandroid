package ci;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ a4(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((r9) this.b.l.Q1).g(false);
                break;
            case 1:
                q4 q4Var = this.b.l;
                j4 j4Var = q4Var.Q1;
                if (j4Var != null) {
                    aa aaVar = ((r9) j4Var).d;
                    aaVar.Z0 = false;
                    aaVar.P();
                }
                q4Var.f1(false);
                q4Var.h3 = true;
                q4Var.K0.D(true);
                break;
            case 2:
                q4 q4Var2 = this.b.l;
                q4Var2.U3 = true;
                q4Var2.setActive(false);
                break;
            default:
                q4 q4Var3 = this.b.l;
                q4Var3.U3 = true;
                q4Var3.setActive(false);
                break;
        }
    }
}
