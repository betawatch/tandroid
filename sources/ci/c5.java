package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.wm0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c5(Object obj, int i10, int i11, int i12) {
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
                q6 q6Var = (q6) obj;
                q6Var.A1.a = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                q6Var.T0.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) obj;
                e4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                nj0 nj0Var = e4Var.f;
                nj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.i6.B1(nj0Var.getDrawable(), offsetColor & 620756991, true);
                break;
            case 2:
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) obj;
                o6Var.getClass();
                o6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                o6Var.invalidateSelf();
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
                ry0 ry0Var = (ry0) ((wm0) obj).b;
                ry0Var.c.setAlpha(animatedFraction);
                ry0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    ry0Var.y0(i11 + i14);
                    ry0Var.c.setTranslationY(i14);
                    break;
                }
                break;
            default:
                qg.m0 m0Var = (qg.m0) obj;
                m0Var.K1.a = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                m0Var.c1.invalidate();
                break;
        }
    }
}
