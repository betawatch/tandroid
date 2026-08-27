package nh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ v3(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                x3 x3Var = this.b.n;
                if (x3Var.getWebView() != null) {
                    x3Var.getWebView().setScrollY(intValue);
                    break;
                }
                break;
        }
    }
}
