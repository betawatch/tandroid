package bi;

import org.telegram.ui.kh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ o1(k2 k2Var, int i10) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.F0();
                break;
            case 1:
                k2 k2Var = this.b;
                if (k2Var.K0 != 0) {
                    k2Var.a0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                k2 k2Var2 = this.b;
                if (k2Var2.K0 != 1) {
                    k2Var2.h0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                k2 k2Var3 = this.b;
                if (k2Var3.K0 != 2) {
                    k2Var3.v0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                k2.Z(this.b);
                break;
            case 5:
                k2 k2Var4 = this.b;
                k2Var4.w0(2147483646, 0, true);
                kh0 kh0Var = k2Var4.O0;
                if (kh0Var != null) {
                    kh0Var.g(false);
                    k2Var4.O0 = null;
                    break;
                }
                break;
            default:
                k2 k2Var5 = this.b;
                k2Var5.w0(0, 0, false);
                kh0 kh0Var2 = k2Var5.O0;
                if (kh0Var2 != null) {
                    kh0Var2.g(true);
                    k2Var5.O0 = null;
                    break;
                }
                break;
        }
    }
}
