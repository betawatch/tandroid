package hi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.ph0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g4(Object obj, int i7, int i10, int i11) {
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
                l5 l5Var = (l5) obj;
                l5Var.k1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                l5Var.D0.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                f4Var.getClass();
                int S0 = org.telegram.messenger.g0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i11, i10);
                ph0 ph0Var = f4Var.f;
                ph0Var.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.n6.H1(ph0Var.getDrawable(), S0 & 620756991, true);
                break;
            case 2:
                org.telegram.ui.Components.m6 m6Var = (org.telegram.ui.Components.m6) obj;
                m6Var.getClass();
                m6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10));
                m6Var.invalidateSelf();
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
                iw0 iw0Var = (iw0) ((al0) obj).b;
                iw0Var.n1.setAlpha(animatedFraction);
                iw0Var.r1.setAlpha(animatedFraction);
                if (i11 != 0) {
                    int i13 = (int) ((1.0f - animatedFraction) * i11);
                    iw0Var.X0(i10 + i13);
                    iw0Var.n1.setTranslationY(i13);
                    break;
                }
                break;
            default:
                tg.g0 g0Var = (tg.g0) obj;
                g0Var.u1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                g0Var.M0.invalidate();
                break;
        }
    }
}
