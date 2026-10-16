package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ik extends org.telegram.ui.Components.c31 {
    public final /* synthetic */ fo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(fo foVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.e = foVar;
    }

    @Override // org.telegram.ui.Components.c31, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        fo foVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (kVar.t() || foVar.F9()) {
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
