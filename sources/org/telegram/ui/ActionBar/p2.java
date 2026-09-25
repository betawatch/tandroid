package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.na0;
import org.telegram.ui.wq;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                na0 na0Var = (na0) this.c;
                float[] fArr = na0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue3;
                h5[] h5VarArr = na0Var.w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                na0Var.x[i12].setAlpha(fArr[i12]);
                break;
            case 5:
                wq wqVar = (wq) this.c;
                wqVar.getClass();
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                bl0 bl0Var = (bl0) wqVar.d;
                bl0Var.b.put(this.b, f11);
                bl0Var.d = true;
                bl0Var.a.invalidate();
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
