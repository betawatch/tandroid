// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ns8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ts8 b;

    public /* synthetic */ ns8(ts8 ts8Var, byte b) {
        this.a = b;
        this.b = ts8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ts8 ts8Var = this.b;
        switch (b) {
            case 0:
                ts8Var.e0 = true;
                break;
            case 1:
                ts8Var.u();
                break;
            default:
                if (!ts8Var.k0) {
                    rr6 rr6Var = ts8Var.J;
                    rr6Var.getClass();
                    rr6Var.b(ts8Var);
                    break;
                }
                break;
        }
    }
}
