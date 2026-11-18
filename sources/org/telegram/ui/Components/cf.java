package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cf extends org.telegram.ui.ActionBar.h1 {
    public final /* synthetic */ ChatActivityEnterView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.h1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        this.o.K0.invalidate();
    }
}
