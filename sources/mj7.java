// default package

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class mj7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nj7 b;

    public /* synthetic */ mj7(nj7 nj7Var, byte b) {
        this.a = b;
        this.b = nj7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        nj7 nj7Var = this.b;
        switch (b) {
            case 0:
                nj7Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nj7Var.n = floatValue;
                View view = nj7Var.b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - nj7Var.n);
                view.setScaleY(1.0f - nj7Var.n);
                nj7Var.c.setColorFilter(new PorterDuffColorFilter(on2.f(nj7Var.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                nj7Var.a.invalidate();
                break;
        }
    }
}
