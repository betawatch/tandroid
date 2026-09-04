package bi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ d2(f2 f2Var, int i10) {
        this.a = i10;
        this.b = f2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                f2 f2Var = this.b;
                f2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f2Var.n = floatValue;
                View view = f2Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - f2Var.n);
                view.setScaleY(1.0f - f2Var.n);
                f2Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.d(f2Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                f2Var.a.invalidate();
                break;
        }
    }
}
