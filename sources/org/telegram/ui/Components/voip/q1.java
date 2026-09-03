package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class q1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ s1 c;

    public q1(s1 s1Var, float f10, float f11) {
        this.c = s1Var;
        this.a = f10;
        this.b = f11;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        s1 s1Var = this.c;
        if (s1Var.M) {
            s1Var.J = false;
            s1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = s1Var.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.G, 0.0f);
        s1Var.a0 = ofFloat;
        ofFloat.addUpdateListener(s1Var.b0);
        s1Var.a0.setDuration(300L);
        s1Var.a0.start();
        float measuredWidth = this.a - ((s1Var.getMeasuredWidth() - (s1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((s1Var.getMeasuredHeight() - (s1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        s1Var.setTranslationX(measuredWidth);
        s1Var.setTranslationY(measuredHeight);
        s1Var.setScaleX(0.23f);
        s1Var.setScaleY(0.23f);
        s1Var.animate().setListener(null).cancel();
        s1Var.animate().setListener(new f91(this, 6)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(mr.f).start();
        return false;
    }
}
