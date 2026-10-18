package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s8 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ k8(s8 s8Var, float f7, float f10, int i10) {
        this.a = i10;
        this.b = s8Var;
        this.c = f7;
        this.d = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                s8 s8Var = this.b;
                s8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var.setScrollY((int) AndroidUtilities.lerp(this.c, 0.0f, floatValue));
                r8 r8Var = s8Var.b0;
                r8Var.w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                r8Var.invalidate();
                break;
            default:
                s8 s8Var2 = this.b;
                s8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s8Var2.setScrollY((int) AndroidUtilities.lerp(this.c, Math.min((s8Var2.getMeasuredHeight() - s8Var2.u0) - AndroidUtilities.dp(64.0f), s8Var2.r0.getBottom() - s8Var2.getMeasuredHeight()), floatValue2));
                r8 r8Var2 = s8Var2.b0;
                r8Var2.w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                r8Var2.invalidate();
                break;
        }
    }
}
