package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dc0 implements zl0 {
    public final /* synthetic */ hc0 a;

    public dc0(hc0 hc0Var) {
        this.a = hc0Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(int i10, View view) {
        hc0 hc0Var = this.a;
        if (hc0Var.a != 1 || hc0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = hc0Var.r.previewMessages.get(i10).getId();
        boolean z10 = hc0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (hc0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            hc0Var.r.selectedIds.delete(id2);
        } else {
            hc0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view).N3(z11, z11, true);
        }
        hc0Var.l(true);
    }
}
