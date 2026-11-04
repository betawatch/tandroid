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
import org.telegram.messenger.hs;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o7 extends ai.q2 {
    public boolean A0;
    public ValueAnimator B0;
    public TL_wallet.nftItem x0;
    public b8 y0;
    public float z0;

    @Override // ai.q2
    public final void b(d60 d60Var, Canvas canvas, float f10, float f11, float f12) {
        if (this.z0 == 1.0f) {
            super.b(d60Var, canvas, f10, f11, f12);
            return;
        }
        canvas.save();
        float f13 = this.z0;
        canvas.scale(f13, f13, f10 / 2.0f, f11 / 2.0f);
        super.b(d60Var, canvas, f10, f11, f12);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        b8 b8Var;
        float f10;
        int i3;
        float f11;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (b8Var = this.y0) != null) {
            RectF rectF = b8Var.I;
            Paint paint = b8Var.y;
            a8 a8Var = b8Var.l1;
            if (this == b8Var.m1 && a8Var != null && a8Var.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float l10 = Utilities.l(b8Var.q1.a);
                float[] D = b8Var.D(b8Var.o1 % 2.0f);
                float f12 = D[0] * l10;
                float f13 = D[1] * l10;
                float f14 = D[2] * l10;
                int left = frameLayout.getLeft();
                org.telegram.ui.Components.k9 k9Var = this.E;
                float left2 = k9Var.getLeft() + left + (k9Var.getWidth() / 2.0f);
                float height = (k9Var.getHeight() / 2.0f) + k9Var.getTop() + frameLayout.getTop();
                float B = com.google.android.recaptcha.internal.a.B(f14, 0.025f, (0.07f * f13) + 1.0f, (k9Var.getWidth() * hs.L4) / 268.0f);
                if (f13 > 0.01f && a8Var.w != null) {
                    float f15 = ((176.0f * B) / 128.0f) / 2.0f;
                    float L = (org.telegram.messenger.g0.L(2.0f) * f13) + height;
                    rectF.set(left2 - f15, L - f15, left2 + f15, L + f15);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f13));
                    canvas.drawBitmap(a8Var.w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                }
                float l11 = a8Var.u == null ? 0.0f : Utilities.l(1.4f * f13);
                float L2 = height - (org.telegram.messenger.g0.L(5.0f) * f13);
                float f16 = f13 * (-5.0f);
                if (l11 < 0.99f) {
                    paint.setAlpha(hs.e4);
                    f11 = L2;
                    f10 = B;
                    i3 = 255;
                    b8Var.r(canvas, a8Var.v, left2, f11, f10, f12, 1.0f, f16, 0.24f, 0.97f);
                } else {
                    f10 = B;
                    i3 = 255;
                    f11 = L2;
                }
                if (l11 > 0.01f) {
                    paint.setAlpha((int) (255.0f * l11));
                    b8Var.r(canvas, a8Var.u, left2, f11, f10, f12, 1.0f, f16, 0.24f, 0.97f);
                }
                paint.setAlpha(i3);
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

    public final void m(float f10, long j10, OvershootInterpolator overshootInterpolator) {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z0, f10);
        this.B0 = ofFloat;
        ofFloat.addUpdateListener(new p3(this, 5));
        if (overshootInterpolator != null) {
            this.B0.setInterpolator(overshootInterpolator);
        }
        this.B0.setDuration(j10);
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
        b8 b8Var = this.y0;
        if (b8Var != null) {
            b8Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b8 b8Var = this.y0;
        if (b8Var != null) {
            b8Var.h.remove(this);
        }
        super.onDetachedFromWindow();
    }
}
