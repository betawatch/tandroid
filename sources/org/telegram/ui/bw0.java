package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bw0 extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ dw0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw0(dw0 dw0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = dw0Var;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        if (c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            fo.n8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        fw0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        fw0.e0(this.F.d, d6Var);
    }
}
