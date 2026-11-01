package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qn extends org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ sn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(sn snVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = snVar;
    }

    @Override // org.telegram.ui.ActionBar.k1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.un unVar = this.o.G;
        if (unVar != null) {
            unVar.getClass();
            unVar.s8(false, true, 0.0f);
        }
    }
}
