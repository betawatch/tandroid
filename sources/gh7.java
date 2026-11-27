// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gh7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hh7 b;

    public /* synthetic */ gh7(hh7 hh7Var, byte b) {
        this.a = b;
        this.b = hh7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hh7 hh7Var = this.b;
        switch (b) {
            case 0:
                hh7Var.x();
                break;
            default:
                hh7Var.m(true);
                break;
        }
    }
}
