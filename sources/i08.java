// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i08 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t08 b;

    public /* synthetic */ i08(t08 t08Var, byte b) {
        this.a = b;
        this.b = t08Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        t08 t08Var = this.b;
        switch (b) {
            case 0:
                if (t08Var.H) {
                    t08Var.b.invalidate();
                    break;
                }
                break;
            case 1:
                t08Var.h();
                break;
            case 2:
                int i = t08.r0;
                t08Var.h();
                break;
            default:
                int i2 = t08.r0;
                t08Var.h();
                break;
        }
    }
}
