// default package

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kh7 b;

    public /* synthetic */ jh7(kh7 kh7Var, byte b) {
        this.a = b;
        this.b = kh7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        kh7 kh7Var = this.b;
        switch (b) {
            case 0:
                kh7Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kh7Var.n = floatValue;
                View view = kh7Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - kh7Var.n);
                view.setScaleY(1.0f - kh7Var.n);
                kh7Var.c.setColorFilter(new PorterDuffColorFilter(bm2.f(kh7Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                kh7Var.a.invalidate();
                break;
        }
    }
}
