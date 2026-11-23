package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ gn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float T1 = org.telegram.messenger.g0.T1(photoViewer.a6, photoViewer.e6, photoViewer.l6);
                float T12 = org.telegram.messenger.g0.T1(photoViewer.X5, photoViewer.c6, photoViewer.l6);
                float T13 = org.telegram.messenger.g0.T1(photoViewer.Y5, photoViewer.d6, photoViewer.l6);
                cropAreaView.o0 = 0.0f;
                cropAreaView.p0 = T1;
                cropAreaView.q0 = T12;
                cropAreaView.r0 = T13;
                cropAreaView.invalidate();
                break;
            case 2:
                photoViewer.M1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                photoViewer.M1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                photoViewer.q3();
                break;
            case 6:
                photoViewer.M1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                photoViewer.M1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                vp0 vp0Var = photoViewer.M1;
                if (vp0Var != null) {
                    vp0Var.N0.invalidate();
                    break;
                }
                break;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                vp0 vp0Var2 = photoViewer.M1;
                if (vp0Var2 != null && Math.abs(floatValue - vp0Var2.H1) > 0.1f) {
                    vp0Var2.H1 = floatValue;
                    vp0Var2.v0(vp0Var2.s0, vp0Var2.t0, vp0Var2.u0, vp0Var2.x0, vp0Var2.y0);
                }
                photoViewer.f0.invalidate();
                break;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.Z8;
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.D1();
                break;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                photoViewer.X0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                break;
            default:
                Drawable[] drawableArr8 = PhotoViewer.Z8;
                photoViewer.getClass();
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
