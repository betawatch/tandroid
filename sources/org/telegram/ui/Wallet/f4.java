package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ f4(z5 z5Var, int i7) {
        this.a = i7;
        this.b = z5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        int i7 = this.a;
        z5 z5Var = this.b;
        switch (i7) {
            case 0:
                z5Var.R.post(new f4(z5Var, 8));
                break;
            case 1:
                z5.e0(z5Var);
                break;
            case 2:
                z5Var.getClass();
                z5Var.presentFragment(new p8());
                break;
            case 3:
                z5Var.getClass();
                z5Var.presentFragment(new gi.f());
                break;
            case 4:
                d8 d8Var = z5Var.j0;
                if (d8Var != null && (d0Var = z5Var.E0) != null) {
                    d8Var.Y(d0Var);
                }
                d0 d0Var2 = z5Var.E0;
                boolean z9 = (d0Var2 == null || d0Var2.a.isEmpty()) ? false : true;
                if (z5Var.f0 != z9) {
                    z5Var.M0(z9);
                }
                if (z9 && z5Var.F0) {
                    u8 u8Var = z5Var.i0;
                    if (u8Var != null) {
                        u8Var.b(false);
                    }
                    if (z5Var.f0) {
                        z5Var.F0 = false;
                        z5Var.e0 = 1;
                        fi.g1 g1Var = z5Var.p0;
                        if (g1Var != null) {
                            g1Var.setPosition(1);
                        }
                    } else {
                        z5Var.F0 = true;
                    }
                }
                fi.w3 w3Var = z5Var.a;
                if (w3Var != null && w3Var.f3 != null) {
                    z5Var.Y0(true);
                    break;
                }
                break;
            case 5:
                z5Var.s0(false);
                break;
            case 6:
                z5Var.E0();
                break;
            case 7:
                z5Var.D0();
                break;
            case 8:
                if (z5Var.R.isAttachedToWindow()) {
                    if (!z5Var.a.canScrollVertically(-1)) {
                        z5Var.a.e3.h1(0, 0);
                    }
                    z5Var.R.requestLayout();
                    break;
                }
                break;
            case 9:
                z5Var.M0 = null;
                break;
            case 10:
                z5.h0(z5Var);
                break;
            case 11:
                gc.a0(z5Var).N(id.M0(2131745861, null), id.M0(2131751105, null)).j();
                break;
            case 12:
                z5Var.U0();
                break;
            case 13:
                z5Var.D0();
                break;
            default:
                z5Var.D0();
                break;
        }
    }
}
