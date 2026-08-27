package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wa0 implements pk0 {
    public final /* synthetic */ ab0 a;

    public wa0(ab0 ab0Var) {
        this.a = ab0Var;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        ab0 ab0Var = this.a;
        if (ab0Var.a != 1 || ab0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = ab0Var.r.previewMessages.get(i10).getId();
        boolean z10 = ab0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (ab0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            ab0Var.r.selectedIds.delete(id2);
        } else {
            ab0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view).K3(z11, z11, true);
        }
        ab0Var.k(true);
    }
}
