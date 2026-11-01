package org.telegram.ui.Wallet;

import org.telegram.messenger.dd;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ii;
import org.telegram.ui.hk;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ f4(b6 b6Var, int i10) {
        this.a = i10;
        this.b = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var;
        int i10 = this.a;
        b6 b6Var = this.b;
        switch (i10) {
            case 0:
                b6.e0(b6Var);
                break;
            case 1:
                b6Var.getClass();
                b6Var.presentFragment(new t8());
                break;
            case 2:
                b6Var.getClass();
                b6Var.presentFragment(new wh.g());
                break;
            case 3:
                h8 h8Var = b6Var.j0;
                if (h8Var != null && (c0Var = b6Var.E0) != null) {
                    h8Var.Y(c0Var);
                }
                c0 c0Var2 = b6Var.E0;
                boolean z10 = (c0Var2 == null || c0Var2.a.isEmpty()) ? false : true;
                if (b6Var.f0 != z10) {
                    b6Var.L0(z10);
                }
                if (z10 && b6Var.F0) {
                    y8 y8Var = b6Var.i0;
                    if (y8Var != null) {
                        y8Var.b(false);
                    }
                    if (b6Var.f0) {
                        b6Var.F0 = false;
                        b6Var.e0 = 1;
                        hk hkVar = b6Var.p0;
                        if (hkVar != null) {
                            hkVar.setPosition(1);
                        }
                    } else {
                        b6Var.F0 = true;
                    }
                }
                ii iiVar = b6Var.a;
                if (iiVar != null && iiVar.f3 != null) {
                    b6Var.X0(true);
                    break;
                }
                break;
            case 4:
                b6Var.s0(false);
                break;
            case 5:
                b6Var.E0();
                break;
            case 6:
                b6Var.D0();
                break;
            case 7:
                if (b6Var.R.isAttachedToWindow()) {
                    if (!b6Var.a.canScrollVertically(-1)) {
                        b6Var.a.e3.h1(0, 0);
                    }
                    b6Var.R.requestLayout();
                    break;
                }
                break;
            case 8:
                b6Var.M0 = null;
                break;
            case 9:
                b6.h0(b6Var);
                break;
            case 10:
                b6Var.T0();
                break;
            case 11:
                cc.a0(b6Var).N(dd.L0(2131745878, null), dd.L0(2131751106, null)).j();
                break;
            case 12:
                b6Var.R.post(new f4(b6Var, 7));
                break;
            case 13:
                b6Var.D0();
                break;
            default:
                b6Var.D0();
                break;
        }
    }
}
