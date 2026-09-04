package di;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ni1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class bb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bb(Object obj, float f7, float f10, int i10) {
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
                pc pcVar = (pc) obj;
                pcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pcVar.r.setTranslationY(f10 * floatValue);
                pcVar.r.b(f7 * floatValue);
                break;
            case 1:
                le.e eVar = (le.e) obj;
                if (eVar.g) {
                    DecelerateInterpolator decelerateInterpolator = ke.a.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    eVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    break;
                }
                break;
            case 2:
                bw bwVar = (bw) obj;
                bwVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bwVar.L = floatValue2;
                bwVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                bwVar.b.invalidate();
                break;
            case 3:
                ni1 ni1Var = (ni1) obj;
                ni1Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = ni1Var.y;
                ni1Var.G = dp - (dp * f11);
                ni1Var.H = dp2 - (f11 * dp2);
                ni1Var.invalidate();
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
