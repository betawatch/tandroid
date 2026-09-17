package fi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r4 b;

    public /* synthetic */ h4(r4 r4Var, int i10) {
        this.a = i10;
        this.b = r4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k4 k4Var = this.b.n;
                if (k4Var.getWebView() != null) {
                    k4Var.getWebView().setScrollY(intValue);
                    break;
                }
                break;
        }
    }
}
