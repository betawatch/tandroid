package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ck extends org.telegram.ui.Components.q21 {
    public final /* synthetic */ zn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(zn znVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.e = znVar;
    }

    @Override // org.telegram.ui.Components.q21, android.view.View
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
