package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class lb0 implements al0 {
    public final /* synthetic */ pb0 a;

    public lb0(pb0 pb0Var) {
        this.a = pb0Var;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        pb0 pb0Var = this.a;
        if (pb0Var.a != 1 || pb0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = pb0Var.r.previewMessages.get(i10).getId();
        boolean z10 = pb0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (pb0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            pb0Var.r.selectedIds.delete(id2);
        } else {
            pb0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).L3(z11, z11, true);
        }
        pb0Var.k(true);
    }
}
