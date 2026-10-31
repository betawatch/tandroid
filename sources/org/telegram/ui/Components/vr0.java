package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vr0 implements xl0 {
    public final /* synthetic */ zt0 a;

    public vr0(zt0 zt0Var) {
        this.a = zt0Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final void D() {
        int a2;
        ss0[] ss0VarArr = this.a.m0;
        int i10 = ss0VarArr[0].E;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    a2 = org.telegram.messenger.i0.L(100.0f);
                } else if (i10 != 4) {
                    a2 = i10 != 5 ? org.telegram.messenger.i0.L(58.0f) : org.telegram.messenger.i0.L(60.0f);
                }
            }
            a2 = org.telegram.messenger.i0.L(56.0f);
        } else {
            a2 = org.telegram.ui.Cells.t7.a(1);
        }
        if ((ss0VarArr[0].E == 0 ? (r5.x.L0() / r0.o1[0]) * a2 : r5.x.L0() * a2) < ss0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ss0VarArr[0].h.y0(0);
            return;
        }
        vj0 vj0Var = ss0VarArr[0].D;
        vj0Var.b = 1;
        vj0Var.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.xl0
    public final void E0(float f7) {
        zt0 zt0Var = this.a;
        org.telegram.ui.ActionBar.t0 t0Var = zt0Var.p0;
        ss0[] ss0VarArr = zt0Var.m0;
        if (f7 != 1.0f || ss0VarArr[1].getVisibility() == 0) {
            if (zt0Var.j1) {
                ss0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                ss0VarArr[1].setTranslationX(ss0VarArr[0].getMeasuredWidth() - (ss0VarArr[0].getMeasuredWidth() * f7));
            } else {
                ss0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                ss0VarArr[1].setTranslationX((ss0VarArr[0].getMeasuredWidth() * f7) - ss0VarArr[0].getMeasuredWidth());
            }
            zt0Var.U0(zt0Var.getTabProgress());
            float i02 = zt0Var.i0(f7);
            zt0Var.r0 = i02;
            zt0Var.t0.setVisibility((i02 == 0.0f || !zt0Var.H() || zt0Var.y0()) ? 4 : 0);
            if (t0Var == null || zt0Var.H()) {
                zt0Var.q0 = zt0Var.j0(f7);
                zt0Var.I1();
            } else {
                zt0Var.setSearchItemVisibility(zt0Var.E0() ? 8 : 4);
                zt0Var.q0 = 0.0f;
            }
            zt0Var.D1(false);
            if (f7 == 1.0f) {
                ss0 ss0Var = ss0VarArr[0];
                ss0VarArr[0] = ss0VarArr[1];
                ss0VarArr[1] = ss0Var;
                ss0Var.setVisibility(8);
                if (t0Var != null && zt0Var.z0 == 2) {
                    zt0Var.setSearchItemVisibility(zt0Var.E0() ? 8 : 4);
                }
                zt0Var.z0 = 0;
                zt0Var.p1();
            }
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean G1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        zt0 zt0Var = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
        if (k2Var != null) {
            boolean A0 = zt0Var.A0();
            if (zt0.m0(i10, A0) != null) {
                if (A0) {
                    if (org.telegram.messenger.w3.w(5, k2Var.getMessagesController().L0(Long.valueOf(zt0Var.f1.id)))) {
                        profileTab = zt0Var.f1.main_tab;
                        if (profileTab != null || (i10 != zt0.n0(profileTab) && zt0Var.U1 != i10)) {
                            z60 H = z60.H(k2Var, view);
                            H.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false)));
                            H.c(R.drawable.tabs_reorder, org.telegram.messenger.cd.L0(2131746637, null), new i2.j0(this, A0, i10, 5), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (zt0Var.l1 == k2Var.getUserConfig().e() && (userFull = zt0Var.g1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    z60 H2 = z60.H(k2Var, view);
                    H2.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false)));
                    H2.c(R.drawable.tabs_reorder, org.telegram.messenger.cd.L0(2131746637, null), new i2.j0(this, A0, i10, 5), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public final void d(int i10, boolean z10) {
        zt0 zt0Var = this.a;
        ss0[] ss0VarArr = zt0Var.m0;
        if (ss0VarArr[0].E == i10) {
            return;
        }
        zq0 zq0Var = zt0Var.b0;
        if (zq0Var != null && i10 == 8) {
            zq0Var.b.f(1.0f, 0);
        }
        ss0 ss0Var = ss0VarArr[1];
        ss0Var.E = i10;
        ss0Var.setVisibility(0);
        zt0Var.u0();
        zt0Var.w1(true);
        zt0Var.j1 = z10;
        zt0Var.T0();
        zt0Var.D(!zt0Var.B0(i10));
        zt0Var.D1(true);
    }
}
