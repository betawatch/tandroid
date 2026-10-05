package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class sn extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ vn F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(vn vnVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = vnVar;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.yn.k8(menu, ((org.telegram.ui.yn) this.F.d.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        xn.K(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        xn.L(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.b.s1(c6Var, true);
    }
}
