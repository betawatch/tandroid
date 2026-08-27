package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xr0 implements zl0 {
    public final /* synthetic */ hu0 a;

    public xr0(hu0 hu0Var) {
        this.a = hu0Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void b(int i10, boolean z10) {
        hu0 hu0Var = this.a;
        zs0[] zs0VarArr = hu0Var.g0;
        if (zs0VarArr[0].B == i10) {
            return;
        }
        ar0 ar0Var = hu0Var.S;
        if (ar0Var != null && i10 == 8) {
            ar0Var.n.f(1.0f, 0);
        }
        zs0 zs0Var = zs0VarArr[1];
        zs0Var.B = i10;
        zs0Var.setVisibility(0);
        hu0Var.k0();
        hu0Var.m1(true);
        hu0Var.d1 = z10;
        hu0Var.L0();
        hu0Var.A(!hu0Var.s0(i10), true);
        hu0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean l1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        hu0 hu0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
        if (n2Var != null && hu0.d0(i10, hu0Var.Z0 instanceof TLRPC.TL_channelFull) != null) {
            if (hu0Var.Z0 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(hu0Var.Z0.id)), 5)) {
                    profileTab = hu0Var.Z0.main_tab;
                    if (profileTab != null || (i10 != hu0.e0(profileTab) && hu0Var.N1 != i10)) {
                        b70 H = b70.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new xl(this, i10, 7), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (hu0Var.f1 == n2Var.getUserConfig().getClientUserId() && (userFull = hu0Var.a1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                b70 H2 = b70.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new xl(this, i10, 7), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void o0(float f10) {
        hu0 hu0Var = this.a;
        org.telegram.ui.ActionBar.v0 v0Var = hu0Var.j0;
        zs0[] zs0VarArr = hu0Var.g0;
        if (f10 != 1.0f || zs0VarArr[1].getVisibility() == 0) {
            if (hu0Var.d1) {
                zs0VarArr[0].setTranslationX((-f10) * r5.getMeasuredWidth());
                zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth() - (zs0VarArr[0].getMeasuredWidth() * f10));
            } else {
                zs0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f10);
                zs0VarArr[1].setTranslationX((zs0VarArr[0].getMeasuredWidth() * f10) - zs0VarArr[0].getMeasuredWidth());
            }
            hu0Var.M0(hu0Var.getTabProgress());
            float a02 = hu0Var.a0(f10);
            hu0Var.l0 = a02;
            hu0Var.n0.setVisibility((a02 == 0.0f || !hu0Var.D() || hu0Var.q0()) ? 4 : 0);
            if (v0Var == null || hu0Var.D()) {
                hu0Var.k0 = hu0Var.b0(f10);
                hu0Var.t1();
            } else {
                v0Var.setVisibility(hu0Var.v0() ? 8 : 4);
                hu0Var.k0 = 0.0f;
            }
            hu0Var.q1(false);
            if (f10 == 1.0f) {
                zs0 zs0Var = zs0VarArr[0];
                zs0VarArr[0] = zs0VarArr[1];
                zs0VarArr[1] = zs0Var;
                zs0Var.setVisibility(8);
                if (v0Var != null && hu0Var.t0 == 2) {
                    v0Var.setVisibility(hu0Var.v0() ? 8 : 4);
                }
                hu0Var.t0 = 0;
                hu0Var.f1();
            }
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public final void w() {
        int a2;
        zs0[] zs0VarArr = this.a.g0;
        int i10 = zs0VarArr[0].B;
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
            a2 = org.telegram.ui.Cells.p7.a(1);
        }
        if ((zs0VarArr[0].B == 0 ? (r5.x.L0() / r0.i1[0]) * a2 : r5.x.L0() * a2) < zs0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            zs0VarArr[0].h.x0(0);
            return;
        }
        c2.x xVar = zs0VarArr[0].A;
        xVar.b = 1;
        xVar.d(0, 0, false, false);
    }
}
