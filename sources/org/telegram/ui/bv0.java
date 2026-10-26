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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bv0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final m4 c;
    public final org.telegram.ui.Components.y9 d;
    public final /* synthetic */ cv0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv0(cv0 cv0Var, Context context) {
        super(context);
        this.e = cv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        frameLayout.setOutlineProvider(new av0());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        frameLayout.addView(y9Var);
        frameLayout.setWillNotDraw(false);
        m4 m4Var = new m4(context);
        this.c = m4Var;
        m4Var.setBackgroundColor(0);
        frameLayout.addView(m4Var, org.telegram.ui.Components.gb1.i(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        m4Var.addView(textureView, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        addView(frameLayout, org.telegram.ui.Components.gb1.g(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        cv0 cv0Var = this.e;
        float[] fArr = cv0Var.m;
        xh.g gVar = cv0Var.j;
        Path path = cv0Var.l;
        if (!cv0Var.n || cv0Var.e == null || cv0Var.a == null) {
            return;
        }
        cv0Var.i();
        float left = cv0Var.o - getLeft();
        float top = cv0Var.p - getTop();
        canvas.save();
        float f10 = cv0Var.O;
        float f11 = cv0Var.A;
        float f12 = ((f10 * f11) + 1.0f) - f11;
        canvas.scale(f12, f12, cv0Var.s + left, cv0Var.t + top);
        float f13 = cv0Var.J;
        float f14 = cv0Var.A;
        canvas.translate((f13 * f14) + left, (cv0Var.K * f14) + top);
        ImageReceiver imageReceiver = cv0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f15 = cv0Var.B;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                cv0Var.B = f16;
                if (f16 > 1.0f) {
                    cv0Var.B = 1.0f;
                } else {
                    cv0Var.e();
                }
            }
            cv0Var.g.setAlpha(cv0Var.B);
        }
        float f17 = cv0Var.u;
        float f18 = cv0Var.v;
        float f19 = cv0Var.w;
        float f20 = cv0Var.y;
        if (f19 == f20 && cv0Var.x == cv0Var.z) {
            f7 = 1.0f;
        } else {
            float f21 = f12 < 1.0f ? 0.0f : f12 < 1.4f ? (f12 - 1.0f) / 0.4f : 1.0f;
            f7 = 1.0f;
            float f22 = cv0Var.z;
            float f23 = cv0Var.x;
            float f24 = ((f22 - f23) / 2.0f) * f21;
            f17 -= f24;
            float f25 = ((f20 - f19) / 2.0f) * f21;
            f18 -= f25;
            ImageReceiver imageReceiver2 = cv0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f17, f18, (f24 * 2.0f) + f23, (f25 * 2.0f) + f19);
            }
        }
        if (cv0Var.R) {
            float f26 = cv0Var.s - cv0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f26);
            frameLayout.setPivotY(cv0Var.t - cv0Var.v);
            frameLayout.setScaleY(f12);
            frameLayout.setScaleX(f12);
            frameLayout.setTranslationX((cv0Var.J * f12 * cv0Var.A) + f17 + left);
            frameLayout.setTranslationY((cv0Var.K * f12 * cv0Var.A) + f18 + top);
        } else {
            ImageReceiver imageReceiver3 = cv0Var.f;
            if (imageReceiver3 != null) {
                if (cv0Var.B != f7) {
                    if (imageReceiver3.getLottieAnimation() != null || cv0Var.f.getAnimation() != null || cv0Var.g.getLottieAnimation() != null || cv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                    cv0Var.f.draw(canvas);
                    cv0Var.g.setImageCoords(cv0Var.f.getImageX(), cv0Var.f.getImageY(), cv0Var.f.getImageWidth(), cv0Var.f.getImageHeight());
                    cv0Var.g.draw(canvas);
                } else {
                    cv0Var.g.setImageCoords(imageReceiver3.getImageX(), cv0Var.f.getImageY(), cv0Var.f.getImageWidth(), cv0Var.f.getImageHeight());
                    cv0Var.g.draw(canvas);
                    if (cv0Var.g.getLottieAnimation() != null || cv0Var.g.getAnimation() != null) {
                        invalidate();
                    }
                }
            }
        }
        if (cv0Var.i) {
            cv0Var.h.setAlpha(cv0Var.f.getAlpha());
            cv0Var.h.setRoundRadius(cv0Var.f.getRoundRadius(true));
            cv0Var.h.setImageCoords(cv0Var.f.getImageX(), cv0Var.f.getImageY(), cv0Var.f.getImageWidth(), cv0Var.f.getImageHeight());
            cv0Var.h.draw(canvas);
            int[] roundRadius = cv0Var.f.getRoundRadius(true);
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
            rectF.set(cv0Var.f.getImageX(), cv0Var.f.getImageY(), cv0Var.f.getImageX2(), cv0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (cv0Var.k != null) {
                canvas.translate(cv0Var.f.getImageX(), cv0Var.f.getImageY());
                cv0Var.k.c(canvas, cv0Var.d, (int) cv0Var.f.getImageWidth(), (int) cv0Var.f.getImageHeight(), 1.0f, false);
            } else {
                gVar.h(i0.a.o(-1, (int) (cv0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                gVar.setBounds((int) cv0Var.f.getImageX(), (int) cv0Var.f.getImageY(), (int) cv0Var.f.getImageX2(), (int) cv0Var.f.getImageY2());
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
        zu0 zu0Var;
        cv0 cv0Var = this.e;
        float[] fArr = cv0Var.Q;
        if (cv0Var.C == null) {
            float f11 = cv0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                cv0Var.P = f12;
                if (f12 > 1.0f) {
                    cv0Var.P = 1.0f;
                } else {
                    cv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.ds.f.getInterpolation(cv0Var.P) * cv0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation == 1.0f || (zu0Var = cv0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = 0.0f;
            f10 = measuredHeight;
        } else {
            zu0Var.a(fArr);
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
        cv0Var.c(canvas, 1.0f - interpolation, cv0Var.o - getLeft(), cv0Var.p - getTop(), f7, f10);
    }
}
