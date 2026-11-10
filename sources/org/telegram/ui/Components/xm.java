package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xm extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ org.telegram.ui.l4 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(org.telegram.ui.l4 l4Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = l4Var;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        if (z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.cn.B8(menu, ((org.telegram.ui.cn) ((an) this.F.e).b.Z1).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z9) {
        an.Q((an) this.F.e, this, z9);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        an.R((an) this.F.e, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        ((an) this.F.e).b.h1(z5Var, true);
    }
}
