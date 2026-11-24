// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sc7 b;

    public /* synthetic */ lf(sc7 sc7Var, byte b) {
        this.a = b;
        this.b = sc7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        sc7 sc7Var = this.b;
        switch (b) {
            case 0:
                sc7Var.k(false);
                break;
            case 1:
                sc7Var.k(false);
                break;
            default:
                sc7Var.k(true);
                break;
        }
    }
}
