// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lz9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mz9 b;

    public /* synthetic */ lz9(mz9 mz9Var, byte b) {
        this.a = b;
        this.b = mz9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mz9 mz9Var = this.b;
        switch (b) {
            case 0:
                mz9Var.b();
                break;
            default:
                mz9Var.dismiss();
                break;
        }
    }
}
