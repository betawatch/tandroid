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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dv0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final m4 c;
    public final org.telegram.ui.Components.y9 d;
    public final /* synthetic */ ev0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(ev0 ev0Var, Context context) {
        super(context);
        this.e = ev0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new cv0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        frameLayout.addView(y9Var);
        frameLayout.setWillNotDraw(false);
        m4 m4Var = new m4(context);
        this.c = m4Var;
        m4Var.setBackgroundColor(0);
        frameLayout.addView(m4Var, org.telegram.ui.Components.kb1.i(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        m4Var.addView(textureView, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        addView(frameLayout, org.telegram.ui.Components.kb1.g(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        ev0 ev0Var = this.e;
        float[] fArr = ev0Var.m;
        xh.g gVar = ev0Var.j;
        Path path = ev0Var.l;
        if (!ev0Var.n || ev0Var.e == null || ev0Var.a == null) {
            return;
        }
        ev0Var.i();
        float left = ev0Var.o - getLeft();
        float top = ev0Var.p - getTop();
        canvas.save();
        float f10 = ev0Var.O;
        float f11 = ev0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, ev0Var.s + left, ev0Var.t + top);
        float f13 = ev0Var.J;
        float f14 = ev0Var.A;
        canvas.translate((f13 * f14) + left, (ev0Var.K * f14) + top);
        ImageReceiver imageReceiver = ev0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = ev0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                ev0Var.B = f16;
                if (f16 > 1.0f) {
                    ev0Var.B = 1.0f;
                } else {
                    ev0Var.e();
                }
            }
            ev0Var.g.setAlpha(ev0Var.B);
        }
        float f17 = ev0Var.u;
        float f18 = ev0Var.v;
        float f19 = ev0Var.w;
        float f20 = ev0Var.y;
        if (f19 == f20 && ev0Var.x == ev0Var.z) {
            f7 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f7 = 1.0f;
            float f22 = ev0Var.z;
            float f23 = ev0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = ev0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (ev0Var.R) {
            float f26 = ev0Var.s - ev0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(ev0Var.t - ev0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((ev0Var.J * f12 * ev0Var.A) + f17 + left);
            frameLayout.setTranslationY((ev0Var.K * f12 * ev0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = ev0Var.f;
            if (imageReceiver3 != null) {
                if (ev0Var.B != f7) {
                    if (imageReceiver3.getLottieAnimation() != null || ev0Var.f.getAnimation() != null || ev0Var.g.getLottieAnimation() != null || ev0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    ev0Var.f.draw(canvas);
                    ev0Var.g.setImageCoords(ev0Var.f.getImageX(), ev0Var.f.getImageY(), ev0Var.f.getImageWidth(), ev0Var.f.getImageHeight());
                    ev0Var.g.draw(canvas);
                } else {
                    ev0Var.g.setImageCoords(imageReceiver3.getImageX(), ev0Var.f.getImageY(), ev0Var.f.getImageWidth(), ev0Var.f.getImageHeight());
                    ev0Var.g.draw(canvas);
                    if (ev0Var.g.getLottieAnimation() != null || ev0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (ev0Var.i) {
            ev0Var.h.setAlpha(ev0Var.f.getAlpha());
            ev0Var.h.setRoundRadius(ev0Var.f.getRoundRadius(true));
            ev0Var.h.setImageCoords(ev0Var.f.getImageX(), ev0Var.f.getImageY(), ev0Var.f.getImageWidth(), ev0Var.f.getImageHeight());
            ev0Var.h.draw(canvas);
            int[] roundRadius = ev0Var.f.getRoundRadius(true);
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
            rectF.set(ev0Var.f.getImageX(), ev0Var.f.getImageY(), ev0Var.f.getImageX2(), ev0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (ev0Var.k != null) {
                canvas.translate(ev0Var.f.getImageX(), ev0Var.f.getImageY());
                ev0Var.k.c(canvas, ev0Var.d, (int) ev0Var.f.getImageWidth(), (int) ev0Var.f.getImageHeight(), 1.0f, false);
            } else {
                gVar.h(i0.a.o(-1, (int) (ev0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                gVar.setBounds((int) ev0Var.f.getImageX(), (int) ev0Var.f.getImageY(), (int) ev0Var.f.getImageX2(), (int) ev0Var.f.getImageY2());
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
        float f10;
        bv0 bv0Var;
        ev0 ev0Var = this.e;
        float[] fArr = ev0Var.Q;
        if (ev0Var.C == null) {
            float f11 = ev0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                ev0Var.P = f12;
                if (f12 > 1.0f) {
                    ev0Var.P = 1.0f;
                } else {
                    ev0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.ds.f.getInterpolation(ev0Var.P) * ev0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation == 1.0f || (bv0Var = ev0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = 0.0f;
            f10 = measuredHeight;
        } else {
            bv0Var.a(fArr);
            canvas.save();
            float f13 = 1.0f - interpolation;
            float f14 = fArr[0] * f13;
            float measuredHeight2 = (fArr[1] * f13) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f14, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f10 = measuredHeight2;
            f7 = f14;
        }
        ev0Var.c(canvas, 1.0f - interpolation, ev0Var.o - getLeft(), ev0Var.p - getTop(), f7, f10);
    }
}
