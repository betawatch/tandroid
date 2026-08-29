package nh;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.tv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hh1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v9(Object obj, float f9, float f10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f9;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        float f9 = this.c;
        float f10 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                gb gbVar = (gb) obj;
                gbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gbVar.r.setTranslationY(f10 * floatValue);
                gbVar.r.b(f9 * floatValue);
                break;
            case 1:
                tv tvVar = (tv) obj;
                tvVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tvVar.H = floatValue2;
                tvVar.G = AndroidUtilities.lerp(f10, f9, floatValue2);
                tvVar.b.invalidate();
                break;
            case 2:
                hh1 hh1Var = (hh1) obj;
                hh1Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f9 + AndroidUtilities.dp(52.0f);
                float f11 = hh1Var.y;
                hh1Var.C = dp - (dp * f11);
                hh1Var.D = dp2 - (f11 * dp2);
                hh1Var.invalidate();
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.y1.b.a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.W5;
                float f13 = ((photoViewer.a6 - f12) * photoViewer.h6) + f12;
                cropAreaView.j0 = floatValue3;
                cropAreaView.k0 = f13;
                cropAreaView.l0 = 0.0f;
                cropAreaView.m0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.y1.c.b(AndroidUtilities.lerp(f9, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            default:
                vd.c cVar = (vd.c) obj;
                if (cVar.g) {
                    DecelerateInterpolator decelerateInterpolator = ud.a.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f9 * animatedFraction) + f10, animatedFraction);
                    break;
                }
                break;
        }
    }
}
