package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ao extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ co o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(co coVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = coVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.co coVar = this.o.G;
        if (coVar != null) {
            coVar.getClass();
            coVar.g8(false, true, 0.0f);
        }
    }
}
