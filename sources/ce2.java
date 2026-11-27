// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ce2 implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final /* synthetic */ tqb b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ oe2 e;

    public ce2(oe2 oe2Var, tqb tqbVar, float f, boolean z) {
        this.e = oe2Var;
        this.b = tqbVar;
        this.c = f;
        this.d = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        oe2 oe2Var = this.e;
        oe2Var.L1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.b.setRadius(this.c * floatValue);
        if (this.a || oe2Var.L1 <= 0.5f) {
            return;
        }
        this.a = true;
    }
}
