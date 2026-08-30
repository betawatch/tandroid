package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mb0 implements il0 {
    public final /* synthetic */ qb0 a;

    public mb0(qb0 qb0Var) {
        this.a = qb0Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        qb0 qb0Var = this.a;
        if (qb0Var.a != 1 || qb0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = qb0Var.r.previewMessages.get(i10).getId();
        boolean z4 = qb0Var.r.selectedIds.get(id2, false);
        boolean z10 = !z4;
        if (qb0Var.r.selectedIds.size() == 1 && z4) {
            return;
        }
        if (z4) {
            qb0Var.r.selectedIds.delete(id2);
        } else {
            qb0Var.r.selectedIds.put(id2, z10);
        }
        if (view instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).L3(z10, z10, true);
        }
        qb0Var.k(true);
    }
}
