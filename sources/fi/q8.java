package fi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class q8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;

    public /* synthetic */ q8(t8 t8Var, int i7) {
        this.a = i7;
        this.b = t8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f9 f9Var = this.b.s0;
                f9Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9.i(f9Var);
                break;
            default:
                f9 f9Var2 = this.b.s0;
                f9Var2.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f9.i(f9Var2);
                break;
        }
    }
}
