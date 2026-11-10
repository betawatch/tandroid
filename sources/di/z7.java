package di;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ z7(i8 i8Var, float f10, float f11, int i7) {
        this.a = i7;
        this.b = i8Var;
        this.c = f10;
        this.d = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i8 i8Var = this.b;
                i8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var.setScrollY((int) org.telegram.messenger.g0.T1(this.c, 0.0f, floatValue));
                h8 h8Var = i8Var.b0;
                h8Var.x = org.telegram.messenger.g0.T1(this.d, 0.0f, floatValue);
                h8Var.invalidate();
                break;
            default:
                i8 i8Var2 = this.b;
                i8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i8Var2.setScrollY((int) org.telegram.messenger.g0.T1(this.c, Math.min((i8Var2.getMeasuredHeight() - i8Var2.u0) - org.telegram.messenger.g0.L(64.0f), i8Var2.r0.getBottom() - i8Var2.getMeasuredHeight()), floatValue2));
                h8 h8Var2 = i8Var2.b0;
                h8Var2.x = org.telegram.messenger.g0.T1(this.d, 1.0f, floatValue2);
                h8Var2.invalidate();
                break;
        }
    }
}
