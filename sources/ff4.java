// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ff4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hf4 b;

    public /* synthetic */ ff4(hf4 hf4Var, byte b) {
        this.a = b;
        this.b = hf4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hf4 hf4Var = this.b;
        switch (b) {
            case 0:
                hf4Var.d();
                break;
            case 1:
                hf4Var.a();
                break;
            default:
                hf4Var.b(hf4Var.E);
                break;
        }
    }
}
