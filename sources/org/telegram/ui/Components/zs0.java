package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zs0 implements vm0 {
    public final /* synthetic */ iv0 a;

    public zs0(iv0 iv0Var) {
        this.a = iv0Var;
    }

    @Override // org.telegram.ui.Components.vm0
    public final void B() {
        int a2;
        au0[] au0VarArr = this.a.k0;
        int i10 = au0VarArr[0].F;
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
        if ((au0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < au0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            au0VarArr[0].h.x0(0);
            return;
        }
        yk0 yk0Var = au0VarArr[0].E;
        yk0Var.b = 1;
        yk0Var.c(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.vm0
    public final void d(int i10, boolean z10) {
        iv0 iv0Var = this.a;
        au0[] au0VarArr = iv0Var.k0;
        if (au0VarArr[0].F == i10) {
            return;
        }
        cs0 cs0Var = iv0Var.W;
        if (cs0Var != null && i10 == 8) {
            cs0Var.n.f(1.0f, 0);
        }
        au0 au0Var = au0VarArr[1];
        au0Var.F = i10;
        au0Var.setVisibility(0);
        iv0Var.k0();
        iv0Var.m1(true);
        iv0Var.h1 = z10;
        iv0Var.L0();
        iv0Var.A(!iv0Var.s0(i10), true);
        iv0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.vm0
    public final boolean m1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        iv0 iv0Var = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.v1;
        if (p2Var != null && iv0.d0(i10, iv0Var.d1 instanceof TLRPC.TL_channelFull) != null) {
            if (iv0Var.d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(p2Var.getMessagesController().getChat(Long.valueOf(iv0Var.d1.id)), 5)) {
                    profileTab = iv0Var.d1.main_tab;
                    if (profileTab != null || (i10 != iv0.e0(profileTab) && iv0Var.R1 != i10)) {
                        w70 H = w70.H(p2Var, view);
                        H.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new zd(this, i10, 8), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (iv0Var.j1 == p2Var.getUserConfig().getClientUserId() && (userFull = iv0Var.e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                w70 H2 = w70.H(p2Var, view);
                H2.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new zd(this, i10, 8), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.vm0
    public final void v0(float f7) {
        iv0 iv0Var = this.a;
        org.telegram.ui.ActionBar.w0 w0Var = iv0Var.n0;
        au0[] au0VarArr = iv0Var.k0;
        if (f7 != 1.0f || au0VarArr[1].getVisibility() == 0) {
            if (iv0Var.h1) {
                au0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                au0VarArr[1].setTranslationX(au0VarArr[0].getMeasuredWidth() - (au0VarArr[0].getMeasuredWidth() * f7));
            } else {
                au0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                au0VarArr[1].setTranslationX((au0VarArr[0].getMeasuredWidth() * f7) - au0VarArr[0].getMeasuredWidth());
            }
            iv0Var.M0(iv0Var.getTabProgress());
            float a02 = iv0Var.a0(f7);
            iv0Var.p0 = a02;
            iv0Var.r0.setVisibility((a02 == 0.0f || !iv0Var.D() || iv0Var.q0()) ? 4 : 0);
            if (w0Var == null || iv0Var.D()) {
                iv0Var.o0 = iv0Var.b0(f7);
                iv0Var.t1();
            } else {
                w0Var.setVisibility(iv0Var.v0() ? 8 : 4);
                iv0Var.o0 = 0.0f;
            }
            iv0Var.q1(false);
            if (f7 == 1.0f) {
                au0 au0Var = au0VarArr[0];
                au0VarArr[0] = au0VarArr[1];
                au0VarArr[1] = au0Var;
                au0Var.setVisibility(8);
                if (w0Var != null && iv0Var.x0 == 2) {
                    w0Var.setVisibility(iv0Var.v0() ? 8 : 4);
                }
                iv0Var.x0 = 0;
                iv0Var.f1();
            }
        }
    }
}
