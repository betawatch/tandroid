package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class mt extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ ot o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt(ot otVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = otVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        st stVar = this.o.a;
        stVar.k = null;
        stVar.K = false;
        if (stVar.R) {
            stVar.n();
        }
    }
}
