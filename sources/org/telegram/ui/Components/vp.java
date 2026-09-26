package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class vp implements z4.e {
    public int a;
    public final /* synthetic */ zh0 b;

    public vp(zh0 zh0Var) {
        this.b = zh0Var;
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
        zh0 zh0Var = this.b;
        if (zh0Var.w0 != null) {
            int currentItem = zh0Var.getCurrentItem();
            int k10 = zh0Var.w0.k(currentItem) + zh0Var.w0.j();
            if (currentItem != k10) {
                zh0Var.x(k10, false);
            }
        }
    }

    @Override // z4.e
    public final void a(int i10) {
    }
}
