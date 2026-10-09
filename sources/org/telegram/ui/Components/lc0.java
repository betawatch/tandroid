package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lc0 implements em0 {
    public final /* synthetic */ pc0 a;

    public lc0(pc0 pc0Var) {
        this.a = pc0Var;
    }

    @Override // org.telegram.ui.Components.em0
    public final void d(int i10, View view) {
        pc0 pc0Var = this.a;
        if (pc0Var.a != 1 || pc0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = pc0Var.r.previewMessages.get(i10).getId();
        boolean z10 = pc0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (pc0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            pc0Var.r.selectedIds.delete(id2);
        } else {
            pc0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
        }
        pc0Var.k(true);
    }
}
