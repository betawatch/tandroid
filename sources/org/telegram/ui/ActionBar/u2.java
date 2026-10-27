package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.sz;
import org.telegram.ui.tq;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.a) {
            case 0:
                k3 k3Var = (k3) this.c;
                k3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k3Var.setItemColor(this.b, intValue, intValue);
                break;
            case 1:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == this.b) {
                    s1Var.setSelectedBackgroundProgress(floatValue);
                    break;
                }
                break;
            case 2:
                ru ruVar = (ru) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ruVar.d.setTranslationY(floatValue2);
                int i11 = this.b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                ruVar.R = f10;
                if (i11 > 0 && ((i10 = ruVar.L) == 2 || i10 == 3)) {
                    ruVar.d.setAlpha(f10);
                }
                ruVar.c(floatValue2 - f7);
                break;
            case 3:
                ((sz) this.c).Q0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                o60 o60Var = (o60) this.c;
                if (this.b == o60Var.s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    o60Var.w.setRotationY(floatValue3 * 180.0f);
                    break;
                }
                break;
            case 5:
                tq tqVar = (tq) this.c;
                tqVar.getClass();
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                rl0 rl0Var = (rl0) tqVar.d;
                rl0Var.b.put(this.b, f11);
                rl0Var.d = true;
                rl0Var.a.invalidate();
                break;
            default:
                xh.g gVar = (xh.g) this.c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.b));
                gVar.p = true;
                gVar.invalidateSelf();
                break;
        }
    }
}
