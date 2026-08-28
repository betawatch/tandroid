package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.TextureView;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mu0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final c5.c c;
    public final org.telegram.ui.Components.o9 d;
    public final /* synthetic */ nu0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu0(nu0 nu0Var, Context context) {
        super(context);
        this.e = nu0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new lu0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.d = o9Var;
        frameLayout.addView(o9Var);
        frameLayout.setWillNotDraw(false);
        c5.c cVar = new c5.c(context);
        this.c = cVar;
        cVar.setBackgroundColor(0);
        frameLayout.addView(cVar, g7.e6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        cVar.addView(textureView, g7.e6.c(-1.0f, -1));
        addView(frameLayout, g7.e6.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f10;
        nu0 nu0Var = this.e;
        float[] fArr = nu0Var.m;
        dh.l lVar = nu0Var.j;
        Path path = nu0Var.l;
        if (!nu0Var.n || nu0Var.e == null || nu0Var.a == null) {
            return;
        }
        nu0Var.i();
        float left = nu0Var.o - getLeft();
        float top = nu0Var.p - getTop();
        canvas.save();
        float f11 = nu0Var.O;
        float f12 = nu0Var.A;
        float f13 = ((f11 * f12) + 1.0f) - f12;
        canvas.scale(f13, f13, nu0Var.s + left, nu0Var.t + top);
        float f14 = nu0Var.J;
        float f15 = nu0Var.A;
        canvas.translate((f14 * f15) + left, (nu0Var.K * f15) + top);
        ImageReceiver imageReceiver = nu0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f16 = nu0Var.B;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                nu0Var.B = f17;
                if (f17 > 1.0f) {
                    nu0Var.B = 1.0f;
                } else {
                    nu0Var.e();
                }
            }
            nu0Var.g.setAlpha(nu0Var.B);
        }
        float f18 = nu0Var.u;
        float f19 = nu0Var.v;
        float f20 = nu0Var.w;
        float f21 = nu0Var.y;
        if (f20 == f21 && nu0Var.x == nu0Var.z) {
            f10 = 1.0f;
        } else {
            float f22 = f13 < 1.0f ? 0.0f : f13 < 1.4f ? (f13 - 1.0f) / 0.4f : 1.0f;
            f10 = 1.0f;
            float f23 = nu0Var.z;
            float f24 = nu0Var.x;
            float f25 = ((f23 - f24) / 2.0f) * f22;
            f18 -= f25;
            float f26 = ((f21 - f20) / 2.0f) * f22;
            f19 -= f26;
            ImageReceiver imageReceiver2 = nu0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f18, f19, (f25 * 2.0f) + f24, (f26 * 2.0f) + f20);
            }
        }
        if (nu0Var.R) {
            float f27 = nu0Var.s - nu0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f27);
            frameLayout.setPivotY(nu0Var.t - nu0Var.v);
            frameLayout.setScaleY(f13);
            frameLayout.setScaleX(f13);
            frameLayout.setTranslationX((nu0Var.J * f13 * nu0Var.A) + f18 + left);
            frameLayout.setTranslationY((nu0Var.K * f13 * nu0Var.A) + f19 + top);
        } else {
            ImageReceiver imageReceiver3 = nu0Var.f;
            if (imageReceiver3 != null) {
                if (nu0Var.B != f10) {
                    if (imageReceiver3.getLottieAnimation() != null || nu0Var.f.getAnimation() != null || nu0Var.g.getLottieAnimation() != null || nu0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    nu0Var.f.draw(canvas);
                    nu0Var.g.setImageCoords(nu0Var.f.getImageX(), nu0Var.f.getImageY(), nu0Var.f.getImageWidth(), nu0Var.f.getImageHeight());
                    nu0Var.g.draw(canvas);
                } else {
                    nu0Var.g.setImageCoords(imageReceiver3.getImageX(), nu0Var.f.getImageY(), nu0Var.f.getImageWidth(), nu0Var.f.getImageHeight());
                    nu0Var.g.draw(canvas);
                    if (nu0Var.g.getLottieAnimation() != null || nu0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (nu0Var.i) {
            nu0Var.h.setAlpha(nu0Var.f.getAlpha());
            nu0Var.h.setRoundRadius(nu0Var.f.getRoundRadius(true));
            nu0Var.h.setImageCoords(nu0Var.f.getImageX(), nu0Var.f.getImageY(), nu0Var.f.getImageWidth(), nu0Var.f.getImageHeight());
            nu0Var.h.draw(canvas);
            int[] roundRadius = nu0Var.f.getRoundRadius(true);
            float f28 = roundRadius[0];
            fArr[1] = f28;
            fArr[0] = f28;
            float f29 = roundRadius[1];
            fArr[3] = f29;
            fArr[2] = f29;
            float f30 = roundRadius[2];
            fArr[5] = f30;
            fArr[4] = f30;
            float f31 = roundRadius[3];
            fArr[7] = f31;
            fArr[6] = f31;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(nu0Var.f.getImageX(), nu0Var.f.getImageY(), nu0Var.f.getImageX2(), nu0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (nu0Var.k != null) {
                canvas.translate(nu0Var.f.getImageX(), nu0Var.f.getImageY());
                nu0Var.k.c(canvas, nu0Var.d, (int) nu0Var.f.getImageWidth(), (int) nu0Var.f.getImageHeight(), 1.0f, false);
            } else {
                lVar.h(i0.a.k(-1, (int) (nu0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                lVar.setBounds((int) nu0Var.f.getImageX(), (int) nu0Var.f.getImageY(), (int) nu0Var.f.getImageX2(), (int) nu0Var.f.getImageY2());
                lVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        ku0 ku0Var;
        nu0 nu0Var = this.e;
        float[] fArr = nu0Var.Q;
        if (nu0Var.C == null) {
            float f11 = nu0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                nu0Var.P = f12;
                if (f12 > 1.0f) {
                    nu0Var.P = 1.0f;
                } else {
                    nu0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.gr.f.getInterpolation(nu0Var.P) * nu0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f13 = 0.0f;
        if (interpolation == 1.0f || (ku0Var = nu0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f10 = measuredHeight;
        } else {
            ku0Var.h(fArr);
            canvas.save();
            float f14 = 1.0f - interpolation;
            float f15 = fArr[0] * f14;
            float measuredHeight2 = (fArr[1] * f14) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f15, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f10 = measuredHeight2;
            f13 = f15;
        }
        nu0Var.c(canvas, 1.0f - interpolation, nu0Var.o - getLeft(), nu0Var.p - getTop(), f13, f10);
    }
}
