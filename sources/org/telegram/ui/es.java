package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class es extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ gs o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es(gs gsVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = gsVar;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ks ksVar = this.o.a;
        ksVar.k = null;
        ksVar.K = false;
        if (ksVar.R) {
            ksVar.m();
        }
    }
}
