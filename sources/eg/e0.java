package eg;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.e4;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.xx0;
import qh.a5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e0(Object obj, int i10, int i11, int i12) {
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
                c1 c1Var = (c1) obj;
                c1Var.H1.a = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                c1Var.Z0.invalidate();
                break;
            case 1:
                e4 e4Var = (e4) obj;
                e4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                kj0 kj0Var = e4Var.f;
                kj0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                k6.B1(kj0Var.getDrawable(), offsetColor & 620756991, true);
                break;
            case 2:
                j6 j6Var = (j6) obj;
                j6Var.getClass();
                j6Var.r(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                j6Var.invalidateSelf();
                break;
            case 3:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                int i13 = ScrollSlidingTextTabStrip.l0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                scrollSlidingTextTabStrip.T = i12 * floatValue;
                scrollSlidingTextTabStrip.U = i11 * floatValue;
                scrollSlidingTextTabStrip.a.invalidate();
                scrollSlidingTextTabStrip.invalidate();
                break;
            case 4:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                xx0 xx0Var = (xx0) ((mm0) obj).b;
                xx0Var.c.setAlpha(animatedFraction);
                xx0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    xx0Var.y0(i11 + i14);
                    xx0Var.c.setTranslationY(i14);
                    break;
                }
                break;
            default:
                a5 a5Var = (a5) obj;
                a5Var.x1.a = i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                a5Var.Q0.invalidate();
                break;
        }
    }
}
