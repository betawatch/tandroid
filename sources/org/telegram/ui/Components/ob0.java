package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ob0 implements il0 {
    public final /* synthetic */ sb0 a;

    public ob0(sb0 sb0Var) {
        this.a = sb0Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        sb0 sb0Var = this.a;
        if (sb0Var.a != 1 || sb0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = sb0Var.r.previewMessages.get(i10).getId();
        boolean z4 = sb0Var.r.selectedIds.get(id2, false);
        boolean z10 = !z4;
        if (sb0Var.r.selectedIds.size() == 1 && z4) {
            return;
        }
        if (z4) {
            sb0Var.r.selectedIds.delete(id2);
        } else {
            sb0Var.r.selectedIds.put(id2, z10);
        }
        if (view instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).L3(z10, z10, true);
        }
        sb0Var.k(true);
    }
}
