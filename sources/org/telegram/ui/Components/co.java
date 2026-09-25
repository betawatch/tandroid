package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class co extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ fo o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(fo foVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = foVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.wn wnVar = this.o.G;
        if (wnVar != null) {
            wnVar.getClass();
            wnVar.g8(false, true, 0.0f);
        }
    }
}
