package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class rs0 implements mm0 {
    public final /* synthetic */ zu0 a;

    public rs0(zu0 zu0Var) {
        this.a = zu0Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final void C() {
        int a2;
        st0[] st0VarArr = this.a.k0;
        int i10 = st0VarArr[0].F;
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
        if ((st0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < st0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            st0VarArr[0].h.y0(0);
            return;
        }
        pk0 pk0Var = st0VarArr[0].E;
        pk0Var.b = 1;
        pk0Var.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.mm0
    public final void C0(float f7) {
        zu0 zu0Var = this.a;
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.n0;
        st0[] st0VarArr = zu0Var.k0;
        if (f7 != 1.0f || st0VarArr[1].getVisibility() == 0) {
            if (zu0Var.h1) {
                st0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                st0VarArr[1].setTranslationX(st0VarArr[0].getMeasuredWidth() - (st0VarArr[0].getMeasuredWidth() * f7));
            } else {
                st0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                st0VarArr[1].setTranslationX((st0VarArr[0].getMeasuredWidth() * f7) - st0VarArr[0].getMeasuredWidth());
            }
            zu0Var.M0(zu0Var.getTabProgress());
            float a02 = zu0Var.a0(f7);
            zu0Var.p0 = a02;
            zu0Var.r0.setVisibility((a02 == 0.0f || !zu0Var.D() || zu0Var.q0()) ? 4 : 0);
            if (w0Var == null || zu0Var.D()) {
                zu0Var.o0 = zu0Var.b0(f7);
                zu0Var.t1();
            } else {
                w0Var.setVisibility(zu0Var.v0() ? 8 : 4);
                zu0Var.o0 = 0.0f;
            }
            zu0Var.q1(false);
            if (f7 == 1.0f) {
                st0 st0Var = st0VarArr[0];
                st0VarArr[0] = st0VarArr[1];
                st0VarArr[1] = st0Var;
                st0Var.setVisibility(8);
                if (w0Var != null && zu0Var.x0 == 2) {
                    w0Var.setVisibility(zu0Var.v0() ? 8 : 4);
                }
                zu0Var.x0 = 0;
                zu0Var.f1();
            }
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final void d(int i10, boolean z10) {
        zu0 zu0Var = this.a;
        st0[] st0VarArr = zu0Var.k0;
        if (st0VarArr[0].F == i10) {
            return;
        }
        ur0 ur0Var = zu0Var.W;
        if (ur0Var != null && i10 == 8) {
            ur0Var.n.f(1.0f, 0);
        }
        st0 st0Var = st0VarArr[1];
        st0Var.F = i10;
        st0Var.setVisibility(0);
        zu0Var.k0();
        zu0Var.m1(true);
        zu0Var.h1 = z10;
        zu0Var.L0();
        zu0Var.A(!zu0Var.s0(i10), true);
        zu0Var.q1(true);
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean n1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        zu0 zu0Var = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
        if (o2Var != null && zu0.d0(i10, zu0Var.d1 instanceof TLRPC.TL_channelFull) != null) {
            if (zu0Var.d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(o2Var.getMessagesController().getChat(Long.valueOf(zu0Var.d1.id)), 5)) {
                    profileTab = zu0Var.d1.main_tab;
                    if (profileTab != null || (i10 != zu0.e0(profileTab) && zu0Var.R1 != i10)) {
                        n70 H = n70.H(o2Var, view);
                        H.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new id(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (zu0Var.j1 == o2Var.getUserConfig().getClientUserId() && (userFull = zu0Var.e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                n70 H2 = n70.H(o2Var, view);
                H2.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new id(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
