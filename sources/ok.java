// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ok implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ ok(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                view.setTranslationX((float) (Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d * 4.0d) * (1.0f - r8) * r8 * 4.0f * hl.L(4.0f)));
                break;
            default:
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
        }
    }
}
