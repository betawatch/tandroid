package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class bk extends org.telegram.ui.Components.o21 {
    public final /* synthetic */ zn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(zn znVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.e = znVar;
    }

    @Override // org.telegram.ui.Components.o21, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        zn znVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
        if (kVar.s() || znVar.A9()) {
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
