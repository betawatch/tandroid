// default package

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mfa implements kt9 {
    public final /* synthetic */ nha a;

    public mfa(nha nhaVar) {
        this.a = nhaVar;
    }

    @Override // kt9
    public final void a(int i, boolean z) {
        nha nhaVar = this.a;
        iga[] igaVarArr = nhaVar.n0;
        if (igaVarArr[0].F == i) {
            return;
        }
        oea oeaVar = nhaVar.c0;
        if (oeaVar != null && i == 8) {
            oeaVar.b.g(1.0f, 0);
        }
        iga igaVar = igaVarArr[1];
        igaVar.F = i;
        igaVar.setVisibility(0);
        nhaVar.g0();
        nhaVar.z1(true);
        nhaVar.k1 = z;
        nhaVar.S0();
        nhaVar.j(!nhaVar.p0(i));
        nhaVar.G1(true);
    }

    @Override // kt9
    public final void g(float f) {
        nha nhaVar = this.a;
        r7 r7Var = nhaVar.q0;
        iga[] igaVarArr = nhaVar.n0;
        if (f != 1.0f || igaVarArr[1].getVisibility() == 0) {
            if (nhaVar.k1) {
                igaVarArr[0].setTranslationX((-f) * r4.getMeasuredWidth());
                igaVarArr[1].setTranslationX(igaVarArr[0].getMeasuredWidth() - (igaVarArr[0].getMeasuredWidth() * f));
            } else {
                igaVarArr[0].setTranslationX(r4.getMeasuredWidth() * f);
                igaVarArr[1].setTranslationX((igaVarArr[0].getMeasuredWidth() * f) - igaVarArr[0].getMeasuredWidth());
            }
            nhaVar.T0(nhaVar.getTabProgress());
            float U = nhaVar.U(f);
            nhaVar.s0 = U;
            nhaVar.u0.setVisibility((U == 0.0f || !nhaVar.q() || nhaVar.k0()) ? 4 : 0);
            if (r7Var == null || nhaVar.q()) {
                nhaVar.r0 = nhaVar.V(f);
                nhaVar.L1();
            } else {
                nhaVar.setSearchItemVisibility(nhaVar.s0() ? 8 : 4);
                nhaVar.r0 = 0.0f;
            }
            nhaVar.G1(false);
            if (f == 1.0f) {
                iga igaVar = igaVarArr[0];
                igaVarArr[0] = igaVarArr[1];
                igaVarArr[1] = igaVar;
                igaVar.setVisibility(8);
                if (r7Var != null && nhaVar.A0 == 2) {
                    nhaVar.setSearchItemVisibility(nhaVar.s0() ? 8 : 4);
                }
                nhaVar.A0 = (byte) 0;
                nhaVar.q1();
            }
        }
    }

    @Override // kt9
    public final void s() {
        int a;
        iga[] igaVarArr = this.a.n0;
        int i = igaVarArr[0].F;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    a = gm.L(100.0f);
                } else if (i != 4) {
                    a = i != 5 ? gm.L(58.0f) : gm.L(60.0f);
                }
            }
            a = gm.L(56.0f);
        } else {
            a = tha.a(1);
        }
        iga igaVar = igaVarArr[0];
        int i2 = igaVar.F;
        qea qeaVar = igaVar.x;
        if ((i2 == 0 ? (qeaVar.K0() / r6.p1[0]) * a : qeaVar.K0() * a) < igaVarArr[0].h.getMeasuredHeight() * 1.2f) {
            igaVarArr[0].h.z0(0);
            return;
        }
        cw6 cw6Var = igaVarArr[0].E;
        cw6Var.b = 1;
        cw6Var.l(0, 0, false, false);
    }

    @Override // kt9
    public final boolean y0(int i, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        nha nhaVar = this.a;
        d dVar = nhaVar.y1;
        if (dVar != null) {
            boolean m0 = nhaVar.m0();
            if (nha.Y(i, m0) != null) {
                if (m0) {
                    if (sd2.w(5, dVar.getMessagesController().L0(Long.valueOf(nhaVar.g1.id)))) {
                        profileTab = nhaVar.g1.main_tab;
                        if (profileTab != null || (i != nha.Z(profileTab) && nhaVar.V1 != i)) {
                            bu5 I = bu5.I(dVar, view);
                            I.X(cmb.b0(gm.L(24.0f), cmb.w0(null, cmb.c6, false)));
                            I.b(R.drawable.tabs_reorder, jb6.M0(2131746355, null), new i74(this, m0, i, (byte) 4), false);
                            I.a0();
                            return true;
                        }
                    }
                } else if (nhaVar.m1 == dVar.getUserConfig().e() && (userFull = nhaVar.h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    bu5 I2 = bu5.I(dVar, view);
                    I2.X(cmb.b0(gm.L(24.0f), cmb.w0(null, cmb.c6, false)));
                    I2.b(R.drawable.tabs_reorder, jb6.M0(2131746355, null), new i74(this, m0, i, (byte) 4), false);
                    I2.a0();
                    return true;
                }
            }
        }
        return false;
    }
}
