package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class p1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ r1 c;

    public p1(r1 r1Var, float f10, float f11) {
        this.c = r1Var;
        this.a = f10;
        this.b = f11;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        r1 r1Var = this.c;
        if (r1Var.Q) {
            r1Var.N = false;
            r1Var.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = r1Var.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(r1Var.K, 0.0f);
        r1Var.e0 = ofFloat;
        ofFloat.addUpdateListener(r1Var.f0);
        r1Var.e0.setDuration(300L);
        r1Var.e0.start();
        float measuredWidth = this.a - ((r1Var.getMeasuredWidth() - (r1Var.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((r1Var.getMeasuredHeight() - (r1Var.getMeasuredHeight() * 0.23f)) / 2.0f);
        r1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        r1Var.setTranslationX(measuredWidth);
        r1Var.setTranslationY(measuredHeight);
        r1Var.setScaleX(0.23f);
        r1Var.setScaleY(0.23f);
        r1Var.animate().setListener(null).cancel();
        r1Var.animate().setListener(new x9(this, 16)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(kr.f).start();
        return false;
    }
}
