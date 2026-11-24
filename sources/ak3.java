// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ak3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ck3 b;

    public /* synthetic */ ak3(ck3 ck3Var, byte b) {
        this.a = b;
        this.b = ck3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ck3 ck3Var = this.b;
        switch (b) {
            case 0:
                ck3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ck3Var.requestLayout();
                vs2 vs2Var = ck3Var.c;
                if (vs2Var != null) {
                    vs2Var.accept(Float.valueOf(ck3Var.a));
                    break;
                }
                break;
            default:
                ck3Var.getClass();
                ck3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ck3Var.requestLayout();
                vs2 vs2Var2 = ck3Var.c;
                if (vs2Var2 != null) {
                    vs2Var2.accept(Float.valueOf(ck3Var.a));
                    break;
                }
                break;
        }
    }
}
