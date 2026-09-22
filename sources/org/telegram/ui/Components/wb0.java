package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class wb0 implements ml0 {
    public final /* synthetic */ ac0 a;

    public wb0(ac0 ac0Var) {
        this.a = ac0Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        ac0 ac0Var = this.a;
        if (ac0Var.a != 1 || ac0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = ac0Var.r.previewMessages.get(i10).getId();
        boolean z10 = ac0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (ac0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            ac0Var.r.selectedIds.delete(id2);
        } else {
            ac0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).L3(z11, z11, true);
        }
        ac0Var.k(true);
    }
}
