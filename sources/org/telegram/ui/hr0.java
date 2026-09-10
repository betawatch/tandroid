package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ hr0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.b.a;
                float lerp = AndroidUtilities.lerp(photoViewer.a6, photoViewer.e6, photoViewer.l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.c6, photoViewer.l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.d6, photoViewer.l6);
                cropAreaView.n0 = 0.0f;
                cropAreaView.o0 = lerp;
                cropAreaView.p0 = lerp2;
                cropAreaView.q0 = lerp3;
                cropAreaView.invalidate();
                break;
            case 2:
                photoViewer.L1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.T8;
                photoViewer.s3();
                break;
            case 6:
                photoViewer.L1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                zt0 zt0Var = photoViewer.L1;
                if (zt0Var != null) {
                    zt0Var.d1.invalidate();
                    break;
                }
                break;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.T8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                zt0 zt0Var2 = photoViewer.L1;
                if (zt0Var2 != null && Math.abs(floatValue - zt0Var2.X1) > 0.1f) {
                    zt0Var2.X1 = floatValue;
                    zt0Var2.v0(zt0Var2.I0, zt0Var2.J0, zt0Var2.K0, zt0Var2.N0, zt0Var2.O0);
                }
                photoViewer.e0.invalidate();
                break;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.F1();
                break;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                break;
            default:
                Drawable[] drawableArr8 = PhotoViewer.T8;
                photoViewer.getClass();
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
