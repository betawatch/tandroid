package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.qq;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.a) {
            case 0:
                h3 h3Var = (h3) this.c;
                h3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var.setItemColor(this.b, intValue, intValue);
                break;
            case 1:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == this.b) {
                    t1Var.setSelectedBackgroundProgress(floatValue);
                    break;
                }
                break;
            case 2:
                qu quVar = (qu) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                quVar.d.setTranslationY(floatValue2);
                int i11 = this.b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                quVar.R = f10;
                if (i11 > 0 && ((i10 = quVar.L) == 2 || i10 == 3)) {
                    quVar.d.setAlpha(f10);
                }
                quVar.c(floatValue2 - f7);
                break;
            case 3:
                ((tz) this.c).Q0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                m60 m60Var = (m60) this.c;
                if (this.b == m60Var.s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    m60Var.x.setRotationY(floatValue3 * 180.0f);
                    break;
                }
                break;
            case 5:
                xa0 xa0Var = (xa0) this.c;
                float[] fArr = xa0Var.Z;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue4;
                n5[] n5VarArr = xa0Var.w;
                n5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                n5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                n5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                xa0Var.x[i12].setAlpha(fArr[i12]);
                break;
            case 6:
                qq qqVar = (qq) this.c;
                qqVar.getClass();
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                rl0 rl0Var = (rl0) qqVar.d;
                rl0Var.b.put(this.b, f11);
                rl0Var.d = true;
                rl0Var.a.invalidate();
                break;
            default:
                wh.g gVar = (wh.g) this.c;
                gVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.n = floatValue5;
                gVar.setAlpha((int) ((1.0f - floatValue5) * this.b));
                gVar.p = true;
                gVar.invalidateSelf();
                break;
        }
    }
}
