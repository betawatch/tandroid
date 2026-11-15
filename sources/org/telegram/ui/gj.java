package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gj extends org.telegram.ui.Components.h01 {
    public final /* synthetic */ an e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(an anVar, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, context, e6Var);
        this.e = anVar;
    }

    @Override // org.telegram.ui.Components.h01, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        an anVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (kVar.x() || anVar.Y9()) {
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
