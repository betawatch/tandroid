package ci;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class wa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    public /* synthetic */ wa(oc ocVar, int i10) {
        this.a = i10;
        this.b = ocVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.M0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                this.b.r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                this.b.r1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                this.b.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                this.b.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                oc ocVar = this.b;
                ocVar.getClass();
                ocVar.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ocVar.o();
                ocVar.r.invalidate();
                ocVar.n.invalidate();
                break;
        }
    }
}
