package oh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ t7(a8 a8Var, float f10, float f11, int i10) {
        this.a = i10;
        this.b = a8Var;
        this.c = f10;
        this.d = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a8 a8Var = this.b;
                a8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.setScrollY((int) AndroidUtilities.lerp(this.c, 0.0f, floatValue));
                z7 z7Var = a8Var.V;
                z7Var.w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                z7Var.invalidate();
                break;
            default:
                a8 a8Var2 = this.b;
                a8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var2.setScrollY((int) AndroidUtilities.lerp(this.c, Math.min((a8Var2.getMeasuredHeight() - a8Var2.r0) - AndroidUtilities.dp(64.0f), a8Var2.o0.getBottom() - a8Var2.getMeasuredHeight()), floatValue2));
                z7 z7Var2 = a8Var2.V;
                z7Var2.w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                z7Var2.invalidate();
                break;
        }
    }
}
