package bi;

import android.widget.FrameLayout;
import hi.nb;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.kb;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i1 implements eb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.eb
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.eb
    public final void b(fc fcVar) {
        fi.s3 s3Var;
        switch (this.a) {
            case 0:
                kb kbVar = fcVar.e;
                k1 k1Var = (k1) this.b;
                fh.g c10 = k1Var.p1.c(kbVar, null, true);
                c10.p(c8.j0.c(k1Var.J0));
                c10.r(org.telegram.messenger.g0.L(16.0f));
                kbVar.setCustomBackground(c10);
                break;
            case 2:
                if (fcVar.a == 2 && (s3Var = ((fi.c3) this.b).y.A1) != null) {
                    fi.f9 f9Var = ((fi.w8) s3Var).d;
                    f9Var.Y0 = true;
                    f9Var.V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.eb
    public final /* synthetic */ void c(float f10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.eb
    public final void d(fc fcVar) {
        fi.s3 s3Var;
        switch (this.a) {
            case 2:
                if (fcVar.a == 2 && (s3Var = ((fi.c3) this.b).y.A1) != null) {
                    fi.f9 f9Var = ((fi.w8) s3Var).d;
                    f9Var.Y0 = false;
                    f9Var.V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.eb
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.eb
    public final int f(int i7) {
        int editTextHeight;
        int L;
        i0.b bVar;
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return (int) ((ch.b0) ((ai.h0) this.b).c).u;
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
                editTextHeight = ((nb) this.b).d1.getEditTextHeight();
                L = org.telegram.messenger.g0.L(12.0f);
                break;
            case 6:
                return ((org.telegram.ui.Components.t7) this.b).e.y1.getHeight();
            case 7:
                eb ebVar = (eb) this.b;
                if (ebVar == null) {
                    return 0;
                }
                return ebVar.f(i7);
            case 8:
                editTextHeight = org.telegram.messenger.g0.L(126.0f);
                L = ((em) this.b).c.b.R();
                break;
            case 9:
                bVar = ((org.telegram.ui.ActionBar.g2) ((h90) this.b)).mSystemInsets;
                editTextHeight = bVar.d;
                L = org.telegram.messenger.g0.L(72.0f);
                break;
            case 10:
                FrameLayout frameLayout = ((jw0) this.b).w1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.b;
                if (!(v0Var.getParent() instanceof ki.s3)) {
                    return 0;
                }
                ki.s3 s3Var = (ki.s3) v0Var.getParent();
                return (int) ((s3Var.getSwipeOffsetY() + s3Var.getOffsetY()) - s3Var.getTopActionBarOffsetY());
        }
        return L + editTextHeight;
    }

    @Override // org.telegram.ui.Components.eb
    public final boolean g(int i7) {
        switch (this.a) {
            case 2:
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                }
                break;
            case 7:
                eb ebVar = (eb) this.b;
                if (ebVar == null || !ebVar.g(i7)) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.eb
    public final int h(int i7) {
        switch (this.a) {
            case 7:
                eb ebVar = (eb) this.b;
                if (ebVar != null) {
                    break;
                } else {
                    break;
                }
        }
        return 0;
    }

    private final /* synthetic */ void A(fc fcVar) {
    }

    private final /* synthetic */ void B(fc fcVar) {
    }

    private final /* synthetic */ void C(fc fcVar) {
    }

    private final /* synthetic */ void D(fc fcVar) {
    }

    private final /* synthetic */ void E(fc fcVar) {
    }

    private final /* synthetic */ void F(fc fcVar) {
    }

    private final /* synthetic */ void G(fc fcVar) {
    }

    private final /* synthetic */ void H(fc fcVar) {
    }

    private final /* synthetic */ void I(fc fcVar) {
    }

    private final /* synthetic */ void J(fc fcVar) {
    }

    private final /* synthetic */ void K(fc fcVar) {
    }

    private final /* synthetic */ void L(fc fcVar) {
    }

    private final /* synthetic */ void M(fc fcVar) {
    }

    private final /* synthetic */ void N(fc fcVar) {
    }

    private final /* synthetic */ void O(fc fcVar) {
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

    private final /* synthetic */ void u(fc fcVar) {
    }

    private final /* synthetic */ void v(fc fcVar) {
    }

    private final /* synthetic */ void w(fc fcVar) {
    }

    private final /* synthetic */ void x(fc fcVar) {
    }

    private final /* synthetic */ void y(fc fcVar) {
    }

    private final /* synthetic */ void z(fc fcVar) {
    }
}
