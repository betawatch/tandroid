package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hs extends org.telegram.ui.ActionBar.h1 {
    public final /* synthetic */ js o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(js jsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = jsVar;
    }

    @Override // org.telegram.ui.ActionBar.h1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ns nsVar = this.o.a;
        nsVar.k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
    }
}
