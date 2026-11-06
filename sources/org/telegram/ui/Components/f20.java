package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class f20 implements jg.y1 {
    public final /* synthetic */ g20 a;

    public f20(g20 g20Var) {
        this.a = g20Var;
    }

    @Override // jg.y1
    public final /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // jg.y1
    public final /* synthetic */ boolean k1(int i7) {
        return true;
    }

    @Override // jg.y1
    public final void q(int i7) {
        g20 g20Var = this.a;
        h20 h20Var = g20Var.x;
        if (i7 < 0 || i7 != g20Var.n || g20Var.h) {
            return;
        }
        int i10 = g20Var.f - 1;
        boolean z9 = h20Var.q1.getVisibility() == 0;
        g20Var.f();
        if (g20Var.f > i10) {
            h20Var.O0(i10);
        }
        if (g20Var.d.e() || !h20Var.k1.R0()) {
            return;
        }
        h20Var.q1.e(false, z9);
    }

    @Override // jg.y1
    public final a0.h v0() {
        return this.a.x.V1;
    }

    @Override // jg.y1
    public final /* synthetic */ void m1(ArrayList arrayList) {
    }
}
