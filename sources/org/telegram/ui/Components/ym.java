package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
            org.telegram.ui.cn.B8(menu, ((org.telegram.ui.cn) ((bn) this.F.e).b.W1).h, false, true, true, true);
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
