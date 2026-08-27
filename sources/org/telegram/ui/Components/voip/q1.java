package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f11;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
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
        if (s1Var.L) {
            s1Var.I = false;
            s1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = s1Var.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.F, 0.0f);
        s1Var.W = ofFloat;
        ofFloat.addUpdateListener(s1Var.a0);
        s1Var.W.setDuration(300L);
        s1Var.W.start();
        float measuredWidth = this.a - ((s1Var.getMeasuredWidth() - (s1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((s1Var.getMeasuredHeight() - (s1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        s1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        s1Var.setTranslationX(measuredWidth);
        s1Var.setTranslationY(measuredHeight);
        s1Var.setScaleX(0.23f);
        s1Var.setScaleY(0.23f);
        s1Var.animate().setListener(null).cancel();
        s1Var.animate().setListener(new f11(this, 15)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(er.f).start();
        return false;
    }
}
