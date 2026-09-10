package hi;

import org.telegram.ui.cj0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ l1(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B0();
                break;
            case 1:
                g2 g2Var = this.b;
                if (g2Var.K0 != 0) {
                    g2Var.a0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                g2 g2Var2 = this.b;
                if (g2Var2.K0 != 1) {
                    g2Var2.h0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                g2 g2Var3 = this.b;
                if (g2Var3.K0 != 2) {
                    g2Var3.v0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                g2.V(this.b);
                break;
            case 5:
                g2 g2Var4 = this.b;
                g2Var4.s0(2147483646, 0, true);
                cj0 cj0Var = g2Var4.O0;
                if (cj0Var != null) {
                    cj0Var.h(false);
                    g2Var4.O0 = null;
                    break;
                }
                break;
            default:
                g2 g2Var5 = this.b;
                g2Var5.s0(0, 0, false);
                cj0 cj0Var2 = g2Var5.O0;
                if (cj0Var2 != null) {
                    cj0Var2.h(true);
                    g2Var5.O0 = null;
                    break;
                }
                break;
        }
    }
}
