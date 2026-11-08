package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
