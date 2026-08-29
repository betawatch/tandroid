package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vn extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ xn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(xn xnVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = xnVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.tn tnVar = this.o.C;
        if (tnVar != null) {
            tnVar.getClass();
            tnVar.g8(false, true, 0.0f);
        }
    }
}
