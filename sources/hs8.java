// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hs8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rs8 b;

    public /* synthetic */ hs8(rs8 rs8Var, byte b) {
        this.a = b;
        this.b = rs8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rs8 rs8Var = this.b;
        switch (b) {
            case 0:
                rs8Var.b();
                break;
            case 1:
                rs8Var.c();
                break;
            case 2:
                rs8Var.f(false);
                break;
            default:
                rs8Var.d();
                break;
        }
    }
}
