package fi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.mn0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t4(Object obj, int i10, int i11, int i12) {
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
                e6 e6Var = (e6) obj;
                e6Var.p1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                e6Var.I0.invalidate();
                break;
            case 1:
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) obj;
                i4Var.getClass();
                int offsetColor = AndroidUtilities.getOffsetColor(i12, i11, valueAnimator.getAnimatedFraction(), 1.0f);
                bk0 bk0Var = i4Var.f;
                bk0Var.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.SRC_IN));
                org.telegram.ui.ActionBar.y6.E1(bk0Var.getDrawable(), offsetColor & 620756991, true);
                break;
            case 2:
                org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) obj;
                r6Var.getClass();
                r6Var.u(i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11));
                r6Var.invalidateSelf();
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
                dz0 dz0Var = (dz0) ((mn0) obj).b;
                dz0Var.c.setAlpha(animatedFraction);
                dz0Var.h.setAlpha(animatedFraction);
                if (i12 != 0) {
                    int i14 = (int) ((1.0f - animatedFraction) * i12);
                    dz0Var.A0(i11 + i14);
                    dz0Var.c.setTranslationY(i14);
                    break;
                }
                break;
            default:
                sg.m0 m0Var = (sg.m0) obj;
                m0Var.z1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), i12, i11);
                m0Var.R0.invalidate();
                break;
        }
    }
}
