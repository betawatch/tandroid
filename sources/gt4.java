// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gt4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ht4 b;

    public /* synthetic */ gt4(ht4 ht4Var, byte b) {
        this.a = b;
        this.b = ht4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ht4 ht4Var = this.b;
        switch (b) {
            case 0:
                if (ht4Var.d.K == ht4Var) {
                    ht4Var.d.a0 = false;
                    ht4Var.d.b0 = null;
                    ht4Var.d.h();
                    break;
                }
                break;
            default:
                if (ht4Var.d.K == ht4Var && !ht4Var.b) {
                    ht4Var.d.a0 = true;
                    Runnable runnable = ht4Var.d.b0;
                    ht4Var.d.b0 = null;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
