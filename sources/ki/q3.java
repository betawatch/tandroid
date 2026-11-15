package ki;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ q3(y3 y3Var, int i7) {
        this.a = i7;
        this.b = y3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                p2 p2Var = this.b.n;
                if (p2Var.getWebView() != null) {
                    p2Var.getWebView().setScrollY(intValue);
                    break;
                }
                break;
            default:
                this.b.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
