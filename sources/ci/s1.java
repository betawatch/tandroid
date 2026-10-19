package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1 b;

    public /* synthetic */ s1(u1 u1Var, int i10) {
        this.a = i10;
        this.b = u1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                u1 u1Var = this.b;
                u1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.n = floatValue;
                View view = u1Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - u1Var.n);
                view.setScaleY(1.0f - u1Var.n);
                u1Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.f(u1Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                u1Var.a.invalidate();
                break;
        }
    }
}
