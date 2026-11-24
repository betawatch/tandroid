// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class aa9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ca9 b;

    public /* synthetic */ aa9(ca9 ca9Var, byte b) {
        this.a = b;
        this.b = ca9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ca9 ca9Var = this.b;
        switch (b) {
            case 0:
                int i = ca9Var.a;
                da9 da9Var = ca9Var.w;
                if (i != 0) {
                    da9Var.onBackPressed();
                    break;
                } else {
                    da9Var.dismiss();
                    break;
                }
            default:
                gm.E3(ca9Var.n.d);
                break;
        }
    }
}
