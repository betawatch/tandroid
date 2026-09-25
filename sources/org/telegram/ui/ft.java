package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ft extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ jt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft(jt jtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
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
        View view = ntVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.f8) {
                ((org.telegram.ui.Cells.f8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.f2) {
                ((org.telegram.ui.Cells.f2) view).setScaled(false);
            }
            ntVar.h = null;
        }
    }
}
