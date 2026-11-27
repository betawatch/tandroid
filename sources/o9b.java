// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p9b b;

    public /* synthetic */ o9b(p9b p9bVar, byte b) {
        this.a = b;
        this.b = p9bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        p9b p9bVar = this.b;
        switch (b) {
            case 0:
                p9bVar.b(valueAnimator);
                break;
            default:
                p9bVar.getClass();
                p9bVar.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
