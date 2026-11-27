// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a66 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e66 b;

    public /* synthetic */ a66(e66 e66Var, byte b) {
        this.a = b;
        this.b = e66Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e66 e66Var = this.b;
        switch (b) {
            case 0:
                e66Var.b();
                break;
            default:
                e66Var.c();
                break;
        }
    }
}
