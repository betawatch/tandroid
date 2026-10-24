package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ct extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ dt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = dtVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ht htVar = this.o.a;
        htVar.k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.l();
        }
    }
}
