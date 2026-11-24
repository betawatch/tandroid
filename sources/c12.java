// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class c12 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i22 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c12(i22 i22Var, boolean z, byte b) {
        this.a = b;
        this.b = i22Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        i22 i22Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    i22Var.Z2.setVisibility(8);
                    break;
                }
                break;
            case 1:
                if (!z) {
                    i22Var.v1.setVisibility(8);
                    break;
                }
                break;
            case 2:
                if (!z) {
                    i22Var.x1.setVisibility(8);
                    break;
                }
                break;
            default:
                if (!z) {
                    i22Var.getClass();
                    break;
                } else {
                    i22Var.u3.setVisibility(4);
                    break;
                }
        }
    }
}
