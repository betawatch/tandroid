package ii;

import org.telegram.ui.wi0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ j1(e2 e2Var, int i10) {
        this.a = i10;
        this.b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B0();
                break;
            case 1:
                e2 e2Var = this.b;
                if (e2Var.K0 != 0) {
                    e2Var.a0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                e2 e2Var2 = this.b;
                if (e2Var2.K0 != 1) {
                    e2Var2.h0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                e2 e2Var3 = this.b;
                if (e2Var3.K0 != 2) {
                    e2Var3.v0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                e2.V(this.b);
                break;
            case 5:
                e2 e2Var4 = this.b;
                e2Var4.s0(2147483646, 0, true);
                wi0 wi0Var = e2Var4.O0;
                if (wi0Var != null) {
                    wi0Var.h(false);
                    e2Var4.O0 = null;
                    break;
                }
                break;
            default:
                e2 e2Var5 = this.b;
                e2Var5.s0(0, 0, false);
                wi0 wi0Var2 = e2Var5.O0;
                if (wi0Var2 != null) {
                    wi0Var2.h(true);
                    e2Var5.O0 = null;
                    break;
                }
                break;
        }
    }
}
