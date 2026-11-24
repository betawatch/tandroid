// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ga7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gu2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ga7(gu2 gu2Var, int i, byte b) {
        this.a = b;
        this.b = gu2Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        gu2 gu2Var = this.b;
        switch (b) {
            case 0:
                gu2Var.accept(Integer.valueOf(i));
                break;
            default:
                gu2Var.accept(Integer.valueOf(i));
                break;
        }
    }
}
