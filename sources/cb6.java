// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class cb6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls5 b;
    public final /* synthetic */ lb6 c;

    public /* synthetic */ cb6(ls5 ls5Var, lb6 lb6Var, byte b) {
        this.a = b;
        this.b = ls5Var;
        this.c = lb6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lb6 lb6Var = this.c;
        ls5 ls5Var = this.b;
        switch (b) {
            case 0:
                ls5Var.run();
                lb6Var.a();
                break;
            default:
                ls5Var.run();
                lb6Var.a();
                break;
        }
    }
}
