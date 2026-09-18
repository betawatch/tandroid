package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cd0 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ kd0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd0(kd0 kd0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = kd0Var;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        this.o.I0 = null;
    }
}
