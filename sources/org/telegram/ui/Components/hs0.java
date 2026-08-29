package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hs0 implements jm0 {
    public final /* synthetic */ qu0 a;

    public hs0(qu0 qu0Var) {
        this.a = qu0Var;
    }

    @Override // org.telegram.ui.Components.jm0
    public final void e(int i10, boolean z10) {
        qu0 qu0Var = this.a;
        it0[] it0VarArr = qu0Var.g0;
        if (it0VarArr[0].B == i10) {
            return;
        }
        kr0 kr0Var = qu0Var.S;
        if (kr0Var != null && i10 == 8) {
            kr0Var.n.f(1.0f, 0);
        }
        it0 it0Var = it0VarArr[1];
        it0Var.B = i10;
        it0Var.setVisibility(0);
        qu0Var.k0();
        qu0Var.m1(true);
        qu0Var.d1 = z10;
        qu0Var.L0();
        qu0Var.A(!qu0Var.s0(i10), true);
        qu0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.jm0
    public final boolean i1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        qu0 qu0Var = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
        if (o2Var != null && qu0.d0(i10, qu0Var.Z0 instanceof TLRPC.TL_channelFull) != null) {
            if (qu0Var.Z0 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(o2Var.getMessagesController().getChat(Long.valueOf(qu0Var.Z0.id)), 5)) {
                    profileTab = qu0Var.Z0.main_tab;
                    if (profileTab != null || (i10 != qu0.e0(profileTab) && qu0Var.N1 != i10)) {
                        j70 H = j70.H(o2Var, view);
                        H.W(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new i8(this, i10, 10), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (qu0Var.f1 == o2Var.getUserConfig().getClientUserId() && (userFull = qu0Var.a1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                j70 H2 = j70.H(o2Var, view);
                H2.W(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new i8(this, i10, 10), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jm0
    public final void u0(float f9) {
        qu0 qu0Var = this.a;
        org.telegram.ui.ActionBar.w0 w0Var = qu0Var.j0;
        it0[] it0VarArr = qu0Var.g0;
        if (f9 != 1.0f || it0VarArr[1].getVisibility() == 0) {
            if (qu0Var.d1) {
                it0VarArr[0].setTranslationX((-f9) * r5.getMeasuredWidth());
                it0VarArr[1].setTranslationX(it0VarArr[0].getMeasuredWidth() - (it0VarArr[0].getMeasuredWidth() * f9));
            } else {
                it0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f9);
                it0VarArr[1].setTranslationX((it0VarArr[0].getMeasuredWidth() * f9) - it0VarArr[0].getMeasuredWidth());
            }
            qu0Var.M0(qu0Var.getTabProgress());
            float a02 = qu0Var.a0(f9);
            qu0Var.l0 = a02;
            qu0Var.n0.setVisibility((a02 == 0.0f || !qu0Var.D() || qu0Var.q0()) ? 4 : 0);
            if (w0Var == null || qu0Var.D()) {
                qu0Var.k0 = qu0Var.b0(f9);
                qu0Var.t1();
            } else {
                w0Var.setVisibility(qu0Var.v0() ? 8 : 4);
                qu0Var.k0 = 0.0f;
            }
            qu0Var.q1(false);
            if (f9 == 1.0f) {
                it0 it0Var = it0VarArr[0];
                it0VarArr[0] = it0VarArr[1];
                it0VarArr[1] = it0Var;
                it0Var.setVisibility(8);
                if (w0Var != null && qu0Var.t0 == 2) {
                    w0Var.setVisibility(qu0Var.v0() ? 8 : 4);
                }
                qu0Var.t0 = 0;
                qu0Var.f1();
            }
        }
    }

    @Override // org.telegram.ui.Components.jm0
    public final void x() {
        int a2;
        it0[] it0VarArr = this.a.g0;
        int i10 = it0VarArr[0].B;
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
            a2 = org.telegram.ui.Cells.q7.a(1);
        }
        if ((it0VarArr[0].B == 0 ? (r5.x.L0() / r0.i1[0]) * a2 : r5.x.L0() * a2) < it0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            it0VarArr[0].h.x0(0);
            return;
        }
        c2.z zVar = it0VarArr[0].A;
        zVar.b = 1;
        zVar.c(0, 0, false, false);
    }
}
