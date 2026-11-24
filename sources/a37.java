// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a37 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b37 b;

    public /* synthetic */ a37(b37 b37Var, byte b) {
        this.a = b;
        this.b = b37Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        b37 b37Var = this.b;
        switch (b) {
            case 0:
                if (b37Var.W != -1) {
                    kk7.f(b37Var.Y.d0.x).j(b37Var.W);
                    b37Var.W = -1;
                    break;
                }
                break;
            case 1:
                b37Var.Y.i();
                break;
            default:
                if (b37Var.W != -1) {
                    kk7.f(b37Var.Y.d0.x).j(b37Var.W);
                    b37Var.W = -1;
                    break;
                }
                break;
        }
    }
}
