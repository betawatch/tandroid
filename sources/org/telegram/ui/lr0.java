package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class lr0 extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ nr0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr0(nr0 nr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = nr0Var;
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
        pr0.i0(this.F.d, this, z9);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        pr0.j0(this.F.d, a6Var);
    }
}
