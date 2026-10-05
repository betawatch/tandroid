package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class fo extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ ho o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(ho hoVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = hoVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.yn ynVar = this.o.G;
        if (ynVar != null) {
            ynVar.getClass();
            ynVar.g8(false, true, 0.0f);
        }
    }
}
