package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class lt0 implements jn0 {
    public final /* synthetic */ tv0 a;

    public lt0(tv0 tv0Var) {
        this.a = tv0Var;
    }

    @Override // org.telegram.ui.Components.jn0
    public final boolean b1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        tv0 tv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = tv0Var.v1;
        if (n2Var != null) {
            boolean t02 = tv0Var.t0();
            if (tv0.e0(i10, t02) != null) {
                if (t02) {
                    if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(tv0Var.d1.id)), 5)) {
                        profileTab = tv0Var.d1.main_tab;
                        if (profileTab != null || (i10 != tv0.f0(profileTab) && tv0Var.R1 != i10)) {
                            i80 H = i80.H(n2Var, view);
                            H.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false)));
                            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.z8(this, t02, i10, 4), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (tv0Var.j1 == n2Var.getUserConfig().getClientUserId() && (userFull = tv0Var.e1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    i80 H2 = i80.H(n2Var, view);
                    H2.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false)));
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.z8(this, t02, i10, 4), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jn0
    public final void f(int i10, boolean z10) {
        tv0 tv0Var = this.a;
        mu0[] mu0VarArr = tv0Var.k0;
        if (mu0VarArr[0].F == i10) {
            return;
        }
        os0 os0Var = tv0Var.W;
        if (os0Var != null && i10 == 8) {
            os0Var.n.f(1.0f, 0);
        }
        mu0 mu0Var = mu0VarArr[1];
        mu0Var.F = i10;
        mu0Var.setVisibility(0);
        tv0Var.l0();
        tv0Var.o1(true);
        tv0Var.h1 = z10;
        tv0Var.N0();
        tv0Var.A(!tv0Var.u0(i10), true);
        tv0Var.s1(true);
    }

    @Override // org.telegram.ui.Components.jn0
    public final void k0(float f7) {
        tv0 tv0Var = this.a;
        org.telegram.ui.ActionBar.u0 u0Var = tv0Var.n0;
        mu0[] mu0VarArr = tv0Var.k0;
        if (f7 != 1.0f || mu0VarArr[1].getVisibility() == 0) {
            if (tv0Var.h1) {
                mu0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                mu0VarArr[1].setTranslationX(mu0VarArr[0].getMeasuredWidth() - (mu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                mu0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                mu0VarArr[1].setTranslationX((mu0VarArr[0].getMeasuredWidth() * f7) - mu0VarArr[0].getMeasuredWidth());
            }
            tv0Var.O0(tv0Var.getTabProgress());
            float a02 = tv0Var.a0(f7);
            tv0Var.p0 = a02;
            tv0Var.r0.setVisibility((a02 == 0.0f || !tv0Var.D() || tv0Var.r0()) ? 4 : 0);
            if (u0Var == null || tv0Var.D()) {
                tv0Var.o0 = tv0Var.b0(f7);
                tv0Var.w1();
            } else {
                u0Var.setVisibility(tv0Var.x0() ? 8 : 4);
                tv0Var.o0 = 0.0f;
            }
            tv0Var.s1(false);
            if (f7 == 1.0f) {
                mu0 mu0Var = mu0VarArr[0];
                mu0VarArr[0] = mu0VarArr[1];
                mu0VarArr[1] = mu0Var;
                mu0Var.setVisibility(8);
                if (u0Var != null && tv0Var.x0 == 2) {
                    u0Var.setVisibility(tv0Var.x0() ? 8 : 4);
                }
                tv0Var.x0 = 0;
                tv0Var.h1();
            }
        }
    }

    @Override // org.telegram.ui.Components.jn0
    public final void x() {
        int a2;
        mu0[] mu0VarArr = this.a.k0;
        int i10 = mu0VarArr[0].F;
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
            a2 = org.telegram.ui.Cells.t7.a(1);
        }
        if ((mu0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < mu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            mu0VarArr[0].h.x0(0);
            return;
        }
        ll0 ll0Var = mu0VarArr[0].E;
        ll0Var.b = 1;
        ll0Var.c(0, 0, false, false);
    }
}
