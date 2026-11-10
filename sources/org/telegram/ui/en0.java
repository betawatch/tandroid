package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class en0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ en0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.h3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.b.a;
                float T1 = org.telegram.messenger.g0.T1(photoViewer.Z5, photoViewer.d6, photoViewer.k6);
                float T12 = org.telegram.messenger.g0.T1(photoViewer.W5, photoViewer.b6, photoViewer.k6);
                float T13 = org.telegram.messenger.g0.T1(photoViewer.X5, photoViewer.c6, photoViewer.k6);
                cropAreaView.n0 = 0.0f;
                cropAreaView.o0 = T1;
                cropAreaView.p0 = T12;
                cropAreaView.q0 = T13;
                cropAreaView.invalidate();
                break;
            case 2:
                photoViewer.L1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.l6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.Y8;
                photoViewer.p3();
                break;
            case 6:
                photoViewer.L1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                xp0 xp0Var = photoViewer.L1;
                if (xp0Var != null) {
                    xp0Var.M0.invalidate();
                    break;
                }
                break;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.Y8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Y5 = floatValue;
                xp0 xp0Var2 = photoViewer.L1;
                if (xp0Var2 != null && Math.abs(floatValue - xp0Var2.G1) > 0.1f) {
                    xp0Var2.G1 = floatValue;
                    xp0Var2.v0(xp0Var2.r0, xp0Var2.s0, xp0Var2.t0, xp0Var2.w0, xp0Var2.x0);
                }
                photoViewer.e0.invalidate();
                break;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.Y8;
                photoViewer.l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.D1();
                break;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                break;
            default:
                Drawable[] drawableArr8 = PhotoViewer.Y8;
                photoViewer.getClass();
                photoViewer.l6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
