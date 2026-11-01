package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wr0 implements yl0 {
    public final /* synthetic */ au0 a;

    public wr0(au0 au0Var) {
        this.a = au0Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public final void D() {
        int a2;
        ts0[] ts0VarArr = this.a.m0;
        int i10 = ts0VarArr[0].E;
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
        if ((ts0VarArr[0].E == 0 ? (r5.x.L0() / r0.o1[0]) * a2 : r5.x.L0() * a2) < ts0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ts0VarArr[0].h.y0(0);
            return;
        }
        wj0 wj0Var = ts0VarArr[0].D;
        wj0Var.b = 1;
        wj0Var.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.yl0
    public final void E0(float f7) {
        au0 au0Var = this.a;
        org.telegram.ui.ActionBar.t0 t0Var = au0Var.p0;
        ts0[] ts0VarArr = au0Var.m0;
        if (f7 != 1.0f || ts0VarArr[1].getVisibility() == 0) {
            if (au0Var.j1) {
                ts0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                ts0VarArr[1].setTranslationX(ts0VarArr[0].getMeasuredWidth() - (ts0VarArr[0].getMeasuredWidth() * f7));
            } else {
                ts0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                ts0VarArr[1].setTranslationX((ts0VarArr[0].getMeasuredWidth() * f7) - ts0VarArr[0].getMeasuredWidth());
            }
            au0Var.V0(au0Var.getTabProgress());
            float j02 = au0Var.j0(f7);
            au0Var.r0 = j02;
            au0Var.t0.setVisibility((j02 == 0.0f || !au0Var.H() || au0Var.z0()) ? 4 : 0);
            if (t0Var == null || au0Var.H()) {
                au0Var.q0 = au0Var.k0(f7);
                au0Var.J1();
            } else {
                au0Var.setSearchItemVisibility(au0Var.F0() ? 8 : 4);
                au0Var.q0 = 0.0f;
            }
            au0Var.E1(false);
            if (f7 == 1.0f) {
                ts0 ts0Var = ts0VarArr[0];
                ts0VarArr[0] = ts0VarArr[1];
                ts0VarArr[1] = ts0Var;
                ts0Var.setVisibility(8);
                if (t0Var != null && au0Var.z0 == 2) {
                    au0Var.setSearchItemVisibility(au0Var.F0() ? 8 : 4);
                }
                au0Var.z0 = 0;
                au0Var.q1();
            }
        }
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean G1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        au0 au0Var = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.x1;
        if (k2Var != null) {
            boolean B0 = au0Var.B0();
            if (au0.n0(i10, B0) != null) {
                if (B0) {
                    if (org.telegram.messenger.w3.w(5, k2Var.getMessagesController().L0(Long.valueOf(au0Var.f1.id)))) {
                        profileTab = au0Var.f1.main_tab;
                        if (profileTab != null || (i10 != au0.o0(profileTab) && au0Var.U1 != i10)) {
                            z60 H = z60.H(k2Var, view);
                            H.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false)));
                            H.c(R.drawable.tabs_reorder, org.telegram.messenger.dd.L0(2131746637, null), new i2.j0(this, B0, i10, 5), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (au0Var.l1 == k2Var.getUserConfig().e() && (userFull = au0Var.g1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    z60 H2 = z60.H(k2Var, view);
                    H2.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false)));
                    H2.c(R.drawable.tabs_reorder, org.telegram.messenger.dd.L0(2131746637, null), new i2.j0(this, B0, i10, 5), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.yl0
    public final void d(int i10, boolean z10) {
        au0 au0Var = this.a;
        ts0[] ts0VarArr = au0Var.m0;
        if (ts0VarArr[0].E == i10) {
            return;
        }
        ar0 ar0Var = au0Var.b0;
        if (ar0Var != null && i10 == 8) {
            ar0Var.b.f(1.0f, 0);
        }
        ts0 ts0Var = ts0VarArr[1];
        ts0Var.E = i10;
        ts0Var.setVisibility(0);
        au0Var.v0();
        au0Var.x1(true);
        au0Var.j1 = z10;
        au0Var.U0();
        au0Var.D(!au0Var.C0(i10));
        au0Var.E1(true);
    }
}
