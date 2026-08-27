package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pn extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ rn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(rn rnVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = rnVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.rn rnVar = this.o.C;
        if (rnVar != null) {
            rnVar.getClass();
            rnVar.g8(false, true, 0.0f);
        }
    }
}
