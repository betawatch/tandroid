package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.br;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                g3 g3Var = (g3) this.c;
                g3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                g3Var.setItemColor(this.b, intValue, intValue);
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
                ju juVar = (ju) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                juVar.d.setTranslationY(floatValue2);
                int i11 = this.b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                juVar.R = f10;
                if (i11 > 0 && ((i10 = juVar.L) == 2 || i10 == 3)) {
                    juVar.d.setAlpha(f10);
                }
                juVar.c(floatValue2 - f7);
                break;
            case 3:
                ((kz) this.c).Q0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                ba0 ba0Var = (ba0) this.c;
                float[] fArr = ba0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue3;
                k5[] k5VarArr = ba0Var.w;
                k5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                k5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                k5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                ba0Var.x[i12].setAlpha(fArr[i12]);
                break;
            case 5:
                br brVar = (br) this.c;
                brVar.getClass();
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                rk0 rk0Var = (rk0) brVar.d;
                rk0Var.b.put(this.b, f11);
                rk0Var.d = true;
                rk0Var.a.invalidate();
                break;
            default:
                vh.h hVar = (vh.h) this.c;
                hVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.n = floatValue4;
                hVar.setAlpha((int) ((1.0f - floatValue4) * this.b));
                hVar.p = true;
                hVar.invalidateSelf();
                break;
        }
    }
}
