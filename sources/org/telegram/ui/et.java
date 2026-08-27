package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class et extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ ft o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(ft ftVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = ftVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        kt ktVar = this.o.a;
        ktVar.k = null;
        ktVar.K = false;
        if (ktVar.R) {
            ktVar.n();
        }
    }
}
