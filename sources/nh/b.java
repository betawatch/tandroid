package nh;

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.uq;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.a) {
            case 0:
                i iVar = (i) this.c;
                iVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.n = floatValue;
                iVar.setAlpha((int) ((1.0f - floatValue) * this.b));
                iVar.p = true;
                iVar.invalidateSelf();
                break;
            case 1:
                z2 z2Var = (z2) this.c;
                z2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                z2Var.C0(this.b, intValue, intValue);
                break;
            case 2:
                q1 q1Var = (q1) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f1() == this.b) {
                    q1Var.setSelectedBackgroundProgress(floatValue2);
                    break;
                }
                break;
            case 3:
                wt wtVar = (wt) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wtVar.d.setTranslationY(floatValue3);
                int i11 = this.b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue3 / f7);
                wtVar.R = f10;
                if (i11 > 0 && ((i10 = wtVar.L) == 2 || i10 == 3)) {
                    wtVar.d.setAlpha(f10);
                }
                wtVar.c(floatValue3 - f7);
                break;
            case 4:
                ((vy) this.c).Q0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                d50 d50Var = (d50) this.c;
                if (this.b == d50Var.s0) {
                    float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue4 >= 0.5f) {
                        floatValue4 -= 1.0f;
                    }
                    d50Var.x.setRotationY(floatValue4 * 180.0f);
                    break;
                }
                break;
            default:
                uq uqVar = (uq) this.c;
                uqVar.getClass();
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                wj0 wj0Var = (wj0) uqVar.d;
                wj0Var.b.put(this.b, f11);
                wj0Var.d = true;
                wj0Var.a.invalidate();
                break;
        }
    }
}
