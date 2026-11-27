// default package

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cn(Object obj, int i, int i2, byte b) {
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
                hn hnVar = (hn) obj;
                hnVar.getClass();
                hnVar.u(vm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i));
                hnVar.invalidateSelf();
                break;
            case 1:
                int R0 = hl.R0(valueAnimator.getAnimatedFraction(), 1.0f, i2, i);
                e29 e29Var = ((zb5) obj).f;
                e29Var.setColorFilter(new PorterDuffColorFilter(R0, PorterDuff.Mode.SRC_IN));
                aob.F1(e29Var.getDrawable(), R0 & 620756991, true);
                break;
            case 2:
                wy5 wy5Var = (wy5) obj;
                wy5Var.u1.a = vm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                wy5Var.M0.invalidate();
                break;
            case 3:
                dx7 dx7Var = (dx7) obj;
                dx7Var.k1.a = vm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, i);
                dx7Var.D0.invalidate();
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
                s4b s4bVar = (s4b) ((lc8) obj).b;
                s4bVar.m1.setAlpha(animatedFraction);
                s4bVar.q1.setAlpha(animatedFraction);
                if (i2 != 0) {
                    int i4 = (int) ((1.0f - animatedFraction) * i2);
                    s4bVar.R0(i + i4);
                    s4bVar.m1.setTranslationY(i4);
                    break;
                }
                break;
        }
    }
}
