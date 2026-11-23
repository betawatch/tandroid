package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class lr0 extends org.telegram.ui.Cells.b6 {
    public final /* synthetic */ nr0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr0(nr0 nr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = nr0Var;
    }

    @Override // org.telegram.ui.Cells.b6
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            bn.C8(menu, this.G.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.b6
    public final void j(boolean z10) {
        pr0.i0(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        pr0.j0(this.G.d, b6Var);
    }
}
