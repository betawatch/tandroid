package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xq0 implements zk0 {
    public final /* synthetic */ ys0 a;

    public xq0(ys0 ys0Var) {
        this.a = ys0Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void D() {
        int a10;
        tr0[] tr0VarArr = this.a.n0;
        int i7 = tr0VarArr[0].F;
        if (i7 != 0) {
            if (i7 != 1 && i7 != 2) {
                if (i7 == 3) {
                    a10 = org.telegram.messenger.g0.L(100.0f);
                } else if (i7 != 4) {
                    a10 = i7 != 5 ? org.telegram.messenger.g0.L(58.0f) : org.telegram.messenger.g0.L(60.0f);
                }
            }
            a10 = org.telegram.messenger.g0.L(56.0f);
        } else {
            a10 = org.telegram.ui.Cells.o7.a(1);
        }
        if ((tr0VarArr[0].F == 0 ? (r5.x.L0() / r0.p1[0]) * a10 : r5.x.L0() * a10) < tr0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            tr0VarArr[0].h.y0(0);
            return;
        }
        wi0 wi0Var = tr0VarArr[0].E;
        wi0Var.b = 1;
        wi0Var.d(0, 0, false, false);
    }

    @Override // org.telegram.ui.Components.zk0
    public final void D0(float f10) {
        ys0 ys0Var = this.a;
        org.telegram.ui.ActionBar.q0 q0Var = ys0Var.q0;
        tr0[] tr0VarArr = ys0Var.n0;
        if (f10 != 1.0f || tr0VarArr[1].getVisibility() == 0) {
            if (ys0Var.k1) {
                tr0VarArr[0].setTranslationX((-f10) * r5.getMeasuredWidth());
                tr0VarArr[1].setTranslationX(tr0VarArr[0].getMeasuredWidth() - (tr0VarArr[0].getMeasuredWidth() * f10));
            } else {
                tr0VarArr[0].setTranslationX(r5.getMeasuredWidth() * f10);
                tr0VarArr[1].setTranslationX((tr0VarArr[0].getMeasuredWidth() * f10) - tr0VarArr[0].getMeasuredWidth());
            }
            ys0Var.Z0(ys0Var.getTabProgress());
            float k02 = ys0Var.k0(f10);
            ys0Var.s0 = k02;
            ys0Var.u0.setVisibility((k02 == 0.0f || !ys0Var.I() || ys0Var.A0()) ? 4 : 0);
            if (q0Var == null || ys0Var.I()) {
                ys0Var.r0 = ys0Var.l0(f10);
                ys0Var.N1();
            } else {
                ys0Var.setSearchItemVisibility(ys0Var.I0() ? 8 : 4);
                ys0Var.r0 = 0.0f;
            }
            ys0Var.I1(false);
            if (f10 == 1.0f) {
                tr0 tr0Var = tr0VarArr[0];
                tr0VarArr[0] = tr0VarArr[1];
                tr0VarArr[1] = tr0Var;
                tr0Var.setVisibility(8);
                if (q0Var != null && ys0Var.A0 == 2) {
                    ys0Var.setSearchItemVisibility(ys0Var.I0() ? 8 : 4);
                }
                ys0Var.A0 = 0;
                ys0Var.u1();
            }
        }
    }

    @Override // org.telegram.ui.Components.zk0
    public final void b(int i7, boolean z10) {
        ys0 ys0Var = this.a;
        tr0[] tr0VarArr = ys0Var.n0;
        if (tr0VarArr[0].F == i7) {
            return;
        }
        zp0 zp0Var = ys0Var.c0;
        if (zp0Var != null && i7 == 8) {
            zp0Var.b.f(1.0f, 0);
        }
        tr0 tr0Var = tr0VarArr[1];
        tr0Var.F = i7;
        tr0Var.setVisibility(0);
        ys0Var.w0();
        ys0Var.B1(true);
        ys0Var.k1 = z10;
        ys0Var.Y0();
        ys0Var.E(!ys0Var.F0(i7));
        ys0Var.I1(true);
    }

    @Override // org.telegram.ui.Components.zk0
    public final boolean j1(int i7, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        ys0 ys0Var = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
        if (e2Var != null) {
            boolean C0 = ys0Var.C0();
            if (ys0.o0(i7, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.t3.w(5, e2Var.getMessagesController().M0(Long.valueOf(ys0Var.g1.id)))) {
                        profileTab = ys0Var.g1.main_tab;
                        if (profileTab != null || (i7 != ys0.p0(profileTab) && ys0Var.V1 != i7)) {
                            m60 H = m60.H(e2Var, view);
                            H.W(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false)));
                            H.c(R.drawable.tabs_reorder, org.telegram.messenger.hd.M0(2131746622, null), new di.t7(this, C0, i7, 6), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (ys0Var.m1 == e2Var.getUserConfig().e() && (userFull = ys0Var.h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    m60 H2 = m60.H(e2Var, view);
                    H2.W(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false)));
                    H2.c(R.drawable.tabs_reorder, org.telegram.messenger.hd.M0(2131746622, null), new di.t7(this, C0, i7, 6), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }
}
