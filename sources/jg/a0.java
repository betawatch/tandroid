package jg;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.rl0;
import vh.b4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0(Object obj, int i10, int i11, int i12) {
        this.a = i12;
        this.d = obj;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        int i11 = this.c;
        int i12 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                r0 r0Var = (r0) obj;
                r0Var.t1.a = i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                r0Var.L0.invalidate();
                break;
            case 1:
                h4 h4Var = (h4) obj;
                h4Var.getClass();
                int S0 = org.telegram.messenger.i0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i12, i11);
                ei0 ei0Var = h4Var.f;
                ei0Var.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.SRC_IN));
                t6.H1(ei0Var.getDrawable(), S0 & 620756991, true);
                break;
            case 2:
                e6 e6Var = (e6) obj;
                e6Var.getClass();
                e6Var.u(i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                e6Var.invalidateSelf();
                break;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.o0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i12 * floatValue;
                scrollSlidingTextTabStrip.a0 = i11 * floatValue;
                scrollSlidingTextTabStrip.a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                break;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                cx0 cx0Var = (cx0) ((rl0) obj).b;
                cx0Var.j1.setAlpha(animatedFraction);
                cx0Var.n1.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    cx0Var.W0(i11 + i14);
                    cx0Var.j1.setTranslationY(i14);
                    break;
                }
                break;
            default:
                b4 b4Var = (b4) obj;
                b4Var.j1.a = i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                b4Var.C0.invalidate();
                break;
        }
    }
}
