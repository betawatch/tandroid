package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gr0 implements jl0 {
    public final /* synthetic */ it0 a;

    public gr0(it0 it0Var) {
        this.a = it0Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean Y0(int i7, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        it0 it0Var = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
        if (g2Var != null) {
            boolean C0 = it0Var.C0();
            if (it0.o0(i7, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.v3.w(5, g2Var.getMessagesController().O0(Long.valueOf(it0Var.g1.id)))) {
                        profileTab = it0Var.g1.main_tab;
                        if (profileTab != null || (i7 != it0.p0(profileTab) && it0Var.V1 != i7)) {
                            x60 I = x60.I(g2Var, view);
                            I.X(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false)));
                            I.c(R.drawable.tabs_reorder, org.telegram.messenger.gd.N0(2131746426, null), new di.x7(this, C0, i7, 6), false);
                            I.a0();
                            return true;
                        }
                    }
                } else if (it0Var.m1 == g2Var.getUserConfig().e() && (userFull = it0Var.h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    x60 I2 = x60.I(g2Var, view);
                    I2.X(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false)));
                    I2.c(R.drawable.tabs_reorder, org.telegram.messenger.gd.N0(2131746426, null), new di.x7(this, C0, i7, 6), false);
                    I2.a0();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void a(int i7, boolean z10) {
        it0 it0Var = this.a;
        ds0[] ds0VarArr = it0Var.n0;
        if (ds0VarArr[0].F == i7) {
            return;
        }
        iq0 iq0Var = it0Var.c0;
        if (iq0Var != null && i7 == 8) {
            iq0Var.b.g(1.0f, 0);
        }
        ds0 ds0Var = ds0VarArr[1];
        ds0Var.F = i7;
        ds0Var.setVisibility(0);
        it0Var.w0();
        it0Var.B1(true);
        it0Var.k1 = z10;
        it0Var.Y0();
        it0Var.E(!it0Var.F0(i7));
        it0Var.I1(true);
    }

    @Override // org.telegram.ui.Components.jl0
    public final void c(float f10) {
        it0 it0Var = this.a;
        org.telegram.ui.ActionBar.q0 q0Var = it0Var.q0;
        ds0[] ds0VarArr = it0Var.n0;
        if (f10 != 1.0f || ds0VarArr[1].getVisibility() == 0) {
            if (it0Var.k1) {
                ds0VarArr[0].setTranslationX((-f10) * r5.getMeasuredWidth());
                ds0VarArr[1].setTranslationX(ds0VarArr[0].getMeasuredWidth() - (ds0VarArr[0].getMeasuredWidth() * f10));
            } else {
                ds0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f10);
                ds0VarArr[1].setTranslationX((ds0VarArr[0].getMeasuredWidth() * f10) - ds0VarArr[0].getMeasuredWidth());
            }
            it0Var.Z0(it0Var.getTabProgress());
            float k02 = it0Var.k0(f10);
            it0Var.s0 = k02;
            it0Var.u0.setVisibility((k02 == 0.0f || !it0Var.I() || it0Var.A0()) ? 4 : 0);
            if (q0Var == null || it0Var.I()) {
                it0Var.r0 = it0Var.l0(f10);
                it0Var.N1();
            } else {
                it0Var.setSearchItemVisibility(it0Var.I0() ? 8 : 4);
                it0Var.r0 = 0.0f;
            }
            it0Var.I1(false);
            if (f10 == 1.0f) {
                ds0 ds0Var = ds0VarArr[0];
                ds0VarArr[0] = ds0VarArr[1];
                ds0VarArr[1] = ds0Var;
                ds0Var.setVisibility(8);
                if (q0Var != null && it0Var.A0 == 2) {
                    it0Var.setSearchItemVisibility(it0Var.I0() ? 8 : 4);
                }
                it0Var.A0 = 0;
                it0Var.u1();
            }
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public final void y() {
        int a10;
        ds0[] ds0VarArr = this.a.n0;
        int i7 = ds0VarArr[0].F;
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
        if ((ds0VarArr[0].F == 0 ? (r5.x.L0() / r0.p1[0]) * a10 : r5.x.L0() * a10) < ds0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ds0VarArr[0].h.y0(0);
            return;
        }
        org.telegram.ui.ActionBar.l5 l5Var = ds0VarArr[0].E;
        l5Var.b = 1;
        l5Var.k(0, 0, false, false);
    }
}
