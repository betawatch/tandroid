package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.yt;
import org.telegram.ui.yp;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        switch (this.a) {
            case 0:
                w2 w2Var = (w2) this.c;
                w2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                w2Var.C0(this.b, intValue, intValue);
                break;
            case 1:
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (r1Var.getMessageObject() != null && r1Var.getMessageObject().e1() == this.b) {
                    r1Var.setSelectedBackgroundProgress(floatValue);
                    break;
                }
                break;
            case 2:
                yt ytVar = (yt) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ytVar.d.setTranslationY(floatValue2);
                int i10 = this.b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                ytVar.S = f11;
                if (i10 > 0 && ((i7 = ytVar.M) == 2 || i7 == 3)) {
                    ytVar.d.setAlpha(f11);
                }
                ytVar.c(floatValue2 - f10);
                break;
            case 3:
                ((ty) this.c).R0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                b50 b50Var = (b50) this.c;
                if (this.b == b50Var.u0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    b50Var.x.setRotationY(floatValue3 * 180.0f);
                    break;
                }
                break;
            case 5:
                yp ypVar = (yp) this.c;
                ypVar.getClass();
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                hj0 hj0Var = (hj0) ypVar.d;
                hj0Var.b.put(this.b, f12);
                hj0Var.d = true;
                hj0Var.a.invalidate();
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
