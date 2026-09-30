package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class rn extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ un F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(un unVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = unVar;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.wn.k8(menu, ((org.telegram.ui.wn) this.F.d.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        wn.M(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        wn.N(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.b.t1(c6Var, true);
    }
}
