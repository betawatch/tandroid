package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ho extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ jo o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(jo joVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = joVar;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.eo eoVar = this.o.G;
        if (eoVar != null) {
            eoVar.getClass();
            eoVar.g8(false, true, 0.0f);
        }
    }
}
