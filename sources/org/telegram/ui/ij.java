package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ij extends org.telegram.ui.Components.g01 {
    public final /* synthetic */ cn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(cn cnVar, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, context, g6Var);
        this.e = cnVar;
    }

    @Override // org.telegram.ui.Components.g01, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        cn cnVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (kVar.w() || cnVar.X9()) {
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
