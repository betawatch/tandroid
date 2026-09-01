package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class qs0 implements um0 {
    public final /* synthetic */ zu0 a;

    public qs0(zu0 zu0Var) {
        this.a = zu0Var;
    }

    @Override // org.telegram.ui.Components.um0
    public final void B() {
        int a2;
        rt0[] rt0VarArr = this.a.h0;
        int i10 = rt0VarArr[0].C;
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
            a2 = org.telegram.ui.Cells.s7.a(1);
        }
        if ((rt0VarArr[0].C == 0 ? (r5.x.L0() / r0.j1[0]) * a2 : r5.x.L0() * a2) < rt0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            rt0VarArr[0].h.x0(0);
            return;
        }
        c2.y yVar = rt0VarArr[0].B;
        yVar.b = 1;
        yVar.c(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.um0
    public final void f(int i10, boolean z4) {
        zu0 zu0Var = this.a;
        rt0[] rt0VarArr = zu0Var.h0;
        if (rt0VarArr[0].C == i10) {
            return;
        }
        tr0 tr0Var = zu0Var.T;
        if (tr0Var != null && i10 == 8) {
            tr0Var.n.f(1.0f, 0);
        }
        rt0 rt0Var = rt0VarArr[1];
        rt0Var.C = i10;
        rt0Var.setVisibility(0);
        zu0Var.k0();
        zu0Var.m1(true);
        zu0Var.e1 = z4;
        zu0Var.L0();
        zu0Var.A(!zu0Var.s0(i10), true);
        zu0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.um0
    public final boolean j1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        zu0 zu0Var = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.s1;
        if (p2Var != null && zu0.d0(i10, zu0Var.a1 instanceof TLRPC.TL_channelFull) != null) {
            if (zu0Var.a1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(p2Var.getMessagesController().getChat(Long.valueOf(zu0Var.a1.id)), 5)) {
                    profileTab = zu0Var.a1.main_tab;
                    if (profileTab != null || (i10 != zu0.e0(profileTab) && zu0Var.O1 != i10)) {
                        q70 H = q70.H(p2Var, view);
                        H.W(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new jm(this, i10, 7), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (zu0Var.g1 == p2Var.getUserConfig().getClientUserId() && (userFull = zu0Var.b1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                q70 H2 = q70.H(p2Var, view);
                H2.W(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new jm(this, i10, 7), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.um0
    public final void w0(float f10) {
        zu0 zu0Var = this.a;
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.k0;
        rt0[] rt0VarArr = zu0Var.h0;
        if (f10 != 1.0f || rt0VarArr[1].getVisibility() == 0) {
            if (zu0Var.e1) {
                rt0VarArr[0].setTranslationX((-f10) * r5.getMeasuredWidth());
                rt0VarArr[1].setTranslationX(rt0VarArr[0].getMeasuredWidth() - (rt0VarArr[0].getMeasuredWidth() * f10));
            } else {
                rt0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f10);
                rt0VarArr[1].setTranslationX((rt0VarArr[0].getMeasuredWidth() * f10) - rt0VarArr[0].getMeasuredWidth());
            }
            zu0Var.M0(zu0Var.getTabProgress());
            float a02 = zu0Var.a0(f10);
            zu0Var.m0 = a02;
            zu0Var.o0.setVisibility((a02 == 0.0f || !zu0Var.D() || zu0Var.q0()) ? 4 : 0);
            if (w0Var == null || zu0Var.D()) {
                zu0Var.l0 = zu0Var.b0(f10);
                zu0Var.t1();
            } else {
                w0Var.setVisibility(zu0Var.v0() ? 8 : 4);
                zu0Var.l0 = 0.0f;
            }
            zu0Var.q1(false);
            if (f10 == 1.0f) {
                rt0 rt0Var = rt0VarArr[0];
                rt0VarArr[0] = rt0VarArr[1];
                rt0VarArr[1] = rt0Var;
                rt0Var.setVisibility(8);
                if (w0Var != null && zu0Var.u0 == 2) {
                    w0Var.setVisibility(zu0Var.v0() ? 8 : 4);
                }
                zu0Var.u0 = 0;
                zu0Var.f1();
            }
        }
    }
}
