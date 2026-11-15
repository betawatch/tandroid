package fi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ s7(a8 a8Var, float f10, float f11, int i7) {
        this.a = i7;
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
                a8Var.setScrollY((int) org.telegram.messenger.g0.T1(this.c, 0.0f, floatValue));
                z7 z7Var = a8Var.c0;
                z7Var.x = org.telegram.messenger.g0.T1(this.d, 0.0f, floatValue);
                z7Var.invalidate();
                break;
            default:
                a8 a8Var2 = this.b;
                a8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var2.setScrollY((int) org.telegram.messenger.g0.T1(this.c, Math.min((a8Var2.getMeasuredHeight() - a8Var2.v0) - org.telegram.messenger.g0.L(64.0f), a8Var2.s0.getBottom() - a8Var2.getMeasuredHeight()), floatValue2));
                z7 z7Var2 = a8Var2.c0;
                z7Var2.x = org.telegram.messenger.g0.T1(this.d, 1.0f, floatValue2);
                z7Var2.invalidate();
                break;
        }
    }
}
