package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class qn extends org.telegram.ui.Cells.b6 {
    public final /* synthetic */ org.telegram.ui.l4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(org.telegram.ui.l4 l4Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = l4Var;
    }

    @Override // org.telegram.ui.Cells.b6
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) ((tn) this.G.e).b.a2).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.b6
    public final void j(boolean z10) {
        tn.R((tn) this.G.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        tn.S((tn) this.G.e, b6Var);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void l(bi.u uVar) {
        ((tn) this.G.e).b.i1(uVar, true);
    }
}
