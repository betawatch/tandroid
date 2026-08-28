package dh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.wy;
import org.telegram.ui.nq;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9;
        switch (this.a) {
            case 0:
                l lVar = (l) this.c;
                lVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.n = floatValue;
                lVar.setAlpha((int) ((1.0f - floatValue) * this.b));
                lVar.p = true;
                lVar.invalidateSelf();
                break;
            case 1:
                f3 f3Var = (f3) this.c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.b, intValue, intValue);
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
                ut utVar = (ut) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                utVar.d.setTranslationY(floatValue3);
                int i10 = this.b;
                float f10 = i10;
                float f11 = 1.0f - (floatValue3 / f10);
                utVar.N = f11;
                if (i10 > 0 && ((i9 = utVar.H) == 2 || i9 == 3)) {
                    utVar.d.setAlpha(f11);
                }
                utVar.c(floatValue3 - f10);
                break;
            case 4:
                ((wy) this.c).M0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                k90 k90Var = (k90) this.c;
                float[] fArr = k90Var.V;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i11 = this.b;
                fArr[i11] = floatValue4;
                h5[] h5VarArr = k90Var.w;
                h5VarArr[i11].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                h5VarArr[i11].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i11]));
                h5VarArr[i11].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i11]));
                k90Var.x[i11].setAlpha(fArr[i11]);
                break;
            default:
                nq nqVar = (nq) this.c;
                nqVar.getClass();
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                dk0 dk0Var = (dk0) nqVar.d;
                dk0Var.b.put(this.b, f12);
                dk0Var.d = true;
                dk0Var.a.invalidate();
                break;
        }
    }
}
