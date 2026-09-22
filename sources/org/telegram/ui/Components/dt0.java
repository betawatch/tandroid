package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class dt0 implements zm0 {
    public final /* synthetic */ lv0 a;

    public dt0(lv0 lv0Var) {
        this.a = lv0Var;
    }

    @Override // org.telegram.ui.Components.zm0
    public final void C() {
        int a2;
        eu0[] eu0VarArr = this.a.k0;
        int i10 = eu0VarArr[0].F;
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
            a2 = org.telegram.ui.Cells.v7.a(1);
        }
        if ((eu0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < eu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            eu0VarArr[0].h.y0(0);
            return;
        }
        bl0 bl0Var = eu0VarArr[0].E;
        bl0Var.b = 1;
        bl0Var.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.zm0
    public final void d(int i10, boolean z10) {
        lv0 lv0Var = this.a;
        eu0[] eu0VarArr = lv0Var.k0;
        if (eu0VarArr[0].F == i10) {
            return;
        }
        gs0 gs0Var = lv0Var.W;
        if (gs0Var != null && i10 == 8) {
            gs0Var.n.f(1.0f, 0);
        }
        eu0 eu0Var = eu0VarArr[1];
        eu0Var.F = i10;
        eu0Var.setVisibility(0);
        lv0Var.k0();
        lv0Var.m1(true);
        lv0Var.h1 = z10;
        lv0Var.L0();
        lv0Var.A(!lv0Var.s0(i10), true);
        lv0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.zm0
    public final boolean m1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        lv0 lv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = lv0Var.v1;
        if (n2Var != null && lv0.d0(i10, lv0Var.d1 instanceof TLRPC.TL_channelFull) != null) {
            if (lv0Var.d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(lv0Var.d1.id)), 5)) {
                    profileTab = lv0Var.d1.main_tab;
                    if (profileTab != null || (i10 != lv0.e0(profileTab) && lv0Var.R1 != i10)) {
                        y70 H = y70.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new kd(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (lv0Var.j1 == n2Var.getUserConfig().getClientUserId() && (userFull = lv0Var.e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                y70 H2 = y70.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new kd(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.zm0
    public final void y0(float f7) {
        lv0 lv0Var = this.a;
        org.telegram.ui.ActionBar.v0 v0Var = lv0Var.n0;
        eu0[] eu0VarArr = lv0Var.k0;
        if (f7 != 1.0f || eu0VarArr[1].getVisibility() == 0) {
            if (lv0Var.h1) {
                eu0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                eu0VarArr[1].setTranslationX(eu0VarArr[0].getMeasuredWidth() - (eu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                eu0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                eu0VarArr[1].setTranslationX((eu0VarArr[0].getMeasuredWidth() * f7) - eu0VarArr[0].getMeasuredWidth());
            }
            lv0Var.M0(lv0Var.getTabProgress());
            float a02 = lv0Var.a0(f7);
            lv0Var.p0 = a02;
            lv0Var.r0.setVisibility((a02 == 0.0f || !lv0Var.D() || lv0Var.q0()) ? 4 : 0);
            if (v0Var == null || lv0Var.D()) {
                lv0Var.o0 = lv0Var.b0(f7);
                lv0Var.t1();
            } else {
                v0Var.setVisibility(lv0Var.v0() ? 8 : 4);
                lv0Var.o0 = 0.0f;
            }
            lv0Var.q1(false);
            if (f7 == 1.0f) {
                eu0 eu0Var = eu0VarArr[0];
                eu0VarArr[0] = eu0VarArr[1];
                eu0VarArr[1] = eu0Var;
                eu0Var.setVisibility(8);
                if (v0Var != null && lv0Var.x0 == 2) {
                    v0Var.setVisibility(lv0Var.v0() ? 8 : 4);
                }
                lv0Var.x0 = 0;
                lv0Var.f1();
            }
        }
    }
}
