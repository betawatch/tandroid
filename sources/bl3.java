// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bl3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gl3 b;

    public /* synthetic */ bl3(gl3 gl3Var, byte b) {
        this.a = b;
        this.b = gl3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gl3 gl3Var = this.b;
        switch (b) {
            case 0:
                gl3Var.X(false);
                break;
            default:
                gl3Var.O(true);
                break;
        }
    }
}
