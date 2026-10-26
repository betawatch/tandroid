package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ao extends org.telegram.ui.Cells.h6 {
    public final /* synthetic */ eo F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(eo eoVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = eoVar;
    }

    @Override // org.telegram.ui.Cells.h6
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
        if (g6Var.isFocused() && g6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.un.r8(menu, ((org.telegram.ui.un) this.F.d.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.h6
    public final void i(boolean z10) {
        go.P(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.h6
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        go.Q(this.F.d, h6Var);
    }

    @Override // org.telegram.ui.Cells.h6
    public final void k(org.telegram.ui.Cells.g6 g6Var) {
        this.F.d.b.y1(g6Var, true);
    }
}
