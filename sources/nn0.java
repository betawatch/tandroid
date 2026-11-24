// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nn0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tn0 b;

    public /* synthetic */ nn0(tn0 tn0Var, byte b) {
        this.a = b;
        this.b = tn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tn0 tn0Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new nn0(tn0Var, (byte) 1));
                break;
            default:
                tn0Var.a(null);
                break;
        }
    }
}
