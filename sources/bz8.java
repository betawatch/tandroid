// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bz8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jo0 b;
    public final /* synthetic */ ry8 c;

    public /* synthetic */ bz8(jo0 jo0Var, ry8 ry8Var, byte b) {
        this.a = b;
        this.b = jo0Var;
        this.c = ry8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ry8 ry8Var = this.c;
        jo0 jo0Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new bz8(jo0Var, ry8Var, (byte) 1));
                break;
            default:
                jo0Var.removeView(ry8Var);
                break;
        }
    }
}
