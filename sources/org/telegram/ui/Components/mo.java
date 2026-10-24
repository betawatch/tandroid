package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class mo extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ oo o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(oo ooVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = ooVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.sn snVar = this.o.G;
        if (snVar != null) {
            snVar.getClass();
            snVar.j8(false, true, 0.0f);
        }
    }
}
