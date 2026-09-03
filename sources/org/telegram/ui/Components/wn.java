package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wn extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ yn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(yn ynVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = ynVar;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.zn znVar = this.o.D;
        if (znVar != null) {
            znVar.getClass();
            znVar.g8(false, true, 0.0f);
        }
    }
}
