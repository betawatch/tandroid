package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.dr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s2(Object obj, int i10, int i11) {
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
                nu nuVar = (nu) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nuVar.d.setTranslationY(floatValue2);
                int i11 = this.b;
                float f7 = i11;
                float f10 = 1.0f - (floatValue2 / f7);
                nuVar.R = f10;
                if (i11 > 0 && ((i10 = nuVar.L) == 2 || i10 == 3)) {
                    nuVar.d.setAlpha(f10);
                }
                nuVar.c(floatValue2 - f7);
                break;
            case 3:
                ((rz) this.c).Q0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                la0 la0Var = (la0) this.c;
                float[] fArr = la0Var.Z;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue3;
                l5[] l5VarArr = la0Var.w;
                l5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue3));
                l5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                l5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                la0Var.x[i12].setAlpha(fArr[i12]);
                break;
            case 5:
                dr drVar = (dr) this.c;
                drVar.getClass();
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                zk0 zk0Var = (zk0) drVar.d;
                zk0Var.b.put(this.b, f11);
                zk0Var.d = true;
                zk0Var.a.invalidate();
                break;
            default:
                uh.h hVar = (uh.h) this.c;
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
