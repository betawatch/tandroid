package ei;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
