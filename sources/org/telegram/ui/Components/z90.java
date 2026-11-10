package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        int e12 = ((org.telegram.messenger.ij) ca0Var.r.f.get(i7)).e1();
        boolean z9 = ca0Var.r.g.get(e12, false);
        boolean z10 = !z9;
        if (ca0Var.r.g.size() == 1 && z9) {
            return;
        }
        if (z9) {
            ca0Var.r.g.delete(e12);
        } else {
            ca0Var.r.g.put(e12, z10);
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).l3(z10, z10, true);
        }
        ca0Var.l(true);
    }
}
