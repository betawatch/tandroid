package ji;

import org.telegram.ui.cj0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ i1(c2 c2Var, int i10) {
        this.a = i10;
        this.b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B0();
                break;
            case 1:
                c2 c2Var = this.b;
                if (c2Var.K0 != 0) {
                    c2Var.a0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                c2 c2Var2 = this.b;
                if (c2Var2.K0 != 1) {
                    c2Var2.h0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                c2 c2Var3 = this.b;
                if (c2Var3.K0 != 2) {
                    c2Var3.v0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                c2.V(this.b);
                break;
            case 5:
                c2 c2Var4 = this.b;
                c2Var4.s0(2147483646, 0, true);
                cj0 cj0Var = c2Var4.O0;
                if (cj0Var != null) {
                    cj0Var.h(false);
                    c2Var4.O0 = null;
                    break;
                }
                break;
            default:
                c2 c2Var5 = this.b;
                c2Var5.s0(0, 0, false);
                cj0 cj0Var2 = c2Var5.O0;
                if (cj0Var2 != null) {
                    cj0Var2.h(true);
                    c2Var5.O0 = null;
                    break;
                }
                break;
        }
    }
}
