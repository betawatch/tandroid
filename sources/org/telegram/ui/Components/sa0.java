package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sa0 implements mk0 {
    public final /* synthetic */ wa0 a;

    public sa0(wa0 wa0Var) {
        this.a = wa0Var;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        wa0 wa0Var = this.a;
        if (wa0Var.a != 1 || wa0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = wa0Var.r.previewMessages.get(i9).getId();
        boolean z10 = wa0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (wa0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            wa0Var.r.selectedIds.delete(id2);
        } else {
            wa0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).L3(z11, z11, true);
        }
        wa0Var.k(true);
    }
}
