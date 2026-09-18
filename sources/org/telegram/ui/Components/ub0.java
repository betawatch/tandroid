package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ub0 implements kl0 {
    public final /* synthetic */ yb0 a;

    public ub0(yb0 yb0Var) {
        this.a = yb0Var;
    }

    @Override // org.telegram.ui.Components.kl0
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
        if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
        }
        yb0Var.k(true);
    }
}
