package hi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.gv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.yb1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i9(Object obj, float f10, float f11, int i7) {
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
                sa saVar = (sa) obj;
                saVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                saVar.r.setTranslationY(f11 * floatValue);
                saVar.r.b(f10 * floatValue);
                break;
            case 1:
                gv gvVar = (gv) obj;
                gvVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gvVar.M = floatValue2;
                gvVar.L = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                gvVar.b.invalidate();
                break;
            case 2:
                yb1 yb1Var = (yb1) obj;
                yb1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f11 + org.telegram.messenger.g0.L(28.0f);
                float L2 = f10 + org.telegram.messenger.g0.L(52.0f);
                float f12 = yb1Var.E;
                yb1Var.H = L - (L * f12);
                yb1Var.I = L2 - (f12 * L2);
                yb1Var.invalidate();
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.a6;
                float f14 = ((photoViewer.e6 - f13) * photoViewer.l6) + f13;
                cropAreaView.o0 = floatValue3;
                cropAreaView.p0 = f14;
                cropAreaView.q0 = 0.0f;
                cropAreaView.r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.c.b(org.telegram.messenger.g0.T1(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 4:
                org.telegram.ui.Wallet.c4 c4Var = (org.telegram.ui.Wallet.c4) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c4Var.A = (f11 * floatValue4) + c4Var.g();
                c4Var.B = (f10 * floatValue4) + (c4Var.k.F * 0.14f);
                c4Var.D = floatValue4 > 0.0f;
                c4Var.a.invalidate();
                break;
            case 5:
                org.telegram.ui.Wallet.c6 c6Var = (org.telegram.ui.Wallet.c6) obj;
                c6Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.O = f11 * floatValue5;
                c6Var.P = f10 * floatValue5;
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
