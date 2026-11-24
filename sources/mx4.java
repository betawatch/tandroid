// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mx4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ox4 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ mx4(ox4 ox4Var, boolean z, byte b) {
        this.a = b;
        this.b = ox4Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        ox4 ox4Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    ox4Var.H.setVisibility(8);
                    break;
                }
                break;
            default:
                if (!z) {
                    ox4Var.w.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
