// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class l28 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w28 b;

    public /* synthetic */ l28(w28 w28Var, byte b) {
        this.a = b;
        this.b = w28Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        w28 w28Var = this.b;
        switch (b) {
            case 0:
                if (w28Var.H) {
                    w28Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                w28Var.h();
                break;
            case 2:
                int i = w28.r0;
                w28Var.h();
                break;
            default:
                int i2 = w28.r0;
                w28Var.h();
                break;
        }
    }
}
