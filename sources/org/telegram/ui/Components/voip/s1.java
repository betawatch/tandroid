package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r81;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class s1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ u1 c;

    public s1(u1 u1Var, float f7, float f10) {
        this.c = u1Var;
        this.a = f7;
        this.b = f10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        u1 u1Var = this.c;
        if (u1Var.P) {
            u1Var.M = false;
            u1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = u1Var.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(u1Var.J, 0.0f);
        u1Var.d0 = ofFloat;
        ofFloat.addUpdateListener(u1Var.e0);
        u1Var.d0.setDuration(300L);
        u1Var.d0.start();
        float measuredWidth = this.a - ((u1Var.getMeasuredWidth() - (u1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((u1Var.getMeasuredHeight() - (u1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        u1Var.setTranslationX(measuredWidth);
        u1Var.setTranslationY(measuredHeight);
        u1Var.setScaleX(0.23f);
        u1Var.setScaleY(0.23f);
        u1Var.animate().setListener(null).cancel();
        u1Var.animate().setListener(new r81(this, 8)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(qr.f).start();
        return false;
    }
}
