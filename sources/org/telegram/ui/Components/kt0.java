package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class kt0 implements jn0 {
    public final /* synthetic */ sv0 a;

    public kt0(sv0 sv0Var) {
        this.a = sv0Var;
    }

    @Override // org.telegram.ui.Components.jn0
    public final boolean b1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        sv0 sv0Var = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = sv0Var.v1;
        if (n2Var != null) {
            boolean t02 = sv0Var.t0();
            if (sv0.e0(i10, t02) != null) {
                if (t02) {
                    if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(sv0Var.d1.id)), 5)) {
                        profileTab = sv0Var.d1.main_tab;
                        if (profileTab != null || (i10 != sv0.f0(profileTab) && sv0Var.R1 != i10)) {
                            i80 H = i80.H(n2Var, view);
                            H.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false)));
                            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.y8(this, t02, i10, 4), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (sv0Var.j1 == n2Var.getUserConfig().getClientUserId() && (userFull = sv0Var.e1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    i80 H2 = i80.H(n2Var, view);
                    H2.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false)));
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.y8(this, t02, i10, 4), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jn0
    public final void f(int i10, boolean z10) {
        sv0 sv0Var = this.a;
        lu0[] lu0VarArr = sv0Var.k0;
        if (lu0VarArr[0].F == i10) {
            return;
        }
        ns0 ns0Var = sv0Var.W;
        if (ns0Var != null && i10 == 8) {
            ns0Var.n.f(1.0f, 0);
        }
        lu0 lu0Var = lu0VarArr[1];
        lu0Var.F = i10;
        lu0Var.setVisibility(0);
        sv0Var.l0();
        sv0Var.o1(true);
        sv0Var.h1 = z10;
        sv0Var.N0();
        sv0Var.A(!sv0Var.u0(i10), true);
        sv0Var.s1(true);
    }

    @Override // org.telegram.ui.Components.jn0
    public final void k0(float f7) {
        sv0 sv0Var = this.a;
        org.telegram.ui.ActionBar.u0 u0Var = sv0Var.n0;
        lu0[] lu0VarArr = sv0Var.k0;
        if (f7 != 1.0f || lu0VarArr[1].getVisibility() == 0) {
            if (sv0Var.h1) {
                lu0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                lu0VarArr[1].setTranslationX(lu0VarArr[0].getMeasuredWidth() - (lu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                lu0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                lu0VarArr[1].setTranslationX((lu0VarArr[0].getMeasuredWidth() * f7) - lu0VarArr[0].getMeasuredWidth());
            }
            sv0Var.O0(sv0Var.getTabProgress());
            float a02 = sv0Var.a0(f7);
            sv0Var.p0 = a02;
            sv0Var.r0.setVisibility((a02 == 0.0f || !sv0Var.D() || sv0Var.r0()) ? 4 : 0);
            if (u0Var == null || sv0Var.D()) {
                sv0Var.o0 = sv0Var.b0(f7);
                sv0Var.w1();
            } else {
                u0Var.setVisibility(sv0Var.x0() ? 8 : 4);
                sv0Var.o0 = 0.0f;
            }
            sv0Var.s1(false);
            if (f7 == 1.0f) {
                lu0 lu0Var = lu0VarArr[0];
                lu0VarArr[0] = lu0VarArr[1];
                lu0VarArr[1] = lu0Var;
                lu0Var.setVisibility(8);
                if (u0Var != null && sv0Var.x0 == 2) {
                    u0Var.setVisibility(sv0Var.x0() ? 8 : 4);
                }
                sv0Var.x0 = 0;
                sv0Var.h1();
            }
        }
    }

    @Override // org.telegram.ui.Components.jn0
    public final void x() {
        int a2;
        lu0[] lu0VarArr = this.a.k0;
        int i10 = lu0VarArr[0].F;
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
        if ((lu0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < lu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            lu0VarArr[0].h.x0(0);
            return;
        }
        ll0 ll0Var = lu0VarArr[0].E;
        ll0Var.b = 1;
        ll0Var.c(0, 0, false, false);
    }
}
