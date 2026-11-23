package fi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j1 b;

    public /* synthetic */ h1(j1 j1Var, int i7) {
        this.a = i7;
        this.b = j1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                j1 j1Var = this.b;
                j1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j1Var.n = floatValue;
                View view = j1Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - j1Var.n);
                view.setScaleY(1.0f - j1Var.n);
                j1Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.f(j1Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                j1Var.a.invalidate();
                break;
        }
    }
}
