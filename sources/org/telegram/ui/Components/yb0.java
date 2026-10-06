package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class yb0 implements ml0 {
    public final /* synthetic */ cc0 a;

    public yb0(cc0 cc0Var) {
        this.a = cc0Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        cc0 cc0Var = this.a;
        if (cc0Var.a != 1 || cc0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = cc0Var.r.previewMessages.get(i10).getId();
        boolean z10 = cc0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (cc0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            cc0Var.r.selectedIds.delete(id2);
        } else {
            cc0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
        }
        cc0Var.k(true);
    }
}
