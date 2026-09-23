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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class hv0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final l4 c;
    public final org.telegram.ui.Components.w9 d;
    public final /* synthetic */ iv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv0(iv0 iv0Var, Context context) {
        super(context);
        this.e = iv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new gv0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        frameLayout.addView(w9Var);
        frameLayout.setWillNotDraw(false);
        l4 l4Var = new l4(context);
        this.c = l4Var;
        l4Var.setBackgroundColor(0);
        frameLayout.addView(l4Var, w7.x5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        l4Var.addView(textureView, w7.x5.c(-1.0f, -1));
        addView(frameLayout, w7.x5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        iv0 iv0Var = this.e;
        float[] fArr = iv0Var.m;
        vh.h hVar = iv0Var.j;
        Path path = iv0Var.l;
        if (!iv0Var.n || iv0Var.e == null || iv0Var.a == null) {
            return;
        }
        iv0Var.i();
        float left = iv0Var.o - getLeft();
        float top = iv0Var.p - getTop();
        canvas.save();
        float f10 = iv0Var.O;
        float f11 = iv0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, iv0Var.s + left, iv0Var.t + top);
        float f13 = iv0Var.J;
        float f14 = iv0Var.A;
        canvas.translate((f13 * f14) + left, (iv0Var.K * f14) + top);
        ImageReceiver imageReceiver = iv0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = iv0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                iv0Var.B = f16;
                if (f16 > 1.0f) {
                    iv0Var.B = 1.0f;
                } else {
                    iv0Var.e();
                }
            }
            iv0Var.g.setAlpha(iv0Var.B);
        }
        float f17 = iv0Var.u;
        float f18 = iv0Var.v;
        float f19 = iv0Var.w;
        float f20 = iv0Var.y;
        if (f19 == f20 && iv0Var.x == iv0Var.z) {
            f7 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f7 = 1.0f;
            float f22 = iv0Var.z;
            float f23 = iv0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = iv0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (iv0Var.R) {
            float f26 = iv0Var.s - iv0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(iv0Var.t - iv0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((iv0Var.J * f12 * iv0Var.A) + f17 + left);
            frameLayout.setTranslationY((iv0Var.K * f12 * iv0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = iv0Var.f;
            if (imageReceiver3 != null) {
                if (iv0Var.B != f7) {
                    if (imageReceiver3.getLottieAnimation() != null || iv0Var.f.getAnimation() != null || iv0Var.g.getLottieAnimation() != null || iv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    iv0Var.f.draw(canvas);
                    iv0Var.g.setImageCoords(iv0Var.f.getImageX(), iv0Var.f.getImageY(), iv0Var.f.getImageWidth(), iv0Var.f.getImageHeight());
                    iv0Var.g.draw(canvas);
                } else {
                    iv0Var.g.setImageCoords(imageReceiver3.getImageX(), iv0Var.f.getImageY(), iv0Var.f.getImageWidth(), iv0Var.f.getImageHeight());
                    iv0Var.g.draw(canvas);
                    if (iv0Var.g.getLottieAnimation() != null || iv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (iv0Var.i) {
            iv0Var.h.setAlpha(iv0Var.f.getAlpha());
            iv0Var.h.setRoundRadius(iv0Var.f.getRoundRadius(true));
            iv0Var.h.setImageCoords(iv0Var.f.getImageX(), iv0Var.f.getImageY(), iv0Var.f.getImageWidth(), iv0Var.f.getImageHeight());
            iv0Var.h.draw(canvas);
            int[] roundRadius = iv0Var.f.getRoundRadius(true);
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
            rectF.set(iv0Var.f.getImageX(), iv0Var.f.getImageY(), iv0Var.f.getImageX2(), iv0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (iv0Var.k != null) {
                canvas.translate(iv0Var.f.getImageX(), iv0Var.f.getImageY());
                iv0Var.k.c(canvas, iv0Var.d, (int) iv0Var.f.getImageWidth(), (int) iv0Var.f.getImageHeight(), 1.0f, false);
            } else {
                hVar.h(i0.a.k(-1, (int) (iv0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                hVar.setBounds((int) iv0Var.f.getImageX(), (int) iv0Var.f.getImageY(), (int) iv0Var.f.getImageX2(), (int) iv0Var.f.getImageY2());
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
        fv0 fv0Var;
        iv0 iv0Var = this.e;
        float[] fArr = iv0Var.Q;
        if (iv0Var.C == null) {
            float f10 = iv0Var.P;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                iv0Var.P = f11;
                if (f11 > 1.0f) {
                    iv0Var.P = 1.0f;
                } else {
                    iv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.rr.f.getInterpolation(iv0Var.P) * iv0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f12 = 0.0f;
        if (interpolation == 1.0f || (fv0Var = iv0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = measuredHeight;
        } else {
            fv0Var.g(fArr);
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
        iv0Var.c(canvas, 1.0f - interpolation, iv0Var.o - getLeft(), iv0Var.p - getTop(), f12, f7);
    }
}
