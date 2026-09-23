package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class co extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ fo o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(fo foVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = foVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.xn xnVar = this.o.G;
        if (xnVar != null) {
            xnVar.getClass();
            xnVar.g8(false, true, 0.0f);
        }
    }
}
