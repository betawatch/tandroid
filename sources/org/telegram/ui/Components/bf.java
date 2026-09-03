package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bf extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ ChatActivityEnterView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = chatActivityEnterView;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        this.o.G0.invalidate();
    }
}
