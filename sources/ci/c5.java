package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                lj0 lj0Var = e4Var.f;
                lj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.h6.B1(lj0Var.getDrawable(), offsetColor & 620756991, true);
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
                fy0 fy0Var = (fy0) ((qm0) obj).b;
                fy0Var.c.setAlpha(animatedFraction);
                fy0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    fy0Var.y0(i11 + i14);
                    fy0Var.c.setTranslationY(i14);
                    break;
                }
                break;
            default:
                qg.n0 n0Var = (qg.n0) obj;
                n0Var.K1.a = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                n0Var.c1.invalidate();
                break;
        }
    }
}
