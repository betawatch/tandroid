// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class j21 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y21 b;

    public /* synthetic */ j21(y21 y21Var, byte b) {
        this.a = b;
        this.b = y21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        y21 y21Var = this.b;
        switch (b) {
            case 0:
                y21Var.onExitTransitionStart();
                break;
            case 1:
                y21Var.onEnterTransitionStart();
                break;
            default:
                try {
                    y21Var.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
