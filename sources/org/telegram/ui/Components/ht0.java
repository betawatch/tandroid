package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ht0 implements dn0 {
    public final /* synthetic */ pv0 a;

    public ht0(pv0 pv0Var) {
        this.a = pv0Var;
    }

    @Override // org.telegram.ui.Components.dn0
    public final void C() {
        int a2;
        iu0[] iu0VarArr = this.a.k0;
        int i10 = iu0VarArr[0].F;
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
        if ((iu0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < iu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            iu0VarArr[0].h.y0(0);
            return;
        }
        bl0 bl0Var = iu0VarArr[0].E;
        bl0Var.b = 1;
        bl0Var.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.dn0
    public final void E0(float f7) {
        pv0 pv0Var = this.a;
        org.telegram.ui.ActionBar.v0 v0Var = pv0Var.n0;
        iu0[] iu0VarArr = pv0Var.k0;
        if (f7 != 1.0f || iu0VarArr[1].getVisibility() == 0) {
            if (pv0Var.h1) {
                iu0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                iu0VarArr[1].setTranslationX(iu0VarArr[0].getMeasuredWidth() - (iu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                iu0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                iu0VarArr[1].setTranslationX((iu0VarArr[0].getMeasuredWidth() * f7) - iu0VarArr[0].getMeasuredWidth());
            }
            pv0Var.M0(pv0Var.getTabProgress());
            float a02 = pv0Var.a0(f7);
            pv0Var.p0 = a02;
            pv0Var.r0.setVisibility((a02 == 0.0f || !pv0Var.D() || pv0Var.q0()) ? 4 : 0);
            if (v0Var == null || pv0Var.D()) {
                pv0Var.o0 = pv0Var.b0(f7);
                pv0Var.t1();
            } else {
                v0Var.setVisibility(pv0Var.v0() ? 8 : 4);
                pv0Var.o0 = 0.0f;
            }
            pv0Var.q1(false);
            if (f7 == 1.0f) {
                iu0 iu0Var = iu0VarArr[0];
                iu0VarArr[0] = iu0VarArr[1];
                iu0VarArr[1] = iu0Var;
                iu0Var.setVisibility(8);
                if (v0Var != null && pv0Var.x0 == 2) {
                    v0Var.setVisibility(pv0Var.v0() ? 8 : 4);
                }
                pv0Var.x0 = 0;
                pv0Var.f1();
            }
        }
    }

    @Override // org.telegram.ui.Components.dn0
    public final void b(int i10, boolean z10) {
        pv0 pv0Var = this.a;
        iu0[] iu0VarArr = pv0Var.k0;
        if (iu0VarArr[0].F == i10) {
            return;
        }
        ks0 ks0Var = pv0Var.W;
        if (ks0Var != null && i10 == 8) {
            ks0Var.n.f(1.0f, 0);
        }
        iu0 iu0Var = iu0VarArr[1];
        iu0Var.F = i10;
        iu0Var.setVisibility(0);
        pv0Var.k0();
        pv0Var.m1(true);
        pv0Var.h1 = z10;
        pv0Var.L0();
        pv0Var.A(!pv0Var.s0(i10), true);
        pv0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.dn0
    public final boolean o1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        pv0 pv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = pv0Var.v1;
        if (n2Var != null && pv0.d0(i10, pv0Var.d1 instanceof TLRPC.TL_channelFull) != null) {
            if (pv0Var.d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(pv0Var.d1.id)), 5)) {
                    profileTab = pv0Var.d1.main_tab;
                    if (profileTab != null || (i10 != pv0.e0(profileTab) && pv0Var.R1 != i10)) {
                        b80 H = b80.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ld(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (pv0Var.j1 == n2Var.getUserConfig().getClientUserId() && (userFull = pv0Var.e1) != null) {
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
