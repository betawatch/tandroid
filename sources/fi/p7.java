package fi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class p7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x7 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ p7(x7 x7Var, float f10, float f11, int i7) {
        this.a = i7;
        this.b = x7Var;
        this.c = f10;
        this.d = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                x7 x7Var = this.b;
                x7Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x7Var.setScrollY((int) org.telegram.messenger.g0.T1(this.c, 0.0f, floatValue));
                w7 w7Var = x7Var.c0;
                w7Var.x = org.telegram.messenger.g0.T1(this.d, 0.0f, floatValue);
                w7Var.invalidate();
                break;
            default:
                x7 x7Var2 = this.b;
                x7Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x7Var2.setScrollY((int) org.telegram.messenger.g0.T1(this.c, Math.min((x7Var2.getMeasuredHeight() - x7Var2.v0) - org.telegram.messenger.g0.L(64.0f), x7Var2.s0.getBottom() - x7Var2.getMeasuredHeight()), floatValue2));
                w7 w7Var2 = x7Var2.c0;
                w7Var2.x = org.telegram.messenger.g0.T1(this.d, 1.0f, floatValue2);
                w7Var2.invalidate();
                break;
        }
    }
}
