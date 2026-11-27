// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class aha implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zha b;
    public final /* synthetic */ eja c;

    public /* synthetic */ aha(eja ejaVar, zha zhaVar, byte b) {
        this.a = b;
        this.c = ejaVar;
        this.b = zhaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        zha zhaVar = this.b;
        eja ejaVar = this.c;
        switch (b) {
            case 0:
                ejaVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zhaVar.h.invalidate();
                break;
            default:
                ejaVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zhaVar.h.invalidate();
                break;
        }
    }
}
