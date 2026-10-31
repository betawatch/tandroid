package fe;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.mv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.d4;
import org.telegram.ui.Wallet.g6;
import org.telegram.ui.ud1;
import vh.o8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(Object obj, float f7, float f10, int i10) {
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
                f fVar = (f) obj;
                if (fVar.h) {
                    DecelerateInterpolator decelerateInterpolator = ee.a.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    fVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    break;
                }
                break;
            case 1:
                lg.g gVar = (lg.g) obj;
                gVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg.h hVar = gVar.a;
                hVar.d = f10 * floatValue;
                hVar.i = f7 * floatValue;
                break;
            case 2:
                mv mvVar = (mv) obj;
                mvVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mvVar.L = floatValue2;
                mvVar.K = i0.T1(f10, f7, floatValue2);
                mvVar.b.invalidate();
                break;
            case 3:
                ud1 ud1Var = (ud1) obj;
                ud1Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f10 + i0.L(28.0f);
                float L2 = f7 + i0.L(52.0f);
                float f11 = ud1Var.D;
                ud1Var.G = L - (L * f11);
                ud1Var.H = L2 - (f11 * L2);
                ud1Var.invalidate();
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
                photoViewer.C1.c.b(i0.T1(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 5:
                d4 d4Var = (d4) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d4Var.A = (f10 * floatValue4) + d4Var.g();
                d4Var.B = (f7 * floatValue4) + (d4Var.k.E * 0.14f);
                d4Var.D = floatValue4 > 0.0f;
                d4Var.a.invalidate();
                break;
            case 6:
                g6 g6Var = (g6) obj;
                g6Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g6Var.N = f10 * floatValue5;
                g6Var.O = f7 * floatValue5;
                break;
            default:
                o8 o8Var = (o8) obj;
                o8Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.r.setTranslationY(f10 * floatValue6);
                o8Var.r.b(f7 * floatValue6);
                break;
        }
    }
}
