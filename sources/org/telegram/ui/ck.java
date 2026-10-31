package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ck extends org.telegram.ui.Components.k11 {
    public final /* synthetic */ un e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(un unVar, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var);
        this.e = unVar;
    }

    @Override // org.telegram.ui.Components.k11, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        un unVar = this.e;
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        if (lVar.u() || unVar.M9()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            invalidate();
        }
        super.setTranslationY(f7);
    }
}
