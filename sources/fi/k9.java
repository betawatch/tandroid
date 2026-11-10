package fi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.av;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k9(Object obj, float f10, float f11, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        float f10 = this.c;
        float f11 = this.b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                va vaVar = (va) obj;
                vaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vaVar.r.setTranslationY(f11 * floatValue);
                vaVar.r.b(f10 * floatValue);
                break;
            case 1:
                av avVar = (av) obj;
                avVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                avVar.L = floatValue2;
                avVar.K = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                avVar.b.invalidate();
                break;
            case 2:
                dc1 dc1Var = (dc1) obj;
                dc1Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f11 + org.telegram.messenger.g0.L(28.0f);
                float L2 = f10 + org.telegram.messenger.g0.L(52.0f);
                float f12 = dc1Var.D;
                dc1Var.G = L - (L * f12);
                dc1Var.H = L2 - (f12 * L2);
                dc1Var.invalidate();
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.b.a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.Z5;
                float f14 = ((photoViewer.d6 - f13) * photoViewer.k6) + f13;
                cropAreaView.n0 = floatValue3;
                cropAreaView.o0 = f14;
                cropAreaView.p0 = 0.0f;
                cropAreaView.q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.c.b(org.telegram.messenger.g0.T1(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 4:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d4Var.A = (f11 * floatValue4) + d4Var.g();
                d4Var.B = (f10 * floatValue4) + (d4Var.k.E * 0.14f);
                d4Var.D = floatValue4 > 0.0f;
                d4Var.a.invalidate();
                break;
            case 5:
                org.telegram.ui.Wallet.d6 d6Var = (org.telegram.ui.Wallet.d6) obj;
                d6Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d6Var.N = f11 * floatValue5;
                d6Var.O = f10 * floatValue5;
                break;
            case 6:
                te.c cVar = (te.c) obj;
                if (cVar.h) {
                    DecelerateInterpolator decelerateInterpolator = se.a.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    break;
                }
                break;
            default:
                vg.e eVar = (vg.e) obj;
                eVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = eVar.a;
                fVar.d = f11 * floatValue6;
                fVar.i = f10 * floatValue6;
                break;
        }
    }
}
