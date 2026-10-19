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
import org.telegram.ui.Components.g80;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class g7 extends yh.g1 {
    public TL_wallet.nftItem o0;
    public t7 p0;
    public float q0;
    public boolean r0;
    public ValueAnimator s0;

    @Override // yh.g1
    public final void a(g80 g80Var, Canvas canvas, float f7, float f10, float f11) {
        if (this.q0 == 1.0f) {
            super.a(g80Var, canvas, f7, f10, f11);
            return;
        }
        canvas.save();
        float f12 = this.q0;
        canvas.scale(f12, f12, f7 / 2.0f, f10 / 2.0f);
        super.a(g80Var, canvas, f7, f10, f11);
        canvas.restore();
    }

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
        t7 t7Var;
        float f7;
        int i10;
        float f10;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout && (t7Var = this.p0) != null) {
            RectF rectF = t7Var.H;
            Paint paint = t7Var.x;
            s7 s7Var = t7Var.k1;
            if (this == t7Var.l1 && s7Var != null && s7Var.v != null) {
                paint.setShader(null);
                paint.setColorFilter(null);
                float clamp01 = Utilities.clamp01(t7Var.p1.a);
                float[] D = t7Var.D(t7Var.n1 % 2.0f);
                float f11 = D[0] * clamp01;
                float f12 = D[1] * clamp01;
                float f13 = D[2] * clamp01;
                int left = frameLayout.getLeft();
                org.telegram.ui.Components.w9 w9Var = this.y;
                float left2 = w9Var.getLeft() + left + (w9Var.getWidth() / 2.0f);
                float height = (w9Var.getHeight() / 2.0f) + w9Var.getTop() + frameLayout.getTop();
                float B = com.google.android.gms.internal.play_billing.k3.B(f13, 0.025f, (0.07f * f12) + 1.0f, (w9Var.getWidth() * 288) / 268.0f);
                if (f12 > 0.01f && s7Var.w != null) {
                    float f14 = ((176.0f * B) / 128.0f) / 2.0f;
                    float dp = (AndroidUtilities.dp(2.0f) * f12) + height;
                    rectF.set(left2 - f14, dp - f14, left2 + f14, dp + f14);
                    paint.setColor(-16777216);
                    paint.setAlpha((int) (60.0f * f12));
                    canvas.drawBitmap(s7Var.w, (Rect) null, rectF, paint);
                    paint.setColor(-1);
                }
                float clamp012 = s7Var.u == null ? 0.0f : Utilities.clamp01(1.4f * f12);
                float dp2 = height - (AndroidUtilities.dp(5.0f) * f12);
                float f15 = f12 * (-5.0f);
                if (clamp012 < 0.99f) {
                    paint.setAlpha(255);
                    f10 = dp2;
                    f7 = B;
                    i10 = 255;
                    t7Var.r(canvas, s7Var.v, left2, f10, f7, f11, 1.0f, f15, 0.24f, 0.97f);
                } else {
                    f7 = B;
                    i10 = 255;
                    f10 = dp2;
                }
                if (clamp012 > 0.01f) {
                    paint.setAlpha((int) (255.0f * clamp012));
                    t7Var.r(canvas, s7Var.u, left2, f10, f7, f11, 1.0f, f15, 0.24f, 0.97f);
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
        ofFloat.addUpdateListener(new b3(this, 5));
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
        t7 t7Var = this.p0;
        if (t7Var != null) {
            t7Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t7 t7Var = this.p0;
        if (t7Var != null) {
            t7Var.h.remove(this);
        }
        super.onDetachedFromWindow();
    }
}
