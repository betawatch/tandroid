package li;

import org.telegram.ui.pi0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ h1(b2 b2Var, int i10) {
        this.a = i10;
        this.b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C0();
                break;
            case 1:
                b2 b2Var = this.b;
                if (b2Var.K0 != 0) {
                    b2Var.a0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                b2 b2Var2 = this.b;
                if (b2Var2.K0 != 1) {
                    b2Var2.h0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                b2 b2Var3 = this.b;
                if (b2Var3.K0 != 2) {
                    b2Var3.v0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                b2.W(this.b);
                break;
            case 5:
                b2 b2Var4 = this.b;
                b2Var4.t0(2147483646, 0, true);
                pi0 pi0Var = b2Var4.O0;
                if (pi0Var != null) {
                    pi0Var.g(false);
                    b2Var4.O0 = null;
                    break;
                }
                break;
            default:
                b2 b2Var5 = this.b;
                b2Var5.t0(0, 0, false);
                pi0 pi0Var2 = b2Var5.O0;
                if (pi0Var2 != null) {
                    pi0Var2.g(true);
                    b2Var5.O0 = null;
                    break;
                }
                break;
        }
    }
}
