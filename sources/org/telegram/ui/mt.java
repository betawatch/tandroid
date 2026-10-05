package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class mt extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ nt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt(nt ntVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = ntVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        rt rtVar = this.o.a;
        rtVar.k = null;
        rtVar.K = false;
        if (rtVar.R) {
            rtVar.n();
        }
    }
}
