// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h22 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j22 b;

    public /* synthetic */ h22(j22 j22Var, byte b) {
        this.a = b;
        this.b = j22Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j22 j22Var = this.b;
        switch (b) {
            case 0:
                if (j22Var.f != null) {
                    j22Var.w = yjb.k(new StringBuilder("+"), j22Var.f.phone, p38.f());
                    j22Var.s = j22Var.f;
                    gl.d3(new h22(j22Var, (byte) 1));
                    break;
                }
                break;
            default:
                j22Var.c.l(j22Var.w, false);
                break;
        }
    }
}
