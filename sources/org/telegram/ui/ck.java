package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ck extends org.telegram.ui.Components.a21 {
    public final /* synthetic */ bo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(bo boVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.e = boVar;
    }

    @Override // org.telegram.ui.Components.a21, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        bo boVar = this.e;
        kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
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
