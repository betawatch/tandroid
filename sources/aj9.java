// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class aj9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dj9 b;

    public /* synthetic */ aj9(dj9 dj9Var, byte b) {
        this.a = b;
        this.b = dj9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dj9 dj9Var = this.b;
        switch (b) {
            case 0:
                dj9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj9Var.g();
                break;
            default:
                dj9Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dj9Var.g();
                break;
        }
    }
}
