// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class au3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cu3 b;

    public /* synthetic */ au3(cu3 cu3Var, byte b) {
        this.a = b;
        this.b = cu3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cu3 cu3Var = this.b;
        switch (b) {
            case 0:
                cu3Var.post(new au3(cu3Var, (byte) 1));
                break;
            default:
                cu3Var.h();
                cu3Var.d();
                break;
        }
    }
}
