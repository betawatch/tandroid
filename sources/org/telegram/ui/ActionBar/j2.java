package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.y40;
import org.telegram.ui.yp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                wt wtVar = (wt) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wtVar.d.setTranslationY(floatValue2);
                int i10 = this.b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                wtVar.S = f11;
                if (i10 > 0 && ((i7 = wtVar.M) == 2 || i7 == 3)) {
                    wtVar.d.setAlpha(f11);
                }
                wtVar.c(floatValue2 - f10);
                break;
            case 3:
                ((qy) this.c).R0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                y40 y40Var = (y40) this.c;
                if (this.b == y40Var.u0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    y40Var.x.setRotationY(floatValue3 * 180.0f);
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
