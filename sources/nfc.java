// default package

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nfc implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ pfc c;

    public nfc(pfc pfcVar, float f, float f2) {
        this.c = pfcVar;
        this.a = f;
        this.b = f2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        pfc pfcVar = this.c;
        if (pfcVar.Q) {
            pfcVar.N = false;
            pfcVar.requestLayout();
            return false;
        }
        ValueAnimator valueAnimator = pfcVar.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(pfcVar.K, 0.0f);
        pfcVar.e0 = ofFloat;
        ofFloat.addUpdateListener(pfcVar.f0);
        pfcVar.e0.setDuration(300L);
        pfcVar.e0.start();
        float measuredWidth = this.a - ((pfcVar.getMeasuredWidth() - (pfcVar.getMeasuredWidth() * 0.23f)) / 2.0f);
        float measuredHeight = this.b - ((pfcVar.getMeasuredHeight() - (pfcVar.getMeasuredHeight() * 0.23f)) / 2.0f);
        pfcVar.getViewTreeObserver().removeOnPreDrawListener(this);
        pfcVar.setTranslationX(measuredWidth);
        pfcVar.setTranslationY(measuredHeight);
        pfcVar.setScaleX(0.23f);
        pfcVar.setScaleY(0.23f);
        pfcVar.animate().setListener(null).cancel();
        pfcVar.animate().setListener(new iab(this, (byte) 19)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(300L).setStartDelay(0L).setInterpolator(s33.f).start();
        return false;
    }
}
