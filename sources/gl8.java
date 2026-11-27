// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gl8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kl8 b;

    public /* synthetic */ gl8(kl8 kl8Var, byte b) {
        this.a = b;
        this.b = kl8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        kl8 kl8Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kl8Var.I2.getLayoutParams().height = hl.U1(floatValue, kl8Var.J2[0].getHeight(), kl8Var.J2[1].getHeight());
                kl8Var.I2.requestLayout();
                break;
            default:
                kl8Var.B2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kl8Var.c.invalidate();
                break;
        }
    }
}
