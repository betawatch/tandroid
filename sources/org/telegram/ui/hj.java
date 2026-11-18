package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hj extends org.telegram.ui.Components.p01 {
    public final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(bn bnVar, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.e = bnVar;
    }

    @Override // org.telegram.ui.Components.p01, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        bn bnVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
        if (kVar.y() || bnVar.Y9()) {
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
