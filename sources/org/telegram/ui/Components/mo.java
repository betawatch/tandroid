package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
        org.telegram.ui.qn qnVar = this.o.G;
        if (qnVar != null) {
            qnVar.getClass();
            qnVar.j8(false, true, 0.0f);
        }
    }
}
