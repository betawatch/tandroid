package li;

import org.telegram.ui.ni0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ni0 ni0Var = b2Var4.O0;
                if (ni0Var != null) {
                    ni0Var.g(false);
                    b2Var4.O0 = null;
                    break;
                }
                break;
            default:
                b2 b2Var5 = this.b;
                b2Var5.t0(0, 0, false);
                ni0 ni0Var2 = b2Var5.O0;
                if (ni0Var2 != null) {
                    ni0Var2.g(true);
                    b2Var5.O0 = null;
                    break;
                }
                break;
        }
    }
}
