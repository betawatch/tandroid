package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class vb0 implements kl0 {
    public final /* synthetic */ zb0 a;

    public vb0(zb0 zb0Var) {
        this.a = zb0Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        zb0 zb0Var = this.a;
        if (zb0Var.a != 1 || zb0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = zb0Var.r.previewMessages.get(i10).getId();
        boolean z10 = zb0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (zb0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            zb0Var.r.selectedIds.delete(id2);
        } else {
            zb0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
        }
        zb0Var.k(true);
    }
}
