package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ra0 implements gk0 {
    public final /* synthetic */ ua0 a;

    public ra0(ua0 ua0Var) {
        this.a = ua0Var;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void f(int i10, View view) {
        ua0 ua0Var = this.a;
        if (ua0Var.a != 1 || ua0Var.r.f.size() <= 1) {
            return;
        }
        int f12 = ((org.telegram.messenger.jj) ua0Var.r.f.get(i10)).f1();
        boolean z10 = ua0Var.r.g.get(f12, false);
        boolean z11 = !z10;
        if (ua0Var.r.g.size() == 1 && z10) {
            return;
        }
        if (z10) {
            ua0Var.r.g.delete(f12);
        } else {
            ua0Var.r.g.put(f12, z11);
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).h3(z11, z11, true);
        }
        ua0Var.l(true);
    }
}
