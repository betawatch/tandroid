package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kb0 implements al0 {
    public final /* synthetic */ ob0 a;

    public kb0(ob0 ob0Var) {
        this.a = ob0Var;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        ob0 ob0Var = this.a;
        if (ob0Var.a != 1 || ob0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = ob0Var.r.previewMessages.get(i10).getId();
        boolean z10 = ob0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (ob0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            ob0Var.r.selectedIds.delete(id2);
        } else {
            ob0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).L3(z11, z11, true);
        }
        ob0Var.k(true);
    }
}
