package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class qs0 implements lm0 {
    public final /* synthetic */ yu0 a;

    public qs0(yu0 yu0Var) {
        this.a = yu0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final void C() {
        int a2;
        rt0[] rt0VarArr = this.a.k0;
        int i10 = rt0VarArr[0].F;
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
        if ((rt0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < rt0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            rt0VarArr[0].h.x0(0);
            return;
        }
        ok0 ok0Var = rt0VarArr[0].E;
        ok0Var.b = 1;
        ok0Var.c(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.lm0
    public final void C0(float f7) {
        yu0 yu0Var = this.a;
        org.telegram.ui.ActionBar.v0 v0Var = yu0Var.n0;
        rt0[] rt0VarArr = yu0Var.k0;
        if (f7 != 1.0f || rt0VarArr[1].getVisibility() == 0) {
            if (yu0Var.h1) {
                rt0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                rt0VarArr[1].setTranslationX(rt0VarArr[0].getMeasuredWidth() - (rt0VarArr[0].getMeasuredWidth() * f7));
            } else {
                rt0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                rt0VarArr[1].setTranslationX((rt0VarArr[0].getMeasuredWidth() * f7) - rt0VarArr[0].getMeasuredWidth());
            }
            yu0Var.M0(yu0Var.getTabProgress());
            float a02 = yu0Var.a0(f7);
            yu0Var.p0 = a02;
            yu0Var.r0.setVisibility((a02 == 0.0f || !yu0Var.D() || yu0Var.q0()) ? 4 : 0);
            if (v0Var == null || yu0Var.D()) {
                yu0Var.o0 = yu0Var.b0(f7);
                yu0Var.t1();
            } else {
                v0Var.setVisibility(yu0Var.v0() ? 8 : 4);
                yu0Var.o0 = 0.0f;
            }
            yu0Var.q1(false);
            if (f7 == 1.0f) {
                rt0 rt0Var = rt0VarArr[0];
                rt0VarArr[0] = rt0VarArr[1];
                rt0VarArr[1] = rt0Var;
                rt0Var.setVisibility(8);
                if (v0Var != null && yu0Var.x0 == 2) {
                    v0Var.setVisibility(yu0Var.v0() ? 8 : 4);
                }
                yu0Var.x0 = 0;
                yu0Var.f1();
            }
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final void d(int i10, boolean z10) {
        yu0 yu0Var = this.a;
        rt0[] rt0VarArr = yu0Var.k0;
        if (rt0VarArr[0].F == i10) {
            return;
        }
        tr0 tr0Var = yu0Var.W;
        if (tr0Var != null && i10 == 8) {
            tr0Var.n.f(1.0f, 0);
        }
        rt0 rt0Var = rt0VarArr[1];
        rt0Var.F = i10;
        rt0Var.setVisibility(0);
        yu0Var.k0();
        yu0Var.m1(true);
        yu0Var.h1 = z10;
        yu0Var.L0();
        yu0Var.A(!yu0Var.s0(i10), true);
        yu0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean n1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        yu0 yu0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.v1;
        if (n2Var != null && yu0.d0(i10, yu0Var.d1 instanceof TLRPC.TL_channelFull) != null) {
            if (yu0Var.d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(yu0Var.d1.id)), 5)) {
                    profileTab = yu0Var.d1.main_tab;
                    if (profileTab != null || (i10 != yu0.e0(profileTab) && yu0Var.R1 != i10)) {
                        n70 H = n70.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new id(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (yu0Var.j1 == n2Var.getUserConfig().getClientUserId() && (userFull = yu0Var.e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                n70 H2 = n70.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new id(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
