package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        boolean z9 = h20Var.t1.getVisibility() == 0;
        g20Var.f();
        if (g20Var.f > i10) {
            h20Var.O0(i10);
        }
        if (g20Var.d.e() || !h20Var.n1.R0()) {
            return;
        }
        h20Var.t1.e(false, z9);
    }

    @Override // jg.y1
    public final a0.h v0() {
        return this.a.x.Y1;
    }

    @Override // jg.y1
    public final /* synthetic */ void m1(ArrayList arrayList) {
    }
}
