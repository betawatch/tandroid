package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ym extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ org.telegram.ui.l4 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(org.telegram.ui.l4 l4Var, Context context, int i7) {
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
            org.telegram.ui.an.A8(menu, ((org.telegram.ui.an) ((bn) this.F.e).b.W1).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z9) {
        bn.Q((bn) this.F.e, this, z9);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        bn.R((bn) this.F.e, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        ((bn) this.F.e).b.h1(z5Var, true);
    }
}
