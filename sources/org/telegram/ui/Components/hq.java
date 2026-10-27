package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hq implements a5.i {
    public int a;
    public final /* synthetic */ oi0 b;

    public hq(oi0 oi0Var) {
        this.b = oi0Var;
    }

    @Override // a5.i
    public final void b(float f7, int i10, int i11) {
        if (i10 == this.b.getCurrentItem() && f7 == 0.0f && this.a == 1) {
            d();
        }
    }

    @Override // a5.i
    public final void c(int i10) {
        if (i10 == 0) {
            d();
        }
        this.a = i10;
    }

    public final void d() {
        oi0 oi0Var = this.b;
        if (oi0Var.w0 != null) {
            int currentItem = oi0Var.getCurrentItem();
            int k10 = oi0Var.w0.k(currentItem) + oi0Var.w0.j();
            if (currentItem != k10) {
                oi0Var.x(k10, false);
            }
        }
    }

    @Override // a5.i
    public final void a(int i10) {
    }
}
