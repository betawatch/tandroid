package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bi1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pv(Object obj, float f10, float f11, int i10) {
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
                zv zvVar = (zv) obj;
                zvVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zvVar.I = floatValue;
                zvVar.H = AndroidUtilities.lerp(f11, f10, floatValue);
                zvVar.b.invalidate();
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
                qh.ba baVar = (qh.ba) obj;
                baVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                baVar.r.setTranslationY(f11 * floatValue3);
                baVar.r.b(f10 * floatValue3);
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
