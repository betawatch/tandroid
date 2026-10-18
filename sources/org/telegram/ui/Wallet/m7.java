package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class m7 extends yh.h1 {
    public TL_wallet.nftItem o0;
    public z7 p0;
    public float q0;
    public boolean r0;
    public ValueAnimator s0;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.q0 == 1.0f) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float f7 = this.q0;
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        z7 z7Var;
        float f7;
        int i10;
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (z7Var = this.p0) != null) {
            RectF rectF = z7Var.H;
            Paint paint = z7Var.x;
            y7 y7Var = z7Var.f1;
            if (this == z7Var.g1 && y7Var != null && y7Var.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float clamp01 = Utilities.clamp01(z7Var.k1.a);
                float[] F = z7Var.F(z7Var.i1 % 2.0f);
                float f11 = F[0] * clamp01;
                float f12 = F[1] * clamp01;
                float f13 = F[2] * clamp01;
                int left = frameLayout.getLeft();
                org.telegram.ui.Components.w9 w9Var = this.y;
                float left2 = w9Var.getLeft() + left + (w9Var.getWidth() / 2.0f);
                float height = (w9Var.getHeight() / 2.0f) + w9Var.getTop() + frameLayout.getTop();
                float B = com.google.android.gms.internal.play_billing.k3.B(f13, 0.025f, (0.07f * f12) + 1.0f, (w9Var.getWidth() * 288) / 268.0f);
                if (f12 > 0.01f && y7Var.w != null) {
                    float f14 = ((176.0f * B) / 128.0f) / 2.0f;
                    float dp = (AndroidUtilities.dp(2.0f) * f12) + height;
                    rectF.set(left2 - f14, dp - f14, left2 + f14, dp + f14);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f12));
                    canvas.drawBitmap(y7Var.w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                }
                float clamp012 = y7Var.u == null ? 0.0f : Utilities.clamp01(1.4f * f12);
                float dp2 = height - (AndroidUtilities.dp(5.0f) * f12);
                float f15 = f12 * (-5.0f);
                if (clamp012 < 0.99f) {
                    paint.setAlpha(255);
                    f10 = dp2;
                    f7 = B;
                    i10 = 255;
                    z7Var.r(canvas, y7Var.v, left2, f10, f7, f11, 1.0f, f15, 0.24f, 0.97f);
                } else {
                    f7 = B;
                    i10 = 255;
                    f10 = dp2;
                }
                if (clamp012 > 0.01f) {
                    paint.setAlpha((int) (255.0f * clamp012));
                    z7Var.r(canvas, y7Var.u, left2, f10, f7, f11, 1.0f, f15, 0.24f, 0.97f);
                }
                paint.setAlpha(i10);
            }
        }
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (isPressed() == this.r0) {
            return;
        }
        boolean isPressed = isPressed();
        this.r0 = isPressed;
        l(isPressed ? 0.96f : 1.0f, isPressed ? 80L : 350L, isPressed ? null : new OvershootInterpolator(1.5f));
    }

    public final void l(float f7, long j10, OvershootInterpolator overshootInterpolator) {
        ValueAnimator valueAnimator = this.s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.q0, f7);
        this.s0 = ofFloat;
        ofFloat.addUpdateListener(new u2(this, 6));
        if (overshootInterpolator != null) {
            this.s0.setInterpolator(overshootInterpolator);
        }
        this.s0.setDuration(j10);
        this.s0.start();
    }

    public final void m(float f7) {
        this.q0 = f7;
        invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void n() {
        ValueAnimator valueAnimator = this.s0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.q0 == 1.0f) {
            return;
        }
        setScaleX(getScaleX() * this.q0);
        setScaleY(getScaleY() * this.q0);
        m(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z7 z7Var = this.p0;
        if (z7Var != null) {
            z7Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        z7 z7Var = this.p0;
        if (z7Var != null) {
            z7Var.h.remove(this);
        }
        super.onDetachedFromWindow();
    }
}
