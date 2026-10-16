package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class po extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ro o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(ro roVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = roVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.fo foVar = this.o.G;
        if (foVar != null) {
            foVar.getClass();
            foVar.j8(false, true, 0.0f);
        }
    }
}
