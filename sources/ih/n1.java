package ih;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;

    public /* synthetic */ n1(p1 p1Var, int i9) {
        this.a = i9;
        this.b = p1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                p1 p1Var = this.b;
                p1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p1Var.n = floatValue;
                View view = p1Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - p1Var.n);
                view.setScaleY(1.0f - p1Var.n);
                p1Var.c.setColorFilter(new PorterDuffColorFilter(i0.a.d(p1Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                p1Var.a.invalidate();
                break;
        }
    }
}
