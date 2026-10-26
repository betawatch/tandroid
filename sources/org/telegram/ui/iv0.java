package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class iv0 extends org.telegram.ui.Cells.h6 {
    public final /* synthetic */ kv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv0(kv0 kv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = kv0Var;
    }

    @Override // org.telegram.ui.Cells.h6
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
        if (g6Var.isFocused() && g6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            un.r8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.h6
    public final void i(boolean z10) {
        mv0.e0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.h6
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        mv0.f0(this.F.d, h6Var);
    }
}
