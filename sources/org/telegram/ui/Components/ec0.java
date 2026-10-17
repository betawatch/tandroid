package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ec0 implements wl0 {
    public final /* synthetic */ ic0 a;

    public ec0(ic0 ic0Var) {
        this.a = ic0Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        ic0 ic0Var = this.a;
        if (ic0Var.a != 1 || ic0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = ic0Var.r.previewMessages.get(i10).getId();
        boolean z10 = ic0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (ic0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            ic0Var.r.selectedIds.delete(id2);
        } else {
            ic0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
        }
        ic0Var.l(true);
    }
}
