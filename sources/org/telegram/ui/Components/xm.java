package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xm extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ org.telegram.ui.n4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(org.telegram.ui.n4 n4Var, Context context, int i3) {
        super(context, i3, null, null);
        this.G = n4Var;
    }

    @Override // org.telegram.ui.Cells.z5
    public final void g(ai.z zVar, ActionMode actionMode) {
        if (zVar.isFocused() && zVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.wm.A8(menu, ((org.telegram.ui.wm) ((an) this.G.e).b.X1).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void i(boolean z10) {
        an.Q((an) this.G.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        an.R((an) this.G.e, z5Var);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void k(ai.z zVar) {
        ((an) this.G.e).b.h1(zVar, true);
    }
}
