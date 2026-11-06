package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class kr0 extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ mr0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr0(mr0 mr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = mr0Var;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        if (z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            an.A8(menu, this.F.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z9) {
        or0.i0(this.F.d, this, z9);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        or0.j0(this.F.d, a6Var);
    }
}
