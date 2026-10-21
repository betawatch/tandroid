package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.oq;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                l60 l60Var = (l60) this.c;
                if (this.b == l60Var.s0) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue3 >= 0.5f) {
                        floatValue3 -= 1.0f;
                    }
                    l60Var.x.setRotationY(floatValue3 * 180.0f);
                    break;
                }
                break;
            case 5:
                wa0 wa0Var = (wa0) this.c;
                float[] fArr = wa0Var.Z;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue4;
                j5[] j5VarArr = wa0Var.w;
                j5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                j5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                j5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                wa0Var.x[i12].setAlpha(fArr[i12]);
                break;
            case 6:
                oq oqVar = (oq) this.c;
                oqVar.getClass();
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                ol0 ol0Var = (ol0) oqVar.d;
                ol0Var.b.put(this.b, f11);
                ol0Var.d = true;
                ol0Var.a.invalidate();
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
