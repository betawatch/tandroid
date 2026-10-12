package bi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ e2(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                g2 g2Var = this.b;
                g2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var.n = floatValue;
                View view = g2Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - g2Var.n);
                view.setScaleY(1.0f - g2Var.n);
                g2Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.d(g2Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                g2Var.a.invalidate();
                break;
        }
    }
}
