package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class t1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ v1 c;

    public t1(v1 v1Var, float f7, float f10) {
        this.c = v1Var;
        this.a = f7;
        this.b = f10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        v1 v1Var = this.c;
        if (v1Var.P) {
            v1Var.M = false;
            v1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = v1Var.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(v1Var.J, 0.0f);
        v1Var.d0 = ofFloat;
        ofFloat.addUpdateListener(v1Var.e0);
        v1Var.d0.setDuration(300L);
        v1Var.d0.start();
        float measuredWidth = this.a - ((v1Var.getMeasuredWidth() - (v1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((v1Var.getMeasuredHeight() - (v1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        v1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        v1Var.setTranslationX(measuredWidth);
        v1Var.setTranslationY(measuredHeight);
        v1Var.setScaleX(0.23f);
        v1Var.setScaleY(0.23f);
        v1Var.animate().setListener(null).cancel();
        v1Var.animate().setListener(new q81(this, 8)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(rr.f).start();
        return false;
    }
}
