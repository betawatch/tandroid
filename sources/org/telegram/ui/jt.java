package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jt extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ mt o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt(mt mtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = mtVar;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        qt qtVar = this.o.a;
        qtVar.k = null;
        qtVar.K = false;
        if (qtVar.R) {
            qtVar.n();
        }
        View view = qtVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e2) {
                ((org.telegram.ui.Cells.e2) view).setScaled(false);
            }
            qtVar.h = null;
        }
    }
}
