package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sp implements m2.f {
    public int a;
    public final /* synthetic */ vh0 b;

    public sp(vh0 vh0Var) {
        this.b = vh0Var;
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
        if (i10 == this.b.getCurrentItem() && f10 == 0.0f && this.a == 1) {
            d();
        }
    }

    @Override // m2.f
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.a = i10;
    }

    public final void d() {
        vh0 vh0Var = this.b;
        if (vh0Var.t0 != null) {
            int currentItem = vh0Var.getCurrentItem();
            int k10 = vh0Var.t0.k(currentItem) + vh0Var.t0.j();
            if (currentItem != k10) {
                vh0Var.x(k10, false);
            }
        }
    }

    @Override // m2.f
    public final void a(int i10) {
    }
}
