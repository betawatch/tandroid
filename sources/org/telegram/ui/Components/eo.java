package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class eo extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ go o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(go goVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = goVar;
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
