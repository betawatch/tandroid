package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class pv0 extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ rv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv0(rv0 rv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = rv0Var;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            xn.k8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        tv0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        tv0.e0(this.F.d, d6Var);
    }
}
