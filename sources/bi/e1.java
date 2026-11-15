package bi;

import android.widget.FrameLayout;
import fi.i9;
import fi.z8;
import hi.sa;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.y80;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e1 implements wa {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.wa
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wa
    public final void b(xb xbVar) {
        fi.u3 u3Var;
        switch (this.a) {
            case 0:
                cb cbVar = xbVar.e;
                f1 f1Var = (f1) this.b;
                fh.g c10 = f1Var.p1.c(cbVar, null, true);
                gh.e eVar = new gh.e(f1Var.J0);
                eVar.e = new g0.e(11);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f = N;
                eVar.h = N2;
                c10.p(eVar);
                c10.r(org.telegram.messenger.g0.L(16.0f));
                cbVar.setCustomBackground(c10);
                break;
            case 2:
                if (xbVar.a == 2 && (u3Var = ((fi.e3) this.b).y.A1) != null) {
                    i9 i9Var = ((z8) u3Var).d;
                    i9Var.Y0 = true;
                    i9Var.V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.wa
    public final /* synthetic */ void c(float f10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.wa
    public final void d(xb xbVar) {
        fi.u3 u3Var;
        switch (this.a) {
            case 2:
                if (xbVar.a == 2 && (u3Var = ((fi.e3) this.b).y.A1) != null) {
                    i9 i9Var = ((z8) u3Var).d;
                    i9Var.Y0 = false;
                    i9Var.V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.wa
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wa
    public final int f(int i7) {
        int editTextHeight;
        int L;
        i0.c cVar;
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return (int) ((ch.b0) ((ai.k0) this.b).c).u;
            case 2:
                if (((fi.e3) this.b).y.h2) {
                    return 0;
                }
                return org.telegram.messenger.g0.L(64.0f);
            case 3:
                return ((fi.c5) this.b).r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                editTextHeight = ((sa) this.b).d1.getEditTextHeight();
                L = org.telegram.messenger.g0.L(12.0f);
                break;
            case 6:
                return ((n7) this.b).e.y1.getHeight();
            case 7:
                wa waVar = (wa) this.b;
                if (waVar == null) {
                    return 0;
                }
                return waVar.f(i7);
            case 8:
                editTextHeight = org.telegram.messenger.g0.L(126.0f);
                L = ((xl) this.b).c.b.R();
                break;
            case 9:
                cVar = ((org.telegram.ui.ActionBar.e2) ((y80) this.b)).mSystemInsets;
                editTextHeight = cVar.d;
                L = org.telegram.messenger.g0.L(72.0f);
                break;
            case 10:
                FrameLayout frameLayout = ((bw0) this.b).w1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.b;
                if (!(v0Var.getParent() instanceof ki.x3)) {
                    return 0;
                }
                ki.x3 x3Var = (ki.x3) v0Var.getParent();
                return (int) ((x3Var.getSwipeOffsetY() + x3Var.getOffsetY()) - x3Var.getTopActionBarOffsetY());
        }
        return L + editTextHeight;
    }

    @Override // org.telegram.ui.Components.wa
    public final boolean g(int i7) {
        switch (this.a) {
            case 2:
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                }
                break;
            case 7:
                wa waVar = (wa) this.b;
                if (waVar == null || !waVar.g(i7)) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wa
    public final int h(int i7) {
        switch (this.a) {
            case 7:
                wa waVar = (wa) this.b;
                if (waVar != null) {
                    break;
                } else {
                    break;
                }
        }
        return 0;
    }

    private final /* synthetic */ void A(xb xbVar) {
    }

    private final /* synthetic */ void B(xb xbVar) {
    }

    private final /* synthetic */ void C(xb xbVar) {
    }

    private final /* synthetic */ void D(xb xbVar) {
    }

    private final /* synthetic */ void E(xb xbVar) {
    }

    private final /* synthetic */ void F(xb xbVar) {
    }

    private final /* synthetic */ void G(xb xbVar) {
    }

    private final /* synthetic */ void H(xb xbVar) {
    }

    private final /* synthetic */ void I(xb xbVar) {
    }

    private final /* synthetic */ void J(xb xbVar) {
    }

    private final /* synthetic */ void K(xb xbVar) {
    }

    private final /* synthetic */ void L(xb xbVar) {
    }

    private final /* synthetic */ void M(xb xbVar) {
    }

    private final /* synthetic */ void N(xb xbVar) {
    }

    private final /* synthetic */ void O(xb xbVar) {
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

    private final /* synthetic */ void u(xb xbVar) {
    }

    private final /* synthetic */ void v(xb xbVar) {
    }

    private final /* synthetic */ void w(xb xbVar) {
    }

    private final /* synthetic */ void x(xb xbVar) {
    }

    private final /* synthetic */ void y(xb xbVar) {
    }

    private final /* synthetic */ void z(xb xbVar) {
    }
}
