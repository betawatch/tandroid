// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class o38 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a48 b;

    public /* synthetic */ o38(a48 a48Var, byte b) {
        this.a = b;
        this.b = a48Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a48 a48Var = this.b;
        switch (b) {
            case 0:
                if (a48Var.H) {
                    a48Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                a48Var.h();
                break;
            default:
                int i = a48.r0;
                a48Var.h();
                break;
        }
    }
}
