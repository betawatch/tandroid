package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o6 implements org.telegram.ui.ActionBar.b7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.b7
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.b7
    public final void b() {
        switch (this.a) {
            case 0:
                ((w7) this.b).K0();
                break;
            case 1:
                ((bl) this.b).Y();
                break;
            case 2:
                cq cqVar = (cq) this.b;
                org.telegram.ui.ActionBar.t0 t0Var = cqVar.I;
                t0Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, cqVar.d0));
                org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.I5, cqVar.d0), t0Var.getBackground());
                t0Var.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, cqVar.d0), false);
                t0Var.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, cqVar.d0), true);
                t0Var.H(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, cqVar.d0));
                break;
            case 3:
                ((tf0) this.b).M0();
                break;
            case 4:
                dn0 dn0Var = ((gn0) this.b).z0;
                if (dn0Var != null) {
                    dn0Var.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y8, false));
                    break;
                }
                break;
            case 5:
                ((Runnable) this.b).run();
                break;
            case 6:
                ((cx0) this.b).X0(false);
                break;
            default:
                ((w41) this.b).d();
                break;
        }
    }

    private final /* synthetic */ void c(float f7) {
    }

    private final /* synthetic */ void d(float f7) {
    }

    private final /* synthetic */ void e(float f7) {
    }

    private final /* synthetic */ void f(float f7) {
    }

    private final /* synthetic */ void g(float f7) {
    }

    private final /* synthetic */ void h(float f7) {
    }

    private final /* synthetic */ void i(float f7) {
    }

    private final /* synthetic */ void j(float f7) {
    }
}
