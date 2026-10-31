package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dt extends org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ gt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt(gt gtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = gtVar;
    }

    @Override // org.telegram.ui.ActionBar.k1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        lt ltVar = this.o.a;
        ltVar.k = null;
        ltVar.K = false;
        if (ltVar.R) {
            ltVar.m();
        }
        View view = ltVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.h2) {
                ((org.telegram.ui.Cells.h2) view).setScaled(false);
            }
            ltVar.h = null;
        }
    }
}
