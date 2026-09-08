package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.cr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                hu huVar = (hu) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                huVar.d.setTranslationY(floatValue2);
                int i11 = this.b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                huVar.R = f10;
                if (i11 > 0 && ((i10 = huVar.L) == 2 || i10 == 3)) {
                    huVar.d.setAlpha(f10);
                }
                huVar.c(floatValue2 - f7);
                break;
            case 3:
                ((kz) this.c).Q0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                ca0 ca0Var = (ca0) this.c;
                float[] fArr = ca0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue3;
                j5[] j5VarArr = ca0Var.w;
                j5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                j5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                j5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                ca0Var.x[i12].setAlpha(fArr[i12]);
                break;
            case 5:
                cr crVar = (cr) this.c;
                crVar.getClass();
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                qk0 qk0Var = (qk0) crVar.d;
                qk0Var.b.put(this.b, f11);
                qk0Var.d = true;
                qk0Var.a.invalidate();
                break;
            default:
                wh.h hVar = (wh.h) this.c;
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
