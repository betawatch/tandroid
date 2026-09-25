package ii;

import org.telegram.ui.vi0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                vi0 vi0Var = e2Var4.O0;
                if (vi0Var != null) {
                    vi0Var.h(false);
                    e2Var4.O0 = null;
                    break;
                }
                break;
            default:
                e2 e2Var5 = this.b;
                e2Var5.s0(0, 0, false);
                vi0 vi0Var2 = e2Var5.O0;
                if (vi0Var2 != null) {
                    vi0Var2.h(true);
                    e2Var5.O0 = null;
                    break;
                }
                break;
        }
    }
}
