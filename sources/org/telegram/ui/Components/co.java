package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
