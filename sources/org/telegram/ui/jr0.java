package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ jr0(PhotoViewer photoViewer, int i10) {
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
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.r3();
                break;
            case 6:
                photoViewer.L1.t0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                cu0 cu0Var = photoViewer.L1;
                if (cu0Var != null) {
                    cu0Var.d1.invalidate();
                    break;
                }
                break;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                cu0 cu0Var2 = photoViewer.L1;
                if (cu0Var2 != null && Math.abs(floatValue - cu0Var2.X1) > 0.1f) {
                    cu0Var2.X1 = floatValue;
                    cu0Var2.v0(cu0Var2.I0, cu0Var2.J0, cu0Var2.K0, cu0Var2.N0, cu0Var2.O0);
                }
                photoViewer.e0.invalidate();
                break;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.F1();
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
