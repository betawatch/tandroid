package ih;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.xq;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                g3 g3Var = (g3) this.c;
                g3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                g3Var.setItemColor(this.b, intValue, intValue);
                break;
            case 2:
                s1 s1Var = (s1) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (s1Var.getMessageObject() != null && s1Var.getMessageObject().getId() == this.b) {
                    s1Var.setSelectedBackgroundProgress(floatValue2);
                    break;
                }
                break;
            case 3:
                cu cuVar = (cu) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cuVar.d.setTranslationY(floatValue3);
                int i11 = this.b;
                float f10 = i11;
                float f11 = 1.0f - (floatValue3 / f10);
                cuVar.O = f11;
                if (i11 > 0 && ((i10 = cuVar.I) == 2 || i10 == 3)) {
                    cuVar.d.setAlpha(f11);
                }
                cuVar.c(floatValue3 - f10);
                break;
            case 4:
                ((kz) this.c).N0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                ea0 ea0Var = (ea0) this.c;
                float[] fArr = ea0Var.W;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue4;
                k5[] k5VarArr = ea0Var.w;
                k5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                k5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                k5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                ea0Var.x[i12].setAlpha(fArr[i12]);
                break;
            default:
                xq xqVar = (xq) this.c;
                xqVar.getClass();
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                yk0 yk0Var = (yk0) xqVar.d;
                yk0Var.b.put(this.b, f12);
                yk0Var.d = true;
                yk0Var.a.invalidate();
                break;
        }
    }
}
