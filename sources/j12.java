// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class j12 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s12 b;

    public /* synthetic */ j12(s12 s12Var, byte b) {
        this.a = b;
        this.b = s12Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        s12 s12Var = this.b;
        switch (b) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                gw0 gw0Var = s12Var.n;
                if (gw0Var.getWebView() != null) {
                    gw0Var.getWebView().setScrollY(intValue);
                    break;
                }
                break;
            default:
                s12Var.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
