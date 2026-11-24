// default package

import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class on1 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ on1(mu1 mu1Var, long j, boolean z) {
        this.b = mu1Var;
        this.d = j;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        boolean z = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.d9(j, z);
                break;
            default:
                ar1 ar1Var = mu1Var.a0;
                if (ar1Var != null) {
                    MediaController w = MediaController.w();
                    if (!ar1Var.O2 && !ar1Var.v3 && w.E() && !w.F() && w.h1 == ar1Var.w3) {
                        ar1Var.d1 = false;
                        mw1 mw1Var = ar1Var.c1;
                        if (mw1Var != null) {
                            mw1Var.j(oy1.a, false);
                        }
                        ar1Var.y4 = true;
                        ar1Var.v3 = true;
                        hy1 hy1Var = ar1Var.P3;
                        if (hy1Var != null) {
                            hy1Var.n0(1);
                        }
                        ar1Var.r2(0, true);
                        if (z) {
                            ar1Var.P = true;
                            l lVar = ar1Var.E2;
                            if (lVar != null) {
                                lVar.E.d(1, true, false);
                            }
                            hq6 d0 = hq6.d0(ar1Var.R);
                            long j2 = ar1Var.G3;
                            mu1 mu1Var2 = ar1Var.F3;
                            d0.g2(j2, (mu1Var2 == null || !mu1Var2.x4) ? 0L : mu1Var2.d(), true);
                        }
                        long currentTimeMillis = j > 0 ? System.currentTimeMillis() - j : w.l1;
                        ar1Var.Y1 = currentTimeMillis;
                        my1 my1Var = ar1Var.Z0;
                        if (my1Var != null) {
                            my1Var.a(currentTimeMillis);
                        }
                        ar1Var.h5 = true;
                        ar1Var.c2();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ on1(mu1 mu1Var, boolean z, long j) {
        this.b = mu1Var;
        this.c = z;
        this.d = j;
    }
}
