// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class gj9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ij9 b;

    public /* synthetic */ gj9(ij9 ij9Var, byte b) {
        this.a = b;
        this.b = ij9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ij9 ij9Var = this.b;
        switch (b) {
            case 0:
                ij9Var.g(false);
                break;
            default:
                kk7.f(ij9Var.c).k(kk7.g5, new Object[0]);
                break;
        }
    }
}
