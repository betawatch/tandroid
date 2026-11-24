// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class oa8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qa8 b;

    public /* synthetic */ oa8(qa8 qa8Var, byte b) {
        this.a = b;
        this.b = qa8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        qa8 qa8Var = this.b;
        switch (b) {
            case 0:
                qa8Var.getClass();
                qa8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qa8Var.invalidate();
                break;
            default:
                qa8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qa8Var.invalidate();
                break;
        }
    }
}
