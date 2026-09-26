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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class gv0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final l4 c;
    public final org.telegram.ui.Components.w9 d;
    public final /* synthetic */ hv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv0(hv0 hv0Var, Context context) {
        super(context);
        this.e = hv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new fv0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        frameLayout.addView(w9Var);
        frameLayout.setWillNotDraw(false);
        l4 l4Var = new l4(context);
        this.c = l4Var;
        l4Var.setBackgroundColor(0);
        frameLayout.addView(l4Var, w7.y5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        l4Var.addView(textureView, w7.y5.c(-1.0f, -1));
        addView(frameLayout, w7.y5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        hv0 hv0Var = this.e;
        float[] fArr = hv0Var.m;
        vh.g gVar = hv0Var.j;
        Path path = hv0Var.l;
        if (!hv0Var.n || hv0Var.e == null || hv0Var.a == null) {
            return;
        }
        hv0Var.i();
        float left = hv0Var.o - getLeft();
        float top = hv0Var.p - getTop();
        canvas.save();
        float f10 = hv0Var.O;
        float f11 = hv0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, hv0Var.s + left, hv0Var.t + top);
        float f13 = hv0Var.J;
        float f14 = hv0Var.A;
        canvas.translate((f13 * f14) + left, (hv0Var.K * f14) + top);
        ImageReceiver imageReceiver = hv0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = hv0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                hv0Var.B = f16;
                if (f16 > 1.0f) {
                    hv0Var.B = 1.0f;
                } else {
                    hv0Var.e();
                }
            }
            hv0Var.g.setAlpha(hv0Var.B);
        }
        float f17 = hv0Var.u;
        float f18 = hv0Var.v;
        float f19 = hv0Var.w;
        float f20 = hv0Var.y;
        if (f19 == f20 && hv0Var.x == hv0Var.z) {
            f7 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f7 = 1.0f;
            float f22 = hv0Var.z;
            float f23 = hv0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = hv0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (hv0Var.R) {
            float f26 = hv0Var.s - hv0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(hv0Var.t - hv0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((hv0Var.J * f12 * hv0Var.A) + f17 + left);
            frameLayout.setTranslationY((hv0Var.K * f12 * hv0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = hv0Var.f;
            if (imageReceiver3 != null) {
                if (hv0Var.B != f7) {
                    if (imageReceiver3.getLottieAnimation() != null || hv0Var.f.getAnimation() != null || hv0Var.g.getLottieAnimation() != null || hv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    hv0Var.f.draw(canvas);
                    hv0Var.g.setImageCoords(hv0Var.f.getImageX(), hv0Var.f.getImageY(), hv0Var.f.getImageWidth(), hv0Var.f.getImageHeight());
                    hv0Var.g.draw(canvas);
                } else {
                    hv0Var.g.setImageCoords(imageReceiver3.getImageX(), hv0Var.f.getImageY(), hv0Var.f.getImageWidth(), hv0Var.f.getImageHeight());
                    hv0Var.g.draw(canvas);
                    if (hv0Var.g.getLottieAnimation() != null || hv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (hv0Var.i) {
            hv0Var.h.setAlpha(hv0Var.f.getAlpha());
            hv0Var.h.setRoundRadius(hv0Var.f.getRoundRadius(true));
            hv0Var.h.setImageCoords(hv0Var.f.getImageX(), hv0Var.f.getImageY(), hv0Var.f.getImageWidth(), hv0Var.f.getImageHeight());
            hv0Var.h.draw(canvas);
            int[] roundRadius = hv0Var.f.getRoundRadius(true);
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
            rectF.set(hv0Var.f.getImageX(), hv0Var.f.getImageY(), hv0Var.f.getImageX2(), hv0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (hv0Var.k != null) {
                canvas.translate(hv0Var.f.getImageX(), hv0Var.f.getImageY());
                hv0Var.k.c(canvas, hv0Var.d, (int) hv0Var.f.getImageWidth(), (int) hv0Var.f.getImageHeight(), 1.0f, false);
            } else {
                gVar.h(i0.a.k(-1, (int) (hv0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                gVar.setBounds((int) hv0Var.f.getImageX(), (int) hv0Var.f.getImageY(), (int) hv0Var.f.getImageX2(), (int) hv0Var.f.getImageY2());
                gVar.draw(canvas);
            }
            canvas.restore();
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ev0 ev0Var;
        hv0 hv0Var = this.e;
        float[] fArr = hv0Var.Q;
        if (hv0Var.C == null) {
            float f10 = hv0Var.P;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                hv0Var.P = f11;
                if (f11 > 1.0f) {
                    hv0Var.P = 1.0f;
                } else {
                    hv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.rr.f.getInterpolation(hv0Var.P) * hv0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f12 = 0.0f;
        if (interpolation == 1.0f || (ev0Var = hv0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = measuredHeight;
        } else {
            ev0Var.b(fArr);
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
        hv0Var.c(canvas, 1.0f - interpolation, hv0Var.o - getLeft(), hv0Var.p - getTop(), f12, f7);
    }
}
