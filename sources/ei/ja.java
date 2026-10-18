package ei;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.kw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ch1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ja implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ja(Object obj, float f7, float f10, int i10) {
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
                vb vbVar = (vb) obj;
                vbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vbVar.r.setTranslationY(f10 * floatValue);
                vbVar.r.b(f7 * floatValue);
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
                kw kwVar = (kw) obj;
                kwVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kwVar.L = floatValue2;
                kwVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                kwVar.b.invalidate();
                break;
            case 3:
                ch1 ch1Var = (ch1) obj;
                ch1Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = ch1Var.y;
                ch1Var.G = dp - (dp * f11);
                ch1Var.H = dp2 - (f11 * dp2);
                ch1Var.invalidate();
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
                org.telegram.ui.Wallet.l3 l3Var = (org.telegram.ui.Wallet.l3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l3Var.A = (f10 * floatValue4) + l3Var.i();
                l3Var.B = (f7 * floatValue4) + (l3Var.k.E * 0.14f);
                l3Var.D = floatValue4 > 0.0f;
                l3Var.a.invalidate();
                break;
            case 6:
                org.telegram.ui.Wallet.p5 p5Var = (org.telegram.ui.Wallet.p5) obj;
                p5Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p5Var.J = f10 * floatValue5;
                p5Var.K = f7 * floatValue5;
                break;
            case 7:
                org.telegram.ui.Wallet.e6 e6Var = (org.telegram.ui.Wallet.e6) obj;
                e6Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Wallet.b6 b6Var = e6Var.i0;
                float f14 = 1.0f - floatValue6;
                b6Var.d = f10 * f14;
                b6Var.i = f7 * f14;
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
