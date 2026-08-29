package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kn extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ mn B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(mn mnVar, Context context, int i10) {
        super(context, i10, null, null);
        this.B = mnVar;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(bh.b bVar, ActionMode actionMode) {
        if (bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.tn.k8(menu, ((org.telegram.ui.tn) this.B.d.b.b0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z10) {
        on.L(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        on.M(this.B.d, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void k(bh.b bVar) {
        this.B.d.b.t1(bVar, true);
    }
}
