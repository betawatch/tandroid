package di;

import android.app.Activity;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ w1(j4 j4Var, int i7) {
        this.a = i7;
        this.b = j4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 3;
        boolean z9 = false;
        j4 j4Var = this.b;
        switch (i7) {
            case 0:
                j4Var.S1.setVisibility(8);
                break;
            case 1:
                if (!j4Var.s0.G0) {
                    j4Var.i3 = null;
                    if (j4Var.q0 == null) {
                        fi.m3 m3Var = new fi.m3(j4Var.getContext(), 3);
                        m3Var.o(1.0f, -22.0f);
                        j4Var.q0 = m3Var;
                        m3Var.j(i0.a.o(i0.a.f(0.13f, -16777216, -1), qs.P3));
                        fi.m3 m3Var2 = j4Var.q0;
                        m3Var2.U = false;
                        m3Var2.u(id.M0(2131746399, null));
                        j4Var.q0.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
                        j4Var.L0.addView(j4Var.q0, ha.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, j4Var.g2 ? 0.0f : 56.0f));
                    }
                    j4Var.q0.w();
                    iz.H(true);
                    break;
                }
                break;
            case 2:
                j4Var.O0();
                break;
            case 3:
                ((h9) j4Var.z1).b(true);
                break;
            case 4:
                j4Var.p0(true);
                break;
            case 5:
                q9 q9Var = j4Var.s0;
                if (q9Var != null) {
                    q9Var.N(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                j4Var.M0();
                break;
            case 7:
                j4Var.u3 = 0L;
                o2 o2Var = j4Var.K1;
                if (o2Var != null) {
                    o2Var.E(true);
                    j4Var.K1.T1();
                    j4Var.p0(true);
                    break;
                }
                break;
            case 8:
                Activity W = org.telegram.messenger.g0.W(j4Var.getContext());
                if (W != null) {
                    z0 z0Var = new z0(i10, j4Var, W);
                    q9 q9Var2 = ((h9) j4Var.z1).d;
                    p9 p9Var = q9Var2.z0;
                    if (p9Var != null) {
                        z9 = p9Var.release(z0Var);
                        q9Var2.z0 = null;
                    }
                    if (!z9) {
                        org.telegram.messenger.g0.i3(z0Var, 80L);
                        break;
                    }
                }
                break;
            case 9:
                q9 q9Var3 = ((h9) j4Var.z1).d;
                q9Var3.h1 = false;
                q9Var3.V();
                break;
            case 10:
                j4Var.J0(null);
                break;
            case 11:
                j4Var.a1(false);
                qp.e1().edit().putInt("taptostorysoundhint", qp.e1().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                j4Var.D3 = true;
                j4Var.setActive(false);
                break;
        }
    }
}
