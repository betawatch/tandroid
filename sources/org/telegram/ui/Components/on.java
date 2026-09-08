package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class on extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ rn F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(rn rnVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = rnVar;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        if (b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.co.k8(menu, ((org.telegram.ui.co) this.F.d.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        tn.M(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        tn.N(this.F.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        this.F.d.b.t1(b6Var, true);
    }
}
