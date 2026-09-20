package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class bo extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ eo o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(eo eoVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = eoVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.zn znVar = this.o.G;
        if (znVar != null) {
            znVar.getClass();
            znVar.g8(false, true, 0.0f);
        }
    }
}
