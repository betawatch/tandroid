package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class gj extends org.telegram.ui.Components.f01 {
    public final /* synthetic */ an e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(an anVar, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var);
        this.e = anVar;
    }

    @Override // org.telegram.ui.Components.f01, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        an anVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (kVar.v() || anVar.W9()) {
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
