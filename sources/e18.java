// default package

import android.app.Activity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class e18 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y28 b;

    public /* synthetic */ e18(y28 y28Var, byte b) {
        this.a = b;
        this.b = y28Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = false;
        byte b2 = 1;
        y28 y28Var = this.b;
        switch (b) {
            case 0:
                y28Var.Z1.setVisibility(8);
                break;
            case 1:
                if (!y28Var.z0.H0) {
                    y28Var.p3 = null;
                    if (y28Var.x0 == null) {
                        je5 je5Var = new je5(y28Var.getContext(), 3);
                        je5Var.n(1.0f, -22.0f);
                        y28Var.x0 = je5Var;
                        je5Var.i(bm2.o(bm2.f(0.13f, -16777216, -1), kk7.O3));
                        je5 je5Var2 = y28Var.x0;
                        je5Var2.V = false;
                        je5Var2.t(k96.M0(2131746206, null));
                        y28Var.x0.setPadding(gl.L(8.0f), 0, gl.L(8.0f), gl.L(1.0f));
                        y28Var.S0.addView(y28Var.x0, nme.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, y28Var.n2 ? 0.0f : 56.0f));
                    }
                    y28Var.x0.v();
                    gba.G(true);
                    break;
                }
                break;
            case 2:
                y28Var.K0();
                break;
            case 3:
                ((d8b) y28Var.G1).b(true);
                break;
            case 4:
                y28Var.h0(true);
                break;
            case 5:
                m8b m8bVar = y28Var.z0;
                if (m8bVar != null) {
                    m8bVar.L(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                y28Var.H0();
                break;
            case 7:
                y28Var.A3 = 0L;
                q18 q18Var = y28Var.R1;
                if (q18Var != null) {
                    q18Var.N(true);
                    y28Var.R1.x2();
                    y28Var.h0(true);
                    break;
                }
                break;
            case 8:
                Activity W = gl.W(y28Var.getContext());
                if (W != null) {
                    h18 h18Var = new h18(y28Var, W, b2);
                    m8b m8bVar2 = ((d8b) y28Var.G1).d;
                    l8b l8bVar = m8bVar2.A0;
                    if (l8bVar != null) {
                        z = l8bVar.release(h18Var);
                        m8bVar2.A0 = null;
                    }
                    if (!z) {
                        gl.d3(h18Var, 80L);
                        break;
                    }
                }
                break;
            case 9:
                m8b m8bVar3 = ((d8b) y28Var.G1).d;
                m8bVar3.i1 = false;
                m8bVar3.U();
                break;
            case 10:
                y28Var.E0(null);
                break;
            case 11:
                y28Var.X0(false);
                na7.c1().edit().putInt("taptostorysoundhint", na7.c1().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                y28Var.J3 = true;
                y28Var.setActive(false);
                break;
        }
    }
}
