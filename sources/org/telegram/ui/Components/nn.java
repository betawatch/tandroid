package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class nn extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ org.telegram.ui.l4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(org.telegram.ui.l4 l4Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = l4Var;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) ((qn) this.G.e).b.a2).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(boolean z10) {
        qn.R((qn) this.G.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void k(org.telegram.ui.Cells.a6 a6Var) {
        qn.S((qn) this.G.e, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void l(bi.u uVar) {
        ((qn) this.G.e).b.i1(uVar, true);
    }
}
