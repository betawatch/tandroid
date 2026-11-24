// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class m6b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t7b b;

    public /* synthetic */ m6b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                t7bVar.N0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                t7bVar.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                t7bVar.s1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                t7bVar.t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                t7bVar.t1.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                t7bVar.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7bVar.l();
                t7bVar.r.invalidate();
                t7bVar.n.invalidate();
                break;
        }
    }
}
