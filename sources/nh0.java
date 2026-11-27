// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class nh0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ph0 b;

    public /* synthetic */ nh0(ph0 ph0Var, byte b) {
        this.a = b;
        this.b = ph0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ph0 ph0Var = this.b;
        switch (b) {
            case 0:
                ph0Var.a(null, false);
                break;
            default:
                ph0Var.b(true);
                break;
        }
    }
}
