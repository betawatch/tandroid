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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class nv0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final l4 c;
    public final org.telegram.ui.Components.x9 d;
    public final /* synthetic */ ov0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv0(ov0 ov0Var, Context context) {
        super(context);
        this.e = ov0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new mv0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.d = x9Var;
        frameLayout.addView(x9Var);
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
        ov0 ov0Var = this.e;
        float[] fArr = ov0Var.m;
        wh.h hVar = ov0Var.j;
        Path path = ov0Var.l;
        if (!ov0Var.n || ov0Var.e == null || ov0Var.a == null) {
            return;
        }
        ov0Var.i();
        float left = ov0Var.o - getLeft();
        float top = ov0Var.p - getTop();
        canvas.save();
        float f10 = ov0Var.O;
        float f11 = ov0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, ov0Var.s + left, ov0Var.t + top);
        float f13 = ov0Var.J;
        float f14 = ov0Var.A;
        canvas.translate((f13 * f14) + left, (ov0Var.K * f14) + top);
        ImageReceiver imageReceiver = ov0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = ov0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                ov0Var.B = f16;
                if (f16 > 1.0f) {
                    ov0Var.B = 1.0f;
                } else {
                    ov0Var.e();
                }
            }
            ov0Var.g.setAlpha(ov0Var.B);
        }
        float f17 = ov0Var.u;
        float f18 = ov0Var.v;
        float f19 = ov0Var.w;
        float f20 = ov0Var.y;
        if (f19 == f20 && ov0Var.x == ov0Var.z) {
            f7 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f7 = 1.0f;
            float f22 = ov0Var.z;
            float f23 = ov0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = ov0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (ov0Var.R) {
            float f26 = ov0Var.s - ov0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(ov0Var.t - ov0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((ov0Var.J * f12 * ov0Var.A) + f17 + left);
            frameLayout.setTranslationY((ov0Var.K * f12 * ov0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = ov0Var.f;
            if (imageReceiver3 != null) {
                if (ov0Var.B != f7) {
                    if (imageReceiver3.getLottieAnimation() != null || ov0Var.f.getAnimation() != null || ov0Var.g.getLottieAnimation() != null || ov0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    ov0Var.f.draw(canvas);
                    ov0Var.g.setImageCoords(ov0Var.f.getImageX(), ov0Var.f.getImageY(), ov0Var.f.getImageWidth(), ov0Var.f.getImageHeight());
                    ov0Var.g.draw(canvas);
                } else {
                    ov0Var.g.setImageCoords(imageReceiver3.getImageX(), ov0Var.f.getImageY(), ov0Var.f.getImageWidth(), ov0Var.f.getImageHeight());
                    ov0Var.g.draw(canvas);
                    if (ov0Var.g.getLottieAnimation() != null || ov0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (ov0Var.i) {
            ov0Var.h.setAlpha(ov0Var.f.getAlpha());
            ov0Var.h.setRoundRadius(ov0Var.f.getRoundRadius(true));
            ov0Var.h.setImageCoords(ov0Var.f.getImageX(), ov0Var.f.getImageY(), ov0Var.f.getImageWidth(), ov0Var.f.getImageHeight());
            ov0Var.h.draw(canvas);
            int[] roundRadius = ov0Var.f.getRoundRadius(true);
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
            rectF.set(ov0Var.f.getImageX(), ov0Var.f.getImageY(), ov0Var.f.getImageX2(), ov0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (ov0Var.k != null) {
                canvas.translate(ov0Var.f.getImageX(), ov0Var.f.getImageY());
                ov0Var.k.c(canvas, ov0Var.d, (int) ov0Var.f.getImageWidth(), (int) ov0Var.f.getImageHeight(), 1.0f, false);
            } else {
                hVar.h(i0.a.k(-1, (int) (ov0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                hVar.setBounds((int) ov0Var.f.getImageX(), (int) ov0Var.f.getImageY(), (int) ov0Var.f.getImageX2(), (int) ov0Var.f.getImageY2());
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
        lv0 lv0Var;
        ov0 ov0Var = this.e;
        float[] fArr = ov0Var.Q;
        if (ov0Var.C == null) {
            float f10 = ov0Var.P;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                ov0Var.P = f11;
                if (f11 > 1.0f) {
                    ov0Var.P = 1.0f;
                } else {
                    ov0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.pr.f.getInterpolation(ov0Var.P) * ov0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f12 = 0.0f;
        if (interpolation == 1.0f || (lv0Var = ov0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = measuredHeight;
        } else {
            lv0Var.h(fArr);
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
        ov0Var.c(canvas, 1.0f - interpolation, ov0Var.o - getLeft(), ov0Var.p - getTop(), f12, f7);
    }
}
