package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ h8(p8 p8Var, float f7, float f10, int i10) {
        this.a = i10;
        this.b = p8Var;
        this.c = f7;
        this.d = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p8 p8Var = this.b;
                p8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p8Var.setScrollY((int) AndroidUtilities.lerp(this.c, 0.0f, floatValue));
                o8 o8Var = p8Var.b0;
                o8Var.w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                o8Var.invalidate();
                break;
            default:
                p8 p8Var2 = this.b;
                p8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p8Var2.setScrollY((int) AndroidUtilities.lerp(this.c, Math.min((p8Var2.getMeasuredHeight() - p8Var2.u0) - AndroidUtilities.dp(64.0f), p8Var2.r0.getBottom() - p8Var2.getMeasuredHeight()), floatValue2));
                o8 o8Var2 = p8Var2.b0;
                o8Var2.w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                o8Var2.invalidate();
                break;
        }
    }
}
