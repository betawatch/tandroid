package org.telegram.ui.Components;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class tp implements z4.e {
    public int a;
    public final /* synthetic */ oh0 b;

    public tp(oh0 oh0Var) {
        this.b = oh0Var;
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
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
        oh0 oh0Var = this.b;
        if (oh0Var.w0 != null) {
            int currentItem = oh0Var.getCurrentItem();
            int k10 = oh0Var.w0.k(currentItem) + oh0Var.w0.j();
            if (currentItem != k10) {
                oh0Var.x(k10, false);
            }
        }
    }

    @Override // z4.e
    public final void b(int i10) {
    }
}
