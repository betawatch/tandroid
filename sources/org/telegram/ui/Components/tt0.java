package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class tt0 implements rn0 {
    public final /* synthetic */ bw0 a;

    public tt0(bw0 bw0Var) {
        this.a = bw0Var;
    }

    @Override // org.telegram.ui.Components.rn0
    public final void C() {
        int a2;
        uu0[] uu0VarArr = this.a.k0;
        int i10 = uu0VarArr[0].F;
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
        if ((uu0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < uu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            uu0VarArr[0].h.x0(0);
            return;
        }
        tl0 tl0Var = uu0VarArr[0].E;
        tl0Var.b = 1;
        tl0Var.c(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.rn0
    public final void d(int i10, boolean z10) {
        bw0 bw0Var = this.a;
        uu0[] uu0VarArr = bw0Var.k0;
        if (uu0VarArr[0].F == i10) {
            return;
        }
        ws0 ws0Var = bw0Var.W;
        if (ws0Var != null && i10 == 8) {
            ws0Var.n.f(1.0f, 0);
        }
        uu0 uu0Var = uu0VarArr[1];
        uu0Var.F = i10;
        uu0Var.setVisibility(0);
        bw0Var.k0();
        bw0Var.m1(true);
        bw0Var.h1 = z10;
        bw0Var.L0();
        bw0Var.A(!bw0Var.s0(i10), true);
        bw0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.rn0
    public final boolean k1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        bw0 bw0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = bw0Var.v1;
        if (n2Var != null && bw0.d0(i10, bw0Var.d1 instanceof TLRPC.TL_channelFull) != null) {
            if (bw0Var.d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(bw0Var.d1.id)), 5)) {
                    profileTab = bw0Var.d1.main_tab;
                    if (profileTab != null || (i10 != bw0.e0(profileTab) && bw0Var.R1 != i10)) {
                        p80 H = p80.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new nd(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (bw0Var.j1 == n2Var.getUserConfig().getClientUserId() && (userFull = bw0Var.e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                p80 H2 = p80.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new nd(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.rn0
    public final void u0(float f7) {
        bw0 bw0Var = this.a;
        org.telegram.ui.ActionBar.v0 v0Var = bw0Var.n0;
        uu0[] uu0VarArr = bw0Var.k0;
        if (f7 != 1.0f || uu0VarArr[1].getVisibility() == 0) {
            if (bw0Var.h1) {
                uu0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth() - (uu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                uu0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                uu0VarArr[1].setTranslationX((uu0VarArr[0].getMeasuredWidth() * f7) - uu0VarArr[0].getMeasuredWidth());
            }
            bw0Var.M0(bw0Var.getTabProgress());
            float a02 = bw0Var.a0(f7);
            bw0Var.p0 = a02;
            bw0Var.r0.setVisibility((a02 == 0.0f || !bw0Var.D() || bw0Var.q0()) ? 4 : 0);
            if (v0Var == null || bw0Var.D()) {
                bw0Var.o0 = bw0Var.b0(f7);
                bw0Var.t1();
            } else {
                v0Var.setVisibility(bw0Var.v0() ? 8 : 4);
                bw0Var.o0 = 0.0f;
            }
            bw0Var.q1(false);
            if (f7 == 1.0f) {
                uu0 uu0Var = uu0VarArr[0];
                uu0VarArr[0] = uu0VarArr[1];
                uu0VarArr[1] = uu0Var;
                uu0Var.setVisibility(8);
                if (v0Var != null && bw0Var.x0 == 2) {
                    v0Var.setVisibility(bw0Var.v0() ? 8 : 4);
                }
                bw0Var.x0 = 0;
                bw0Var.f1();
            }
        }
    }
}
