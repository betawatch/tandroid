// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
