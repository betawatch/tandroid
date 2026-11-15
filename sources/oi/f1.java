package oi;

import org.telegram.ui.bg0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;

    public /* synthetic */ f1(z1 z1Var, int i7) {
        this.a = i7;
        this.b = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.G0();
                break;
            case 1:
                z1 z1Var = this.b;
                if (z1Var.L0 != 0) {
                    z1Var.b0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                z1 z1Var2 = this.b;
                if (z1Var2.L0 != 1) {
                    z1Var2.i0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                z1 z1Var3 = this.b;
                if (z1Var3.L0 != 2) {
                    z1Var3.w0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                z1.a0(this.b);
                break;
            case 5:
                z1 z1Var4 = this.b;
                z1Var4.x0(2147483646, 0, true);
                bg0 bg0Var = z1Var4.P0;
                if (bg0Var != null) {
                    bg0Var.h(false);
                    z1Var4.P0 = null;
                    break;
                }
                break;
            default:
                z1 z1Var5 = this.b;
                z1Var5.x0(0, 0, false);
                bg0 bg0Var2 = z1Var5.P0;
                if (bg0Var2 != null) {
                    bg0Var2.h(true);
                    z1Var5.P0 = null;
                    break;
                }
                break;
        }
    }
}
