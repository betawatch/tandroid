package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class en extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ gn B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(gn gnVar, Context context, int i10) {
        super(context, i10, null, null);
        this.B = gnVar;
    }

    @Override // org.telegram.ui.Cells.z5
    public final void g(gh.r rVar, ActionMode actionMode) {
        if (rVar.isFocused() && rVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.rn.k8(menu, ((org.telegram.ui.rn) this.B.d.b.b0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void i(boolean z10) {
        in.M(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        in.N(this.B.d, z5Var);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void k(gh.r rVar) {
        this.B.d.b.t1(rVar, true);
    }
}
