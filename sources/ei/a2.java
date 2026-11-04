package ei;

import android.app.Activity;
import b8.mf;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ a2(j4 j4Var, int i3) {
        this.a = i3;
        this.b = j4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        boolean z10 = false;
        j4 j4Var = this.b;
        switch (i3) {
            case 0:
                j4Var.T1.setVisibility(8);
                break;
            case 1:
                if (!j4Var.t0.I0) {
                    j4Var.j3 = null;
                    if (j4Var.r0 == null) {
                        gi.l3 l3Var = new gi.l3(j4Var.getContext(), 3);
                        l3Var.o(1.0f, -22.0f);
                        j4Var.r0 = l3Var;
                        l3Var.j(i0.a.o(i0.a.f(0.13f, -16777216, -1), hs.P3));
                        gi.l3 l3Var2 = j4Var.r0;
                        l3Var2.V = false;
                        l3Var2.u(bd.M0(2131746407, null));
                        j4Var.r0.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
                        j4Var.M0.addView(j4Var.r0, mf.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, j4Var.h2 ? 0.0f : 56.0f));
                    }
                    j4Var.r0.w();
                    az.H(true);
                    break;
                }
                break;
            case 2:
                j4Var.O0();
                break;
            case 3:
                ((i9) j4Var.A1).b(true);
                break;
            case 4:
                j4Var.p0(true);
                break;
            case 5:
                r9 r9Var = j4Var.t0;
                if (r9Var != null) {
                    r9Var.V(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                j4Var.M0();
                break;
            case 7:
                j4Var.v3 = 0L;
                s2 s2Var = j4Var.L1;
                if (s2Var != null) {
                    s2Var.E(true);
                    j4Var.L1.S1();
                    j4Var.p0(true);
                    break;
                }
                break;
            case 8:
                Activity W = org.telegram.messenger.g0.W(j4Var.getContext());
                if (W != null) {
                    b0 b0Var = new b0(6, j4Var, W);
                    r9 r9Var2 = ((i9) j4Var.A1).d;
                    q9 q9Var = r9Var2.A0;
                    if (q9Var != null) {
                        z10 = q9Var.release(b0Var);
                        r9Var2.A0 = null;
                    }
                    if (!z10) {
                        org.telegram.messenger.g0.i3(b0Var, 80L);
                        break;
                    }
                }
                break;
            case 9:
                r9 r9Var3 = ((i9) j4Var.A1).d;
                r9Var3.j1 = false;
                r9Var3.d0();
                break;
            case 10:
                j4Var.J0(null);
                break;
            case 11:
                j4Var.a1(false);
                hp.e1().edit().putInt("taptostorysoundhint", hp.e1().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                j4Var.E3 = true;
                j4Var.setActive(false);
                break;
        }
    }
}
