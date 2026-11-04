package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6 implements org.telegram.ui.ActionBar.s6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q6(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.s6
    public final /* synthetic */ void a(float f10) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.s6
    public final void b() {
        switch (this.a) {
            case 0:
                ((z7) this.b).K0();
                break;
            case 1:
                ((uk) this.b).b0();
                break;
            case 2:
                vp vpVar = (vp) this.b;
                org.telegram.ui.ActionBar.q0 q0Var = vpVar.J;
                q0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, vpVar.e0));
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I5, vpVar.e0), q0Var.getBackground());
                q0Var.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, vpVar.e0), false);
                q0Var.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, vpVar.e0), true);
                q0Var.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, vpVar.e0));
                break;
            case 3:
                ((se0) this.b).M0();
                break;
            case 4:
                fm0 fm0Var = ((im0) this.b).A0;
                if (fm0Var != null) {
                    fm0Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y8, false));
                    break;
                }
                break;
            case 5:
                ((Runnable) this.b).run();
                break;
            case 6:
                ((xv0) this.b).X0(false);
                break;
            default:
                ((n31) this.b).d();
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
