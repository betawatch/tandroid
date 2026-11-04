package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ c1 c;

    public a1(c1 c1Var, float f10, float f11) {
        this.c = c1Var;
        this.a = f10;
        this.b = f11;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        c1 c1Var = this.c;
        if (c1Var.Q) {
            c1Var.N = false;
            c1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = c1Var.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c1Var.K, 0.0f);
        c1Var.e0 = ofFloat;
        ofFloat.addUpdateListener(c1Var.f0);
        c1Var.e0.setDuration(300L);
        c1Var.e0.start();
        float measuredWidth = this.a - ((c1Var.getMeasuredWidth() - (c1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((c1Var.getMeasuredHeight() - (c1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        c1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        c1Var.setTranslationX(measuredWidth);
        c1Var.setTranslationY(measuredHeight);
        c1Var.setScaleX(0.23f);
        c1Var.setScaleY(0.23f);
        c1Var.animate().setListener(null).cancel();
        c1Var.animate().setListener(new w9(this, 15)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(xq.f).start();
        return false;
    }
}
