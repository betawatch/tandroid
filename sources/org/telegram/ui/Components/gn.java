package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gn extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ fg.j F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(fg.j jVar, Context context, int i10) {
        super(context, i10, null, null);
        this.F = jVar;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(ih.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.un.x8(menu, ((org.telegram.ui.un) ((jn) this.F.e).b.W1).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        jn.P((jn) this.F.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        jn.Q((jn) this.F.e, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void k(ih.b bVar) {
        ((jn) this.F.e).b.g1(bVar, true);
    }
}
