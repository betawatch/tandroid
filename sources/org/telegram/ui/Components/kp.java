package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kp implements m2.e {
    public int a;
    public final /* synthetic */ ah0 b;

    public kp(ah0 ah0Var) {
        this.b = ah0Var;
    }

    public final void a() {
        ah0 ah0Var = this.b;
        if (ah0Var.s0 != null) {
            int currentItem = ah0Var.getCurrentItem();
            int k10 = ah0Var.s0.k(currentItem) + ah0Var.s0.j();
            if (currentItem != k10) {
                ah0Var.x(k10, false);
            }
        }
    }

    @Override // m2.e
    public final void c(float f10, int i9, int i10) {
        if (i9 == this.b.getCurrentItem() && f10 == 0.0f && this.a == 1) {
            a();
        }
    }

    @Override // m2.e
    public final void d(int i9) {
        if (i9 == 0) {
            a();
        }
        this.a = i9;
    }

    @Override // m2.e
    public final void b(int i9) {
    }
}
