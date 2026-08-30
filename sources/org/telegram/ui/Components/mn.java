package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mn extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ on C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(on onVar, Context context, int i10) {
        super(context, i10, null, null);
        this.C = onVar;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(dh.b bVar, ActionMode actionMode) {
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
        qn.M(this.C.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        qn.N(this.C.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(dh.b bVar) {
        this.C.d.b.t1(bVar, true);
    }
}
