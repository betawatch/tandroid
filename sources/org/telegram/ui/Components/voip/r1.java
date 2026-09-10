package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zn0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class r1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ t1 c;

    public r1(t1 t1Var, float f7, float f10) {
        this.c = t1Var;
        this.a = f7;
        this.b = f10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        t1 t1Var = this.c;
        if (t1Var.P) {
            t1Var.M = false;
            t1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = t1Var.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(t1Var.J, 0.0f);
        t1Var.d0 = ofFloat;
        ofFloat.addUpdateListener(t1Var.e0);
        t1Var.d0.setDuration(300L);
        t1Var.d0.start();
        float measuredWidth = this.a - ((t1Var.getMeasuredWidth() - (t1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((t1Var.getMeasuredHeight() - (t1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        t1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        t1Var.setTranslationX(measuredWidth);
        t1Var.setTranslationY(measuredHeight);
        t1Var.setScaleX(0.23f);
        t1Var.setScaleY(0.23f);
        t1Var.animate().setListener(null).cancel();
        t1Var.animate().setListener(new zn0(this, 27)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(wr.f).start();
        return false;
    }
}
