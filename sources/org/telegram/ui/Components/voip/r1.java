package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p11;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ t1 c;

    public r1(t1 t1Var, float f9, float f10) {
        this.c = t1Var;
        this.a = f9;
        this.b = f10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        t1 t1Var = this.c;
        if (t1Var.L) {
            t1Var.I = false;
            t1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = t1Var.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(t1Var.F, 0.0f);
        t1Var.W = ofFloat;
        ofFloat.addUpdateListener(t1Var.a0);
        t1Var.W.setDuration(300L);
        t1Var.W.start();
        float measuredWidth = this.a - ((t1Var.getMeasuredWidth() - (t1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((t1Var.getMeasuredHeight() - (t1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        t1Var.setTranslationX(measuredWidth);
        t1Var.setTranslationY(measuredHeight);
        t1Var.setScaleX(0.23f);
        t1Var.setScaleY(0.23f);
        t1Var.animate().setListener(null).cancel();
        t1Var.animate().setListener(new p11(this, 15)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(jr.f).start();
        return false;
    }
}
