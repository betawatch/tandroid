package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements org.telegram.ui.ActionBar.g7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.g7
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.g7
    public final void b() {
        switch (this.a) {
            case 0:
                ((m8) this.b).v0();
                break;
            case 1:
                ((sl) this.b).Y();
                break;
            case 2:
                yq yqVar = (yq) this.b;
                org.telegram.ui.ActionBar.w0 w0Var = yqVar.I;
                w0Var.setIconColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, yqVar.d0));
                org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.I5, yqVar.d0), w0Var.getBackground());
                w0Var.O(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, yqVar.d0), false);
                w0Var.O(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.F8, yqVar.d0), true);
                w0Var.H(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, yqVar.d0));
                break;
            case 3:
                ((oh0) this.b).U();
                break;
            case 4:
                bp0 bp0Var = ((fp0) this.b).z0;
                if (bp0Var != null) {
                    bp0Var.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y8, false));
                    break;
                }
                break;
            case 5:
                ((Runnable) this.b).run();
                break;
            case 6:
                ((dz0) this.b).B0(false);
                break;
            default:
                ((q61) this.b).d();
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
