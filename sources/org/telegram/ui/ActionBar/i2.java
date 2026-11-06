package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.si0;
import org.telegram.ui.vp;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.a) {
            case 0:
                v2 v2Var = (v2) this.c;
                v2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v2Var.C0(this.b, intValue, intValue);
                break;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == this.b) {
                    q1Var.setSelectedBackgroundProgress(floatValue);
                    break;
                }
                break;
            case 2:
                kt ktVar = (kt) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ktVar.d.setTranslationY(floatValue2);
                int i10 = this.b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                ktVar.R = f11;
                if (i10 > 0 && ((i7 = ktVar.L) == 2 || i7 == 3)) {
                    ktVar.d.setAlpha(f11);
                }
                ktVar.c(floatValue2 - f10);
                break;
            case 3:
                ((gy) this.c).Q0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                n40 n40Var = (n40) this.c;
                if (this.b == n40Var.s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    n40Var.x.setRotationY(floatValue3 * 180.0f);
                    break;
                }
                break;
            case 5:
                vp vpVar = (vp) this.c;
                vpVar.getClass();
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                si0 si0Var = (si0) vpVar.d;
                si0Var.b.put(this.b, f12);
                si0Var.d = true;
                si0Var.a.invalidate();
                break;
            default:
                xh.f fVar = (xh.f) this.c;
                fVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.n = floatValue4;
                fVar.setAlpha((int) ((1.0f - floatValue4) * this.b));
                fVar.p = true;
                fVar.invalidateSelf();
                break;
        }
    }
}
