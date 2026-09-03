package org.telegram.ui;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class iv0 extends org.telegram.ui.Cells.b6 {
    public final /* synthetic */ kv0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv0(kv0 kv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.C = kv0Var;
    }

    @Override // org.telegram.ui.Cells.b6
    public final void g(dh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            zn.k8(menu, this.C.d.f.h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.b6
    public final void i(boolean z4) {
        mv0.d0(this.C.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void j(org.telegram.ui.Cells.b6 b6Var) {
        mv0.e0(this.C.d, b6Var);
    }
}
