package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class nn extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ pn C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(pn pnVar, Context context, int i10) {
        super(context, i10, null, null);
        this.C = pnVar;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(eh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) this.C.d.b.c0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z4) {
        rn.M(this.C.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        rn.N(this.C.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(eh.b bVar) {
        this.C.d.b.t1(bVar, true);
    }
}
