package hi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.rh0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class f4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f4(Object obj, int i7, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i7;
        this.c = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        int i10 = this.c;
        int i11 = this.b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                k5 k5Var = (k5) obj;
                k5Var.k1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                k5Var.D0.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) obj;
                g4Var.getClass();
                int S0 = org.telegram.messenger.g0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i11, i10);
                rh0 rh0Var = g4Var.f;
                rh0Var.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.m6.H1(rh0Var.getDrawable(), S0 & 620756991, true);
                break;
            case 2:
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) obj;
                n6Var.getClass();
                n6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10));
                n6Var.invalidateSelf();
                break;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i12 = ScrollSlidingTextTabStrip.p0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.a0 = i11 * floatValue;
                scrollSlidingTextTabStrip.b0 = i10 * floatValue;
                scrollSlidingTextTabStrip.a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                break;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                kw0 kw0Var = (kw0) ((cl0) obj).b;
                kw0Var.n1.setAlpha(animatedFraction);
                kw0Var.r1.setAlpha(animatedFraction);
                if (i11 != 0) {
                    int i13 = (int) ((1.0f - animatedFraction) * i11);
                    kw0Var.X0(i10 + i13);
                    kw0Var.n1.setTranslationY(i13);
                    break;
                }
                break;
            default:
                tg.h0 h0Var = (tg.h0) obj;
                h0Var.u1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                h0Var.M0.invalidate();
                break;
        }
    }
}
