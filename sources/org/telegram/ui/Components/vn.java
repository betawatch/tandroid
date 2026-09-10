package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vn extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ xn F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(xn xnVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = xnVar;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        if (d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.eo.k8(menu, ((org.telegram.ui.eo) this.F.d.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        zn.M(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        zn.N(this.F.d, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void k(org.telegram.ui.Cells.d6 d6Var) {
        this.F.d.b.t1(d6Var, true);
    }
}
