package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wz;
import org.telegram.ui.fr;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.a) {
            case 0:
                e3 e3Var = (e3) this.c;
                e3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var.setItemColor(this.b, intValue, intValue);
                break;
            case 1:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    break;
                }
                break;
            case 2:
                vu vuVar = (vu) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vuVar.d.setTranslationY(floatValue2);
                int i11 = this.b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                vuVar.R = f10;
                if (i11 > 0 && ((i10 = vuVar.L) == 2 || i10 == 3)) {
                    vuVar.d.setAlpha(f10);
                }
                vuVar.c(floatValue2 - f7);
                break;
            case 3:
                ((wz) this.c).Q0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                o60 o60Var = (o60) this.c;
                if (this.b == o60Var.s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    o60Var.x.setRotationY(floatValue3 * 180.0f);
                    break;
                }
                break;
            case 5:
                cb0 cb0Var = (cb0) this.c;
                float[] fArr = cb0Var.Z;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue4;
                h5[] h5VarArr = cb0Var.w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                cb0Var.x[i12].setAlpha(fArr[i12]);
                break;
            case 6:
                fr frVar = (fr) this.c;
                frVar.getClass();
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                rl0 rl0Var = (rl0) frVar.d;
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
