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
import org.telegram.ui.Components.i80;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class g7 extends zh.g1 {
    public ValueAnimator A0;
    public TL_wallet.nftItem w0;
    public t7 x0;
    public float y0;
    public boolean z0;

    @Override // zh.g1
    public final void b(i80 i80Var, Canvas canvas, float f7, float f10, float f11) {
        if (this.y0 == 1.0f) {
            super.b(i80Var, canvas, f7, f10, f11);
            return;
        }
        canvas.save();
        float f12 = this.y0;
        canvas.scale(f12, f12, f7 / 2.0f, f10 / 2.0f);
        super.b(i80Var, canvas, f7, f10, f11);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.y0 == 1.0f) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        float f7 = this.y0;
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
        if (view == frameLayout && (t7Var = this.x0) != null) {
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
                org.telegram.ui.Components.y9 y9Var = this.y;
                float left2 = y9Var.getLeft() + left + (y9Var.getWidth() / 2.0f);
                float height = (y9Var.getHeight() / 2.0f) + y9Var.getTop() + frameLayout.getTop();
                float D2 = c3.h0.D(f13, 0.025f, (0.07f * f12) + 1.0f, (y9Var.getWidth() * 288) / 268.0f);
                if (f12 > 0.01f && s7Var.w != null) {
                    float f14 = ((176.0f * D2) / 128.0f) / 2.0f;
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
                    f7 = D2;
                    i10 = 255;
                    t7Var.r(canvas, s7Var.v, left2, f10, f7, f11, 1.0f, f15, 0.24f, 0.97f);
                } else {
                    f7 = D2;
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
        if (isPressed() == this.z0) {
            return;
        }
        boolean isPressed = isPressed();
        this.z0 = isPressed;
        m(isPressed ? 0.96f : 1.0f, isPressed ? 80L : 350L, isPressed ? null : new OvershootInterpolator(1.5f));
    }

    public final void m(float f7, long j10, OvershootInterpolator overshootInterpolator) {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, f7);
        this.A0 = ofFloat;
        ofFloat.addUpdateListener(new a3(this, 5));
        if (overshootInterpolator != null) {
            this.A0.setInterpolator(overshootInterpolator);
        }
        this.A0.setDuration(j10);
        this.A0.start();
    }

    public final void n(float f7) {
        this.y0 = f7;
        invalidate();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final void o() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.y0 == 1.0f) {
            return;
        }
        setScaleX(getScaleX() * this.y0);
        setScaleY(getScaleY() * this.y0);
        n(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t7 t7Var = this.x0;
        if (t7Var != null) {
            t7Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t7 t7Var = this.x0;
        if (t7Var != null) {
            t7Var.h.remove(this);
        }
        super.onDetachedFromWindow();
    }
}
