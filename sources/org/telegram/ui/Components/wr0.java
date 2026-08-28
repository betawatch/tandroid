package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wr0 implements wl0 {
    public final /* synthetic */ eu0 a;

    public wr0(eu0 eu0Var) {
        this.a = eu0Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void b(int i9, boolean z10) {
        eu0 eu0Var = this.a;
        xs0[] xs0VarArr = eu0Var.g0;
        if (xs0VarArr[0].B == i9) {
            return;
        }
        zq0 zq0Var = eu0Var.S;
        if (zq0Var != null && i9 == 8) {
            zq0Var.n.f(1.0f, 0);
        }
        xs0 xs0Var = xs0VarArr[1];
        xs0Var.B = i9;
        xs0Var.setVisibility(0);
        eu0Var.k0();
        eu0Var.m1(true);
        eu0Var.d1 = z10;
        eu0Var.L0();
        eu0Var.A(!eu0Var.s0(i9), true);
        eu0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.wl0
    public final boolean k1(int i9, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        eu0 eu0Var = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
        if (o2Var != null && eu0.d0(i9, eu0Var.Z0 instanceof TLRPC.TL_channelFull) != null) {
            if (eu0Var.Z0 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(o2Var.getMessagesController().getChat(Long.valueOf(eu0Var.Z0.id)), 5)) {
                    profileTab = eu0Var.Z0.main_tab;
                    if (profileTab != null || (i9 != eu0.e0(profileTab) && eu0Var.N1 != i9)) {
                        x60 H = x60.H(o2Var, view);
                        H.W(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new qd(this, i9, 8), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (eu0Var.f1 == o2Var.getUserConfig().getClientUserId() && (userFull = eu0Var.a1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                x60 H2 = x60.H(o2Var, view);
                H2.W(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new qd(this, i9, 8), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void p() {
        int a2;
        xs0[] xs0VarArr = this.a.g0;
        int i9 = xs0VarArr[0].B;
        if (i9 != 0) {
            if (i9 != 1 && i9 != 2) {
                if (i9 == 3) {
                    a2 = AndroidUtilities.dp(100.0f);
                } else if (i9 != 4) {
                    a2 = i9 != 5 ? AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(60.0f);
                }
            }
            a2 = AndroidUtilities.dp(56.0f);
        } else {
            a2 = org.telegram.ui.Cells.s7.a(1);
        }
        if ((xs0VarArr[0].B == 0 ? (r5.x.L0() / r0.i1[0]) * a2 : r5.x.L0() * a2) < xs0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            xs0VarArr[0].h.x0(0);
            return;
        }
        c2.y yVar = xs0VarArr[0].A;
        yVar.b = 1;
        yVar.c(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.wl0
    public final void v0(float f10) {
        eu0 eu0Var = this.a;
        org.telegram.ui.ActionBar.w0 w0Var = eu0Var.j0;
        xs0[] xs0VarArr = eu0Var.g0;
        if (f10 != 1.0f || xs0VarArr[1].getVisibility() == 0) {
            if (eu0Var.d1) {
                xs0VarArr[0].setTranslationX((-f10) * r5.getMeasuredWidth());
                xs0VarArr[1].setTranslationX(xs0VarArr[0].getMeasuredWidth() - (xs0VarArr[0].getMeasuredWidth() * f10));
            } else {
                xs0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f10);
                xs0VarArr[1].setTranslationX((xs0VarArr[0].getMeasuredWidth() * f10) - xs0VarArr[0].getMeasuredWidth());
            }
            eu0Var.M0(eu0Var.getTabProgress());
            float a02 = eu0Var.a0(f10);
            eu0Var.l0 = a02;
            eu0Var.n0.setVisibility((a02 == 0.0f || !eu0Var.D() || eu0Var.q0()) ? 4 : 0);
            if (w0Var == null || eu0Var.D()) {
                eu0Var.k0 = eu0Var.b0(f10);
                eu0Var.t1();
            } else {
                w0Var.setVisibility(eu0Var.v0() ? 8 : 4);
                eu0Var.k0 = 0.0f;
            }
            eu0Var.q1(false);
            if (f10 == 1.0f) {
                xs0 xs0Var = xs0VarArr[0];
                xs0VarArr[0] = xs0VarArr[1];
                xs0VarArr[1] = xs0Var;
                xs0Var.setVisibility(8);
                if (w0Var != null && eu0Var.t0 == 2) {
                    w0Var.setVisibility(eu0Var.v0() ? 8 : 4);
                }
                eu0Var.t0 = 0;
                eu0Var.f1();
            }
        }
    }
}
