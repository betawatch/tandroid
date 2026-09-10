package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class aq implements z4.e {
    public int a;
    public final /* synthetic */ yh0 b;

    public aq(yh0 yh0Var) {
        this.b = yh0Var;
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
        yh0 yh0Var = this.b;
        if (yh0Var.w0 != null) {
            int currentItem = yh0Var.getCurrentItem();
            int k10 = yh0Var.w0.k(currentItem) + yh0Var.w0.j();
            if (currentItem != k10) {
                yh0Var.x(k10, false);
            }
        }
    }

    @Override // z4.e
    public final void a(int i10) {
    }
}
