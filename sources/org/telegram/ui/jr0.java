package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jr0 extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ lr0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr0(lr0 lr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = lr0Var;
    }

    @Override // org.telegram.ui.Cells.z5
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            an.C8(menu, this.G.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(boolean z10) {
        nr0.i0(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        nr0.j0(this.G.d, z5Var);
    }
}
