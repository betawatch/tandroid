// default package

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f68 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ f68(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.f9;
                photoViewer.i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.f9;
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.f9;
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float R1 = gl.R1(photoViewer.a6, photoViewer.e6, photoViewer.l6);
                float R12 = gl.R1(photoViewer.X5, photoViewer.c6, photoViewer.l6);
                float R13 = gl.R1(photoViewer.Y5, photoViewer.d6, photoViewer.l6);
                cropAreaView.o0 = 0.0f;
                cropAreaView.p0 = R1;
                cropAreaView.q0 = R12;
                cropAreaView.r0 = R13;
                cropAreaView.invalidate();
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.f9;
                photoViewer.M1.v0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                Drawable[] drawableArr5 = PhotoViewer.f9;
                photoViewer.M1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                Drawable[] drawableArr6 = PhotoViewer.f9;
                photoViewer.m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 6:
                Drawable[] drawableArr7 = PhotoViewer.f9;
                photoViewer.C2();
                break;
            case 7:
                Drawable[] drawableArr8 = PhotoViewer.f9;
                photoViewer.M1.v0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                Drawable[] drawableArr9 = PhotoViewer.f9;
                photoViewer.M1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                Drawable[] drawableArr10 = PhotoViewer.f9;
                q88 q88Var = photoViewer.M1;
                if (q88Var != null) {
                    q88Var.T0.invalidate();
                    break;
                }
                break;
            case 10:
                Drawable[] drawableArr11 = PhotoViewer.f9;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                q88 q88Var2 = photoViewer.M1;
                if (q88Var2 != null && Math.abs(floatValue - q88Var2.N1) > 0.1f) {
                    q88Var2.N1 = floatValue;
                    q88Var2.x0(q88Var2.y0, q88Var2.z0, q88Var2.A0, q88Var2.D0, q88Var2.E0);
                }
                photoViewer.f0.invalidate();
                break;
            case 11:
                Drawable[] drawableArr12 = PhotoViewer.f9;
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.G0();
                break;
            case 12:
                Drawable[] drawableArr13 = PhotoViewer.f9;
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                Drawable[] drawableArr14 = PhotoViewer.f9;
                photoViewer.m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                Drawable[] drawableArr15 = PhotoViewer.f9;
                photoViewer.X0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                break;
        }
    }
}
