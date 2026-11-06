package fi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.yv0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k4(Object obj, int i7, int i10, int i11) {
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
                o5 o5Var = (o5) obj;
                o5Var.j1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                o5Var.C0.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                f4Var.getClass();
                int S0 = org.telegram.messenger.g0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i11, i10);
                ch0 ch0Var = f4Var.f;
                ch0Var.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.k6.H1(ch0Var.getDrawable(), S0 & 620756991, true);
                break;
            case 2:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) obj;
                i6Var.getClass();
                i6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10));
                i6Var.invalidateSelf();
                break;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i12 = ScrollSlidingTextTabStrip.o0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.W = i11 * floatValue;
                scrollSlidingTextTabStrip.a0 = i10 * floatValue;
                scrollSlidingTextTabStrip.a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                break;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                yv0 yv0Var = (yv0) ((nk0) obj).b;
                yv0Var.j1.setAlpha(animatedFraction);
                yv0Var.n1.setAlpha(animatedFraction);
                if (i11 != 0) {
                    int i13 = (int) ((1.0f - animatedFraction) * i11);
                    yv0Var.W0(i10 + i13);
                    yv0Var.j1.setTranslationY(i13);
                    break;
                }
                break;
            default:
                tg.g0 g0Var = (tg.g0) obj;
                g0Var.t1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                g0Var.L0.invalidate();
                break;
        }
    }
}
