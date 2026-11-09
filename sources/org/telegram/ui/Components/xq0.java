package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xq0 implements vk0 {
    public final /* synthetic */ zs0 a;

    public xq0(zs0 zs0Var) {
        this.a = zs0Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final void F0(float f10) {
        zs0 zs0Var = this.a;
        org.telegram.ui.ActionBar.r0 r0Var = zs0Var.p0;
        ur0[] ur0VarArr = zs0Var.m0;
        if (f10 != 1.0f || ur0VarArr[1].getVisibility() == 0) {
            if (zs0Var.j1) {
                ur0VarArr[0].setTranslationX((-f10) * r5.getMeasuredWidth());
                ur0VarArr[1].setTranslationX(ur0VarArr[0].getMeasuredWidth() - (ur0VarArr[0].getMeasuredWidth() * f10));
            } else {
                ur0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f10);
                ur0VarArr[1].setTranslationX((ur0VarArr[0].getMeasuredWidth() * f10) - ur0VarArr[0].getMeasuredWidth());
            }
            zs0Var.Z0(zs0Var.getTabProgress());
            float k02 = zs0Var.k0(f10);
            zs0Var.r0 = k02;
            zs0Var.t0.setVisibility((k02 == 0.0f || !zs0Var.I() || zs0Var.A0()) ? 4 : 0);
            if (r0Var == null || zs0Var.I()) {
                zs0Var.q0 = zs0Var.l0(f10);
                zs0Var.N1();
            } else {
                zs0Var.setSearchItemVisibility(zs0Var.I0() ? 8 : 4);
                zs0Var.q0 = 0.0f;
            }
            zs0Var.I1(false);
            if (f10 == 1.0f) {
                ur0 ur0Var = ur0VarArr[0];
                ur0VarArr[0] = ur0VarArr[1];
                ur0VarArr[1] = ur0Var;
                ur0Var.setVisibility(8);
                if (r0Var != null && zs0Var.z0 == 2) {
                    zs0Var.setSearchItemVisibility(zs0Var.I0() ? 8 : 4);
                }
                zs0Var.z0 = 0;
                zs0Var.u1();
            }
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final void b(int i7, boolean z9) {
        zs0 zs0Var = this.a;
        ur0[] ur0VarArr = zs0Var.m0;
        if (ur0VarArr[0].E == i7) {
            return;
        }
        zp0 zp0Var = zs0Var.b0;
        if (zp0Var != null && i7 == 8) {
            zp0Var.b.f(1.0f, 0);
        }
        ur0 ur0Var = ur0VarArr[1];
        ur0Var.E = i7;
        ur0Var.setVisibility(0);
        zs0Var.w0();
        zs0Var.B1(true);
        zs0Var.j1 = z9;
        zs0Var.Y0();
        zs0Var.E(!zs0Var.F0(i7));
        zs0Var.I1(true);
    }

    @Override // org.telegram.ui.Components.vk0
    public final void c() {
        int a10;
        ur0[] ur0VarArr = this.a.m0;
        int i7 = ur0VarArr[0].E;
        if (i7 != 0) {
            if (i7 != 1 && i7 != 2) {
                if (i7 == 3) {
                    a10 = org.telegram.messenger.g0.L(100.0f);
                } else if (i7 != 4) {
                    a10 = i7 != 5 ? org.telegram.messenger.g0.L(58.0f) : org.telegram.messenger.g0.L(60.0f);
                }
            }
            a10 = org.telegram.messenger.g0.L(56.0f);
        } else {
            a10 = org.telegram.ui.Cells.p7.a(1);
        }
        if ((ur0VarArr[0].E == 0 ? (r5.x.L0() / r0.o1[0]) * a10 : r5.x.L0() * a10) < ur0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ur0VarArr[0].h.y0(0);
            return;
        }
        si0 si0Var = ur0VarArr[0].D;
        si0Var.b = 1;
        si0Var.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean m1(int i7, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        zs0 zs0Var = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.x1;
        if (f2Var != null) {
            boolean C0 = zs0Var.C0();
            if (zs0.o0(i7, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.t3.w(5, f2Var.getMessagesController().M0(Long.valueOf(zs0Var.f1.id)))) {
                        profileTab = zs0Var.f1.main_tab;
                        if (profileTab != null || (i7 != zs0.p0(profileTab) && zs0Var.U1 != i7)) {
                            l60 H = l60.H(f2Var, view);
                            H.W(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.d6, false)));
                            H.c(R.drawable.tabs_reorder, org.telegram.messenger.id.M0(2131746622, null), new bi.c9(this, C0, i7, 6), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (zs0Var.l1 == f2Var.getUserConfig().e() && (userFull = zs0Var.g1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    l60 H2 = l60.H(f2Var, view);
                    H2.W(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.d6, false)));
                    H2.c(R.drawable.tabs_reorder, org.telegram.messenger.id.M0(2131746622, null), new bi.c9(this, C0, i7, 6), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }
}
