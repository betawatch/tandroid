package hi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.qh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class q4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q4(Object obj, int i7, int i10, int i11) {
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
                v5 v5Var = (v5) obj;
                v5Var.k1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                v5Var.D0.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) obj;
                g4Var.getClass();
                int S0 = org.telegram.messenger.g0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i11, i10);
                qh0 qh0Var = g4Var.f;
                qh0Var.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.n6.H1(qh0Var.getDrawable(), S0 & 620756991, true);
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
                jw0 jw0Var = (jw0) ((cl0) obj).b;
                jw0Var.n1.setAlpha(animatedFraction);
                jw0Var.r1.setAlpha(animatedFraction);
                if (i11 != 0) {
                    int i13 = (int) ((1.0f - animatedFraction) * i11);
                    jw0Var.X0(i10 + i13);
                    jw0Var.n1.setTranslationY(i13);
                    break;
                }
                break;
            default:
                tg.l0 l0Var = (tg.l0) obj;
                l0Var.u1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                l0Var.M0.invalidate();
                break;
        }
    }
}
