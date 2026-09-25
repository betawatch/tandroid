package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class bt0 implements xm0 {
    public final /* synthetic */ jv0 a;

    public bt0(jv0 jv0Var) {
        this.a = jv0Var;
    }

    @Override // org.telegram.ui.Components.xm0
    public final void C() {
        int a2;
        cu0[] cu0VarArr = this.a.k0;
        int i10 = cu0VarArr[0].F;
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
        if ((cu0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < cu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            cu0VarArr[0].h.x0(0);
            return;
        }
        zk0 zk0Var = cu0VarArr[0].E;
        zk0Var.b = 1;
        zk0Var.c(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.xm0
    public final void C0(float f7) {
        jv0 jv0Var = this.a;
        org.telegram.ui.ActionBar.u0 u0Var = jv0Var.n0;
        cu0[] cu0VarArr = jv0Var.k0;
        if (f7 != 1.0f || cu0VarArr[1].getVisibility() == 0) {
            if (jv0Var.h1) {
                cu0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                cu0VarArr[1].setTranslationX(cu0VarArr[0].getMeasuredWidth() - (cu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                cu0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                cu0VarArr[1].setTranslationX((cu0VarArr[0].getMeasuredWidth() * f7) - cu0VarArr[0].getMeasuredWidth());
            }
            jv0Var.M0(jv0Var.getTabProgress());
            float a02 = jv0Var.a0(f7);
            jv0Var.p0 = a02;
            jv0Var.r0.setVisibility((a02 == 0.0f || !jv0Var.D() || jv0Var.q0()) ? 4 : 0);
            if (u0Var == null || jv0Var.D()) {
                jv0Var.o0 = jv0Var.b0(f7);
                jv0Var.t1();
            } else {
                u0Var.setVisibility(jv0Var.v0() ? 8 : 4);
                jv0Var.o0 = 0.0f;
            }
            jv0Var.q1(false);
            if (f7 == 1.0f) {
                cu0 cu0Var = cu0VarArr[0];
                cu0VarArr[0] = cu0VarArr[1];
                cu0VarArr[1] = cu0Var;
                cu0Var.setVisibility(8);
                if (u0Var != null && jv0Var.x0 == 2) {
                    u0Var.setVisibility(jv0Var.v0() ? 8 : 4);
                }
                jv0Var.x0 = 0;
                jv0Var.f1();
            }
        }
    }

    @Override // org.telegram.ui.Components.xm0
    public final void d(int i10, boolean z10) {
        jv0 jv0Var = this.a;
        cu0[] cu0VarArr = jv0Var.k0;
        if (cu0VarArr[0].F == i10) {
            return;
        }
        es0 es0Var = jv0Var.W;
        if (es0Var != null && i10 == 8) {
            es0Var.n.f(1.0f, 0);
        }
        cu0 cu0Var = cu0VarArr[1];
        cu0Var.F = i10;
        cu0Var.setVisibility(0);
        jv0Var.k0();
        jv0Var.m1(true);
        jv0Var.h1 = z10;
        jv0Var.L0();
        jv0Var.A(!jv0Var.s0(i10), true);
        jv0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.xm0
    public final boolean n1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        jv0 jv0Var = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.v1;
        if (m2Var != null && jv0.d0(i10, jv0Var.d1 instanceof TLRPC.TL_channelFull) != null) {
            if (jv0Var.d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(m2Var.getMessagesController().getChat(Long.valueOf(jv0Var.d1.id)), 5)) {
                    profileTab = jv0Var.d1.main_tab;
                    if (profileTab != null || (i10 != jv0.e0(profileTab) && jv0Var.R1 != i10)) {
                        y70 H = y70.H(m2Var, view);
                        H.W(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ld(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (jv0Var.j1 == m2Var.getUserConfig().getClientUserId() && (userFull = jv0Var.e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                y70 H2 = y70.H(m2Var, view);
                H2.W(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ld(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
