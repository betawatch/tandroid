package ci;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.dw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fi1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class ya implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ya(Object obj, float f7, float f10, int i10) {
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
                lc lcVar = (lc) obj;
                lcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.r.setTranslationY(f10 * floatValue);
                lcVar.r.b(f7 * floatValue);
                break;
            case 1:
                le.f fVar = (le.f) obj;
                if (fVar.g) {
                    DecelerateInterpolator decelerateInterpolator = ke.a.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    fVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    break;
                }
                break;
            case 2:
                dw dwVar = (dw) obj;
                dwVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dwVar.L = floatValue2;
                dwVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                dwVar.b.invalidate();
                break;
            case 3:
                fi1 fi1Var = (fi1) obj;
                fi1Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = fi1Var.y;
                fi1Var.G = dp - (dp * f11);
                fi1Var.H = dp2 - (f11 * dp2);
                fi1Var.invalidate();
                break;
            default:
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
        }
    }
}
