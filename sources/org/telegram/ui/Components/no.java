package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class no extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ po o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(po poVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = poVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.un unVar = this.o.G;
        if (unVar != null) {
            unVar.getClass();
            unVar.n8(false, true, 0.0f);
        }
    }
}
