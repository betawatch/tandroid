package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hb0 implements zk0 {
    public final /* synthetic */ lb0 a;

    public hb0(lb0 lb0Var) {
        this.a = lb0Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        lb0 lb0Var = this.a;
        if (lb0Var.a != 1 || lb0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = lb0Var.r.previewMessages.get(i10).getId();
        boolean z10 = lb0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (lb0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            lb0Var.r.selectedIds.delete(id2);
        } else {
            lb0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view).L3(z11, z11, true);
        }
        lb0Var.k(true);
    }
}
