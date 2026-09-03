package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class kt extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ nt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt(nt ntVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = ntVar;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        rt rtVar = this.o.a;
        rtVar.k = null;
        rtVar.K = false;
        if (rtVar.R) {
            rtVar.n();
        }
        View view = rtVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.c8) {
                ((org.telegram.ui.Cells.c8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.a8) {
                ((org.telegram.ui.Cells.a8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            rtVar.h = null;
        }
    }
}
