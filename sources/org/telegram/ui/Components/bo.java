package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bo extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ eo o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(eo eoVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = eoVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.bo boVar = this.o.G;
        if (boVar != null) {
            boVar.getClass();
            boVar.g8(false, true, 0.0f);
        }
    }
}
