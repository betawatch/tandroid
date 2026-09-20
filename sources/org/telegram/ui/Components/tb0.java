package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class tb0 implements jl0 {
    public final /* synthetic */ xb0 a;

    public tb0(xb0 xb0Var) {
        this.a = xb0Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        xb0 xb0Var = this.a;
        if (xb0Var.a != 1 || xb0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = xb0Var.r.previewMessages.get(i10).getId();
        boolean z10 = xb0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (xb0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            xb0Var.r.selectedIds.delete(id2);
        } else {
            xb0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
        }
        xb0Var.k(true);
    }
}
