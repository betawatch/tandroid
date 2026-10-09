package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kq implements z4.e {
    public int a;
    public final /* synthetic */ ti0 b;

    public kq(ti0 ti0Var) {
        this.b = ti0Var;
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
        ti0 ti0Var = this.b;
        if (ti0Var.w0 != null) {
            int currentItem = ti0Var.getCurrentItem();
            int k10 = ti0Var.w0.k(currentItem) + ti0Var.w0.j();
            if (currentItem != k10) {
                ti0Var.x(k10, false);
            }
        }
    }

    @Override // z4.e
    public final void a(int i10) {
    }
}
