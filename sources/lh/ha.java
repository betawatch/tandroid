package lh;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.mv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.eh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ha implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ha(Object obj, float f10, float f11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        float f10 = this.c;
        float f11 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                sb sbVar = (sb) obj;
                sbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sbVar.r.setTranslationY(f11 * floatValue);
                sbVar.r.b(f10 * floatValue);
                break;
            case 1:
                mv mvVar = (mv) obj;
                mvVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mvVar.H = floatValue2;
                mvVar.G = AndroidUtilities.lerp(f11, f10, floatValue2);
                mvVar.b.invalidate();
                break;
            case 2:
                eh1 eh1Var = (eh1) obj;
                eh1Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f11 + AndroidUtilities.dp(28.0f);
                float dp2 = f10 + AndroidUtilities.dp(52.0f);
                float f12 = eh1Var.y;
                eh1Var.C = dp - (dp * f12);
                eh1Var.D = dp2 - (f12 * dp2);
                eh1Var.invalidate();
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.y1.b.a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.W5;
                float f14 = ((photoViewer.a6 - f13) * photoViewer.h6) + f13;
                cropAreaView.j0 = floatValue3;
                cropAreaView.k0 = f14;
                cropAreaView.l0 = 0.0f;
                cropAreaView.m0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.y1.c.b(AndroidUtilities.lerp(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            default:
                ud.c cVar = (ud.c) obj;
                if (cVar.g) {
                    DecelerateInterpolator decelerateInterpolator = td.a.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    break;
                }
                break;
        }
    }
}
