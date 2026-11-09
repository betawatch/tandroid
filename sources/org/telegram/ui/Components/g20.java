package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g20 implements jg.y1 {
    public final /* synthetic */ h20 a;

    public g20(h20 h20Var) {
        this.a = h20Var;
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
        h20 h20Var = this.a;
        i20 i20Var = h20Var.x;
        if (i7 < 0 || i7 != h20Var.n || h20Var.h) {
            return;
        }
        int i10 = h20Var.f - 1;
        boolean z9 = i20Var.q1.getVisibility() == 0;
        h20Var.f();
        if (h20Var.f > i10) {
            i20Var.O0(i10);
        }
        if (h20Var.d.e() || !i20Var.k1.R0()) {
            return;
        }
        i20Var.q1.e(false, z9);
    }

    @Override // jg.y1
    public final a0.h v0() {
        return this.a.x.V1;
    }

    @Override // jg.y1
    public final /* synthetic */ void m1(ArrayList arrayList) {
    }
}
