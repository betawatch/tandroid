package fi;

import android.app.Activity;
import c8.ja;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ t1(b4 b4Var, int i7) {
        this.a = i7;
        this.b = b4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        boolean z10 = false;
        b4 b4Var = this.b;
        switch (i7) {
            case 0:
                b4Var.T1.setVisibility(8);
                break;
            case 1:
                if (!b4Var.t0.H0) {
                    b4Var.j3 = null;
                    if (b4Var.r0 == null) {
                        hi.l3 l3Var = new hi.l3(b4Var.getContext(), 3);
                        l3Var.o(1.0f, -22.0f);
                        b4Var.r0 = l3Var;
                        l3Var.j(i0.a.o(i0.a.f(0.13f, -16777216, -1), ns.P3));
                        hi.l3 l3Var2 = b4Var.r0;
                        l3Var2.V = false;
                        l3Var2.u(hd.M0(2131746399, null));
                        b4Var.r0.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
                        b4Var.M0.addView(b4Var.r0, ja.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, b4Var.h2 ? 0.0f : 56.0f));
                    }
                    b4Var.r0.w();
                    gz.H(true);
                    break;
                }
                break;
            case 2:
                b4Var.O0();
                break;
            case 3:
                ((z8) b4Var.A1).b(true);
                break;
            case 4:
                b4Var.p0(true);
                break;
            case 5:
                i9 i9Var = b4Var.t0;
                if (i9Var != null) {
                    i9Var.N(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                b4Var.M0();
                break;
            case 7:
                b4Var.v3 = 0L;
                k2 k2Var = b4Var.L1;
                if (k2Var != null) {
                    k2Var.N(true);
                    b4Var.L1.l2();
                    b4Var.p0(true);
                    break;
                }
                break;
            case 8:
                Activity W = org.telegram.messenger.g0.W(b4Var.getContext());
                if (W != null) {
                    di.s2 s2Var = new di.s2(24, b4Var, W);
                    i9 i9Var2 = ((z8) b4Var.A1).d;
                    h9 h9Var = i9Var2.A0;
                    if (h9Var != null) {
                        z10 = h9Var.release(s2Var);
                        i9Var2.A0 = null;
                    }
                    if (!z10) {
                        org.telegram.messenger.g0.i3(s2Var, 80L);
                        break;
                    }
                }
                break;
            case 9:
                i9 i9Var3 = ((z8) b4Var.A1).d;
                i9Var3.i1 = false;
                i9Var3.V();
                break;
            case 10:
                b4Var.J0(null);
                break;
            case 11:
                b4Var.a1(false);
                np.e1().edit().putInt("taptostorysoundhint", np.e1().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                b4Var.E3 = true;
                b4Var.setActive(false);
                break;
        }
    }
}
