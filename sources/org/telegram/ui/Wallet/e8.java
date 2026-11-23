package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ls;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.w60;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class e8 extends bi.g3 {
    public boolean A0;
    public ValueAnimator B0;
    public TL_wallet.nftItem x0;
    public r8 y0;
    public float z0;

    @Override // bi.g3
    public final void b(w60 w60Var, Canvas canvas, float f10, float f11, float f12) {
        if (this.z0 == 1.0f) {
            super.b(w60Var, canvas, f10, f11, f12);
            return;
        }
        canvas.save();
        float f13 = this.z0;
        canvas.scale(f13, f13, f10 / 2.0f, f11 / 2.0f);
        super.b(w60Var, canvas, f10, f11, f12);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.z0 == 1.0f) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float f10 = this.z0;
        canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        r8 r8Var;
        float f10;
        int i7;
        float f11;
        boolean drawChild = super.drawChild(canvas, view, j3);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (r8Var = this.y0) != null) {
            RectF rectF = r8Var.I;
            Paint paint = r8Var.y;
            q8 q8Var = r8Var.l1;
            if (this == r8Var.m1 && q8Var != null && q8Var.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float l10 = Utilities.l(r8Var.q1.a);
                float[] D = r8Var.D(r8Var.o1 % 2.0f);
                float f12 = D[0] * l10;
                float f13 = D[1] * l10;
                float f14 = D[2] * l10;
                int left = frameLayout.getLeft();
                org.telegram.ui.Components.q9 q9Var = this.E;
                float left2 = q9Var.getLeft() + left + (q9Var.getWidth() / 2.0f);
                float height = (q9Var.getHeight() / 2.0f) + q9Var.getTop() + frameLayout.getTop();
                float C = com.google.android.gms.internal.vision.e2.C(f14, 0.025f, (0.07f * f13) + 1.0f, (q9Var.getWidth() * ls.L4) / 268.0f);
                if (f13 > 0.01f && q8Var.w != null) {
                    float f15 = ((176.0f * C) / 128.0f) / 2.0f;
                    float L = (org.telegram.messenger.g0.L(2.0f) * f13) + height;
                    rectF.set(left2 - f15, L - f15, left2 + f15, L + f15);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f13));
                    canvas.drawBitmap(q8Var.w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                }
                float l11 = q8Var.u == null ? 0.0f : Utilities.l(1.4f * f13);
                float L2 = height - (org.telegram.messenger.g0.L(5.0f) * f13);
                float f16 = f13 * (-5.0f);
                if (l11 < 0.99f) {
                    paint.setAlpha(ls.e4);
                    f11 = L2;
                    f10 = C;
                    i7 = 255;
                    r8Var.r(canvas, q8Var.v, left2, f11, f10, f12, 1.0f, f16, 0.24f, 0.97f);
                } else {
                    f10 = C;
                    i7 = 255;
                    f11 = L2;
                }
                if (l11 > 0.01f) {
                    paint.setAlpha((int) (255.0f * l11));
                    r8Var.r(canvas, q8Var.u, left2, f11, f10, f12, 1.0f, f16, 0.24f, 0.97f);
                }
                paint.setAlpha(i7);
            }
        }
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (isPressed() == this.A0) {
            return;
        }
        boolean isPressed = isPressed();
        this.A0 = isPressed;
        m(isPressed ? 0.96f : 1.0f, isPressed ? 80L : 350L, isPressed ? null : new OvershootInterpolator(1.5f));
    }

    public final void m(float f10, long j3, OvershootInterpolator overshootInterpolator) {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z0, f10);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new z3(this, 5));
        if (overshootInterpolator != null) {
            this.B0.setInterpolator(overshootInterpolator);
        }
        this.B0.setDuration(j3);
        this.B0.start();
    }

    public final void n(float f10) {
        this.z0 = f10;
        invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void o() {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.z0 == 1.0f) {
            return;
        }
        setScaleX(getScaleX() * this.z0);
        setScaleY(getScaleY() * this.z0);
        n(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r8 r8Var = this.y0;
        if (r8Var != null) {
            r8Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        r8 r8Var = this.y0;
        if (r8Var != null) {
            r8Var.h.remove(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        hi.q2.W = getMeasuredHeight();
    }
}
