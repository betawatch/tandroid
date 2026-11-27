// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j11 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z11 b;

    public /* synthetic */ j11(z11 z11Var, byte b) {
        this.a = b;
        this.b = z11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        z11 z11Var = this.b;
        switch (b) {
            case 0:
                z11Var.onExitTransitionStart();
                break;
            case 1:
                z11Var.onEnterTransitionStart();
                break;
            default:
                try {
                    z11Var.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
