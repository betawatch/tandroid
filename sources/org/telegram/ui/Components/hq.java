package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hq implements a5.i {
    public int a;
    public final /* synthetic */ ni0 b;

    public hq(ni0 ni0Var) {
        this.b = ni0Var;
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
        ni0 ni0Var = this.b;
        if (ni0Var.w0 != null) {
            int currentItem = ni0Var.getCurrentItem();
            int k10 = ni0Var.w0.k(currentItem) + ni0Var.w0.j();
            if (currentItem != k10) {
                ni0Var.x(k10, false);
            }
        }
    }

    @Override // a5.i
    public final void a(int i10) {
    }
}
