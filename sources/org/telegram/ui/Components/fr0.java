package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fr0 implements hl0 {
    public final /* synthetic */ gt0 a;

    public fr0(gt0 gt0Var) {
        this.a = gt0Var;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void D() {
        int a10;
        bs0[] bs0VarArr = this.a.n0;
        int i7 = bs0VarArr[0].F;
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
        if ((bs0VarArr[0].F == 0 ? (r5.x.L0() / r0.p1[0]) * a10 : r5.x.L0() * a10) < bs0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            bs0VarArr[0].h.y0(0);
            return;
        }
        org.telegram.ui.ActionBar.l5 l5Var = bs0VarArr[0].E;
        l5Var.b = 1;
        l5Var.k(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.hl0
    public final void a(int i7, boolean z10) {
        gt0 gt0Var = this.a;
        bs0[] bs0VarArr = gt0Var.n0;
        if (bs0VarArr[0].F == i7) {
            return;
        }
        hq0 hq0Var = gt0Var.c0;
        if (hq0Var != null && i7 == 8) {
            hq0Var.b.g(1.0f, 0);
        }
        bs0 bs0Var = bs0VarArr[1];
        bs0Var.F = i7;
        bs0Var.setVisibility(0);
        gt0Var.w0();
        gt0Var.B1(true);
        gt0Var.k1 = z10;
        gt0Var.Y0();
        gt0Var.E(!gt0Var.F0(i7));
        gt0Var.I1(true);
    }

    @Override // org.telegram.ui.Components.hl0
    public final void g(float f10) {
        gt0 gt0Var = this.a;
        org.telegram.ui.ActionBar.r0 r0Var = gt0Var.q0;
        bs0[] bs0VarArr = gt0Var.n0;
        if (f10 != 1.0f || bs0VarArr[1].getVisibility() == 0) {
            if (gt0Var.k1) {
                bs0VarArr[0].setTranslationX((-f10) * r5.getMeasuredWidth());
                bs0VarArr[1].setTranslationX(bs0VarArr[0].getMeasuredWidth() - (bs0VarArr[0].getMeasuredWidth() * f10));
            } else {
                bs0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f10);
                bs0VarArr[1].setTranslationX((bs0VarArr[0].getMeasuredWidth() * f10) - bs0VarArr[0].getMeasuredWidth());
            }
            gt0Var.Z0(gt0Var.getTabProgress());
            float k02 = gt0Var.k0(f10);
            gt0Var.s0 = k02;
            gt0Var.u0.setVisibility((k02 == 0.0f || !gt0Var.I() || gt0Var.A0()) ? 4 : 0);
            if (r0Var == null || gt0Var.I()) {
                gt0Var.r0 = gt0Var.l0(f10);
                gt0Var.N1();
            } else {
                gt0Var.setSearchItemVisibility(gt0Var.I0() ? 8 : 4);
                gt0Var.r0 = 0.0f;
            }
            gt0Var.I1(false);
            if (f10 == 1.0f) {
                bs0 bs0Var = bs0VarArr[0];
                bs0VarArr[0] = bs0VarArr[1];
                bs0VarArr[1] = bs0Var;
                bs0Var.setVisibility(8);
                if (r0Var != null && gt0Var.A0 == 2) {
                    gt0Var.setSearchItemVisibility(gt0Var.I0() ? 8 : 4);
                }
                gt0Var.A0 = 0;
                gt0Var.u1();
            }
        }
    }

    @Override // org.telegram.ui.Components.hl0
    public final boolean h1(int i7, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        gt0 gt0Var = this.a;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
        if (h2Var != null) {
            boolean C0 = gt0Var.C0();
            if (gt0.o0(i7, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.v3.w(5, h2Var.getMessagesController().O0(Long.valueOf(gt0Var.g1.id)))) {
                        profileTab = gt0Var.g1.main_tab;
                        if (profileTab != null || (i7 != gt0.p0(profileTab) && gt0Var.V1 != i7)) {
                            y60 I = y60.I(h2Var, view);
                            I.X(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false)));
                            I.c(R.drawable.tabs_reorder, org.telegram.messenger.gd.M0(2131746427, null), new di.x7(this, C0, i7, 6), false);
                            I.a0();
                            return true;
                        }
                    }
                } else if (gt0Var.m1 == h2Var.getUserConfig().e() && (userFull = gt0Var.h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    y60 I2 = y60.I(h2Var, view);
                    I2.X(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false)));
                    I2.c(R.drawable.tabs_reorder, org.telegram.messenger.gd.M0(2131746427, null), new di.x7(this, C0, i7, 6), false);
                    I2.a0();
                    return true;
                }
            }
        }
        return false;
    }
}
