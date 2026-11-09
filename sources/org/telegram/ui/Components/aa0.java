package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class aa0 implements cj0 {
    public final /* synthetic */ da0 a;

    public aa0(da0 da0Var) {
        this.a = da0Var;
    }

    @Override // org.telegram.ui.Components.cj0
    public final void c(int i7, View view) {
        da0 da0Var = this.a;
        if (da0Var.a != 1 || da0Var.r.f.size() <= 1) {
            return;
        }
        int e12 = ((org.telegram.messenger.ij) da0Var.r.f.get(i7)).e1();
        boolean z9 = da0Var.r.g.get(e12, false);
        boolean z10 = !z9;
        if (da0Var.r.g.size() == 1 && z9) {
            return;
        }
        if (z9) {
            da0Var.r.g.delete(e12);
        } else {
            da0Var.r.g.put(e12, z10);
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).l3(z10, z10, true);
        }
        da0Var.l(true);
    }
}
