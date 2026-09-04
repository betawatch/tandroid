package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ck extends org.telegram.ui.Components.z11 {
    public final /* synthetic */ co e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(co coVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.e = coVar;
    }

    @Override // org.telegram.ui.Components.z11, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        co coVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
        if (kVar.s() || coVar.A9()) {
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
