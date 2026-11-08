package hi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c4 b;

    public /* synthetic */ t3(c4 c4Var, int i7) {
        this.a = i7;
        this.b = c4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                s2 s2Var = this.b.n;
                if (s2Var.getWebView() != null) {
                    s2Var.getWebView().setScrollY(intValue);
                    break;
                }
                break;
            default:
                this.b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
