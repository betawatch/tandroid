package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fq0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ fq0(PhotoViewer photoViewer, int i9) {
        this.a = i9;
        this.b = photoViewer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i9) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.e3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                CropAreaView cropAreaView = photoViewer.y1.b.a;
                float lerp = AndroidUtilities.lerp(photoViewer.W5, photoViewer.a6, photoViewer.h6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.T5, photoViewer.Y5, photoViewer.h6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.U5, photoViewer.Z5, photoViewer.h6);
                cropAreaView.j0 = 0.0f;
                cropAreaView.k0 = lerp;
                cropAreaView.l0 = lerp2;
                cropAreaView.m0 = lerp3;
                cropAreaView.invalidate();
                break;
            case 2:
                photoViewer.H1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                photoViewer.H1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.i6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer.s3();
                break;
            case 6:
                photoViewer.H1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                photoViewer.H1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                xs0 xs0Var = photoViewer.H1;
                if (xs0Var != null) {
                    xs0Var.Z0.invalidate();
                    break;
                }
                break;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.P8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.V5 = floatValue;
                xs0 xs0Var2 = photoViewer.H1;
                if (xs0Var2 != null && Math.abs(floatValue - xs0Var2.T1) > 0.1f) {
                    xs0Var2.T1 = floatValue;
                    xs0Var2.v0(xs0Var2.E0, xs0Var2.F0, xs0Var2.G0, xs0Var2.J0, xs0Var2.K0);
                }
                photoViewer.a0.invalidate();
                break;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.i6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.F1();
                break;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.i6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.i6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                photoViewer.S0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                break;
            default:
                Drawable[] drawableArr8 = PhotoViewer.P8;
                photoViewer.getClass();
                photoViewer.i6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
