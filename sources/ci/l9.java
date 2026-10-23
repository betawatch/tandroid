package ci;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
