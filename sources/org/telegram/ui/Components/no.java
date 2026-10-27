package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class no extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ po o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(po poVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = poVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.wn wnVar = this.o.G;
        if (wnVar != null) {
            wnVar.getClass();
            wnVar.p8(false, true, 0.0f);
        }
    }
}
