package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cj extends org.telegram.ui.Components.e01 {
    public final /* synthetic */ wm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(wm wmVar, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var);
        this.e = wmVar;
    }

    @Override // org.telegram.ui.Components.e01, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        wm wmVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (kVar.v() || wmVar.W9()) {
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
