// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gj3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oj3 b;

    public /* synthetic */ gj3(oj3 oj3Var, byte b) {
        this.a = b;
        this.b = oj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        oj3 oj3Var = this.b;
        switch (b) {
            case 0:
                for (bj3 bj3Var : oj3Var.S.f0) {
                    ((t26) bj3Var.a.getLayoutManager()).u = false;
                }
                break;
            default:
                oj3Var.K();
                break;
        }
    }
}
