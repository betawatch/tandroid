package ih;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.vq;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                t1 t1Var = (t1) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().getId() == this.b) {
                    t1Var.setSelectedBackgroundProgress(floatValue2);
                    break;
                }
                break;
            case 3:
                du duVar = (du) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                duVar.d.setTranslationY(floatValue3);
                int i11 = this.b;
                float f10 = i11;
                float f11 = 1.0f - (floatValue3 / f10);
                duVar.O = f11;
                if (i11 > 0 && ((i10 = duVar.I) == 2 || i10 == 3)) {
                    duVar.d.setAlpha(f11);
                }
                duVar.c(floatValue3 - f10);
                break;
            case 4:
                ((kz) this.c).N0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                da0 da0Var = (da0) this.c;
                float[] fArr = da0Var.W;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue4;
                k5[] k5VarArr = da0Var.w;
                k5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                k5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                k5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                da0Var.x[i12].setAlpha(fArr[i12]);
                break;
            default:
                vq vqVar = (vq) this.c;
                vqVar.getClass();
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                zk0 zk0Var = (zk0) vqVar.d;
                zk0Var.b.put(this.b, f12);
                zk0Var.d = true;
                zk0Var.a.invalidate();
                break;
        }
    }
}
