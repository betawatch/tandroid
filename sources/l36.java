// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l36 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s36 b;

    public /* synthetic */ l36(s36 s36Var, byte b) {
        this.a = b;
        this.b = s36Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        s36 s36Var = this.b;
        switch (b) {
            case 0:
                d01.t(s36Var.getParentActivity(), k96.M0(2131745963, null));
                break;
            case 1:
                s36Var.r.d.requestFocus();
                gl.F3(s36Var.r.d);
                break;
            default:
                s36Var.r.d.clearFocus();
                gl.t1(s36Var.r.d);
                break;
        }
    }
}
