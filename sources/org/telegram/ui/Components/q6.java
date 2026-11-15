package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6 implements org.telegram.ui.ActionBar.r6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.r6
    public final /* synthetic */ void a(float f10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.r6
    public final void b() {
        switch (this.a) {
            case 0:
                ((y7) this.b).K0();
                break;
            case 1:
                ((dl) this.b).b0();
                break;
            case 2:
                dq dqVar = (dq) this.b;
                org.telegram.ui.ActionBar.q0 q0Var = dqVar.J;
                q0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, dqVar.e0));
                org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.I5, dqVar.e0), q0Var.getBackground());
                q0Var.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, dqVar.e0), false);
                q0Var.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, dqVar.e0), true);
                q0Var.I(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, dqVar.e0));
                break;
            case 3:
                ((te0) this.b).M0();
                break;
            case 4:
                gm0 gm0Var = ((jm0) this.b).A0;
                if (gm0Var != null) {
                    gm0Var.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.y8, false));
                    break;
                }
                break;
            case 5:
                ((Runnable) this.b).run();
                break;
            case 6:
                ((bw0) this.b).X0(false);
                break;
            default:
                ((x31) this.b).d();
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
