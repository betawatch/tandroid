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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pv0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final l4 c;
    public final org.telegram.ui.Components.y9 d;
    public final /* synthetic */ qv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv0(qv0 qv0Var, Context context) {
        super(context);
        this.e = qv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new ov0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        frameLayout.addView(y9Var);
        frameLayout.setWillNotDraw(false);
        l4 l4Var = new l4(context);
        this.c = l4Var;
        l4Var.setBackgroundColor(0);
        frameLayout.addView(l4Var, w7.x5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        l4Var.addView(textureView, w7.x5.d(-1.0f, -1));
        addView(frameLayout, w7.x5.d(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        qv0 qv0Var = this.e;
        float[] fArr = qv0Var.m;
        vh.g gVar = qv0Var.j;
        Path path = qv0Var.l;
        if (!qv0Var.n || qv0Var.e == null || qv0Var.a == null) {
            return;
        }
        qv0Var.i();
        float left = qv0Var.o - getLeft();
        float top = qv0Var.p - getTop();
        canvas.save();
        float f10 = qv0Var.O;
        float f11 = qv0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, qv0Var.s + left, qv0Var.t + top);
        float f13 = qv0Var.J;
        float f14 = qv0Var.A;
        canvas.translate((f13 * f14) + left, (qv0Var.K * f14) + top);
        ImageReceiver imageReceiver = qv0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = qv0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                qv0Var.B = f16;
                if (f16 > 1.0f) {
                    qv0Var.B = 1.0f;
                } else {
                    qv0Var.e();
                }
            }
            qv0Var.g.setAlpha(qv0Var.B);
        }
        float f17 = qv0Var.u;
        float f18 = qv0Var.v;
        float f19 = qv0Var.w;
        float f20 = qv0Var.y;
        if (f19 == f20 && qv0Var.x == qv0Var.z) {
            f7 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f7 = 1.0f;
            float f22 = qv0Var.z;
            float f23 = qv0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = qv0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (qv0Var.R) {
            float f26 = qv0Var.s - qv0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(qv0Var.t - qv0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((qv0Var.J * f12 * qv0Var.A) + f17 + left);
            frameLayout.setTranslationY((qv0Var.K * f12 * qv0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = qv0Var.f;
            if (imageReceiver3 != null) {
                if (qv0Var.B != f7) {
                    if (imageReceiver3.getLottieAnimation() != null || qv0Var.f.getAnimation() != null || qv0Var.g.getLottieAnimation() != null || qv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    qv0Var.f.draw(canvas);
                    qv0Var.g.setImageCoords(qv0Var.f.getImageX(), qv0Var.f.getImageY(), qv0Var.f.getImageWidth(), qv0Var.f.getImageHeight());
                    qv0Var.g.draw(canvas);
                } else {
                    qv0Var.g.setImageCoords(imageReceiver3.getImageX(), qv0Var.f.getImageY(), qv0Var.f.getImageWidth(), qv0Var.f.getImageHeight());
                    qv0Var.g.draw(canvas);
                    if (qv0Var.g.getLottieAnimation() != null || qv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (qv0Var.i) {
            qv0Var.h.setAlpha(qv0Var.f.getAlpha());
            qv0Var.h.setRoundRadius(qv0Var.f.getRoundRadius(true));
            qv0Var.h.setImageCoords(qv0Var.f.getImageX(), qv0Var.f.getImageY(), qv0Var.f.getImageWidth(), qv0Var.f.getImageHeight());
            qv0Var.h.draw(canvas);
            int[] roundRadius = qv0Var.f.getRoundRadius(true);
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
            rectF.set(qv0Var.f.getImageX(), qv0Var.f.getImageY(), qv0Var.f.getImageX2(), qv0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (qv0Var.k != null) {
                canvas.translate(qv0Var.f.getImageX(), qv0Var.f.getImageY());
                qv0Var.k.c(canvas, qv0Var.d, (int) qv0Var.f.getImageWidth(), (int) qv0Var.f.getImageHeight(), 1.0f, false);
            } else {
                gVar.h(i0.a.k(-1, (int) (qv0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                gVar.setBounds((int) qv0Var.f.getImageX(), (int) qv0Var.f.getImageY(), (int) qv0Var.f.getImageX2(), (int) qv0Var.f.getImageY2());
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
        nv0 nv0Var;
        qv0 qv0Var = this.e;
        float[] fArr = qv0Var.Q;
        if (qv0Var.C == null) {
            float f11 = qv0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                qv0Var.P = f12;
                if (f12 > 1.0f) {
                    qv0Var.P = 1.0f;
                } else {
                    qv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.hs.f.getInterpolation(qv0Var.P) * qv0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation == 1.0f || (nv0Var = qv0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = 0.0f;
            f10 = measuredHeight;
        } else {
            nv0Var.b(fArr);
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
        qv0Var.c(canvas, 1.0f - interpolation, qv0Var.o - getLeft(), qv0Var.p - getTop(), f7, f10);
    }
}
