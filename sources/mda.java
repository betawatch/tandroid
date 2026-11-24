// default package

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mda implements ir9 {
    public final /* synthetic */ nfa a;

    public mda(nfa nfaVar) {
        this.a = nfaVar;
    }

    @Override // ir9
    public final void B() {
        int a;
        iea[] ieaVarArr = this.a.n0;
        int i = ieaVarArr[0].F;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    a = gl.L(100.0f);
                } else if (i != 4) {
                    a = i != 5 ? gl.L(58.0f) : gl.L(60.0f);
                }
            }
            a = gl.L(56.0f);
        } else {
            a = rfa.a(1);
        }
        iea ieaVar = ieaVarArr[0];
        int i2 = ieaVar.F;
        qca qcaVar = ieaVar.x;
        if ((i2 == 0 ? (qcaVar.K0() / r6.p1[0]) * a : qcaVar.K0() * a) < ieaVarArr[0].h.getMeasuredHeight() * 1.2f) {
            ieaVarArr[0].h.z0(0);
            return;
        }
        cu6 cu6Var = ieaVarArr[0].E;
        cu6Var.b = 1;
        cu6Var.k(0, 0, false, false);
    }

    @Override // ir9
    public final void a(int i, boolean z) {
        nfa nfaVar = this.a;
        iea[] ieaVarArr = nfaVar.n0;
        if (ieaVarArr[0].F == i) {
            return;
        }
        oca ocaVar = nfaVar.c0;
        if (ocaVar != null && i == 8) {
            ocaVar.b.g(1.0f, 0);
        }
        iea ieaVar = ieaVarArr[1];
        ieaVar.F = i;
        ieaVar.setVisibility(0);
        nfaVar.g0();
        nfaVar.z1(true);
        nfaVar.k1 = z;
        nfaVar.S0();
        nfaVar.j(!nfaVar.p0(i));
        nfaVar.G1(true);
    }

    @Override // ir9
    public final void g(float f) {
        nfa nfaVar = this.a;
        r7 r7Var = nfaVar.q0;
        iea[] ieaVarArr = nfaVar.n0;
        if (f != 1.0f || ieaVarArr[1].getVisibility() == 0) {
            if (nfaVar.k1) {
                ieaVarArr[0].setTranslationX((-f) * r4.getMeasuredWidth());
                ieaVarArr[1].setTranslationX(ieaVarArr[0].getMeasuredWidth() - (ieaVarArr[0].getMeasuredWidth() * f));
            } else {
                ieaVarArr[0].setTranslationX(r4.getMeasuredWidth() * f);
                ieaVarArr[1].setTranslationX((ieaVarArr[0].getMeasuredWidth() * f) - ieaVarArr[0].getMeasuredWidth());
            }
            nfaVar.T0(nfaVar.getTabProgress());
            float U = nfaVar.U(f);
            nfaVar.s0 = U;
            nfaVar.u0.setVisibility((U == 0.0f || !nfaVar.q() || nfaVar.k0()) ? 4 : 0);
            if (r7Var == null || nfaVar.q()) {
                nfaVar.r0 = nfaVar.V(f);
                nfaVar.L1();
            } else {
                nfaVar.setSearchItemVisibility(nfaVar.s0() ? 8 : 4);
                nfaVar.r0 = 0.0f;
            }
            nfaVar.G1(false);
            if (f == 1.0f) {
                iea ieaVar = ieaVarArr[0];
                ieaVarArr[0] = ieaVarArr[1];
                ieaVarArr[1] = ieaVar;
                ieaVar.setVisibility(8);
                if (r7Var != null && nfaVar.A0 == 2) {
                    nfaVar.setSearchItemVisibility(nfaVar.s0() ? 8 : 4);
                }
                nfaVar.A0 = (byte) 0;
                nfaVar.q1();
            }
        }
    }

    @Override // ir9
    public final boolean q2(int i, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        nfa nfaVar = this.a;
        d dVar = nfaVar.y1;
        if (dVar != null) {
            boolean m0 = nfaVar.m0();
            if (nfa.Y(i, m0) != null) {
                if (m0) {
                    if (hc2.w(5, dVar.getMessagesController().K0(Long.valueOf(nfaVar.g1.id)))) {
                        profileTab = nfaVar.g1.main_tab;
                        if (profileTab != null || (i != nfa.Z(profileTab) && nfaVar.V1 != i)) {
                            cs5 I = cs5.I(dVar, view);
                            I.X(bkb.b0(gl.L(24.0f), bkb.w0(null, bkb.c6, false)));
                            I.b(R.drawable.tabs_reorder, k96.M0(2131746429, null), new z54(this, m0, i, (byte) 4), false);
                            I.a0();
                            return true;
                        }
                    }
                } else if (nfaVar.m1 == dVar.getUserConfig().e() && (userFull = nfaVar.h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    cs5 I2 = cs5.I(dVar, view);
                    I2.X(bkb.b0(gl.L(24.0f), bkb.w0(null, bkb.c6, false)));
                    I2.b(R.drawable.tabs_reorder, k96.M0(2131746429, null), new z54(this, m0, i, (byte) 4), false);
                    I2.a0();
                    return true;
                }
            }
        }
        return false;
    }
}
