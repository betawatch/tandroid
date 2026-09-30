package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class xb0 implements ml0 {
    public final /* synthetic */ bc0 a;

    public xb0(bc0 bc0Var) {
        this.a = bc0Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        bc0 bc0Var = this.a;
        if (bc0Var.a != 1 || bc0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = bc0Var.r.previewMessages.get(i10).getId();
        boolean z10 = bc0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (bc0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            bc0Var.r.selectedIds.delete(id2);
        } else {
            bc0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
        }
        bc0Var.k(true);
    }
}
