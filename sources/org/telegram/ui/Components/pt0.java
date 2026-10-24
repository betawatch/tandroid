package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class pt0 implements nn0 {
    public final /* synthetic */ xv0 a;

    public pt0(xv0 xv0Var) {
        this.a = xv0Var;
    }

    @Override // org.telegram.ui.Components.nn0
    public final boolean b1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        xv0 xv0Var = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.v1;
        if (o2Var != null) {
            boolean u02 = xv0Var.u0();
            if (xv0.f0(i10, u02) != null) {
                if (u02) {
                    if (ChatObject.canUserDoAction(o2Var.getMessagesController().getChat(Long.valueOf(xv0Var.d1.id)), 5)) {
                        profileTab = xv0Var.d1.main_tab;
                        if (profileTab != null || (i10 != xv0.g0(profileTab) && xv0Var.S1 != i10)) {
                            j80 H = j80.H(o2Var, view);
                            H.W(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)));
                            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.z8(this, u02, i10, 4), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (xv0Var.j1 == o2Var.getUserConfig().getClientUserId() && (userFull = xv0Var.e1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    j80 H2 = j80.H(o2Var, view);
                    H2.W(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)));
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.z8(this, u02, i10, 4), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nn0
    public final void d(int i10, boolean z10) {
        xv0 xv0Var = this.a;
        qu0[] qu0VarArr = xv0Var.k0;
        if (qu0VarArr[0].F == i10) {
            return;
        }
        ss0 ss0Var = xv0Var.W;
        if (ss0Var != null && i10 == 8) {
            ss0Var.n.f(1.0f, 0);
        }
        qu0 qu0Var = qu0VarArr[1];
        qu0Var.F = i10;
        qu0Var.setVisibility(0);
        xv0Var.m0();
        xv0Var.p1(true);
        xv0Var.h1 = z10;
        xv0Var.O0();
        xv0Var.A(!xv0Var.v0(i10), true);
        xv0Var.u1(true);
    }

    @Override // org.telegram.ui.Components.nn0
    public final void k0(float f7) {
        xv0 xv0Var = this.a;
        org.telegram.ui.ActionBar.u0 u0Var = xv0Var.n0;
        qu0[] qu0VarArr = xv0Var.k0;
        if (f7 != 1.0f || qu0VarArr[1].getVisibility() == 0) {
            if (xv0Var.h1) {
                qu0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                qu0VarArr[1].setTranslationX(qu0VarArr[0].getMeasuredWidth() - (qu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                qu0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                qu0VarArr[1].setTranslationX((qu0VarArr[0].getMeasuredWidth() * f7) - qu0VarArr[0].getMeasuredWidth());
            }
            xv0Var.P0(xv0Var.getTabProgress());
            float b02 = xv0Var.b0(f7);
            xv0Var.p0 = b02;
            xv0Var.r0.setVisibility((b02 == 0.0f || !xv0Var.E() || xv0Var.s0()) ? 4 : 0);
            if (u0Var == null || xv0Var.E()) {
                xv0Var.o0 = xv0Var.c0(f7);
                xv0Var.y1();
            } else {
                u0Var.setVisibility(xv0Var.y0() ? 8 : 4);
                xv0Var.o0 = 0.0f;
            }
            xv0Var.u1(false);
            if (f7 == 1.0f) {
                qu0 qu0Var = qu0VarArr[0];
                qu0VarArr[0] = qu0VarArr[1];
                qu0VarArr[1] = qu0Var;
                qu0Var.setVisibility(8);
                if (u0Var != null && xv0Var.x0 == 2) {
                    u0Var.setVisibility(xv0Var.y0() ? 8 : 4);
                }
                xv0Var.x0 = 0;
                xv0Var.i1();
            }
        }
    }

    @Override // org.telegram.ui.Components.nn0
    public final void x() {
        int a2;
        qu0[] qu0VarArr = this.a.k0;
        int i10 = qu0VarArr[0].F;
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
        if ((qu0VarArr[0].F == 0 ? (r5.x.L0() / r0.m1[0]) * a2 : r5.x.L0() * a2) < qu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            qu0VarArr[0].h.x0(0);
            return;
        }
        pl0 pl0Var = qu0VarArr[0].E;
        pl0Var.b = 1;
        pl0Var.c(0, 0, false, false);
    }
}
