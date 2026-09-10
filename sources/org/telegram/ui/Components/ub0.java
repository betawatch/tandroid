package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ub0 implements jl0 {
    public final /* synthetic */ yb0 a;

    public ub0(yb0 yb0Var) {
        this.a = yb0Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        yb0 yb0Var = this.a;
        if (yb0Var.a != 1 || yb0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = yb0Var.r.previewMessages.get(i10).getId();
        boolean z10 = yb0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (yb0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            yb0Var.r.selectedIds.delete(id2);
        } else {
            yb0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).L3(z11, z11, true);
        }
        yb0Var.k(true);
    }
}
