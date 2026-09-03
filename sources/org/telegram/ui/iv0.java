package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class iv0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ kv0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv0(kv0 kv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.C = kv0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(eh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            xn.k8(menu, this.C.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z4) {
        mv0.d0(this.C.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        mv0.e0(this.C.d, c6Var);
    }
}
