package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class mb0 implements zk0 {
    public final /* synthetic */ qb0 a;

    public mb0(qb0 qb0Var) {
        this.a = qb0Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void a(int i10, View view) {
        qb0 qb0Var = this.a;
        if (qb0Var.a != 1 || qb0Var.r.previewMessages.size() <= 1) {
            return;
        }
        int id2 = qb0Var.r.previewMessages.get(i10).getId();
        boolean z10 = qb0Var.r.selectedIds.get(id2, false);
        boolean z11 = !z10;
        if (qb0Var.r.selectedIds.size() == 1 && z10) {
            return;
        }
        if (z10) {
            qb0Var.r.selectedIds.delete(id2);
        } else {
            qb0Var.r.selectedIds.put(id2, z11);
        }
        if (view instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).L3(z11, z11, true);
        }
        qb0Var.k(true);
    }
}
