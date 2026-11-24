// default package

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dz1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dz1(Object obj, float f, float f2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.c;
        float f2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = ((ez1) obj).d;
                chatActivityEnterView.H = f2 * floatValue;
                chatActivityEnterView.u2();
                chatActivityEnterView.R0.setTranslationX(f * floatValue);
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vs4 vs4Var = ((sm3) obj).a;
                vs4Var.d = f2 * floatValue2;
                vs4Var.i = f * floatValue2;
                break;
            case 2:
                mz3 mz3Var = (mz3) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mz3Var.L = floatValue3;
                mz3Var.K = gm.R1(f2, f, floatValue3);
                mz3Var.b.invalidate();
                break;
            case 3:
                h94 h94Var = (h94) obj;
                if (h94Var.h) {
                    DecelerateInterpolator decelerateInterpolator = uo.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    h94Var.d((f * animatedFraction) + f2, animatedFraction);
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f2;
                float f3 = photoViewer.Z5;
                float f4 = ((photoViewer.d6 - f3) * photoViewer.k6) + f3;
                cropAreaView.o0 = floatValue4;
                cropAreaView.p0 = f4;
                cropAreaView.q0 = 0.0f;
                cropAreaView.r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.c.b(gm.R1(f, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 5:
                cic cicVar = (cic) obj;
                cicVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f2 + gm.L(28.0f);
                float L2 = f + gm.L(52.0f);
                float f5 = cicVar.E;
                cicVar.H = L - (L * f5);
                cicVar.I = L2 - (f5 * L2);
                cicVar.invalidate();
                break;
            case 6:
                v9b v9bVar = (v9b) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v9bVar.r.setTranslationY(f2 * floatValue5);
                v9bVar.r.b(f * floatValue5);
                break;
            case 7:
                mmc mmcVar = (mmc) obj;
                float floatValue6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mmcVar.A = (f2 * floatValue6) + mmcVar.g();
                mmcVar.B = (f * floatValue6) + (mmcVar.k.F * 0.14f);
                mmcVar.D = floatValue6 > 0.0f;
                mmcVar.a.invalidate();
                break;
            default:
                moc mocVar = (moc) obj;
                float floatValue7 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mocVar.O = f2 * floatValue7;
                mocVar.P = f * floatValue7;
                break;
        }
    }
}
