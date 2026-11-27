// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m2b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p2b b;

    public /* synthetic */ m2b(p2b p2bVar, byte b) {
        this.a = b;
        this.b = p2bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        p2b p2bVar = this.b;
        switch (b) {
            case 0:
                p2bVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2bVar.invalidate();
                break;
            case 1:
                p2bVar.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                p2bVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2bVar.invalidate();
                break;
        }
    }
}
