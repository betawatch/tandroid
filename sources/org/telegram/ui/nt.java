package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class nt extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ qt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(qt qtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = qtVar;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ut utVar = this.o.a;
        utVar.k = null;
        utVar.K = false;
        if (utVar.R) {
            utVar.n();
        }
        View view = utVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.f8) {
                ((org.telegram.ui.Cells.f8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e2) {
                ((org.telegram.ui.Cells.e2) view).setScaled(false);
            }
            utVar.h = null;
        }
    }
}
