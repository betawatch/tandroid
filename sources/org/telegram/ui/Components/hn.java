package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hn extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ jn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(jn jnVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = jnVar;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        org.telegram.ui.cn cnVar = this.o.G;
        if (cnVar != null) {
            cnVar.getClass();
            cnVar.w8(false, true, 0.0f);
        }
    }
}
