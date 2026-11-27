// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nz8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rz8 b;

    public /* synthetic */ nz8(rz8 rz8Var, byte b) {
        this.a = b;
        this.b = rz8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rz8 rz8Var = this.b;
        switch (b) {
            case 0:
                if (rz8Var.h == null && rz8Var.d != null && !rz8Var.isFinished && rz8Var.getParentActivity() != null) {
                    rz8Var.f0(rz8Var.d.H0(), 0.0f, true);
                    rz8Var.h.setVisibility(4);
                    ny3 ny3Var = rz8Var.y;
                    if (ny3Var != null) {
                        ny3Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                ny3 ny3Var2 = rz8Var.y;
                if (ny3Var2 != null) {
                    ny3Var2.invalidate();
                }
                rz8Var.l0();
                break;
            default:
                rz8Var.j0();
                break;
        }
    }
}
