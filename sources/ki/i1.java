package ki;

import org.telegram.ui.qi0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ i1(d2 d2Var, int i10) {
        this.a = i10;
        this.b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B0();
                break;
            case 1:
                d2 d2Var = this.b;
                if (d2Var.K0 != 0) {
                    d2Var.a0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                d2 d2Var2 = this.b;
                if (d2Var2.K0 != 1) {
                    d2Var2.h0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                d2 d2Var3 = this.b;
                if (d2Var3.K0 != 2) {
                    d2Var3.v0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                d2.V(this.b);
                break;
            case 5:
                d2 d2Var4 = this.b;
                d2Var4.s0(2147483646, 0, true);
                qi0 qi0Var = d2Var4.O0;
                if (qi0Var != null) {
                    qi0Var.g(false);
                    d2Var4.O0 = null;
                    break;
                }
                break;
            default:
                d2 d2Var5 = this.b;
                d2Var5.s0(0, 0, false);
                qi0 qi0Var2 = d2Var5.O0;
                if (qi0Var2 != null) {
                    qi0Var2.g(true);
                    d2Var5.O0 = null;
                    break;
                }
                break;
        }
    }
}
