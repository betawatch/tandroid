package eh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.yy;
import org.telegram.ui.pq;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                e3 e3Var = (e3) this.c;
                e3Var.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                e3Var.setItemColor(this.b, intValue, intValue);
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
                tt ttVar = (tt) this.c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ttVar.d.setTranslationY(floatValue3);
                int i11 = this.b;
                float f10 = i11;
                float f11 = 1.0f - (floatValue3 / f10);
                ttVar.N = f11;
                if (i11 > 0 && ((i10 = ttVar.H) == 2 || i10 == 3)) {
                    ttVar.d.setAlpha(f11);
                }
                ttVar.c(floatValue3 - f10);
                break;
            case 4:
                ((yy) this.c).M0[this.b] = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                o90 o90Var = (o90) this.c;
                float[] fArr = o90Var.V;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i12 = this.b;
                fArr[i12] = floatValue4;
                h5[] h5VarArr = o90Var.w;
                h5VarArr[i12].setScaleX(AndroidUtilities.lerp(1.111f, 1.0f, floatValue4));
                h5VarArr[i12].setScaleY(AndroidUtilities.lerp(1.111f, 1.0f, fArr[i12]));
                h5VarArr[i12].setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), 0, fArr[i12]));
                o90Var.x[i12].setAlpha(fArr[i12]);
                break;
            default:
                pq pqVar = (pq) this.c;
                pqVar.getClass();
                Float f12 = (Float) valueAnimator.getAnimatedValue();
                gk0 gk0Var = (gk0) pqVar.d;
                gk0Var.b.put(this.b, f12);
                gk0Var.d = true;
                gk0Var.a.invalidate();
                break;
        }
    }
}
