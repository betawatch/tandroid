package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class br0 extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ dr0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(dr0 dr0Var, Context context, int i3) {
        super(context, i3, null, null);
        this.G = dr0Var;
    }

    @Override // org.telegram.ui.Cells.z5
    public final void g(ai.z zVar, ActionMode actionMode) {
        if (zVar.isFocused() && zVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            wm.A8(menu, this.G.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void i(boolean z10) {
        fr0.i0(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        fr0.j0(this.G.d, z5Var);
    }
}
