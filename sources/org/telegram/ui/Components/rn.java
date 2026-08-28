package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rn extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ tn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(tn tnVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = tnVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.qn qnVar = this.o.C;
        if (qnVar != null) {
            qnVar.getClass();
            qnVar.g8(false, true, 0.0f);
        }
    }
}
