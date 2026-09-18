package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class bo extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ eo o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(eo eoVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = eoVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.bo boVar = this.o.G;
        if (boVar != null) {
            boVar.getClass();
            boVar.g8(false, true, 0.0f);
        }
    }
}
