// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i57 b;

    public /* synthetic */ h57(i57 i57Var, byte b) {
        this.a = b;
        this.b = i57Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        i57 i57Var = this.b;
        switch (b) {
            case 0:
                if (i57Var.W != -1) {
                    jn7.f(i57Var.Y.d0.x).j(i57Var.W);
                    i57Var.W = -1;
                    break;
                }
                break;
            case 1:
                i57Var.Y.i();
                break;
            default:
                if (i57Var.W != -1) {
                    jn7.f(i57Var.Y.d0.x).j(i57Var.W);
                    i57Var.W = -1;
                    break;
                }
                break;
        }
    }
}
