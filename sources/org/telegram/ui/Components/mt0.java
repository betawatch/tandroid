package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class mt0 implements kn0 {
    public final /* synthetic */ uv0 a;

    public mt0(uv0 uv0Var) {
        this.a = uv0Var;
    }

    @Override // org.telegram.ui.Components.kn0
    public final boolean b1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        uv0 uv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = uv0Var.v1;
        if (n2Var != null) {
            boolean t02 = uv0Var.t0();
            if (uv0.e0(i10, t02) != null) {
                if (t02) {
                    if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(uv0Var.d1.id)), 5)) {
                        profileTab = uv0Var.d1.main_tab;
                        if (profileTab != null || (i10 != uv0.f0(profileTab) && uv0Var.R1 != i10)) {
                            i80 H = i80.H(n2Var, view);
                            H.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false)));
                            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.z8(this, t02, i10, 4), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (uv0Var.j1 == n2Var.getUserConfig().getClientUserId() && (userFull = uv0Var.e1) != null) {
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

    @Override // org.telegram.ui.Components.kn0
    public final void f(int i10, boolean z10) {
        uv0 uv0Var = this.a;
        nu0[] nu0VarArr = uv0Var.k0;
        if (nu0VarArr[0].F == i10) {
            return;
        }
        ps0 ps0Var = uv0Var.W;
        if (ps0Var != null && i10 == 8) {
            ps0Var.n.f(1.0f, 0);
        }
        nu0 nu0Var = nu0VarArr[1];
        nu0Var.F = i10;
        nu0Var.setVisibility(0);
        uv0Var.l0();
        uv0Var.o1(true);
        uv0Var.h1 = z10;
        uv0Var.N0();
        uv0Var.A(!uv0Var.u0(i10), true);
        uv0Var.s1(true);
    }

    @Override // org.telegram.ui.Components.kn0
    public final void k0(float f7) {
        uv0 uv0Var = this.a;
        org.telegram.ui.ActionBar.u0 u0Var = uv0Var.n0;
        nu0[] nu0VarArr = uv0Var.k0;
        if (f7 != 1.0f || nu0VarArr[1].getVisibility() == 0) {
            if (uv0Var.h1) {
                nu0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                nu0VarArr[1].setTranslationX(nu0VarArr[0].getMeasuredWidth() - (nu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                nu0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                nu0VarArr[1].setTranslationX((nu0VarArr[0].getMeasuredWidth() * f7) - nu0VarArr[0].getMeasuredWidth());
            }
            uv0Var.O0(uv0Var.getTabProgress());
            float a02 = uv0Var.a0(f7);
            uv0Var.p0 = a02;
            uv0Var.r0.setVisibility((a02 == 0.0f || !uv0Var.D() || uv0Var.r0()) ? 4 : 0);
            if (u0Var == null || uv0Var.D()) {
                uv0Var.o0 = uv0Var.b0(f7);
                uv0Var.w1();
            } else {
                u0Var.setVisibility(uv0Var.x0() ? 8 : 4);
                uv0Var.o0 = 0.0f;
            }
            uv0Var.s1(false);
            if (f7 == 1.0f) {
                nu0 nu0Var = nu0VarArr[0];
                nu0VarArr[0] = nu0VarArr[1];
                nu0VarArr[1] = nu0Var;
                nu0Var.setVisibility(8);
                if (u0Var != null && uv0Var.x0 == 2) {
                    u0Var.setVisibility(uv0Var.x0() ? 8 : 4);
                }
                uv0Var.x0 = 0;
                uv0Var.h1();
            }
        }
    }

    @Override // org.telegram.ui.Components.kn0
    public final void x() {
        int a2;
        nu0[] nu0VarArr = this.a.k0;
        int i10 = nu0VarArr[0].F;
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
        if ((nu0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < nu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            nu0VarArr[0].h.x0(0);
            return;
        }
        ml0 ml0Var = nu0VarArr[0].E;
        ml0Var.b = 1;
        ml0Var.c(0, 0, false, false);
    }
}
