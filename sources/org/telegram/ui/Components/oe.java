package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oe extends org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ ChatActivityEnterView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.k1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        this.o.J0.invalidate();
    }
}
