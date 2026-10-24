package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ j8(r8 r8Var, float f7, float f10, int i10) {
        this.a = i10;
        this.b = r8Var;
        this.c = f7;
        this.d = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r8 r8Var = this.b;
                r8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.setScrollY((int) AndroidUtilities.lerp(this.c, 0.0f, floatValue));
                q8 q8Var = r8Var.b0;
                q8Var.w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                q8Var.invalidate();
                break;
            default:
                r8 r8Var2 = this.b;
                r8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var2.setScrollY((int) AndroidUtilities.lerp(this.c, Math.min((r8Var2.getMeasuredHeight() - r8Var2.u0) - AndroidUtilities.dp(64.0f), r8Var2.r0.getBottom() - r8Var2.getMeasuredHeight()), floatValue2));
                q8 q8Var2 = r8Var2.b0;
                q8Var2.w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                q8Var2.invalidate();
                break;
        }
    }
}
