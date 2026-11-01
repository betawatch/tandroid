package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.gr;
import org.telegram.ui.s9;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ c1 c;

    public a1(c1 c1Var, float f7, float f10) {
        this.c = c1Var;
        this.a = f7;
        this.b = f10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        c1 c1Var = this.c;
        if (c1Var.P) {
            c1Var.M = false;
            c1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = c1Var.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c1Var.J, 0.0f);
        c1Var.d0 = ofFloat;
        ofFloat.addUpdateListener(c1Var.e0);
        c1Var.d0.setDuration(300L);
        c1Var.d0.start();
        float measuredWidth = this.a - ((c1Var.getMeasuredWidth() - (c1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((c1Var.getMeasuredHeight() - (c1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        c1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        c1Var.setTranslationX(measuredWidth);
        c1Var.setTranslationY(measuredHeight);
        c1Var.setScaleX(0.23f);
        c1Var.setScaleY(0.23f);
        c1Var.animate().setListener(null).cancel();
        c1Var.animate().setListener(new s9(this, 26)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(gr.f).start();
        return false;
    }
}
