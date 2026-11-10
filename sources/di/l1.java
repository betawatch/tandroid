package di;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n1 b;

    public /* synthetic */ l1(n1 n1Var, int i7) {
        this.a = i7;
        this.b = n1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                n1 n1Var = this.b;
                n1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.n = floatValue;
                View view = n1Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - n1Var.n);
                view.setScaleY(1.0f - n1Var.n);
                n1Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.f(n1Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                n1Var.a.invalidate();
                break;
        }
    }
}
