// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd9 b;

    public /* synthetic */ nc9(hd9 hd9Var, byte b) {
        this.a = b;
        this.b = hd9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hd9 hd9Var = this.b;
        switch (b) {
            case 0:
                hd9Var.F0();
                break;
            case 1:
                if (hd9Var.L0 != 0) {
                    hd9Var.b0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                if (hd9Var.L0 != 1) {
                    hd9Var.i0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                if (hd9Var.L0 != 2) {
                    hd9Var.w0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                hd9Var.m0();
                break;
            case 5:
                hd9Var.v0(2147483646, 0, true);
                j47 j47Var = hd9Var.P0;
                if (j47Var != null) {
                    j47Var.f(false);
                    hd9Var.P0 = null;
                    break;
                }
                break;
            default:
                hd9Var.v0(0, 0, false);
                j47 j47Var2 = hd9Var.P0;
                if (j47Var2 != null) {
                    j47Var2.f(true);
                    hd9Var.P0 = null;
                    break;
                }
                break;
        }
    }
}
