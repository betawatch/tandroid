package kh;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.nv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fh1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ka implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ka(Object obj, float f10, float f11, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.a;
        float f10 = this.c;
        float f11 = this.b;
        Object obj = this.d;
        switch (i9) {
            case 0:
                wb wbVar = (wb) obj;
                wbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wbVar.r.setTranslationY(f11 * floatValue);
                wbVar.r.b(f10 * floatValue);
                break;
            case 1:
                nv nvVar = (nv) obj;
                nvVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nvVar.H = floatValue2;
                nvVar.G = AndroidUtilities.lerp(f11, f10, floatValue2);
                nvVar.b.invalidate();
                break;
            case 2:
                fh1 fh1Var = (fh1) obj;
                fh1Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f11 + AndroidUtilities.dp(28.0f);
                float dp2 = f10 + AndroidUtilities.dp(52.0f);
                float f12 = fh1Var.y;
                fh1Var.C = dp - (dp * f12);
                fh1Var.D = dp2 - (f12 * dp2);
                fh1Var.invalidate();
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.y1.b.a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.W5;
                float f14 = ((photoViewer.a6 - f13) * photoViewer.h6) + f13;
                cropAreaView.j0 = floatValue3;
                cropAreaView.k0 = f14;
                cropAreaView.l0 = 0.0f;
                cropAreaView.m0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.y1.c.b(AndroidUtilities.lerp(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            default:
                td.c cVar = (td.c) obj;
                if (cVar.g) {
                    DecelerateInterpolator decelerateInterpolator = sd.a.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    break;
                }
                break;
        }
    }
}
