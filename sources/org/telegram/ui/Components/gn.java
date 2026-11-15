package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gn extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ org.telegram.ui.l4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(org.telegram.ui.l4 l4Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = l4Var;
    }

    @Override // org.telegram.ui.Cells.z5
    public final void h(bi.u uVar, ActionMode actionMode) {
        if (uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.an.C8(menu, ((org.telegram.ui.an) ((jn) this.G.e).b.a2).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(boolean z10) {
        jn.R((jn) this.G.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        jn.S((jn) this.G.e, z5Var);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void l(bi.u uVar) {
        ((jn) this.G.e).b.h1(uVar, true);
    }
}
