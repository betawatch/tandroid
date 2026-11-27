// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i1c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k1c b;

    public /* synthetic */ i1c(k1c k1cVar, byte b) {
        this.a = b;
        this.b = k1cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        k1c k1cVar = this.b;
        switch (b) {
            case 0:
                k1cVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1cVar.h();
                k1cVar.g();
                break;
            default:
                k1cVar.M = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                k1cVar.h.invalidate();
                break;
        }
    }
}
