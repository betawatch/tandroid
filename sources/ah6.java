// default package

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ah6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eh6 b;

    public /* synthetic */ ah6(eh6 eh6Var, byte b) {
        this.a = b;
        this.b = eh6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        eh6 eh6Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eh6Var.d.setAlpha(floatValue);
                eh6Var.e.setAlpha(floatValue);
                eh6Var.f.setProgress(floatValue);
                FrameLayout frameLayout = eh6Var.x;
                frameLayout.setAlpha(floatValue);
                float f = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f);
                frameLayout.setScaleY(f);
                break;
            default:
                eh6Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eh6Var.f.setProgress(floatValue2);
                eh6Var.d.setAlpha(floatValue2);
                eh6Var.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = eh6Var.x;
                frameLayout2.setAlpha(floatValue2);
                float f2 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f2);
                frameLayout2.setScaleY(f2);
                break;
        }
    }
}
