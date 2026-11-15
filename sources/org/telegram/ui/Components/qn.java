package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qn extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ sn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(sn snVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = snVar;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.an anVar = this.o.H;
        if (anVar != null) {
            anVar.getClass();
            anVar.x8(false, true, 0.0f);
        }
    }
}
