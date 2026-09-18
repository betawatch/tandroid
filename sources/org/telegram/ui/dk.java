package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dk extends org.telegram.ui.Components.b21 {
    public final /* synthetic */ bo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(bo boVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.e = boVar;
    }

    @Override // org.telegram.ui.Components.b21, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        bo boVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
        if (kVar.s() || boVar.A9()) {
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
