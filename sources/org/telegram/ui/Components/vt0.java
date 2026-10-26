package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class vt0 implements sn0 {
    public final /* synthetic */ aw0 a;

    public vt0(aw0 aw0Var) {
        this.a = aw0Var;
    }

    @Override // org.telegram.ui.Components.sn0
    public final void f(int i10, boolean z10) {
        aw0 aw0Var = this.a;
        tu0[] tu0VarArr = aw0Var.m0;
        if (tu0VarArr[0].E == i10) {
            return;
        }
        zs0 zs0Var = aw0Var.b0;
        if (zs0Var != null && i10 == 8) {
            zs0Var.b.f(1.0f, 0);
        }
        tu0 tu0Var = tu0VarArr[1];
        tu0Var.E = i10;
        tu0Var.setVisibility(0);
        aw0Var.t0();
        aw0Var.v1(true);
        aw0Var.j1 = z10;
        aw0Var.S0();
        aw0Var.D(!aw0Var.A0(i10));
        aw0Var.C1(true);
    }

    @Override // org.telegram.ui.Components.sn0
    public final boolean h1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        aw0 aw0Var = this.a;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.x1;
        if (r2Var != null) {
            boolean z02 = aw0Var.z0();
            if (aw0.l0(i10, z02) != null) {
                if (z02) {
                    if (ChatObject.canUserDoAction(r2Var.getMessagesController().getChat(Long.valueOf(aw0Var.f1.id)), 5)) {
                        profileTab = aw0Var.f1.main_tab;
                        if (profileTab != null || (i10 != aw0.m0(profileTab) && aw0Var.U1 != i10)) {
                            k80 H = k80.H(r2Var, view);
                            H.W(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false)));
                            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new bi.u8(this, z02, i10, 4), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (aw0Var.l1 == r2Var.getUserConfig().getClientUserId() && (userFull = aw0Var.g1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    k80 H2 = k80.H(r2Var, view);
                    H2.W(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false)));
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new bi.u8(this, z02, i10, 4), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sn0
    public final void z() {
        int a2;
        tu0[] tu0VarArr = this.a.m0;
        int i10 = tu0VarArr[0].E;
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
            a2 = org.telegram.ui.Cells.x7.a(1);
        }
        if ((tu0VarArr[0].E == 0 ? (r5.w.L0() / r0.o1[0]) * a2 : r5.w.L0() * a2) < tu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            tu0VarArr[0].h.y0(0);
            return;
        }
        pl0 pl0Var = tu0VarArr[0].y;
        pl0Var.b = 1;
        pl0Var.c(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.sn0
    public final void z0(float f7) {
        aw0 aw0Var = this.a;
        org.telegram.ui.ActionBar.w0 w0Var = aw0Var.p0;
        tu0[] tu0VarArr = aw0Var.m0;
        if (f7 != 1.0f || tu0VarArr[1].getVisibility() == 0) {
            if (aw0Var.j1) {
                tu0VarArr[0].setTranslationX((-f7) * r5.getMeasuredWidth());
                tu0VarArr[1].setTranslationX(tu0VarArr[0].getMeasuredWidth() - (tu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                tu0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f7);
                tu0VarArr[1].setTranslationX((tu0VarArr[0].getMeasuredWidth() * f7) - tu0VarArr[0].getMeasuredWidth());
            }
            aw0Var.T0(aw0Var.getTabProgress());
            float h02 = aw0Var.h0(f7);
            aw0Var.r0 = h02;
            aw0Var.t0.setVisibility((h02 == 0.0f || !aw0Var.G() || aw0Var.x0()) ? 4 : 0);
            if (w0Var == null || aw0Var.G()) {
                aw0Var.q0 = aw0Var.i0(f7);
                aw0Var.H1();
            } else {
                aw0Var.setSearchItemVisibility(aw0Var.D0() ? 8 : 4);
                aw0Var.q0 = 0.0f;
            }
            aw0Var.C1(false);
            if (f7 == 1.0f) {
                tu0 tu0Var = tu0VarArr[0];
                tu0VarArr[0] = tu0VarArr[1];
                tu0VarArr[1] = tu0Var;
                tu0Var.setVisibility(8);
                if (w0Var != null && aw0Var.z0 == 2) {
                    aw0Var.setSearchItemVisibility(aw0Var.D0() ? 8 : 4);
                }
                aw0Var.z0 = 0;
                aw0Var.o1();
            }
        }
    }
}
