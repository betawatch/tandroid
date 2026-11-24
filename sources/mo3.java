// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mo3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vo3 b;

    public /* synthetic */ mo3(vo3 vo3Var, byte b) {
        this.a = b;
        this.b = vo3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vo3 vo3Var = this.b;
        switch (b) {
            case 0:
                vo3Var.d(null);
                break;
            case 1:
                vo3Var.g = true;
                vo3Var.d(null);
                break;
            case 2:
                vo3Var.d(null);
                break;
            default:
                vo3Var.f(2, "I recorded it this morning on my way to the office.");
                break;
        }
    }
}
