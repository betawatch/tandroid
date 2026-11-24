// default package

import android.app.Activity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class h38 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a58 b;

    public /* synthetic */ h38(a58 a58Var, byte b) {
        this.a = b;
        this.b = a58Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = false;
        a58 a58Var = this.b;
        switch (b) {
            case 0:
                a58Var.Z1.setVisibility(8);
                break;
            case 1:
                if (!a58Var.z0.H0) {
                    a58Var.p3 = null;
                    if (a58Var.x0 == null) {
                        hg5 hg5Var = new hg5(a58Var.getContext(), 3);
                        hg5Var.n(1.0f, -22.0f);
                        a58Var.x0 = hg5Var;
                        hg5Var.i(on2.p(on2.f(0.13f, -16777216, -1), nm7.O3));
                        hg5 hg5Var2 = a58Var.x0;
                        hg5Var2.V = false;
                        hg5Var2.t(jb6.M0(2131746132, null));
                        a58Var.x0.setPadding(gm.L(8.0f), 0, gm.L(8.0f), gm.L(1.0f));
                        a58Var.S0.addView(a58Var.x0, qoe.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, a58Var.n2 ? 0.0f : 56.0f));
                    }
                    a58Var.x0.v();
                    gda.G(true);
                    break;
                }
                break;
            case 2:
                a58Var.K0();
                break;
            case 3:
                ((fab) a58Var.G1).b(true);
                break;
            case 4:
                a58Var.h0(true);
                break;
            case 5:
                oab oabVar = a58Var.z0;
                if (oabVar != null) {
                    oabVar.L(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                a58Var.H0();
                break;
            case 7:
                a58Var.A3 = 0L;
                t38 t38Var = a58Var.R1;
                if (t38Var != null) {
                    t38Var.M(true);
                    a58Var.R1.C2();
                    a58Var.h0(true);
                    break;
                }
                break;
            case 8:
                Activity W = gm.W(a58Var.getContext());
                if (W != null) {
                    a18 a18Var = new a18(a58Var, W, (byte) 2);
                    oab oabVar2 = ((fab) a58Var.G1).d;
                    nab nabVar = oabVar2.A0;
                    if (nabVar != null) {
                        z = nabVar.release(a18Var);
                        oabVar2.A0 = null;
                    }
                    if (!z) {
                        gm.d3(a18Var, 80L);
                        break;
                    }
                }
                break;
            case 9:
                oab oabVar3 = ((fab) a58Var.G1).d;
                oabVar3.i1 = false;
                oabVar3.U();
                break;
            case 10:
                a58Var.E0(null);
                break;
            case 11:
                a58Var.X0(false);
                oc7.d1().edit().putInt("taptostorysoundhint", oc7.d1().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                a58Var.J3 = true;
                a58Var.setActive(false);
                break;
        }
    }
}
