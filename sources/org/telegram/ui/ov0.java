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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ov0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final k4 c;
    public final org.telegram.ui.Components.w9 d;
    public final /* synthetic */ pv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov0(pv0 pv0Var, Context context) {
        super(context);
        this.e = pv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new nv0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        frameLayout.addView(w9Var);
        frameLayout.setWillNotDraw(false);
        k4 k4Var = new k4(context);
        this.c = k4Var;
        k4Var.setBackgroundColor(0);
        frameLayout.addView(k4Var, w7.y5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        k4Var.addView(textureView, w7.y5.c(-1.0f, -1));
        addView(frameLayout, w7.y5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        pv0 pv0Var = this.e;
        float[] fArr = pv0Var.m;
        vh.h hVar = pv0Var.j;
        Path path = pv0Var.l;
        if (!pv0Var.n || pv0Var.e == null || pv0Var.a == null) {
            return;
        }
        pv0Var.i();
        float left = pv0Var.o - getLeft();
        float top = pv0Var.p - getTop();
        canvas.save();
        float f10 = pv0Var.O;
        float f11 = pv0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, pv0Var.s + left, pv0Var.t + top);
        float f13 = pv0Var.J;
        float f14 = pv0Var.A;
        canvas.translate((f13 * f14) + left, (pv0Var.K * f14) + top);
        ImageReceiver imageReceiver = pv0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = pv0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                pv0Var.B = f16;
                if (f16 > 1.0f) {
                    pv0Var.B = 1.0f;
                } else {
                    pv0Var.e();
                }
            }
            pv0Var.g.setAlpha(pv0Var.B);
        }
        float f17 = pv0Var.u;
        float f18 = pv0Var.v;
        float f19 = pv0Var.w;
        float f20 = pv0Var.y;
        if (f19 == f20 && pv0Var.x == pv0Var.z) {
            f7 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f7 = 1.0f;
            float f22 = pv0Var.z;
            float f23 = pv0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = pv0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (pv0Var.R) {
            float f26 = pv0Var.s - pv0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(pv0Var.t - pv0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((pv0Var.J * f12 * pv0Var.A) + f17 + left);
            frameLayout.setTranslationY((pv0Var.K * f12 * pv0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = pv0Var.f;
            if (imageReceiver3 != null) {
                if (pv0Var.B != f7) {
                    if (imageReceiver3.getLottieAnimation() != null || pv0Var.f.getAnimation() != null || pv0Var.g.getLottieAnimation() != null || pv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    pv0Var.f.draw(canvas);
                    pv0Var.g.setImageCoords(pv0Var.f.getImageX(), pv0Var.f.getImageY(), pv0Var.f.getImageWidth(), pv0Var.f.getImageHeight());
                    pv0Var.g.draw(canvas);
                } else {
                    pv0Var.g.setImageCoords(imageReceiver3.getImageX(), pv0Var.f.getImageY(), pv0Var.f.getImageWidth(), pv0Var.f.getImageHeight());
                    pv0Var.g.draw(canvas);
                    if (pv0Var.g.getLottieAnimation() != null || pv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (pv0Var.i) {
            pv0Var.h.setAlpha(pv0Var.f.getAlpha());
            pv0Var.h.setRoundRadius(pv0Var.f.getRoundRadius(true));
            pv0Var.h.setImageCoords(pv0Var.f.getImageX(), pv0Var.f.getImageY(), pv0Var.f.getImageWidth(), pv0Var.f.getImageHeight());
            pv0Var.h.draw(canvas);
            int[] roundRadius = pv0Var.f.getRoundRadius(true);
            float f27 = roundRadius[0];
            fArr[1] = f27;
            fArr[0] = f27;
            float f28 = roundRadius[1];
            fArr[3] = f28;
            fArr[2] = f28;
            float f29 = roundRadius[2];
            fArr[5] = f29;
            fArr[4] = f29;
            float f30 = roundRadius[3];
            fArr[7] = f30;
            fArr[6] = f30;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(pv0Var.f.getImageX(), pv0Var.f.getImageY(), pv0Var.f.getImageX2(), pv0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (pv0Var.k != null) {
                canvas.translate(pv0Var.f.getImageX(), pv0Var.f.getImageY());
                pv0Var.k.c(canvas, pv0Var.d, (int) pv0Var.f.getImageWidth(), (int) pv0Var.f.getImageHeight(), 1.0f, false);
            } else {
                hVar.h(i0.a.k(-1, (int) (pv0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                hVar.setBounds((int) pv0Var.f.getImageX(), (int) pv0Var.f.getImageY(), (int) pv0Var.f.getImageX2(), (int) pv0Var.f.getImageY2());
                hVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        mv0 mv0Var;
        pv0 pv0Var = this.e;
        float[] fArr = pv0Var.Q;
        if (pv0Var.C == null) {
            float f10 = pv0Var.P;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                pv0Var.P = f11;
                if (f11 > 1.0f) {
                    pv0Var.P = 1.0f;
                } else {
                    pv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.qr.f.getInterpolation(pv0Var.P) * pv0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f12 = 0.0f;
        if (interpolation == 1.0f || (mv0Var = pv0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = measuredHeight;
        } else {
            mv0Var.b(fArr);
            canvas.save();
            float f13 = 1.0f - interpolation;
            float f14 = fArr[0] * f13;
            float measuredHeight2 = (fArr[1] * f13) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f14, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f7 = measuredHeight2;
            f12 = f14;
        }
        pv0Var.c(canvas, 1.0f - interpolation, pv0Var.o - getLeft(), pv0Var.p - getTop(), f12, f7);
    }
}
