package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k7 implements ua {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ua
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ua
    public final void b(wb wbVar) {
        th.v2 v2Var;
        switch (this.a) {
            case 6:
                bb bbVar = wbVar.e;
                ph.k0 k0Var = (ph.k0) this.b;
                vg.f c10 = k0Var.l1.c(bbVar, null, true);
                wg.d dVar = new wg.d(k0Var.I0);
                dVar.e = new xg.a(0);
                float N = org.telegram.messenger.i0.N(0.5f);
                float N2 = org.telegram.messenger.i0.N(0.5f);
                dVar.f = N;
                dVar.h = N2;
                c10.o(dVar);
                c10.q(org.telegram.messenger.i0.L(16.0f));
                bbVar.setCustomBackground(c10);
                break;
            case 8:
                if (wbVar.a == 2 && (v2Var = ((th.g2) this.b).y.z1) != null) {
                    th.o7 o7Var = ((th.f7) v2Var).d;
                    o7Var.Y0 = true;
                    o7Var.d0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ua
    public final /* synthetic */ void c(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ua
    public final void d(wb wbVar) {
        th.v2 v2Var;
        switch (this.a) {
            case 8:
                if (wbVar.a == 2 && (v2Var = ((th.g2) this.b).y.z1) != null) {
                    th.o7 o7Var = ((th.f7) v2Var).d;
                    o7Var.Y0 = false;
                    o7Var.d0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ua
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ua
    public final int f(int i10) {
        int L;
        int R;
        i0.c cVar;
        switch (this.a) {
            case 0:
                return ((m7) this.b).e.u1.getHeight();
            case 1:
                ua uaVar = (ua) this.b;
                if (uaVar == null) {
                    return 0;
                }
                return uaVar.f(i10);
            case 2:
                L = org.telegram.messenger.i0.L(126.0f);
                R = ((yl) this.b).c.b.R();
                break;
            case 3:
                cVar = ((org.telegram.ui.ActionBar.k2) ((n90) this.b)).mSystemInsets;
                L = cVar.d;
                R = org.telegram.messenger.i0.L(72.0f);
                break;
            case 4:
                FrameLayout frameLayout = ((cx0) this.b).s1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 5:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.b;
                if (!(z0Var.getParent() instanceof xh.h3)) {
                    return 0;
                }
                xh.h3 h3Var = (xh.h3) z0Var.getParent();
                return (int) ((h3Var.getSwipeOffsetY() + h3Var.getOffsetY()) - h3Var.getTopActionBarOffsetY());
            case 6:
                return 0;
            case 7:
                return (int) ((sg.b0) ((ph.k) this.b).c).u;
            case 8:
                if (((th.g2) this.b).y.g2) {
                    return 0;
                }
                return org.telegram.messenger.i0.L(64.0f);
            case 9:
                return ((th.y3) this.b).r.getPaddingBottom();
            case 10:
                return 0;
            default:
                L = ((vh.o8) this.b).c1.getEditTextHeight();
                R = org.telegram.messenger.i0.L(12.0f);
                break;
        }
        return R + L;
    }

    @Override // org.telegram.ui.Components.ua
    public final boolean g(int i10) {
        switch (this.a) {
            case 1:
                ua uaVar = (ua) this.b;
                if (uaVar == null || !uaVar.g(i10)) {
                }
                break;
            case 8:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ua
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                ua uaVar = (ua) this.b;
                return uaVar == null ? org.telegram.messenger.i0.m : uaVar.h(i10);
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                return org.telegram.messenger.i0.m;
            case 7:
                return 0;
            case 8:
                return org.telegram.messenger.i0.L(58.0f);
            case 9:
                return 0;
            case 10:
                return (int) (((th.g4) this.b).a + org.telegram.messenger.i0.L(58.0f));
            default:
                return 0;
        }
    }

    private final /* synthetic */ void A(wb wbVar) {
    }

    private final /* synthetic */ void B(wb wbVar) {
    }

    private final /* synthetic */ void C(wb wbVar) {
    }

    private final /* synthetic */ void D(wb wbVar) {
    }

    private final /* synthetic */ void E(wb wbVar) {
    }

    private final /* synthetic */ void F(wb wbVar) {
    }

    private final /* synthetic */ void G(wb wbVar) {
    }

    private final /* synthetic */ void H(wb wbVar) {
    }

    private final /* synthetic */ void I(wb wbVar) {
    }

    private final /* synthetic */ void J(wb wbVar) {
    }

    private final /* synthetic */ void K(wb wbVar) {
    }

    private final /* synthetic */ void L(wb wbVar) {
    }

    private final /* synthetic */ void M(wb wbVar) {
    }

    private final /* synthetic */ void N(wb wbVar) {
    }

    private final /* synthetic */ void O(wb wbVar) {
    }

    private final /* synthetic */ void i(float f7) {
    }

    private final /* synthetic */ void j(float f7) {
    }

    private final /* synthetic */ void k(float f7) {
    }

    private final /* synthetic */ void l(float f7) {
    }

    private final /* synthetic */ void m(float f7) {
    }

    private final /* synthetic */ void n(float f7) {
    }

    private final /* synthetic */ void o(float f7) {
    }

    private final /* synthetic */ void p(float f7) {
    }

    private final /* synthetic */ void q(float f7) {
    }

    private final /* synthetic */ void r(float f7) {
    }

    private final /* synthetic */ void s(float f7) {
    }

    private final /* synthetic */ void t(float f7) {
    }

    private final /* synthetic */ void u(wb wbVar) {
    }

    private final /* synthetic */ void v(wb wbVar) {
    }

    private final /* synthetic */ void w(wb wbVar) {
    }

    private final /* synthetic */ void x(wb wbVar) {
    }

    private final /* synthetic */ void y(wb wbVar) {
    }

    private final /* synthetic */ void z(wb wbVar) {
    }
}
