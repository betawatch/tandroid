package ei;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ v3(b4 b4Var, int i3) {
        this.a = i3;
        this.b = b4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((i9) this.b.x.A1).g(false);
                break;
            case 1:
                j4 j4Var = this.b.x;
                c4 c4Var = j4Var.A1;
                if (c4Var != null) {
                    r9 r9Var = ((i9) c4Var).d;
                    r9Var.a1 = false;
                    r9Var.d0();
                }
                j4Var.d1(false);
                j4Var.R2 = true;
                j4Var.u0.E(true);
                break;
            case 2:
                j4 j4Var2 = this.b.x;
                j4Var2.E3 = true;
                j4Var2.setActive(false);
                break;
            default:
                j4 j4Var3 = this.b.x;
                j4Var3.E3 = true;
                j4Var3.setActive(false);
                break;
        }
    }
}
