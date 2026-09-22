package ei;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ h4(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.I.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j4 j4Var = this.b.n;
                if (j4Var.getWebView() != null) {
                    j4Var.getWebView().setScrollY(intValue);
                    break;
                }
                break;
        }
    }
}
