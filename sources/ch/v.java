package ch;

import android.widget.FrameLayout;
import bi.x5;
import di.c4;
import di.h9;
import di.j3;
import di.l5;
import di.q9;
import di.w5;
import fi.va;
import hi.b4;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.q7;
import org.telegram.ui.Components.ql;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.web.x0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class v implements ab {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ab
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ab
    public final void b(cc ccVar) {
        c4 c4Var;
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (ccVar.a == 2 && (c4Var = ((j3) this.b).y.z1) != null) {
                    q9 q9Var = ((h9) c4Var).d;
                    q9Var.X0 = true;
                    q9Var.V();
                    break;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                gb gbVar = ccVar.e;
                zh.h0 h0Var = (zh.h0) this.b;
                fh.g c10 = h0Var.l1.c(gbVar, null, true);
                gh.e eVar = new gh.e(h0Var.I0);
                eVar.e = new g2.c(9);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f = N;
                eVar.h = N2;
                c10.p(eVar);
                c10.r(org.telegram.messenger.g0.L(16.0f));
                gbVar.setCustomBackground(c10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ab
    public final /* synthetic */ void c(float f10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.ab
    public final void d(cc ccVar) {
        c4 c4Var;
        switch (this.a) {
            case 1:
                if (ccVar.a == 2 && (c4Var = ((j3) this.b).y.z1) != null) {
                    q9 q9Var = ((h9) c4Var).d;
                    q9Var.X0 = false;
                    q9Var.V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ab
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ab
    public final int f(int i7) {
        int editTextHeight;
        int L;
        i0.b bVar;
        switch (this.a) {
            case 0:
                return (int) ((b0) ((x5) this.b).c).u;
            case 1:
                if (((j3) this.b).y.g2) {
                    return 0;
                }
                return org.telegram.messenger.g0.L(64.0f);
            case 2:
                return ((l5) this.b).r.getPaddingBottom();
            case 3:
                return 0;
            case 4:
                editTextHeight = ((va) this.b).c1.getEditTextHeight();
                L = org.telegram.messenger.g0.L(12.0f);
                break;
            case 5:
                return ((q7) this.b).e.u1.getHeight();
            case 6:
                ab abVar = (ab) this.b;
                if (abVar == null) {
                    return 0;
                }
                return abVar.f(i7);
            case 7:
                editTextHeight = org.telegram.messenger.g0.L(126.0f);
                L = ((ql) this.b).c.b.Q();
                break;
            case 8:
                bVar = ((f2) ((v80) this.b)).mSystemInsets;
                editTextHeight = bVar.d;
                L = org.telegram.messenger.g0.L(72.0f);
                break;
            case 9:
                FrameLayout frameLayout = ((zv0) this.b).s1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 10:
                x0 x0Var = (x0) this.b;
                if (!(x0Var.getParent() instanceof b4)) {
                    return 0;
                }
                b4 b4Var = (b4) x0Var.getParent();
                return (int) ((b4Var.getSwipeOffsetY() + b4Var.getOffsetY()) - b4Var.getTopActionBarOffsetY());
            default:
                return 0;
        }
        return L + editTextHeight;
    }

    @Override // org.telegram.ui.Components.ab
    public final boolean g(int i7) {
        switch (this.a) {
            case 1:
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                }
                break;
            case 6:
                ab abVar = (ab) this.b;
                if (abVar == null || !abVar.g(i7)) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ab
    public final int h(int i7) {
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return org.telegram.messenger.g0.L(58.0f);
            case 2:
                return 0;
            case 3:
                return (int) (((w5) this.b).a + org.telegram.messenger.g0.L(58.0f));
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                ab abVar = (ab) this.b;
                return abVar == null ? org.telegram.messenger.g0.m : abVar.h(i7);
            case 7:
                return 0;
            case 8:
                return 0;
            case 9:
                return 0;
            case 10:
                return 0;
            default:
                return org.telegram.messenger.g0.m;
        }
    }

    private final /* synthetic */ void A(cc ccVar) {
    }

    private final /* synthetic */ void B(cc ccVar) {
    }

    private final /* synthetic */ void C(cc ccVar) {
    }

    private final /* synthetic */ void D(cc ccVar) {
    }

    private final /* synthetic */ void E(cc ccVar) {
    }

    private final /* synthetic */ void F(cc ccVar) {
    }

    private final /* synthetic */ void G(cc ccVar) {
    }

    private final /* synthetic */ void H(cc ccVar) {
    }

    private final /* synthetic */ void I(cc ccVar) {
    }

    private final /* synthetic */ void J(cc ccVar) {
    }

    private final /* synthetic */ void K(cc ccVar) {
    }

    private final /* synthetic */ void L(cc ccVar) {
    }

    private final /* synthetic */ void M(cc ccVar) {
    }

    private final /* synthetic */ void N(cc ccVar) {
    }

    private final /* synthetic */ void O(cc ccVar) {
    }

    private final /* synthetic */ void i(float f10) {
    }

    private final /* synthetic */ void j(float f10) {
    }

    private final /* synthetic */ void k(float f10) {
    }

    private final /* synthetic */ void l(float f10) {
    }

    private final /* synthetic */ void m(float f10) {
    }

    private final /* synthetic */ void n(float f10) {
    }

    private final /* synthetic */ void o(float f10) {
    }

    private final /* synthetic */ void p(float f10) {
    }

    private final /* synthetic */ void q(float f10) {
    }

    private final /* synthetic */ void r(float f10) {
    }

    private final /* synthetic */ void s(float f10) {
    }

    private final /* synthetic */ void t(float f10) {
    }

    private final /* synthetic */ void u(cc ccVar) {
    }

    private final /* synthetic */ void v(cc ccVar) {
    }

    private final /* synthetic */ void w(cc ccVar) {
    }

    private final /* synthetic */ void x(cc ccVar) {
    }

    private final /* synthetic */ void y(cc ccVar) {
    }

    private final /* synthetic */ void z(cc ccVar) {
    }
}
