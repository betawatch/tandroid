package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.xq;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10;
        switch (this.a) {
            case 0:
                f3 f3Var = (f3) this.c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.b, intValue, intValue);
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
                ku kuVar = (ku) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kuVar.d.setTranslationY(floatValue2);
                int i11 = this.b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                kuVar.R = f10;
                if (i11 > 0 && ((i10 = kuVar.L) == 2 || i10 == 3)) {
                    kuVar.d.setAlpha(f10);
                }
                kuVar.c(floatValue2 - f7);
                break;
            case 3:
                ((lz) this.c).Q0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                ca0 ca0Var = (ca0) this.c;
                float[] fArr = ca0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue3;
                i5[] i5VarArr = ca0Var.w;
                i5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                i5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                i5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                ca0Var.x[i12].setAlpha(fArr[i12]);
                break;
            case 5:
                xq xqVar = (xq) this.c;
                xqVar.getClass();
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                rk0 rk0Var = (rk0) xqVar.d;
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
