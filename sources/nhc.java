// default package

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nhc implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ phc c;

    public nhc(phc phcVar, float f, float f2) {
        this.c = phcVar;
        this.a = f;
        this.b = f2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        phc phcVar = this.c;
        if (phcVar.Q) {
            phcVar.N = false;
            phcVar.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = phcVar.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(phcVar.K, 0.0f);
        phcVar.e0 = ofFloat;
        ofFloat.addUpdateListener(phcVar.f0);
        phcVar.e0.setDuration(300L);
        phcVar.e0.start();
        float measuredWidth = this.a - ((phcVar.getMeasuredWidth() - (phcVar.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((phcVar.getMeasuredHeight() - (phcVar.getMeasuredHeight() * 0.23f)) / 2.0f);
        phcVar.getViewTreeObserver().removeOnPreDrawListener(this);
        phcVar.setTranslationX(measuredWidth);
        phcVar.setTranslationY(measuredHeight);
        phcVar.setScaleX(0.23f);
        phcVar.setScaleY(0.23f);
        phcVar.animate().setListener(null).cancel();
        phcVar.animate().setListener(new q7b(this, (byte) 21)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(d53.f).start();
        return false;
    }
}
