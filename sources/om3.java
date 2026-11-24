// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class om3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sm3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ om3(sm3 sm3Var, int i, byte b) {
        this.a = b;
        this.b = sm3Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.a) {
            case 0:
                sm3 sm3Var = this.b;
                sm3Var.postOnAnimation(new om3(sm3Var, this.c, b));
                break;
            default:
                sm3 sm3Var2 = this.b;
                int i = this.c;
                if (sm3Var2.e && !sm3Var2.r && i == sm3Var2.F) {
                    sm3Var2.y = true;
                    sm3Var2.requestRender();
                    break;
                }
                break;
        }
    }
}
