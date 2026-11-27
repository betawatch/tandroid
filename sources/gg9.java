// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yg9 b;

    public /* synthetic */ gg9(yg9 yg9Var, byte b) {
        this.a = b;
        this.b = yg9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yg9 yg9Var = this.b;
        switch (b) {
            case 0:
                yg9Var.G0();
                break;
            case 1:
                if (yg9Var.L0 != 0) {
                    yg9Var.b0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                if (yg9Var.L0 != 1) {
                    yg9Var.i0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                if (yg9Var.L0 != 2) {
                    yg9Var.w0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                yg9Var.m0();
                break;
            case 5:
                yg9Var.w0(2147483646, 0, true);
                q67 q67Var = yg9Var.P0;
                if (q67Var != null) {
                    q67Var.f(false);
                    yg9Var.P0 = null;
                    break;
                }
                break;
            default:
                yg9Var.w0(0, 0, false);
                q67 q67Var2 = yg9Var.P0;
                if (q67Var2 != null) {
                    q67Var2.f(true);
                    yg9Var.P0 = null;
                    break;
                }
                break;
        }
    }
}
