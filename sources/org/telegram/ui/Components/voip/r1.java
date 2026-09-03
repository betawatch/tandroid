package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ t1 c;

    public r1(t1 t1Var, float f10, float f11) {
        this.c = t1Var;
        this.a = f10;
        this.b = f11;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        t1 t1Var = this.c;
        if (t1Var.M) {
            t1Var.J = false;
            t1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = t1Var.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(t1Var.G, 0.0f);
        t1Var.a0 = ofFloat;
        ofFloat.addUpdateListener(t1Var.b0);
        t1Var.a0.setDuration(300L);
        t1Var.a0.start();
        float measuredWidth = this.a - ((t1Var.getMeasuredWidth() - (t1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((t1Var.getMeasuredHeight() - (t1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        t1Var.setTranslationX(measuredWidth);
        t1Var.setTranslationY(measuredHeight);
        t1Var.setScaleX(0.23f);
        t1Var.setScaleY(0.23f);
        t1Var.animate().setListener(null).cancel();
        t1Var.animate().setListener(new f91(this, 6)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(pr.f).start();
        return false;
    }
}
