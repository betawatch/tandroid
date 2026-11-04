package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uq0 implements yk0 {
    public final /* synthetic */ ws0 a;

    public uq0(ws0 ws0Var) {
        this.a = ws0Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final void A() {
        int a10;
        rr0[] rr0VarArr = this.a.n0;
        int i3 = rr0VarArr[0].F;
        if (i3 != 0) {
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    a10 = org.telegram.messenger.g0.L(100.0f);
                } else if (i3 != 4) {
                    a10 = i3 != 5 ? org.telegram.messenger.g0.L(58.0f) : org.telegram.messenger.g0.L(60.0f);
                }
            }
            a10 = org.telegram.messenger.g0.L(56.0f);
        } else {
            a10 = org.telegram.ui.Cells.o7.a(1);
        }
        if ((rr0VarArr[0].F == 0 ? (r5.x.L0() / r0.p1[0]) * a10 : r5.x.L0() * a10) < rr0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            rr0VarArr[0].h.y0(0);
            return;
        }
        vi0 vi0Var = rr0VarArr[0].E;
        vi0Var.b = 1;
        vi0Var.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.yk0
    public final void F0(float f10) {
        ws0 ws0Var = this.a;
        org.telegram.ui.ActionBar.q0 q0Var = ws0Var.q0;
        rr0[] rr0VarArr = ws0Var.n0;
        if (f10 != 1.0f || rr0VarArr[1].getVisibility() == 0) {
            if (ws0Var.k1) {
                rr0VarArr[0].setTranslationX((-f10) * r5.getMeasuredWidth());
                rr0VarArr[1].setTranslationX(rr0VarArr[0].getMeasuredWidth() - (rr0VarArr[0].getMeasuredWidth() * f10));
            } else {
                rr0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f10);
                rr0VarArr[1].setTranslationX((rr0VarArr[0].getMeasuredWidth() * f10) - rr0VarArr[0].getMeasuredWidth());
            }
            ws0Var.X0(ws0Var.getTabProgress());
            float k02 = ws0Var.k0(f10);
            ws0Var.s0 = k02;
            ws0Var.u0.setVisibility((k02 == 0.0f || !ws0Var.I() || ws0Var.A0()) ? 4 : 0);
            if (q0Var == null || ws0Var.I()) {
                ws0Var.r0 = ws0Var.l0(f10);
                ws0Var.L1();
            } else {
                ws0Var.setSearchItemVisibility(ws0Var.H0() ? 8 : 4);
                ws0Var.r0 = 0.0f;
            }
            ws0Var.G1(false);
            if (f10 == 1.0f) {
                rr0 rr0Var = rr0VarArr[0];
                rr0VarArr[0] = rr0VarArr[1];
                rr0VarArr[1] = rr0Var;
                rr0Var.setVisibility(8);
                if (q0Var != null && ws0Var.A0 == 2) {
                    ws0Var.setSearchItemVisibility(ws0Var.H0() ? 8 : 4);
                }
                ws0Var.A0 = 0;
                ws0Var.s1();
            }
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public final void f(int i3, boolean z10) {
        ws0 ws0Var = this.a;
        rr0[] rr0VarArr = ws0Var.n0;
        if (rr0VarArr[0].F == i3) {
            return;
        }
        yp0 yp0Var = ws0Var.c0;
        if (yp0Var != null && i3 == 8) {
            yp0Var.b.f(1.0f, 0);
        }
        rr0 rr0Var = rr0VarArr[1];
        rr0Var.F = i3;
        rr0Var.setVisibility(0);
        ws0Var.w0();
        ws0Var.z1(true);
        ws0Var.k1 = z10;
        ws0Var.W0();
        ws0Var.E(!ws0Var.E0(i3));
        ws0Var.G1(true);
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean k1(int i3, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        ws0 ws0Var = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
        if (d2Var != null) {
            boolean C0 = ws0Var.C0();
            if (ws0.o0(i3, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.t3.w(5, d2Var.getMessagesController().M0(Long.valueOf(ws0Var.g1.id)))) {
                        profileTab = ws0Var.g1.main_tab;
                        if (profileTab != null || (i3 != ws0.p0(profileTab) && ws0Var.V1 != i3)) {
                            f60 H = f60.H(d2Var, view);
                            H.W(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)));
                            H.c(R.drawable.tabs_reorder, org.telegram.messenger.bd.M0(2131746630, null), new ci.c8(this, C0, i3, 6), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (ws0Var.m1 == d2Var.getUserConfig().e() && (userFull = ws0Var.h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    f60 H2 = f60.H(d2Var, view);
                    H2.W(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)));
                    H2.c(R.drawable.tabs_reorder, org.telegram.messenger.bd.M0(2131746630, null), new ci.c8(this, C0, i3, 6), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }
}
