package fi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.kw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ih1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class fa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fa(Object obj, float f7, float f10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f7;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        float f7 = this.c;
        float f10 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                sb sbVar = (sb) obj;
                sbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sbVar.r.setTranslationY(f10 * floatValue);
                sbVar.r.b(f7 * floatValue);
                break;
            case 1:
                oe.e eVar = (oe.e) obj;
                if (eVar.h) {
                    DecelerateInterpolator decelerateInterpolator = ne.a.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    eVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    break;
                }
                break;
            case 2:
                kw kwVar = (kw) obj;
                kwVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kwVar.L = floatValue2;
                kwVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                kwVar.b.invalidate();
                break;
            case 3:
                ih1 ih1Var = (ih1) obj;
                ih1Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = ih1Var.y;
                ih1Var.G = dp - (dp * f11);
                ih1Var.H = dp2 - (f11 * dp2);
                ih1Var.invalidate();
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.b.a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.a6;
                float f13 = ((photoViewer.e6 - f12) * photoViewer.l6) + f12;
                cropAreaView.n0 = floatValue3;
                cropAreaView.o0 = f13;
                cropAreaView.p0 = 0.0f;
                cropAreaView.q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 5:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3Var.A = (f10 * floatValue4) + m3Var.g();
                m3Var.B = (f7 * floatValue4) + (m3Var.k.E * 0.14f);
                m3Var.D = floatValue4 > 0.0f;
                m3Var.a.invalidate();
                break;
            case 6:
                org.telegram.ui.Wallet.r5 r5Var = (org.telegram.ui.Wallet.r5) obj;
                r5Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r5Var.N = f10 * floatValue5;
                r5Var.O = f7 * floatValue5;
                break;
            default:
                ug.f fVar = (ug.f) obj;
                fVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug.g gVar = fVar.a;
                gVar.d = f10 * floatValue6;
                gVar.i = f7 * floatValue6;
                break;
        }
    }
}
