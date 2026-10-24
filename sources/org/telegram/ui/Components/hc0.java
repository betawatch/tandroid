package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class hc0 implements am0 {
    public final /* synthetic */ lc0 a;

    public hc0(lc0 lc0Var) {
        this.a = lc0Var;
    }

    @Override // org.telegram.ui.Components.am0
    public final void d(int i10, View view) {
        lc0 lc0Var = this.a;
        if (lc0Var.a != 1 || lc0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = lc0Var.r.previewMessages.get(i10).getId();
        boolean z10 = lc0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (lc0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            lc0Var.r.selectedIds.delete(id2);
        } else {
            lc0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).K3(z11, z11, true);
        }
        lc0Var.l(true);
    }
}
