package oi;

import org.telegram.ui.dg0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ g1(b2 b2Var, int i7) {
        this.a = i7;
        this.b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.G0();
                break;
            case 1:
                b2 b2Var = this.b;
                if (b2Var.L0 != 0) {
                    b2Var.b0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                b2 b2Var2 = this.b;
                if (b2Var2.L0 != 1) {
                    b2Var2.i0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                b2 b2Var3 = this.b;
                if (b2Var3.L0 != 2) {
                    b2Var3.w0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                b2.a0(this.b);
                break;
            case 5:
                b2 b2Var4 = this.b;
                b2Var4.x0(2147483646, 0, true);
                dg0 dg0Var = b2Var4.P0;
                if (dg0Var != null) {
                    dg0Var.h(false);
                    b2Var4.P0 = null;
                    break;
                }
                break;
            default:
                b2 b2Var5 = this.b;
                b2Var5.x0(0, 0, false);
                dg0 dg0Var2 = b2Var5.P0;
                if (dg0Var2 != null) {
                    dg0Var2.h(true);
                    b2Var5.P0 = null;
                    break;
                }
                break;
        }
    }
}
