package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class in extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ kn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(kn knVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = knVar;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.an anVar = this.o.G;
        if (anVar != null) {
            anVar.getClass();
            anVar.v8(false, true, 0.0f);
        }
    }
}
