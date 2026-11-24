// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ js8 b;

    public /* synthetic */ gs8(js8 js8Var, byte b) {
        this.a = b;
        this.b = js8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        js8 js8Var = this.b;
        switch (b) {
            case 0:
                js8Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                js8Var.e();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                js8Var.R = floatValue;
                js8Var.r.setUseGyroscope(floatValue);
                break;
        }
    }
}
