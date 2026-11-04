package gi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.xv0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h4(Object obj, int i3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i3;
        this.c = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.a;
        int i10 = this.c;
        int i11 = this.b;
        Object obj = this.d;
        switch (i3) {
            case 0:
                m5 m5Var = (m5) obj;
                m5Var.k1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                m5Var.D0.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) obj;
                f4Var.getClass();
                int S0 = org.telegram.messenger.g0.S0(valueAnimator.getAnimatedFraction(), 1.0f, i11, i10);
                fh0 fh0Var = f4Var.f;
                fh0Var.setColorFilter(new PorterDuffColorFilter(S0, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.k6.H1(fh0Var.getDrawable(), S0 & 620756991, true);
                break;
            case 2:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) obj;
                g6Var.getClass();
                g6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10));
                g6Var.invalidateSelf();
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
                xv0 xv0Var = (xv0) ((rk0) obj).b;
                xv0Var.k1.setAlpha(animatedFraction);
                xv0Var.o1.setAlpha(animatedFraction);
                if (i11 != 0) {
                    int i13 = (int) ((1.0f - animatedFraction) * i11);
                    xv0Var.W0(i10 + i13);
                    xv0Var.k1.setTranslationY(i13);
                    break;
                }
                break;
            default:
                ug.f0 f0Var = (ug.f0) obj;
                f0Var.u1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i11, i10);
                f0Var.M0.invalidate();
                break;
        }
    }
}
