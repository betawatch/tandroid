package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements org.telegram.ui.ActionBar.s6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.s6
    public final /* synthetic */ void a(float f10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.s6
    public final void b() {
        switch (this.a) {
            case 0:
                ((b8) this.b).K0();
                break;
            case 1:
                ((wk) this.b).b0();
                break;
            case 2:
                vp vpVar = (vp) this.b;
                org.telegram.ui.ActionBar.r0 r0Var = vpVar.I;
                r0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, vpVar.d0));
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I5, vpVar.d0), r0Var.getBackground());
                r0Var.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, vpVar.d0), false);
                r0Var.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, vpVar.d0), true);
                r0Var.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, vpVar.d0));
                break;
            case 3:
                ((qe0) this.b).M0();
                break;
            case 4:
                cm0 cm0Var = ((fm0) this.b).z0;
                if (cm0Var != null) {
                    cm0Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y8, false));
                    break;
                }
                break;
            case 5:
                ((Runnable) this.b).run();
                break;
            case 6:
                ((yv0) this.b).X0(false);
                break;
            default:
                ((t31) this.b).d();
                break;
        }
    }

    private final /* synthetic */ void c(float f10) {
    }

    private final /* synthetic */ void d(float f10) {
    }

    private final /* synthetic */ void e(float f10) {
    }

    private final /* synthetic */ void f(float f10) {
    }

    private final /* synthetic */ void g(float f10) {
    }

    private final /* synthetic */ void h(float f10) {
    }

    private final /* synthetic */ void i(float f10) {
    }

    private final /* synthetic */ void j(float f10) {
    }
}
