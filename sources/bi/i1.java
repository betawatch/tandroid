package bi;

import android.widget.FrameLayout;
import fi.f9;
import hi.sa;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.lb;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class i1 implements fb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final void b(gc gcVar) {
        fi.s3 s3Var;
        switch (this.a) {
            case 0:
                lb lbVar = gcVar.e;
                k1 k1Var = (k1) this.b;
                fh.g c10 = k1Var.p1.c(lbVar, null, true);
                c10.p(c8.i0.c(k1Var.J0));
                c10.r(org.telegram.messenger.g0.L(16.0f));
                lbVar.setCustomBackground(c10);
                break;
            case 2:
                if (gcVar.a == 2 && (s3Var = ((fi.c3) this.b).y.A1) != null) {
                    f9 f9Var = ((fi.w8) s3Var).d;
                    f9Var.Y0 = true;
                    f9Var.V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void c(float f10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.fb
    public final void d(gc gcVar) {
        fi.s3 s3Var;
        switch (this.a) {
            case 2:
                if (gcVar.a == 2 && (s3Var = ((fi.c3) this.b).y.A1) != null) {
                    f9 f9Var = ((fi.w8) s3Var).d;
                    f9Var.Y0 = false;
                    f9Var.V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final int f(int i7) {
        int editTextHeight;
        int L;
        i0.b bVar;
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return (int) ((ch.b0) ((ai.l0) this.b).c).u;
            case 2:
                if (((fi.c3) this.b).y.h2) {
                    return 0;
                }
                return org.telegram.messenger.g0.L(64.0f);
            case 3:
                return ((fi.b5) this.b).r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                editTextHeight = ((sa) this.b).d1.getEditTextHeight();
                L = org.telegram.messenger.g0.L(12.0f);
                break;
            case 6:
                return ((org.telegram.ui.Components.u7) this.b).e.y1.getHeight();
            case 7:
                fb fbVar = (fb) this.b;
                if (fbVar == null) {
                    return 0;
                }
                return fbVar.f(i7);
            case 8:
                editTextHeight = org.telegram.messenger.g0.L(126.0f);
                L = ((gm) this.b).c.b.R();
                break;
            case 9:
                bVar = ((org.telegram.ui.ActionBar.g2) ((k90) this.b)).mSystemInsets;
                editTextHeight = bVar.d;
                L = org.telegram.messenger.g0.L(72.0f);
                break;
            case 10:
                FrameLayout frameLayout = ((kw0) this.b).w1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.b;
                if (!(v0Var.getParent() instanceof ki.r3)) {
                    return 0;
                }
                ki.r3 r3Var = (ki.r3) v0Var.getParent();
                return (int) ((r3Var.getSwipeOffsetY() + r3Var.getOffsetY()) - r3Var.getTopActionBarOffsetY());
        }
        return L + editTextHeight;
    }

    @Override // org.telegram.ui.Components.fb
    public final boolean g(int i7) {
        switch (this.a) {
            case 2:
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                }
                break;
            case 7:
                fb fbVar = (fb) this.b;
                if (fbVar == null || !fbVar.g(i7)) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.fb
    public final int h(int i7) {
        switch (this.a) {
            case 7:
                fb fbVar = (fb) this.b;
                if (fbVar != null) {
                    break;
                } else {
                    break;
                }
        }
        return 0;
    }

    private final /* synthetic */ void A(gc gcVar) {
    }

    private final /* synthetic */ void B(gc gcVar) {
    }

    private final /* synthetic */ void C(gc gcVar) {
    }

    private final /* synthetic */ void D(gc gcVar) {
    }

    private final /* synthetic */ void E(gc gcVar) {
    }

    private final /* synthetic */ void F(gc gcVar) {
    }

    private final /* synthetic */ void G(gc gcVar) {
    }

    private final /* synthetic */ void H(gc gcVar) {
    }

    private final /* synthetic */ void I(gc gcVar) {
    }

    private final /* synthetic */ void J(gc gcVar) {
    }

    private final /* synthetic */ void K(gc gcVar) {
    }

    private final /* synthetic */ void L(gc gcVar) {
    }

    private final /* synthetic */ void M(gc gcVar) {
    }

    private final /* synthetic */ void N(gc gcVar) {
    }

    private final /* synthetic */ void O(gc gcVar) {
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

    private final /* synthetic */ void u(gc gcVar) {
    }

    private final /* synthetic */ void v(gc gcVar) {
    }

    private final /* synthetic */ void w(gc gcVar) {
    }

    private final /* synthetic */ void x(gc gcVar) {
    }

    private final /* synthetic */ void y(gc gcVar) {
    }

    private final /* synthetic */ void z(gc gcVar) {
    }
}
