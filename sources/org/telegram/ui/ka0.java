package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ka0 extends org.telegram.ui.ActionBar.h1 {
    public final /* synthetic */ pa0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(pa0 pa0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = pa0Var;
    }

    @Override // org.telegram.ui.ActionBar.h1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        this.o.P0 = null;
    }
}
