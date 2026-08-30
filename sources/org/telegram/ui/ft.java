package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ft extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ lt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft(lt ltVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = ltVar;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        pt ptVar = this.o.a;
        ptVar.k = null;
        ptVar.K = false;
        if (ptVar.R) {
            ptVar.n();
        }
    }
}
