package ai;

import android.widget.FrameLayout;
import ei.i9;
import ei.r9;
import gi.i8;
import gi.va;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.za;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h1 implements za {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.za
    public final void b(ac acVar) {
        ei.c4 c4Var;
        switch (this.a) {
            case 0:
                fb fbVar = acVar.e;
                i1 i1Var = (i1) this.b;
                gh.g c2 = i1Var.m1.c(fbVar, null, true);
                hh.e eVar = new hh.e(i1Var.J0);
                eVar.e = new i8(9);
                float N = org.telegram.messenger.g0.N(0.5f);
                float N2 = org.telegram.messenger.g0.N(0.5f);
                eVar.f = N;
                eVar.h = N2;
                c2.p(eVar);
                c2.r(org.telegram.messenger.g0.L(16.0f));
                fbVar.setCustomBackground(c2);
                break;
            case 2:
                if (acVar.a == 2 && (c4Var = ((ei.m3) this.b).y.A1) != null) {
                    r9 r9Var = ((i9) c4Var).d;
                    r9Var.Z0 = true;
                    r9Var.d0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ void c(float f10) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.za
    public final void d(ac acVar) {
        ei.c4 c4Var;
        switch (this.a) {
            case 2:
                if (acVar.a == 2 && (c4Var = ((ei.m3) this.b).y.A1) != null) {
                    r9 r9Var = ((i9) c4Var).d;
                    r9Var.Z0 = false;
                    r9Var.d0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.za
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.za
    public final int f(int i3) {
        int editTextHeight;
        int L;
        i0.b bVar;
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return (int) ((dh.a0) ((c0) this.b).c).u;
            case 2:
                if (((ei.m3) this.b).y.h2) {
                    return 0;
                }
                return org.telegram.messenger.g0.L(64.0f);
            case 3:
                return ((ei.k5) this.b).r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                editTextHeight = ((va) this.b).d1.getEditTextHeight();
                L = org.telegram.messenger.g0.L(12.0f);
                break;
            case 6:
                return ((o7) this.b).e.v1.getHeight();
            case 7:
                za zaVar = (za) this.b;
                if (zaVar == null) {
                    return 0;
                }
                return zaVar.f(i3);
            case 8:
                editTextHeight = org.telegram.messenger.g0.L(126.0f);
                L = ((pl) this.b).c.b.Q();
                break;
            case 9:
                bVar = ((org.telegram.ui.ActionBar.d2) ((r80) this.b)).mSystemInsets;
                editTextHeight = bVar.d;
                L = org.telegram.messenger.g0.L(72.0f);
                break;
            case 10:
                FrameLayout frameLayout = ((xv0) this.b).t1;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.b;
                if (!(w0Var.getParent() instanceof ii.c4)) {
                    return 0;
                }
                ii.c4 c4Var = (ii.c4) w0Var.getParent();
                return (int) ((c4Var.getSwipeOffsetY() + c4Var.getOffsetY()) - c4Var.getTopActionBarOffsetY());
        }
        return L + editTextHeight;
    }

    @Override // org.telegram.ui.Components.za
    public final boolean g(int i3) {
        switch (this.a) {
            case 2:
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                }
                break;
            case 7:
                za zaVar = (za) this.b;
                if (zaVar == null || !zaVar.g(i3)) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.za
    public final int h(int i3) {
        switch (this.a) {
            case 7:
                za zaVar = (za) this.b;
                if (zaVar != null) {
                    break;
                } else {
                    break;
                }
        }
        return 0;
    }

    private final /* synthetic */ void A(ac acVar) {
    }

    private final /* synthetic */ void B(ac acVar) {
    }

    private final /* synthetic */ void C(ac acVar) {
    }

    private final /* synthetic */ void D(ac acVar) {
    }

    private final /* synthetic */ void E(ac acVar) {
    }

    private final /* synthetic */ void F(ac acVar) {
    }

    private final /* synthetic */ void G(ac acVar) {
    }

    private final /* synthetic */ void H(ac acVar) {
    }

    private final /* synthetic */ void I(ac acVar) {
    }

    private final /* synthetic */ void J(ac acVar) {
    }

    private final /* synthetic */ void K(ac acVar) {
    }

    private final /* synthetic */ void L(ac acVar) {
    }

    private final /* synthetic */ void M(ac acVar) {
    }

    private final /* synthetic */ void N(ac acVar) {
    }

    private final /* synthetic */ void O(ac acVar) {
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

    private final /* synthetic */ void u(ac acVar) {
    }

    private final /* synthetic */ void v(ac acVar) {
    }

    private final /* synthetic */ void w(ac acVar) {
    }

    private final /* synthetic */ void x(ac acVar) {
    }

    private final /* synthetic */ void y(ac acVar) {
    }

    private final /* synthetic */ void z(ac acVar) {
    }
}
