package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.yq;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (u1Var.getMessageObject() != null && u1Var.getMessageObject().getId() == this.b) {
                    u1Var.setSelectedBackgroundProgress(floatValue);
                    break;
                }
                break;
            case 2:
                mu muVar = (mu) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                muVar.d.setTranslationY(floatValue2);
                int i11 = this.b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                muVar.R = f10;
                if (i11 > 0 && ((i10 = muVar.L) == 2 || i10 == 3)) {
                    muVar.d.setAlpha(f10);
                }
                muVar.c(floatValue2 - f7);
                break;
            case 3:
                ((nz) this.c).Q0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                pa0 pa0Var = (pa0) this.c;
                float[] fArr = pa0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue3;
                i5[] i5VarArr = pa0Var.w;
                i5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                i5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                i5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                pa0Var.x[i12].setAlpha(fArr[i12]);
                break;
            case 5:
                yq yqVar = (yq) this.c;
                yqVar.getClass();
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                dl0 dl0Var = (dl0) yqVar.d;
                dl0Var.b.put(this.b, f11);
                dl0Var.d = true;
                dl0Var.a.invalidate();
                break;
            default:
                vh.g gVar = (vh.g) this.c;
                gVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.n = floatValue4;
                gVar.setAlpha((int) ((1.0f - floatValue4) * this.b));
                gVar.p = true;
                gVar.invalidateSelf();
                break;
        }
    }
}
