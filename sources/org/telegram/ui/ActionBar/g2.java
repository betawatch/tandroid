package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.tp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g2(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3;
        switch (this.a) {
            case 0:
                t2 t2Var = (t2) this.c;
                t2Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                t2Var.C0(this.b, intValue, intValue);
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
                jt jtVar = (jt) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jtVar.d.setTranslationY(floatValue2);
                int i10 = this.b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue2 / f10);
                jtVar.S = f11;
                if (i10 > 0 && ((i3 = jtVar.M) == 2 || i3 == 3)) {
                    jtVar.d.setAlpha(f11);
                }
                jtVar.c(floatValue2 - f10);
                break;
            case 3:
                ((ey) this.c).R0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                j40 j40Var = (j40) this.c;
                if (this.b == j40Var.t0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    j40Var.x.setRotationY(floatValue3 * 180.0f);
                    break;
                }
                break;
            case 5:
                tp tpVar = (tp) this.c;
                tpVar.getClass();
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                wi0 wi0Var = (wi0) tpVar.d;
                wi0Var.b.put(this.b, f12);
                wi0Var.d = true;
                wi0Var.a.invalidate();
                break;
            default:
                yh.f fVar = (yh.f) this.c;
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
