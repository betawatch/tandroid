package jh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.mz;
import org.telegram.ui.wq;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                k kVar = (k) this.c;
                kVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.n = floatValue;
                kVar.setAlpha((int) ((1.0f - floatValue) * this.b));
                kVar.p = true;
                kVar.invalidateSelf();
                break;
            case 1:
                h3 h3Var = (h3) this.c;
                h3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h3Var.setItemColor(this.b, intValue, intValue);
                break;
            case 2:
                t1 t1Var = (t1) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == this.b) {
                    t1Var.setSelectedBackgroundProgress(floatValue2);
                    break;
                }
                break;
            case 3:
                fu fuVar = (fu) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fuVar.d.setTranslationY(floatValue3);
                int i11 = this.b;
                float f10 = i11;
                float f11 = 1.0f - (floatValue3 / f10);
                fuVar.O = f11;
                if (i11 > 0 && ((i10 = fuVar.I) == 2 || i10 == 3)) {
                    fuVar.d.setAlpha(f11);
                }
                fuVar.c(floatValue3 - f10);
                break;
            case 4:
                ((mz) this.c).N0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                fa0 fa0Var = (fa0) this.c;
                float[] fArr = fa0Var.W;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue4;
                l5[] l5VarArr = fa0Var.w;
                l5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                l5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                l5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                fa0Var.x[i12].setAlpha(fArr[i12]);
                break;
            default:
                wq wqVar = (wq) this.c;
                wqVar.getClass();
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                al0 al0Var = (al0) wqVar.d;
                al0Var.b.put(this.b, f12);
                al0Var.d = true;
                al0Var.a.invalidate();
                break;
        }
    }
}
