package gh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.pq;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                f3 f3Var = (f3) this.c;
                f3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                f3Var.setItemColor(this.b, intValue, intValue);
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
                au auVar = (au) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                auVar.d.setTranslationY(floatValue3);
                int i11 = this.b;
                float f9 = i11;
                float f10 = 1.0f - (floatValue3 / f9);
                auVar.N = f10;
                if (i11 > 0 && ((i10 = auVar.H) == 2 || i10 == 3)) {
                    auVar.d.setAlpha(f10);
                }
                auVar.c(floatValue3 - f9);
                break;
            case 4:
                ((fz) this.c).M0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                y90 y90Var = (y90) this.c;
                float[] fArr = y90Var.V;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue4;
                h5[] h5VarArr = y90Var.w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                y90Var.x[i12].setAlpha(fArr[i12]);
                break;
            default:
                pq pqVar = (pq) this.c;
                pqVar.getClass();
                Float f11 = (Float) valueAnimator.getAnimatedValue();
                pk0 pk0Var = (pk0) pqVar.d;
                pk0Var.b.put(this.b, f11);
                pk0Var.d = true;
                pk0Var.a.invalidate();
                break;
        }
    }
}
