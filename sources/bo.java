// default package

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bo implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bo(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                ho hoVar = (ho) obj;
                hoVar.getClass();
                hoVar.u(on2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i));
                hoVar.invalidateSelf();
                break;
            case 1:
                int R0 = gm.R0(valueAnimator.getAnimatedFraction(), 1.0f, i2, i);
                s09 s09Var = ((wb5) obj).f;
                s09Var.setColorFilter(new PorterDuffColorFilter(R0, PorterDuff.Mode.SRC_IN));
                cmb.F1(s09Var.getDrawable(), R0 & 620756991, true);
                break;
            case 2:
                ry5 ry5Var = (ry5) obj;
                ry5Var.A1.a = on2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                ry5Var.S0.invalidate();
                break;
            case 3:
                xv7 xv7Var = (xv7) obj;
                xv7Var.q1.a = on2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                xv7Var.J0.invalidate();
                break;
            case 4:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i3 = ScrollSlidingTextTabStrip.p0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.a0 = i2 * floatValue;
                scrollSlidingTextTabStrip.b0 = i * floatValue;
                scrollSlidingTextTabStrip.a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                break;
            default:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                x2b x2bVar = (x2b) ((wa8) obj).b;
                x2bVar.m1.setAlpha(animatedFraction);
                x2bVar.q1.setAlpha(animatedFraction);
                if (i2 != 0) {
                    int i4 = (int) ((1.0f - animatedFraction) * i2);
                    x2bVar.Q0(i + i4);
                    x2bVar.m1.setTranslationY(i4);
                    break;
                }
                break;
        }
    }
}
