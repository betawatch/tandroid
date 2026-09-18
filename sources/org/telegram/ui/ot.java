package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ot extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ qt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot(qt qtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = qtVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ut utVar = this.o.a;
        utVar.k = null;
        utVar.K = false;
        if (utVar.R) {
            utVar.n();
        }
    }
}
