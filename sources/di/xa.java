package di;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ow;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vi1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class xa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xa(Object obj, float f7, float f10, int i10) {
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
                kc kcVar = (kc) obj;
                kcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kcVar.r.setTranslationY(f10 * floatValue);
                kcVar.r.b(f7 * floatValue);
                break;
            case 1:
                ne.e eVar = (ne.e) obj;
                if (eVar.g) {
                    DecelerateInterpolator decelerateInterpolator = me.a.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    eVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    break;
                }
                break;
            case 2:
                ow owVar = (ow) obj;
                owVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                owVar.L = floatValue2;
                owVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                owVar.b.invalidate();
                break;
            case 3:
                vi1 vi1Var = (vi1) obj;
                vi1Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = vi1Var.y;
                vi1Var.G = dp - (dp * f11);
                vi1Var.H = dp2 - (f11 * dp2);
                vi1Var.invalidate();
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
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var.A = (f10 * floatValue4) + e3Var.g();
                e3Var.B = (f7 * floatValue4) + (e3Var.k.E * 0.14f);
                e3Var.D = floatValue4 > 0.0f;
                e3Var.a.invalidate();
                break;
            case 6:
                org.telegram.ui.Wallet.d5 d5Var = (org.telegram.ui.Wallet.d5) obj;
                d5Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d5Var.J = f10 * floatValue5;
                d5Var.K = f7 * floatValue5;
                break;
            case 7:
                org.telegram.ui.Wallet.p5 p5Var = (org.telegram.ui.Wallet.p5) obj;
                p5Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Wallet.l5 l5Var = p5Var.f0;
                float f14 = 1.0f - floatValue6;
                l5Var.d = f10 * f14;
                l5Var.i = f7 * f14;
                break;
            default:
                tg.f fVar = (tg.f) obj;
                fVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = fVar.a;
                gVar.d = f10 * floatValue7;
                gVar.i = f7 * floatValue7;
                break;
        }
    }
}
