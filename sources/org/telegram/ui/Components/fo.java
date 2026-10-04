package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
