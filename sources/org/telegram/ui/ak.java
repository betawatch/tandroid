package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ak extends org.telegram.ui.Components.c21 {
    public final /* synthetic */ zn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(zn znVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.e = znVar;
    }

    @Override // org.telegram.ui.Components.c21, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        zn znVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (kVar.s() || znVar.A9()) {
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
