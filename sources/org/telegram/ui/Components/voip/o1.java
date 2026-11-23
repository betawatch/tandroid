package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class o1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ q1 c;

    public o1(q1 q1Var, float f10, float f11) {
        this.c = q1Var;
        this.a = f10;
        this.b = f11;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        q1 q1Var = this.c;
        if (q1Var.Q) {
            q1Var.N = false;
            q1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = q1Var.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(q1Var.K, 0.0f);
        q1Var.e0 = ofFloat;
        ofFloat.addUpdateListener(q1Var.f0);
        q1Var.e0.setDuration(300L);
        q1Var.e0.start();
        float measuredWidth = this.a - ((q1Var.getMeasuredWidth() - (q1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((q1Var.getMeasuredHeight() - (q1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        q1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        q1Var.setTranslationX(measuredWidth);
        q1Var.setTranslationY(measuredHeight);
        q1Var.setScaleX(0.23f);
        q1Var.setScaleY(0.23f);
        q1Var.animate().setListener(null).cancel();
        q1Var.animate().setListener(new y9(this, 16)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(nr.f).start();
        return false;
    }
}
