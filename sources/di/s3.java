package di;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ s3(z3 z3Var, int i7) {
        this.a = i7;
        this.b = z3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((g9) this.b.x.z1).g(false);
                break;
            case 1:
                i4 i4Var = this.b.x;
                b4 b4Var = i4Var.z1;
                if (b4Var != null) {
                    p9 p9Var = ((g9) b4Var).d;
                    p9Var.Y0 = false;
                    p9Var.V();
                }
                i4Var.d1(false);
                i4Var.Q2 = true;
                i4Var.t0.E(true);
                break;
            case 2:
                i4 i4Var2 = this.b.x;
                i4Var2.D3 = true;
                i4Var2.setActive(false);
                break;
            default:
                i4 i4Var3 = this.b.x;
                i4Var3.D3 = true;
                i4Var3.setActive(false);
                break;
        }
    }
}
