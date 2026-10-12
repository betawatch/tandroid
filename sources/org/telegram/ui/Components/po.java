package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class po extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ro o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(ro roVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = roVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.fo foVar = this.o.G;
        if (foVar != null) {
            foVar.getClass();
            foVar.j8(false, true, 0.0f);
        }
    }
}
