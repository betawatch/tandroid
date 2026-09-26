package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class gt extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ jt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt(jt jtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = jtVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        nt ntVar = this.o.a;
        ntVar.k = null;
        ntVar.K = false;
        if (ntVar.R) {
            ntVar.n();
        }
    }
}
