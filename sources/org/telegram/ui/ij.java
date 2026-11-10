package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ij extends org.telegram.ui.Components.f01 {
    public final /* synthetic */ cn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(cn cnVar, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.e = cnVar;
    }

    @Override // org.telegram.ui.Components.f01, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        cn cnVar = this.e;
        lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (lVar.x() || cnVar.X9()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
