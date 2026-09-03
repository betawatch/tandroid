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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bv0 extends FrameLayout {
    public final FrameLayout a;
    public final TextureView b;
    public final q4 c;
    public final org.telegram.ui.Components.p9 d;
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
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        frameLayout.addView(p9Var);
        frameLayout.setWillNotDraw(false);
        q4 q4Var = new q4(context);
        this.c = q4Var;
        q4Var.setBackgroundColor(0);
        frameLayout.addView(q4Var, k7.b6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.b = textureView;
        textureView.setOpaque(false);
        q4Var.addView(textureView, k7.b6.c(-1.0f, -1));
        addView(frameLayout, k7.b6.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f10;
        cv0 cv0Var = this.e;
        float[] fArr = cv0Var.m;
        ih.k kVar = cv0Var.j;
        Path path = cv0Var.l;
        if (!cv0Var.n || cv0Var.e == null || cv0Var.a == null) {
            return;
        }
        cv0Var.i();
        float left = cv0Var.o - getLeft();
        float top = cv0Var.p - getTop();
        canvas.save();
        float f11 = cv0Var.O;
        float f12 = cv0Var.A;
        float f13 = ((f11 * f12) + 1.0f) - f12;
        canvas.scale(f13, f13, cv0Var.s + left, cv0Var.t + top);
        float f14 = cv0Var.J;
        float f15 = cv0Var.A;
        canvas.translate((f14 * f15) + left, (cv0Var.K * f15) + top);
        ImageReceiver imageReceiver = cv0Var.g;
        if (imageReceiver != null && imageReceiver.hasNotThumb()) {
            float f16 = cv0Var.B;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                cv0Var.B = f17;
                if (f17 > 1.0f) {
                    cv0Var.B = 1.0f;
                } else {
                    cv0Var.e();
                }
            }
            cv0Var.g.setAlpha(cv0Var.B);
        }
        float f18 = cv0Var.u;
        float f19 = cv0Var.v;
        float f20 = cv0Var.w;
        float f21 = cv0Var.y;
        if (f20 == f21 && cv0Var.x == cv0Var.z) {
            f10 = 1.0f;
        } else {
            float f22 = f13 < 1.0f ? 0.0f : f13 < 1.4f ? (f13 - 1.0f) / 0.4f : 1.0f;
            f10 = 1.0f;
            float f23 = cv0Var.z;
            float f24 = cv0Var.x;
            float f25 = ((f23 - f24) / 2.0f) * f22;
            f18 -= f25;
            float f26 = ((f21 - f20) / 2.0f) * f22;
            f19 -= f26;
            ImageReceiver imageReceiver2 = cv0Var.f;
            if (imageReceiver2 != null) {
                imageReceiver2.setImageCoords(f18, f19, (f25 * 2.0f) + f24, (f26 * 2.0f) + f20);
            }
        }
        if (cv0Var.R) {
            float f27 = cv0Var.s - cv0Var.u;
            FrameLayout frameLayout = this.a;
            frameLayout.setPivotX(f27);
            frameLayout.setPivotY(cv0Var.t - cv0Var.v);
            frameLayout.setScaleY(f13);
            frameLayout.setScaleX(f13);
            frameLayout.setTranslationX((cv0Var.J * f13 * cv0Var.A) + f18 + left);
            frameLayout.setTranslationY((cv0Var.K * f13 * cv0Var.A) + f19 + top);
        } else {
            ImageReceiver imageReceiver3 = cv0Var.f;
            if (imageReceiver3 != null) {
                if (cv0Var.B != f10) {
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
            rectF.set(cv0Var.f.getImageX(), cv0Var.f.getImageY(), cv0Var.f.getImageX2(), cv0Var.f.getImageY2());
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            if (cv0Var.k != null) {
                canvas.translate(cv0Var.f.getImageX(), cv0Var.f.getImageY());
                cv0Var.k.c(canvas, cv0Var.d, (int) cv0Var.f.getImageWidth(), (int) cv0Var.f.getImageHeight(), 1.0f, false);
            } else {
                kVar.h(i0.a.k(-1, (int) (cv0Var.f.getAlpha() * Color.alpha(-1) * 0.325f)));
                kVar.setBounds((int) cv0Var.f.getImageX(), (int) cv0Var.f.getImageY(), (int) cv0Var.f.getImageX2(), (int) cv0Var.f.getImageY2());
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
        float interpolation = org.telegram.ui.Components.mr.f.getInterpolation(cv0Var.P) * cv0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f13 = 0.0f;
        if (interpolation == 1.0f || (zu0Var = cv0Var.F) == null) {
            a(canvas);
            super.dispatchDraw(canvas);
            f10 = measuredHeight;
        } else {
            zu0Var.c(fArr);
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
        cv0Var.c(canvas, 1.0f - interpolation, cv0Var.o - getLeft(), cv0Var.p - getTop(), f13, f10);
    }
}
