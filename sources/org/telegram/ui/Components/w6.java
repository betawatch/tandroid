package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w6 implements org.telegram.ui.ActionBar.v6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.v6
    public final /* synthetic */ void a(float f10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.v6
    public final void b() {
        switch (this.a) {
            case 0:
                ((g8) this.b).L0();
                break;
            case 1:
                ((kl) this.b).b0();
                break;
            case 2:
                kq kqVar = (kq) this.b;
                org.telegram.ui.ActionBar.r0 r0Var = kqVar.J;
                r0Var.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, kqVar.e0));
                org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.I5, kqVar.e0), r0Var.getBackground());
                r0Var.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, kqVar.e0), false);
                r0Var.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, kqVar.e0), true);
                r0Var.I(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, kqVar.e0));
                break;
            case 3:
                ((df0) this.b).N0();
                break;
            case 4:
                om0 om0Var = ((rm0) this.b).A0;
                if (om0Var != null) {
                    om0Var.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y8, false));
                    break;
                }
                break;
            case 5:
                ((Runnable) this.b).run();
                break;
            case 6:
                ((iw0) this.b).Y0(false);
                break;
            default:
                ((h41) this.b).d();
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
