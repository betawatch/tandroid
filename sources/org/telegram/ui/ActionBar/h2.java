package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.q40;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.xp;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.a) {
            case 0:
                u2 u2Var = (u2) this.c;
                u2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                u2Var.C0(this.b, intValue, intValue);
                break;
            case 1:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().e1() == this.b) {
                    q1Var.setSelectedBackgroundProgress(floatValue);
                    break;
                }
                break;
            case 2:
                rt rtVar = (rt) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rtVar.d.setTranslationY(floatValue2);
                int i10 = this.b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                rtVar.S = f11;
                if (i10 > 0 && ((i7 = rtVar.M) == 2 || i7 == 3)) {
                    rtVar.d.setAlpha(f11);
                }
                rtVar.c(floatValue2 - f10);
                break;
            case 3:
                ((ly) this.c).R0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                q40 q40Var = (q40) this.c;
                if (this.b == q40Var.u0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    q40Var.x.setRotationY(floatValue3 * 180.0f);
                    break;
                }
                break;
            case 5:
                xp xpVar = (xp) this.c;
                xpVar.getClass();
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                xi0 xi0Var = (xi0) xpVar.d;
                xi0Var.b.put(this.b, f12);
                xi0Var.d = true;
                xi0Var.a.invalidate();
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
