package ih;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ w7(e8 e8Var, float f10, float f11, int i9) {
        this.a = i9;
        this.b = e8Var;
        this.c = f10;
        this.d = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e8 e8Var = this.b;
                e8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8Var.setScrollY((int) AndroidUtilities.lerp(this.c, 0.0f, floatValue));
                d8 d8Var = e8Var.U;
                d8Var.w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                d8Var.invalidate();
                break;
            default:
                e8 e8Var2 = this.b;
                e8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e8Var2.setScrollY((int) AndroidUtilities.lerp(this.c, Math.min((e8Var2.getMeasuredHeight() - e8Var2.q0) - AndroidUtilities.dp(64.0f), e8Var2.n0.getBottom() - e8Var2.getMeasuredHeight()), floatValue2));
                d8 d8Var2 = e8Var2.U;
                d8Var2.w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                d8Var2.invalidate();
                break;
        }
    }
}
