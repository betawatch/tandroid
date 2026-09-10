package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ek extends org.telegram.ui.Components.o21 {
    public final /* synthetic */ eo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(eo eoVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.e = eoVar;
    }

    @Override // org.telegram.ui.Components.o21, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        eo eoVar = this.e;
        lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
        if (lVar.s() || eoVar.A9()) {
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
