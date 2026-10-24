package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class bt extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ dt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt(dt dtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = dtVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ht htVar = this.o.a;
        htVar.k = null;
        htVar.K = false;
        if (htVar.R) {
            htVar.l();
        }
    }
}
