package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nb0 implements hl0 {
    public final /* synthetic */ rb0 a;

    public nb0(rb0 rb0Var) {
        this.a = rb0Var;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void d(int i10, View view) {
        rb0 rb0Var = this.a;
        if (rb0Var.a != 1 || rb0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = rb0Var.r.previewMessages.get(i10).getId();
        boolean z4 = rb0Var.r.selectedIds.get(id2, false);
        boolean z10 = !z4;
        if (rb0Var.r.selectedIds.size() == 1 && z4) {
            return;
        }
        if (z4) {
            rb0Var.r.selectedIds.delete(id2);
        } else {
            rb0Var.r.selectedIds.put(id2, z10);
        }
        if (view instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view).L3(z10, z10, true);
        }
        rb0Var.k(true);
    }
}
