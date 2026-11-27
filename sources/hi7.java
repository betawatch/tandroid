// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hi7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pi7 b;

    public /* synthetic */ hi7(pi7 pi7Var, byte b) {
        this.a = b;
        this.b = pi7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pi7 pi7Var = this.b;
        switch (b) {
            case 0:
                pi7Var.dismiss();
                break;
            case 1:
                pi7Var.c1(true, false);
                break;
            default:
                pi7Var.c1(true, false);
                break;
        }
    }
}
