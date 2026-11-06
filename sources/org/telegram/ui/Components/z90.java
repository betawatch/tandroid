package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class z90 implements bj0 {
    public final /* synthetic */ ca0 a;

    public z90(ca0 ca0Var) {
        this.a = ca0Var;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        ca0 ca0Var = this.a;
        if (ca0Var.a != 1 || ca0Var.r.f.size() <= 1) {
            return;
        }
        int f12 = ((org.telegram.messenger.ij) ca0Var.r.f.get(i7)).f1();
        boolean z9 = ca0Var.r.g.get(f12, false);
        boolean z10 = !z9;
        if (ca0Var.r.g.size() == 1 && z9) {
            return;
        }
        if (z9) {
            ca0Var.r.g.delete(f12);
        } else {
            ca0Var.r.g.put(f12, z10);
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).k3(z10, z10, true);
        }
        ca0Var.l(true);
    }
}
