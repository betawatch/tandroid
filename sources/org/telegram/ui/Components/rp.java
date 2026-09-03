package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class rp implements m2.f {
    public int a;
    public final /* synthetic */ wh0 b;

    public rp(wh0 wh0Var) {
        this.b = wh0Var;
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
        wh0 wh0Var = this.b;
        if (wh0Var.t0 != null) {
            int currentItem = wh0Var.getCurrentItem();
            int k10 = wh0Var.t0.k(currentItem) + wh0Var.t0.j();
            if (currentItem != k10) {
                wh0Var.x(k10, false);
            }
        }
    }

    @Override // m2.f
    public final void a(int i10) {
    }
}
