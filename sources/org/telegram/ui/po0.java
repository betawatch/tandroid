package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class po0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ po0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.b.a;
                float T1 = org.telegram.messenger.i0.T1(photoViewer.a6, photoViewer.e6, photoViewer.l6);
                float T12 = org.telegram.messenger.i0.T1(photoViewer.X5, photoViewer.c6, photoViewer.l6);
                float T13 = org.telegram.messenger.i0.T1(photoViewer.Y5, photoViewer.d6, photoViewer.l6);
                cropAreaView.n0 = 0.0f;
                cropAreaView.o0 = T1;
                cropAreaView.p0 = T12;
                cropAreaView.q0 = T13;
                cropAreaView.invalidate();
                break;
            case 2:
                photoViewer.L1.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.v3();
                break;
            case 6:
                photoViewer.L1.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                er0 er0Var = photoViewer.L1;
                if (er0Var != null) {
                    er0Var.M0.invalidate();
                    break;
                }
                break;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                er0 er0Var2 = photoViewer.L1;
                if (er0Var2 != null && Math.abs(floatValue - er0Var2.G1) > 0.1f) {
                    er0Var2.G1 = floatValue;
                    er0Var2.u0(er0Var2.r0, er0Var2.s0, er0Var2.t0, er0Var2.w0, er0Var2.x0);
                }
                photoViewer.e0.invalidate();
                break;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.I1();
                break;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                break;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
