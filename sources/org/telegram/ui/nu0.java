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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nu0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final c5.c c;
    public final org.telegram.ui.Components.n9 d;
    public final /* synthetic */ ou0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu0(ou0 ou0Var, Context context) {
        super(context);
        this.e = ou0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new mu0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.d = n9Var;
        frameLayout.addView(n9Var);
        frameLayout.setWillNotDraw(false);
        c5.c cVar = new c5.c(context);
        this.c = cVar;
        cVar.setBackgroundColor(0);
        frameLayout.addView(cVar, h7.z5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        cVar.addView(textureView, h7.z5.c(-1.0f, -1));
        addView(frameLayout, h7.z5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f10;
        ou0 ou0Var = this.e;
        float[] fArr = ou0Var.m;
        eh.k kVar = ou0Var.j;
        Path path = ou0Var.l;
        if (!ou0Var.n || ou0Var.e == null || ou0Var.a == null) {
            return;
        }
        ou0Var.i();
        float left = ou0Var.o - getLeft();
        float top = ou0Var.p - getTop();
        canvas.save();
        float f11 = ou0Var.O;
        float f12 = ou0Var.A;
        float f13 = ((f11 * f12) + 1.0f) - f12;
        canvas.scale(f13, f13, ou0Var.s + left, ou0Var.t + top);
        float f14 = ou0Var.J;
        float f15 = ou0Var.A;
        canvas.translate((f14 * f15) + left, (ou0Var.K * f15) + top);
        ImageReceiver imageReceiver = ou0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f16 = ou0Var.B;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                ou0Var.B = f17;
                if (f17 > 1.0f) {
                    ou0Var.B = 1.0f;
                } else {
                    ou0Var.e();
                }
            }
            ou0Var.g.setAlpha(ou0Var.B);
        }
        float f18 = ou0Var.u;
        float f19 = ou0Var.v;
        float f20 = ou0Var.w;
        float f21 = ou0Var.y;
        if (f20 == f21 && ou0Var.x == ou0Var.z) {
            f10 = 1.0f;
        } else {
            float f22 = f13 < 1.0f ? 0.0f : f13 < 1.4f ? (f13 - 1.0f) / 0.4f : 1.0f;
            f10 = 1.0f;
            float f23 = ou0Var.z;
            float f24 = ou0Var.x;
            float f25 = ((f23 - f24) / 2.0f) * f22;
            f18 -= f25;
            float f26 = ((f21 - f20) / 2.0f) * f22;
            f19 -= f26;
            ImageReceiver imageReceiver2 = ou0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f18, f19, (f25 * 2.0f) + f24, (f26 * 2.0f) + f20);
            }
        }
        if (ou0Var.R) {
            float f27 = ou0Var.s - ou0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f27);
            frameLayout.setPivotY(ou0Var.t - ou0Var.v);
            frameLayout.setScaleY(f13);
            frameLayout.setScaleX(f13);
            frameLayout.setTranslationX((ou0Var.J * f13 * ou0Var.A) + f18 + left);
            frameLayout.setTranslationY((ou0Var.K * f13 * ou0Var.A) + f19 + top);
        } else {
            ImageReceiver imageReceiver3 = ou0Var.f;
            if (imageReceiver3 != null) {
                if (ou0Var.B != f10) {
                    if (imageReceiver3.getLottieAnimation() != null || ou0Var.f.getAnimation() != null || ou0Var.g.getLottieAnimation() != null || ou0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    ou0Var.f.draw(canvas);
                    ou0Var.g.setImageCoords(ou0Var.f.getImageX(), ou0Var.f.getImageY(), ou0Var.f.getImageWidth(), ou0Var.f.getImageHeight());
                    ou0Var.g.draw(canvas);
                } else {
                    ou0Var.g.setImageCoords(imageReceiver3.getImageX(), ou0Var.f.getImageY(), ou0Var.f.getImageWidth(), ou0Var.f.getImageHeight());
                    ou0Var.g.draw(canvas);
                    if (ou0Var.g.getLottieAnimation() != null || ou0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (ou0Var.i) {
            ou0Var.h.setAlpha(ou0Var.f.getAlpha());
            ou0Var.h.setRoundRadius(ou0Var.f.getRoundRadius(true));
            ou0Var.h.setImageCoords(ou0Var.f.getImageX(), ou0Var.f.getImageY(), ou0Var.f.getImageWidth(), ou0Var.f.getImageHeight());
            ou0Var.h.draw(canvas);
            int[] roundRadius = ou0Var.f.getRoundRadius(true);
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
            rectF.set(ou0Var.f.getImageX(), ou0Var.f.getImageY(), ou0Var.f.getImageX2(), ou0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (ou0Var.k != null) {
                canvas.translate(ou0Var.f.getImageX(), ou0Var.f.getImageY());
                ou0Var.k.c(canvas, ou0Var.d, (int) ou0Var.f.getImageWidth(), (int) ou0Var.f.getImageHeight(), 1.0f, false);
            } else {
                kVar.h(i0.b.k(-1, (int) (ou0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                kVar.setBounds((int) ou0Var.f.getImageX(), (int) ou0Var.f.getImageY(), (int) ou0Var.f.getImageX2(), (int) ou0Var.f.getImageY2());
                kVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        lu0 lu0Var;
        ou0 ou0Var = this.e;
        float[] fArr = ou0Var.Q;
        if (ou0Var.C == null) {
            float f11 = ou0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                ou0Var.P = f12;
                if (f12 > 1.0f) {
                    ou0Var.P = 1.0f;
                } else {
                    ou0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.er.f.getInterpolation(ou0Var.P) * ou0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f13 = 0.0f;
        if (interpolation == 1.0f || (lu0Var = ou0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f10 = measuredHeight;
        } else {
            lu0Var.h(fArr);
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
        ou0Var.c(canvas, 1.0f - interpolation, ou0Var.o - getLeft(), ou0Var.p - getTop(), f13, f10);
    }
}
