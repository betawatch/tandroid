// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pi9 b;
    public final /* synthetic */ int c;

    public /* synthetic */ eh9(pi9 pi9Var, int i, byte b) {
        this.a = b;
        this.b = pi9Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        pi9 pi9Var = this.b;
        switch (b) {
            case 0:
                pi9Var.f4(i);
                break;
            case 1:
                pi9Var.e4(i);
                break;
            case 2:
                pi9Var.g4(i);
                break;
            default:
                pi9Var.scrollBy(0, i);
                break;
        }
    }
}
