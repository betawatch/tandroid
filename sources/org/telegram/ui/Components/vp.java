package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class vp implements z4.e {
    public int a;
    public final /* synthetic */ ph0 b;

    public vp(ph0 ph0Var) {
        this.b = ph0Var;
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.b.getCurrentItem() && f7 == 0.0f && this.a == 1) {
            d();
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.a = i10;
    }

    public final void d() {
        ph0 ph0Var = this.b;
        if (ph0Var.w0 != null) {
            int currentItem = ph0Var.getCurrentItem();
            int k10 = ph0Var.w0.k(currentItem) + ph0Var.w0.j();
            if (currentItem != k10) {
                ph0Var.x(k10, false);
            }
        }
    }

    @Override // z4.e
    public final void a(int i10) {
    }
}
