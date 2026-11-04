package gi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.zu;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l9(Object obj, float f10, float f11, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.a;
        float f10 = this.c;
        float f11 = this.b;
        Object obj = this.d;
        switch (i3) {
            case 0:
                va vaVar = (va) obj;
                vaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vaVar.r.setTranslationY(f11 * floatValue);
                vaVar.r.b(f10 * floatValue);
                break;
            case 1:
                zu zuVar = (zu) obj;
                zuVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zuVar.M = floatValue2;
                zuVar.L = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                zuVar.b.invalidate();
                break;
            case 2:
                sb1 sb1Var = (sb1) obj;
                sb1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f11 + org.telegram.messenger.g0.L(28.0f);
                float L2 = f10 + org.telegram.messenger.g0.L(52.0f);
                float f12 = sb1Var.E;
                sb1Var.H = L - (L * f12);
                sb1Var.I = L2 - (f12 * L2);
                sb1Var.invalidate();
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.b6;
                float f14 = ((photoViewer.f6 - f13) * photoViewer.m6) + f13;
                cropAreaView.o0 = floatValue3;
                cropAreaView.p0 = f14;
                cropAreaView.q0 = 0.0f;
                cropAreaView.r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.c.b(org.telegram.messenger.g0.T1(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 4:
                org.telegram.ui.Wallet.b4 b4Var = (org.telegram.ui.Wallet.b4) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.A = (f11 * floatValue4) + b4Var.g();
                b4Var.B = (f10 * floatValue4) + (b4Var.k.F * 0.14f);
                b4Var.D = floatValue4 > 0.0f;
                b4Var.a.invalidate();
                break;
            case 5:
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) obj;
                a6Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a6Var.O = f11 * floatValue5;
                a6Var.P = f10 * floatValue5;
                break;
            case 6:
                qe.c cVar = (qe.c) obj;
                if (cVar.h) {
                    DecelerateInterpolator decelerateInterpolator = pe.a.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    break;
                }
                break;
            default:
                wg.e eVar = (wg.e) obj;
                eVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg.f fVar = eVar.a;
                fVar.d = f11 * floatValue6;
                fVar.i = f10 * floatValue6;
                break;
        }
    }
}
