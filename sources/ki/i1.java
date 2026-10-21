package ki;

import org.telegram.ui.mi0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                mi0 mi0Var = d2Var4.O0;
                if (mi0Var != null) {
                    mi0Var.g(false);
                    d2Var4.O0 = null;
                    break;
                }
                break;
            default:
                d2 d2Var5 = this.b;
                d2Var5.s0(0, 0, false);
                mi0 mi0Var2 = d2Var5.O0;
                if (mi0Var2 != null) {
                    mi0Var2.g(true);
                    d2Var5.O0 = null;
                    break;
                }
                break;
        }
    }
}
