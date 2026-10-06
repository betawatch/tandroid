package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class it0 implements dn0 {
    public final /* synthetic */ qv0 a;

    public it0(qv0 qv0Var) {
        this.a = qv0Var;
    }

    @Override // org.telegram.ui.Components.dn0
    public final void C() {
        int a2;
        ju0[] ju0VarArr = this.a.k0;
        int i10 = ju0VarArr[0].F;
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
        if ((ju0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < ju0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ju0VarArr[0].h.y0(0);
            return;
        }
        bl0 bl0Var = ju0VarArr[0].E;
        bl0Var.b = 1;
        bl0Var.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.dn0
    public final void E0(float f7) {
        qv0 qv0Var = this.a;
        org.telegram.ui.ActionBar.v0 v0Var = qv0Var.n0;
        ju0[] ju0VarArr = qv0Var.k0;
        if (f7 != 1.0f || ju0VarArr[1].getVisibility() == 0) {
            if (qv0Var.h1) {
                ju0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                ju0VarArr[1].setTranslationX(ju0VarArr[0].getMeasuredWidth() - (ju0VarArr[0].getMeasuredWidth() * f7));
            } else {
                ju0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                ju0VarArr[1].setTranslationX((ju0VarArr[0].getMeasuredWidth() * f7) - ju0VarArr[0].getMeasuredWidth());
            }
            qv0Var.M0(qv0Var.getTabProgress());
            float a02 = qv0Var.a0(f7);
            qv0Var.p0 = a02;
            qv0Var.r0.setVisibility((a02 == 0.0f || !qv0Var.D() || qv0Var.q0()) ? 4 : 0);
            if (v0Var == null || qv0Var.D()) {
                qv0Var.o0 = qv0Var.b0(f7);
                qv0Var.t1();
            } else {
                v0Var.setVisibility(qv0Var.v0() ? 8 : 4);
                qv0Var.o0 = 0.0f;
            }
            qv0Var.q1(false);
            if (f7 == 1.0f) {
                ju0 ju0Var = ju0VarArr[0];
                ju0VarArr[0] = ju0VarArr[1];
                ju0VarArr[1] = ju0Var;
                ju0Var.setVisibility(8);
                if (v0Var != null && qv0Var.x0 == 2) {
                    v0Var.setVisibility(qv0Var.v0() ? 8 : 4);
                }
                qv0Var.x0 = 0;
                qv0Var.f1();
            }
        }
    }

    @Override // org.telegram.ui.Components.dn0
    public final void b(int i10, boolean z10) {
        qv0 qv0Var = this.a;
        ju0[] ju0VarArr = qv0Var.k0;
        if (ju0VarArr[0].F == i10) {
            return;
        }
        ls0 ls0Var = qv0Var.W;
        if (ls0Var != null && i10 == 8) {
            ls0Var.n.f(1.0f, 0);
        }
        ju0 ju0Var = ju0VarArr[1];
        ju0Var.F = i10;
        ju0Var.setVisibility(0);
        qv0Var.k0();
        qv0Var.m1(true);
        qv0Var.h1 = z10;
        qv0Var.L0();
        qv0Var.A(!qv0Var.s0(i10), true);
        qv0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.dn0
    public final boolean o1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        qv0 qv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.v1;
        if (n2Var != null && qv0.d0(i10, qv0Var.d1 instanceof TLRPC.TL_channelFull) != null) {
            if (qv0Var.d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(qv0Var.d1.id)), 5)) {
                    profileTab = qv0Var.d1.main_tab;
                    if (profileTab != null || (i10 != qv0.e0(profileTab) && qv0Var.R1 != i10)) {
                        b80 H = b80.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ld(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (qv0Var.j1 == n2Var.getUserConfig().getClientUserId() && (userFull = qv0Var.e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                b80 H2 = b80.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ld(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
