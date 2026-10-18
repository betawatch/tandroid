package ci;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9 b;

    public /* synthetic */ l9(o9 o9Var, int i10) {
        this.a = i10;
        this.b = o9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                aa aaVar = this.b.I0;
                aaVar.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa.k(aaVar);
                break;
            default:
                aa aaVar2 = this.b.I0;
                aaVar2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa.k(aaVar2);
                break;
        }
    }
}
