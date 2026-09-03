package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bi1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mv(Object obj, float f10, float f11, int i10) {
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
                wv wvVar = (wv) obj;
                wvVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wvVar.I = floatValue;
                wvVar.H = AndroidUtilities.lerp(f11, f10, floatValue);
                wvVar.b.invalidate();
                break;
            case 1:
                bi1 bi1Var = (bi1) obj;
                bi1Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f11 + AndroidUtilities.dp(28.0f);
                float dp2 = f10 + AndroidUtilities.dp(52.0f);
                float f12 = bi1Var.y;
                bi1Var.D = dp - (dp * f12);
                bi1Var.E = dp2 - (f12 * dp2);
                bi1Var.invalidate();
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.z1.b.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.X5;
                float f14 = ((photoViewer.b6 - f13) * photoViewer.i6) + f13;
                cropAreaView.k0 = floatValue2;
                cropAreaView.l0 = f14;
                cropAreaView.m0 = 0.0f;
                cropAreaView.n0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.z1.c.b(AndroidUtilities.lerp(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 3:
                ph.da daVar = (ph.da) obj;
                daVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.r.setTranslationY(f11 * floatValue3);
                daVar.r.b(f10 * floatValue3);
                break;
            default:
                xd.c cVar = (xd.c) obj;
                if (cVar.g) {
                    DecelerateInterpolator decelerateInterpolator = wd.a.a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    break;
                }
                break;
        }
    }
}
