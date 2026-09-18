package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ct0 implements ym0 {
    public final /* synthetic */ kv0 a;

    public ct0(kv0 kv0Var) {
        this.a = kv0Var;
    }

    @Override // org.telegram.ui.Components.ym0
    public final void C() {
        int a2;
        du0[] du0VarArr = this.a.k0;
        int i10 = du0VarArr[0].F;
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
        if ((du0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < du0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            du0VarArr[0].h.y0(0);
            return;
        }
        zk0 zk0Var = du0VarArr[0].E;
        zk0Var.b = 1;
        zk0Var.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.ym0
    public final void C0(float f7) {
        kv0 kv0Var = this.a;
        org.telegram.ui.ActionBar.v0 v0Var = kv0Var.n0;
        du0[] du0VarArr = kv0Var.k0;
        if (f7 != 1.0f || du0VarArr[1].getVisibility() == 0) {
            if (kv0Var.h1) {
                du0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                du0VarArr[1].setTranslationX(du0VarArr[0].getMeasuredWidth() - (du0VarArr[0].getMeasuredWidth() * f7));
            } else {
                du0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                du0VarArr[1].setTranslationX((du0VarArr[0].getMeasuredWidth() * f7) - du0VarArr[0].getMeasuredWidth());
            }
            kv0Var.M0(kv0Var.getTabProgress());
            float a02 = kv0Var.a0(f7);
            kv0Var.p0 = a02;
            kv0Var.r0.setVisibility((a02 == 0.0f || !kv0Var.D() || kv0Var.q0()) ? 4 : 0);
            if (v0Var == null || kv0Var.D()) {
                kv0Var.o0 = kv0Var.b0(f7);
                kv0Var.t1();
            } else {
                v0Var.setVisibility(kv0Var.v0() ? 8 : 4);
                kv0Var.o0 = 0.0f;
            }
            kv0Var.q1(false);
            if (f7 == 1.0f) {
                du0 du0Var = du0VarArr[0];
                du0VarArr[0] = du0VarArr[1];
                du0VarArr[1] = du0Var;
                du0Var.setVisibility(8);
                if (v0Var != null && kv0Var.x0 == 2) {
                    v0Var.setVisibility(kv0Var.v0() ? 8 : 4);
                }
                kv0Var.x0 = 0;
                kv0Var.f1();
            }
        }
    }

    @Override // org.telegram.ui.Components.ym0
    public final void d(int i10, boolean z10) {
        kv0 kv0Var = this.a;
        du0[] du0VarArr = kv0Var.k0;
        if (du0VarArr[0].F == i10) {
            return;
        }
        fs0 fs0Var = kv0Var.W;
        if (fs0Var != null && i10 == 8) {
            fs0Var.n.f(1.0f, 0);
        }
        du0 du0Var = du0VarArr[1];
        du0Var.F = i10;
        du0Var.setVisibility(0);
        kv0Var.k0();
        kv0Var.m1(true);
        kv0Var.h1 = z10;
        kv0Var.L0();
        kv0Var.A(!kv0Var.s0(i10), true);
        kv0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.ym0
    public final boolean n1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        kv0 kv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = kv0Var.v1;
        if (n2Var != null && kv0.d0(i10, kv0Var.d1 instanceof TLRPC.TL_channelFull) != null) {
            if (kv0Var.d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(kv0Var.d1.id)), 5)) {
                    profileTab = kv0Var.d1.main_tab;
                    if (profileTab != null || (i10 != kv0.e0(profileTab) && kv0Var.R1 != i10)) {
                        w70 H = w70.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new x2(this, i10, 11), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (kv0Var.j1 == n2Var.getUserConfig().getClientUserId() && (userFull = kv0Var.e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                w70 H2 = w70.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new x2(this, i10, 11), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
