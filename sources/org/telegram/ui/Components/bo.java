package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
