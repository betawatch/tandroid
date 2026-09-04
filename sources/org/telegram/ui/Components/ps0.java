package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ps0 implements lm0 {
    public final /* synthetic */ xu0 a;

    public ps0(xu0 xu0Var) {
        this.a = xu0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final void C() {
        int a2;
        qt0[] qt0VarArr = this.a.k0;
        int i10 = qt0VarArr[0].F;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    a2 = AndroidUtilities.dp(100.0f);
                } else if (i10 != 4) {
                    a2 = i10 != 5 ? AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(60.0f);
                }
            }
            a2 = AndroidUtilities.dp(56.0f);
        } else {
            a2 = org.telegram.ui.Cells.u7.a(1);
        }
        if ((qt0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < qt0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            qt0VarArr[0].h.x0(0);
            return;
        }
        ok0 ok0Var = qt0VarArr[0].E;
        ok0Var.b = 1;
        ok0Var.c(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.lm0
    public final void D0(float f7) {
        xu0 xu0Var = this.a;
        org.telegram.ui.ActionBar.v0 v0Var = xu0Var.n0;
        qt0[] qt0VarArr = xu0Var.k0;
        if (f7 != 1.0f || qt0VarArr[1].getVisibility() == 0) {
            if (xu0Var.h1) {
                qt0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() - (qt0VarArr[0].getMeasuredWidth() * f7));
            } else {
                qt0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                qt0VarArr[1].setTranslationX((qt0VarArr[0].getMeasuredWidth() * f7) - qt0VarArr[0].getMeasuredWidth());
            }
            xu0Var.M0(xu0Var.getTabProgress());
            float a02 = xu0Var.a0(f7);
            xu0Var.p0 = a02;
            xu0Var.r0.setVisibility((a02 == 0.0f || !xu0Var.D() || xu0Var.q0()) ? 4 : 0);
            if (v0Var == null || xu0Var.D()) {
                xu0Var.o0 = xu0Var.b0(f7);
                xu0Var.t1();
            } else {
                v0Var.setVisibility(xu0Var.v0() ? 8 : 4);
                xu0Var.o0 = 0.0f;
            }
            xu0Var.q1(false);
            if (f7 == 1.0f) {
                qt0 qt0Var = qt0VarArr[0];
                qt0VarArr[0] = qt0VarArr[1];
                qt0VarArr[1] = qt0Var;
                qt0Var.setVisibility(8);
                if (v0Var != null && xu0Var.x0 == 2) {
                    v0Var.setVisibility(xu0Var.v0() ? 8 : 4);
                }
                xu0Var.x0 = 0;
                xu0Var.f1();
            }
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final void b(int i10, boolean z10) {
        xu0 xu0Var = this.a;
        qt0[] qt0VarArr = xu0Var.k0;
        if (qt0VarArr[0].F == i10) {
            return;
        }
        sr0 sr0Var = xu0Var.W;
        if (sr0Var != null && i10 == 8) {
            sr0Var.n.f(1.0f, 0);
        }
        qt0 qt0Var = qt0VarArr[1];
        qt0Var.F = i10;
        qt0Var.setVisibility(0);
        xu0Var.k0();
        xu0Var.m1(true);
        xu0Var.h1 = z10;
        xu0Var.L0();
        xu0Var.A(!xu0Var.s0(i10), true);
        xu0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean n1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        xu0 xu0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.v1;
        if (n2Var != null && xu0.d0(i10, xu0Var.d1 instanceof TLRPC.TL_channelFull) != null) {
            if (xu0Var.d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(xu0Var.d1.id)), 5)) {
                    profileTab = xu0Var.d1.main_tab;
                    if (profileTab != null || (i10 != xu0.e0(profileTab) && xu0Var.R1 != i10)) {
                        n70 H = n70.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new m8(this, i10, 10), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (xu0Var.j1 == n2Var.getUserConfig().getClientUserId() && (userFull = xu0Var.e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                n70 H2 = n70.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new m8(this, i10, 10), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
