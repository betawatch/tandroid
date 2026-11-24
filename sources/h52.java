// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h52 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l52 b;

    public /* synthetic */ h52(l52 l52Var, byte b) {
        this.a = b;
        this.b = l52Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        l52 l52Var = this.b;
        switch (b) {
            case 0:
                l52Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l52Var.invalidate();
                break;
            default:
                l52Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l52Var.invalidate();
                break;
        }
    }
}
