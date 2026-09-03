package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ps0 implements tm0 {
    public final /* synthetic */ yu0 a;

    public ps0(yu0 yu0Var) {
        this.a = yu0Var;
    }

    @Override // org.telegram.ui.Components.tm0
    public final void B() {
        int a2;
        qt0[] qt0VarArr = this.a.h0;
        int i10 = qt0VarArr[0].C;
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
        if ((qt0VarArr[0].C == 0 ? (r5.x.L0() / r0.j1[0]) * a2 : r5.x.L0() * a2) < qt0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            qt0VarArr[0].h.x0(0);
            return;
        }
        c2.y yVar = qt0VarArr[0].B;
        yVar.b = 1;
        yVar.c(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.tm0
    public final void f(int i10, boolean z4) {
        yu0 yu0Var = this.a;
        qt0[] qt0VarArr = yu0Var.h0;
        if (qt0VarArr[0].C == i10) {
            return;
        }
        sr0 sr0Var = yu0Var.T;
        if (sr0Var != null && i10 == 8) {
            sr0Var.n.f(1.0f, 0);
        }
        qt0 qt0Var = qt0VarArr[1];
        qt0Var.C = i10;
        qt0Var.setVisibility(0);
        yu0Var.k0();
        yu0Var.m1(true);
        yu0Var.e1 = z4;
        yu0Var.L0();
        yu0Var.A(!yu0Var.s0(i10), true);
        yu0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.tm0
    public final boolean j1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        yu0 yu0Var = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
        if (p2Var != null && yu0.d0(i10, yu0Var.a1 instanceof TLRPC.TL_channelFull) != null) {
            if (yu0Var.a1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(p2Var.getMessagesController().getChat(Long.valueOf(yu0Var.a1.id)), 5)) {
                    profileTab = yu0Var.a1.main_tab;
                    if (profileTab != null || (i10 != yu0.e0(profileTab) && yu0Var.O1 != i10)) {
                        q70 H = q70.H(p2Var, view);
                        H.W(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new im(this, i10, 7), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (yu0Var.g1 == p2Var.getUserConfig().getClientUserId() && (userFull = yu0Var.b1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                q70 H2 = q70.H(p2Var, view);
                H2.W(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new im(this, i10, 7), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tm0
    public final void w0(float f10) {
        yu0 yu0Var = this.a;
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.k0;
        qt0[] qt0VarArr = yu0Var.h0;
        if (f10 != 1.0f || qt0VarArr[1].getVisibility() == 0) {
            if (yu0Var.e1) {
                qt0VarArr[0].setTranslationX((-f10) * r5.getMeasuredWidth());
                qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() - (qt0VarArr[0].getMeasuredWidth() * f10));
            } else {
                qt0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f10);
                qt0VarArr[1].setTranslationX((qt0VarArr[0].getMeasuredWidth() * f10) - qt0VarArr[0].getMeasuredWidth());
            }
            yu0Var.M0(yu0Var.getTabProgress());
            float a02 = yu0Var.a0(f10);
            yu0Var.m0 = a02;
            yu0Var.o0.setVisibility((a02 == 0.0f || !yu0Var.D() || yu0Var.q0()) ? 4 : 0);
            if (w0Var == null || yu0Var.D()) {
                yu0Var.l0 = yu0Var.b0(f10);
                yu0Var.t1();
            } else {
                w0Var.setVisibility(yu0Var.v0() ? 8 : 4);
                yu0Var.l0 = 0.0f;
            }
            yu0Var.q1(false);
            if (f10 == 1.0f) {
                qt0 qt0Var = qt0VarArr[0];
                qt0VarArr[0] = qt0VarArr[1];
                qt0VarArr[1] = qt0Var;
                qt0Var.setVisibility(8);
                if (w0Var != null && yu0Var.u0 == 2) {
                    w0Var.setVisibility(yu0Var.v0() ? 8 : 4);
                }
                yu0Var.u0 = 0;
                yu0Var.f1();
            }
        }
    }
}
