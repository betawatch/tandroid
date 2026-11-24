// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fl4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hl4 b;

    public /* synthetic */ fl4(hl4 hl4Var, byte b) {
        this.a = b;
        this.b = hl4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hl4 hl4Var = this.b;
        switch (b) {
            case 0:
                hl4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hl4Var.invalidate();
                break;
            case 1:
                hl4Var.getClass();
                hl4Var.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hl4Var.invalidate();
                break;
            default:
                hl4Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hl4Var.invalidate();
                break;
        }
    }
}
