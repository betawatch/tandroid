package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class q1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ s1 c;

    public q1(s1 s1Var, float f7, float f10) {
        this.c = s1Var;
        this.a = f7;
        this.b = f10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        s1 s1Var = this.c;
        if (s1Var.P) {
            s1Var.M = false;
            s1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = s1Var.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.J, 0.0f);
        s1Var.d0 = ofFloat;
        ofFloat.addUpdateListener(s1Var.e0);
        s1Var.d0.setDuration(300L);
        s1Var.d0.start();
        float measuredWidth = this.a - ((s1Var.getMeasuredWidth() - (s1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((s1Var.getMeasuredHeight() - (s1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        s1Var.setTranslationX(measuredWidth);
        s1Var.setTranslationY(measuredHeight);
        s1Var.setScaleX(0.23f);
        s1Var.setScaleY(0.23f);
        s1Var.animate().setListener(null).cancel();
        s1Var.animate().setListener(new k61(this, 10)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(pr.f).start();
        return false;
    }
}
