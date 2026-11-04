package mi;

import org.telegram.ui.vf0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ i1(c2 c2Var, int i3) {
        this.a = i3;
        this.b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.G0();
                break;
            case 1:
                c2 c2Var = this.b;
                if (c2Var.L0 != 0) {
                    c2Var.b0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                c2 c2Var2 = this.b;
                if (c2Var2.L0 != 1) {
                    c2Var2.i0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                c2 c2Var3 = this.b;
                if (c2Var3.L0 != 2) {
                    c2Var3.w0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                c2.a0(this.b);
                break;
            case 5:
                c2 c2Var4 = this.b;
                c2Var4.x0(2147483646, 0, true);
                vf0 vf0Var = c2Var4.P0;
                if (vf0Var != null) {
                    vf0Var.g(false);
                    c2Var4.P0 = null;
                    break;
                }
                break;
            default:
                c2 c2Var5 = this.b;
                c2Var5.x0(0, 0, false);
                vf0 vf0Var2 = c2Var5.P0;
                if (vf0Var2 != null) {
                    vf0Var2.g(true);
                    c2Var5.P0 = null;
                    break;
                }
                break;
        }
    }
}
