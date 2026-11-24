// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cn3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ln3 b;

    public /* synthetic */ cn3(ln3 ln3Var, byte b) {
        this.a = b;
        this.b = ln3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ln3 ln3Var = this.b;
        switch (b) {
            case 0:
                ln3Var.d(null);
                break;
            case 1:
                ln3Var.g = true;
                ln3Var.d(null);
                break;
            case 2:
                ln3Var.d(null);
                break;
            default:
                ln3Var.f(2, "I recorded it this morning on my way to the office.");
                break;
        }
    }
}
