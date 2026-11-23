package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class hr0 implements jl0 {
    public final /* synthetic */ jt0 a;

    public hr0(jt0 jt0Var) {
        this.a = jt0Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void D() {
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
            a10 = org.telegram.ui.Cells.q7.a(1);
        }
        if ((ds0VarArr[0].F == 0 ? (r5.x.L0() / r0.p1[0]) * a10 : r5.x.L0() * a10) < ds0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ds0VarArr[0].h.y0(0);
            return;
        }
        org.telegram.ui.ActionBar.k5 k5Var = ds0VarArr[0].E;
        k5Var.b = 1;
        k5Var.k(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.jl0
    public final void a(int i7, boolean z10) {
        jt0 jt0Var = this.a;
        ds0[] ds0VarArr = jt0Var.n0;
        if (ds0VarArr[0].F == i7) {
            return;
        }
        jq0 jq0Var = jt0Var.c0;
        if (jq0Var != null && i7 == 8) {
            jq0Var.b.g(1.0f, 0);
        }
        ds0 ds0Var = ds0VarArr[1];
        ds0Var.F = i7;
        ds0Var.setVisibility(0);
        jt0Var.w0();
        jt0Var.B1(true);
        jt0Var.k1 = z10;
        jt0Var.Y0();
        jt0Var.E(!jt0Var.F0(i7));
        jt0Var.I1(true);
    }

    @Override // org.telegram.ui.Components.jl0
    public final void g(float f10) {
        jt0 jt0Var = this.a;
        org.telegram.ui.ActionBar.q0 q0Var = jt0Var.q0;
        ds0[] ds0VarArr = jt0Var.n0;
        if (f10 != 1.0f || ds0VarArr[1].getVisibility() == 0) {
            if (jt0Var.k1) {
                ds0VarArr[0].setTranslationX((-f10) * r5.getMeasuredWidth());
                ds0VarArr[1].setTranslationX(ds0VarArr[0].getMeasuredWidth() - (ds0VarArr[0].getMeasuredWidth() * f10));
            } else {
                ds0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f10);
                ds0VarArr[1].setTranslationX((ds0VarArr[0].getMeasuredWidth() * f10) - ds0VarArr[0].getMeasuredWidth());
            }
            jt0Var.Z0(jt0Var.getTabProgress());
            float k02 = jt0Var.k0(f10);
            jt0Var.s0 = k02;
            jt0Var.u0.setVisibility((k02 == 0.0f || !jt0Var.I() || jt0Var.A0()) ? 4 : 0);
            if (q0Var == null || jt0Var.I()) {
                jt0Var.r0 = jt0Var.l0(f10);
                jt0Var.N1();
            } else {
                jt0Var.setSearchItemVisibility(jt0Var.I0() ? 8 : 4);
                jt0Var.r0 = 0.0f;
            }
            jt0Var.I1(false);
            if (f10 == 1.0f) {
                ds0 ds0Var = ds0VarArr[0];
                ds0VarArr[0] = ds0VarArr[1];
                ds0VarArr[1] = ds0Var;
                ds0Var.setVisibility(8);
                if (q0Var != null && jt0Var.A0 == 2) {
                    jt0Var.setSearchItemVisibility(jt0Var.I0() ? 8 : 4);
                }
                jt0Var.A0 = 0;
                jt0Var.u1();
            }
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean h1(int i7, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        jt0 jt0Var = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.y1;
        if (g2Var != null) {
            boolean C0 = jt0Var.C0();
            if (jt0.o0(i7, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.v3.w(5, g2Var.getMessagesController().O0(Long.valueOf(jt0Var.g1.id)))) {
                        profileTab = jt0Var.g1.main_tab;
                        if (profileTab != null || (i7 != jt0.p0(profileTab) && jt0Var.V1 != i7)) {
                            a70 I = a70.I(g2Var, view);
                            I.X(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false)));
                            I.c(R.drawable.tabs_reorder, org.telegram.messenger.hd.N0(2131746426, null), new di.x7(this, C0, i7, 6), false);
                            I.a0();
                            return true;
                        }
                    }
                } else if (jt0Var.m1 == g2Var.getUserConfig().e() && (userFull = jt0Var.h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    a70 I2 = a70.I(g2Var, view);
                    I2.X(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false)));
                    I2.c(R.drawable.tabs_reorder, org.telegram.messenger.hd.N0(2131746426, null), new di.x7(this, C0, i7, 6), false);
                    I2.a0();
                    return true;
                }
            }
        }
        return false;
    }
}
