package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pa0;
import org.telegram.ui.wq;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                lu luVar = (lu) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                luVar.d.setTranslationY(floatValue2);
                int i11 = this.b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                luVar.R = f10;
                if (i11 > 0 && ((i10 = luVar.L) == 2 || i10 == 3)) {
                    luVar.d.setAlpha(f10);
                }
                luVar.c(floatValue2 - f7);
                break;
            case 3:
                ((mz) this.c).Q0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                pa0 pa0Var = (pa0) this.c;
                float[] fArr = pa0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue3;
                h5[] h5VarArr = pa0Var.w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                pa0Var.x[i12].setAlpha(fArr[i12]);
                break;
            case 5:
                wq wqVar = (wq) this.c;
                wqVar.getClass();
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                dl0 dl0Var = (dl0) wqVar.d;
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
