package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class dp implements c5.g {
    public int a;
    public final /* synthetic */ sf0 b;

    public dp(sf0 sf0Var) {
        this.b = sf0Var;
    }

    @Override // c5.g
    public final void b(float f10, int i7, int i10) {
        if (i7 == this.b.getCurrentItem() && f10 == 0.0f && this.a == 1) {
            d();
        }
    }

    @Override // c5.g
    public final void c(int i7) {
        if (i7 == 0) {
            d();
        }
        this.a = i7;
    }

    public final void d() {
        sf0 sf0Var = this.b;
        if (sf0Var.w0 != null) {
            int currentItem = sf0Var.getCurrentItem();
            int k10 = sf0Var.w0.k(currentItem) + sf0Var.w0.j();
            if (currentItem != k10) {
                sf0Var.x(k10, false);
            }
        }
    }

    @Override // c5.g
    public final void a(int i7) {
    }
}
