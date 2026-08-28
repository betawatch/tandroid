package ih;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ y1(i4 i4Var, int i9) {
        this.a = i9;
        this.b = i4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                i4Var.getClass();
                i4Var.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                break;
            case 1:
                i4 i4Var2 = this.b;
                i4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var2.p3 = floatValue;
                i4Var2.n3.setTransitionProgress(floatValue);
                break;
            default:
                i4.Z(this.b, valueAnimator);
                break;
        }
    }
}
